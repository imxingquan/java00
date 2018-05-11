/*
 * Copyright (c) 2017 , PANSOME All rights reserved.
 *
 *
 *
 *
 *
 *
 *
 *
 */

package annotation.chapter02;

import java.lang.reflect.Field;
import java.util.stream.Stream;

/**
 * @author 402059985@QQ.COM
 * @author
 * @date 2018/5/10
 */
public class AnnotationHelper {

    public static void process(Employee employee) {
        try {
            Field[] fields = employee.getClass().getFields();
            for (Field field : fields) {
                //获取属性上的注解
                MaxLength maxLengthAnnotation = field.getAnnotation(MaxLength.class);
                if (maxLengthAnnotation != null) {
                    //利用反射获取属性值
                    Object  v = field.get(employee);
                    String str = v.toString();
                    //数字的值和注解上定义的长度进行比较
                    if(str.length()> maxLengthAnnotation.length()){
                        System.out.println(String.format("属性[%s]的值超过指定长度[%d]",field.getName(),maxLengthAnnotation.length()));
                        //or throw exception
                    }

                }
            }
        }catch (Exception ex){
            ex.printStackTrace();
            System.out.println(ex.getMessage());
        }
    }
}
