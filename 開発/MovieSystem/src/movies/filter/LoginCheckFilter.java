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


	//チェック除外画面//
	private String excludeDispList[] = {
				"/loginstart","/login"
	};

	@Override
	public void destroy() {
		//無処理//
		;
	}

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
			return;
		}

		//除外画面に含まれている場合はチェックしない//
		if( Arrays.asList(excludeDispList).contains(servletPath)) {
			chain.doFilter(request, response);
			return;
		}

		//ログインセッションを取得し、存在しない場合は、ログイン画面に飛ばす//
		HttpSession session = ((HttpServletRequest)request).getSession(false);

		if( session == null ) {
			//セッションがない場合はログイン画面へ//
			((HttpServletResponse)response).sendRedirect("loginstart");
			return;
		}

		//ログイン情報をセッションに保存//
		UserInfoBeans userInfo = (UserInfoBeans)session.getAttribute("loginInfo");

		if( userInfo == null ) {
			//ログイン画面へ転送//
			((HttpServletResponse)response).sendRedirect("loginstart");
		}else {
			chain.doFilter(request, response);
		}
	}

	@Override
	public void init(FilterConfig arg0) throws ServletException {
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