package com.min.edu.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;

import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class AccessLogFilter implements Filter{

	private Logger logger = LoggerFactory.getLogger(this.getClass());
	
	@Override
	public void init(FilterConfig filterConfig) throws ServletException {
		logger.info("========== AccessFilter 시작");
	}

	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		
		HttpServletRequest req = (HttpServletRequest)request;
		
		// 접속정보 log처리
		String remote = StringUtils.defaultString(req.getRemoteAddr(), "-");
		String uri = StringUtils.defaultString(req.getRequestURI(), "-");
		String queryString = StringUtils.defaultString(req.getQueryString(), "-");
		
		// header 정보
		String referer = StringUtils.defaultString(req.getHeader("Referer"), "-");
		String agent = StringUtils.defaultString(req.getHeader("User-agent"), "-");
		
		System.out.printf("%s %s %s %s %s \t", remote, uri, queryString, referer, agent);
		String log = String.format("%s ? %s - %s - %s - %s", remote, uri, queryString, referer, agent);
		logger.info(log);
		
		chain.doFilter(request, response);
		
	}

	@Override
	public void destroy() {
		logger.info("========== AccessFilter 끝");
		
	}

}
