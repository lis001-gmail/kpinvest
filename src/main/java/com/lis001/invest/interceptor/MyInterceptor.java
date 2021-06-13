package com.lis001.invest.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import com.lis001.invest.common.enums.ExceptionEnum;
import com.lis001.invest.common.response.ApiException;

public class MyInterceptor implements HandlerInterceptor {
    private Logger logger = LoggerFactory.getLogger(this.getClass());
    
    @Override
    public boolean preHandle(
            HttpServletRequest request,
            HttpServletResponse response,
            Object handler
    ) throws Exception {
    	
    	String sUserId = request.getHeader("X-USER_ID");
    	Integer userId = 0;
    	if (sUserId == null)
    	{
			throw new ApiException(ExceptionEnum.SECURITY_01);
    	}
    	try {
    		userId = Integer.parseInt(sUserId);
    	} catch(Exception e) {
			throw new ApiException(ExceptionEnum.SECURITY_01);
    	}

        logger.debug("[MYTEST] preHandle " + sUserId.toString() + "userId " + userId);
        
        request.setAttribute("userId", userId);
        return true;
    }

    @Override
    public void postHandle(
            HttpServletRequest request,
            HttpServletResponse response,
            Object handler,
            ModelAndView modelAndView
    ) throws Exception {
        logger.debug("[MYTEST] postHandle");
    }

    @Override
    public void afterCompletion(
            HttpServletRequest request,
            HttpServletResponse response,
            Object object,
            Exception ex
    ) throws Exception {
        logger.debug("[MYTEST] afterCompletion");
    }
    
//    private int hash(String str)
//    {
//    	int hash = 5381;
//    	
//    	for(int i = 0 ; i < str.length() ; i++)
//    	{
//    		int c = (int)str.charAt(i);
//    		hash = ((hash << 5) + hash) + c;
//    	}
//    	if (hash < 0) hash *= -1;
//    	return hash % 200000;	//	capacity;
//    }

}
