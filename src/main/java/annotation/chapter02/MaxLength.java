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

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.*;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

/**
 * @author 402059985@QQ.COM
 * @author
 * @date 2018/5/10
 */

@Retention(RUNTIME)
@Target({FIELD,METHOD}) //修饰成员变量
public @interface MaxLength {

    int length() default 2;
}
