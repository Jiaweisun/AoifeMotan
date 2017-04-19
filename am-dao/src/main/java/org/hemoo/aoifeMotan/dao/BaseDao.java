package org.hemoo.aoifeMotan.dao;

/**
 * Created by sunjiawei on 2017/4/13.
 */
public interface BaseDao<T> {
    int add(T t);
    int update(T t);
    int delete(T t);
    T view(T t);
}
