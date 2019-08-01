package filter;
import java.io.IOException;
import java.util.Arrays;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import beans.UserInfoBeans;



@WebFilter("/*")
public class LoginCheckFilter implements Filter {


	//チェック除外画面
	private String excludeDispList[] =
		{
				"/auth","/login","/user","/logout","/adduser","/addusercomp","/listMovie","/searchmovie","/detail"
		};
	private String excludeExtList[] =
		{
				"js","css","png","gif","jpg","ico"
		};

	@Override
	public void destroy() {
		//無処理
		;
	}


	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		// TODO 自動生成されたメソッド・スタブ
		//リクエストのサーブレットパスを取得
		String servletPath = ((HttpServletRequest)request).getServletPath();
		//js,cs,png,gif,ico,jpgは除外
		if( Arrays.asList(excludeExtList).contains(getExt(servletPath))){
			chain.doFilter(request, response);
			return;
		}

		request.setCharacterEncoding("UTF-8");
		response.setContentType("text/html); charset=UTF-8");

		//除外画面に含まれている場合はチェックしない
		if( Arrays.asList(excludeDispList).contains(servletPath)){
			chain.doFilter(request, response);
			return;
		}


		//ログインセッションを取得し、存在しない場合は、一覧画面に飛ばす
		HttpSession session = ((HttpServletRequest)request).getSession(false);

		if( session == null ){
			//セッションがない場合は一覧画面へ
			System.out.println("err");
			((HttpServletResponse)response).sendRedirect("listMovie");
			return;
		}
		UserInfoBeans userInfo =
				(UserInfoBeans)session.getAttribute("userInfo");

		if( userInfo == null ){
			//一覧画面へ転送
			((HttpServletResponse)response).sendRedirect("listMovie");
		}else{
			chain.doFilter(request, response);
		}

	}

	@Override
	public void init(FilterConfig arg0) throws ServletException {
		//無処理
		;
	}

	/**
	 * 拡張子を取得する
	 * @param fileName
	 * @return
	 */
	private String getExt(String fileName){

		if (fileName == null)
			return null;
		int point = fileName.lastIndexOf(".");
		if(point == -1){
			return "";
		}

		return fileName.substring(point+1);
	}
}