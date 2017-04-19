package org.hemoo.aoifeMotan.adapter;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * 1. 自定义拦截器，实现HandlerInterceptor
 * 2. 可同时定义多个拦截器类,比如，登录拦截，
 * 3. 只有经过DispatcherServlet 的请求，才会走拦截器链，我们自定义的Servlet 请求是不会被拦截的
 *
 * Created by sunjiawei on 2017/4/19.
 */
public class MyInterceptor implements HandlerInterceptor {
    private Logger logger = LoggerFactory.getLogger(MyInterceptor.class);

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        System.out.println(">> now >>>>request>>>>");
        String authorization = request.getHeader("Authorization");
        logger.info("The authorization is: {}",authorization);//空的
//        if (authorization==null ||authorization== "")
//            return false;
        return true;// 只有返回true才会继续向下执行，返回false取消当前请求
    }

    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {
        System.out.println(">>>request>>>> now >>>view render");
    }

    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {
        System.out.println(">>>request>>>>view render>>>> now(clean) >>>");
    }
}
