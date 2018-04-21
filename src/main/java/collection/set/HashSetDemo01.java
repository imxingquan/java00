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

package collection.set;

import org.junit.Test;

import java.util.HashSet;

/**
 * @author 402059985@QQ.COM
 * @author
 * @date 2018/4/19
 *
 * 1.无序的
 * 2.非同步的
 * 3.元素可以为null
 *
 */
public class HashSetDemo01 {

    class A{

    }
    class B{

    }
    @Test
    public void test01(){
        //无序的
        HashSet books = new HashSet();
        books.add("解忧杂货店");
        books.add("我们仨");
        books.add("自在独行:贾平凹的独行世界");
        System.out.println(books);
    }

    @Test
    public void test02(){

    }
}
