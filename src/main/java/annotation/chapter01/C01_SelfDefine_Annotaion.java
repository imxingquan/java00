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

import org.junit.Test;

import java.lang.annotation.Annotation;

/**
 * @author 402059985@QQ.COM
 * @author
 * @date 2018/5/10
 */
public class C01_SelfDefine_Annotaion {


    @Test
    public void getMyTag() throws ClassNotFoundException,NoSuchMethodException{
        //提取注解
        Annotation arr1[] = Class.forName(TestAnnotation.class.getName()).getMethod("test1").getAnnotations();
        for (Annotation an:arr1) {
            System.out.println(an);
        }

        //提取Annotation的参数
        Annotation arr2[] = Class.forName(TestAnnotation.class.getName()).getMethod("test2").getAnnotations();
        for (Annotation tag:arr2) {

            if(tag instanceof MyTag){
                System.out.println("tab=>"+tag);
                System.out.println("tag.name()=>"+((MyTag)tag).name());
            }
            if(tag instanceof Action){
                System.out.println("tab=>"+tag);
                System.out.println("tag.value()=>"+((Action)tag).value());
                System.out.println("tag.url()=>"+((Action)tag).url());
            }
        }

    }
}
