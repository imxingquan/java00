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

package annotation.chapter01;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/**
 * @author 402059985@QQ.COM
 * @author
 * @date 2018/5/10
 *
 * 自定义Annotation
 */
@Retention(RetentionPolicy.RUNTIME) //运行时通过反射获取注解
public @interface MyTag {

    //定义注解的值
    String name() default "默认值";
    int age() default 30;
}
