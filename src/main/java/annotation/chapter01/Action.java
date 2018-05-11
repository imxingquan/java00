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

import java.lang.annotation.*;

/**
 * @author 402059985@QQ.COM
 * @author
 * @date 2018/5/10
 */
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.METHOD,ElementType.FIELD})
public @interface Action {

    String value() default "action name";
    String url() default "http://163.com";
}
