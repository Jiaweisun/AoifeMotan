package org.hemoo.aoifeMotan.adapter;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

/**
 * 1. 配置类，@Configuration
 * 2. 继承WebMvcConfigurerAdapter，并实现addInterceptor()
 *
 * Created by sunjiawei on 2017/4/19.
 */
@Configuration
public class MyWebMvcConfigurerAdapter extends WebMvcConfigurerAdapter {


    /**
     * 自定义拦截器注入配置
     * @param registry
     */
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        // 如有多个拦截器，则像注释一样，并排添加，组成一个拦截器链
        // addPathPatterns 用于添加拦截规则，excludePathPatterns 用户排除拦截
        registry.addInterceptor(new MyInterceptor()).addPathPatterns("/**");
//        registry.addInterceptor(new MyInterceptor1()).addPathPatterns("/**");
//        registry.addInterceptor(new MyInterceptor2()).addPathPatterns("/**");
        super.addInterceptors(registry);
    }


    /**
     * 静态资源Resources配置
     * @param registry
     */
    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry.addResourceHandler("/static/**")
                .addResourceLocations("classpath:/templates/static/");
        super.addResourceHandlers(registry);
    }
}
