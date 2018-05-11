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

import org.junit.Test;

/**
 * @author 402059985@QQ.COM
 * @author
 * @date 2018/5/10
 */
public class C02_Test {

    @Test
    public void testMaxLength(){

        Employee employee = new Employee();
        employee.name = "Mark";
        employee.address = "Zhong shan Round 1001#";
        employee.age=100;

        //使用注解处理赋值超长
        AnnotationHelper.process(employee);

    }
}
