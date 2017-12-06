package com.renker.cloud.gateway.filter;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;

public class TestZoolFIlter extends ZuulFilter{
	private Logger log = LoggerFactory.getLogger(this.getClass());

	@Override
	public Object run() {
		
		RequestContext requestContext = RequestContext.getCurrentContext();
		HttpServletRequest request = requestContext.getRequest();
		
		log.info("send {} request to {}",request.getMethod(),request.getRequestURL().toString());
		Object accessToken = request.getParameter("accessToken");
		if(accessToken == null){
			log.warn("accessToken is empty ");
			requestContext.setSendZuulResponse(false);
			requestContext.setResponseStatusCode(401);
		}
		
		log.info("accessToken is ok ");
		
		return null;
	}

	@Override
	public boolean shouldFilter() {
		return true;
	}

	@Override
	public int filterOrder() {
		return 0;
	}

	@Override
	public String filterType() {
		return "pre";
	}

}
