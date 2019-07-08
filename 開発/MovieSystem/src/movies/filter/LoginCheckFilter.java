package movies.filter;

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

import movies.beans.UserInfoBeans;


@WebFilter("/*")
public class LoginCheckFilter implements Filter {

	@Override
	public void init(FilterConfig arg0) throws ServletException {
		//無処理//
		;
	}

	//チェック除外画面//
	private String excludeDispList[] = {
		"/userLoginStart","/addUser","/logout","/addUserComp","/listMovie","/unSubscribe","/unSubComp"
	};

	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {

		String excludeExtList[] = {
				"js","css","png","gif","jpg","ico"
		};


		//リクエストのサーブレットパスを取得//
		String servletPath = ((HttpServletRequest)request).getServletPath();
		if(Arrays.asList(excludeExtList).contains(getExt(servletPath))) {
			chain.doFilter(request, response);
			System.out.println("サーブレットパス取得");
			return;
		}

		//除外画面に含まれている場合はチェックしない//
		if( Arrays.asList(excludeDispList).contains(servletPath)) {
			chain.doFilter(request, response);
			System.out.println("除外画面チェック");
			return;
		}

		//ログインされていなくても、映画一覧画面へ遷移させる//
		HttpSession session = ((HttpServletRequest)request).getSession(false);
		System.out.println("1個目if文判定前");
		if( session == null ) {
			//セッションがない場合は映画一覧画面へ//
			System.out.println("セッション処理");
			((HttpServletResponse)response).sendRedirect("listMovie?loginFlg=1");
			return;
		}

		//ログイン情報をセッションに保存//
		UserInfoBeans userInfo = (UserInfoBeans)session.getAttribute("userInfo");

		if( userInfo == null ) {
			System.out.println("ログイン情報処理");
			//映画一覧画面へ転送//
			((HttpServletResponse)response).sendRedirect("listMovie?loginFlg=1");
			return;
		}else {
			chain.doFilter(request, response);
			return;
		}
	}

	@Override
	public void destroy() {
		//無処理//
		;
	}

	private String getExt(String fileName) {

		if(fileName == null)
			return null;

		int point = fileName.lastIndexOf(".");

		if(point == -1) {
			return "";
		}
		return fileName.substring(point + 1);
	}
}