package org.hemoo.aoifeMotan.config;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

/**
 * 可以获取所有的bean
 *
 * Created by sunjiawei on 2017/4/19.
 */
@Component
public class MyApplicationContext implements ApplicationContextAware {

    private static ApplicationContext applicationContext;

    public static ApplicationContext getInstance(){ return applicationContext;}

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        this.applicationContext = applicationContext;
    }
}
