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

/**
 * @author 402059985@QQ.COM
 * @author
 * @date 2018/5/10
 *
 * 演示使用注解来处理属性的长度
 */
public class Employee {

    @MaxLength(length = 5)
    public String name;

    @MaxLength(length = 10)
    public String address;

    @MaxLength(length = 2)
    public int age;
}
