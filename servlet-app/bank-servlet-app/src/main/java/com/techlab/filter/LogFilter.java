package com.techlab.filter;

import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.http.HttpServletRequest;

@WebFilter(urlPatterns = { "/*" }, initParams = {
		@WebInitParam(name = "test-param", value = "Initialization Paramter") })
public class LogFilter implements Filter {

    public LogFilter() {
    }

	public void destroy() {
	}

	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		
		HttpServletRequest req = (HttpServletRequest) request;
		
		System.out.println(req.getRequestURI());
		
		// pass the request along the filter chain
		chain.doFilter(request, response);
	}

	public void init(FilterConfig fConfig) throws ServletException {
	}

}
