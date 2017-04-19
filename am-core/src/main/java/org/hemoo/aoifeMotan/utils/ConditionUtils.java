package org.hemoo.aoifeMotan.utils;

import java.lang.reflect.Field;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 条件工具类
 *
 * @author 李伟伟
 * @create 2017/4/11
 */
public class ConditionUtils {

    public static <T> String convertConditionToQueryString(T entity) {
        StringBuffer queryString = new StringBuffer("");

        Class<?> tClass = entity.getClass();
        try {
            Field[] filFields = tClass.getDeclaredFields();
            for (Field field : filFields) {
                field.setAccessible(true);
                String fieldName = field.getName();
                Object value = field.get(entity);

                if (value == null) continue;

                Class<?> fieldType = field.getType();
                if (fieldType == BigDecimal.class) {
                    value = ((BigDecimal) value).setScale(2, RoundingMode.HALF_DOWN);
                } else if (fieldType == Date.class) {
                    SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
                    value = simpleDateFormat.format(value);
                }

                if (queryString.length() == 0) {
                    queryString.append("?").append(fieldName).append("=").append(value);
                } else {
                    queryString.append("&").append(fieldName).append("=").append(value);
                }

            }
        } catch (Exception e) {
            e.printStackTrace();
            queryString.delete(0, queryString.length());
        }

        return queryString.toString();

    }

    public static void main(String[] args) throws IllegalAccessException {

//        PasDataStatisticsSalaryCondition pasDataStatisticsSalaryCondition = new PasDataStatisticsSalaryCondition();
//        pasDataStatisticsSalaryCondition.setEmpName("Liweiwei");
//        pasDataStatisticsSalaryCondition.setNums(new BigDecimal(5.2));
//        String result = ConditionUtils.convertConditionToQueryString(pasDataStatisticsSalaryCondition);
//        System.out.println("result= " + result);
//
//        StringBuffer buffer = new StringBuffer();
//        buffer.delete(0, buffer.length());
//        System.out.println("rrr= " + buffer.toString());
    }

}
