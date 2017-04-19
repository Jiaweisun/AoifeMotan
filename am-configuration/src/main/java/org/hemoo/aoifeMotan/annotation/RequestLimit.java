package org.hemoo.aoifeMotan.annotation;

import org.springframework.core.Ordered;
import org.springframework.core.annotation.Order;
import java.lang.annotation.*;

/**
 * 限制某个方法的访问次数 & 访问时间
 * 目的：为防止URL恶意攻击
 * （比如：僵尸机访问网站，恶意流量占用）
 *
 * @Retention 表示在什么级别保存注解信息，有三种，SOURCE,CLASS,RUNTIME
 *              SOURCE：注解将被编译器丢弃
 *              CLASS：注解在class文件中可用，但会被VM丢弃
 *              RUNTIME：VM将在运行期间保留注解，因此可以通过反射机制读取注解的信息。
 *
 *@Target 表示该注解用在什么地方.
 *@Documented 表示注解将包含在JAVADOC中。
 *
 *  注解的可用的类型包括以下几种：
 *      所有基本类型、String、Class、enum、Annotation、以上类型的数组形式。
 *      元素不能有不确定的值，即要么有默认值，要么在使用注解的时候提供元素的值， 而且元素不能使用null作为默认值。
 *      注解在只有一个元素且该元素的名称是value的情况下，在使用注解的时候可以省略“value=”，直接写需要的值即可。
 *
 * Created by sunjiawei on 2017/4/13.
 */
@Retention(RetentionPolicy.RUNTIME)//表示在什么级别保存注解信息，
@Target(ElementType.METHOD)//表示该注解用在什么地方
@Documented
//最高优先级
@Order(Ordered.HIGHEST_PRECEDENCE)
public @interface RequestLimit {

    /**
     *
     * 允许访问的次数，默认值MAX_VALUE
     */
    int count() default Integer.MAX_VALUE;

    /**
     *
     * 时间段，单位为毫秒，默认值一分钟
     */
    long time() default 60000;
}
