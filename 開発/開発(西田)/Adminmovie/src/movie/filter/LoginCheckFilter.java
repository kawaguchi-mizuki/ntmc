package movie.filter;

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

import movie.beans.AdminInfoBeans;


@WebFilter("/*")
public class LoginCheckFilter implements Filter{
	@Override
	public void destroy() {
		//無処理
		;
	}

	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {

		String excludeExtList[] = {
				"js","css","png","gif","jpg","ico"
		};

		///////////////////////////////////////
		//リクエストのサーブレットパスを取得
		String servletPath = ((HttpServletRequest)request).getServletPath();

		System.out.println("servletPath:" + servletPath);

		if(Arrays.asList(excludeExtList).contains(getExt(servletPath))) {
			chain.doFilter(request, response);
			return;
		}
		//////////////////////////////////////
		//loginページ以外の場合は、ログインチェックを行う
		if("/top".equals(servletPath)!=true&& "/updatestartAdmin".equals(servletPath) != true&&"/loginAdmin".equals(servletPath)!=true&&"/authadmin".equals(servletPath)!=true){
			///////////////////////////////
			//ログインチェックを行う（セッションからログイン情報を取得してnullでなければOK)

			HttpSession session = ((HttpServletRequest)request).getSession(true);

			//ログイン情報をセッションから取得
			AdminInfoBeans adminInfo = (AdminInfoBeans)session.getAttribute("adminInfo");

			//ログイン情報がnullなら未ログイン
			if( adminInfo == null ){
				System.out.println("ログインしていないのでログイン画面へ戻します");
				((HttpServletResponse)response).sendRedirect("loginAdmin");
				return;
			}

		}

		//処理を続行する
		chain.doFilter(request, response);

	}

	@Override
	public void init(FilterConfig arg0) throws ServletException {
		//無処理
		;
	}
	private String getExt(String fileName) {
		if(fileName==null)
			return null;
		int point = fileName.lastIndexOf(".");
		if(point==-1) {
			return "";
		}
		return fileName.substring(point+1);

	}
}


