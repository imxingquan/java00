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

/**
 * @author 402059985@QQ.COM
 * @author
 * @date 2018/5/10
 */
public class TestAnnotation {

    @Deprecated
    @MyTag
    public void test1(){

    }

    @MyTag(name="李红",age=18)
    @Action
    public void test2(){

    }
}
