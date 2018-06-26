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

package lambda.functionpack;

import org.junit.Assert;
import org.junit.Test;

import java.util.function.BiPredicate;

/**
 * @author 402059985@QQ.COM
 * @author
 * @date 2018/6/2
 *
 * 二元谓词操作
 */
public class BiPredicateDemo {
    //region---------------Repository--------------------------------


    @Test
    public void  test_example01(){
        BiPredicate<Integer,Integer> lambda = (a,b)-> a > b;

        System.out.println(lambda.test(3,5));

        // 3 > 5 or 3 < 5
        System.out.println(lambda.or((a,b)->a < b).test(3,5));
    }

    @Test
    public void test_example03(){

        Assert.assertEquals(true,compare((a, b)->a/5 == 20,100,5));
    }

    public static boolean compare(BiPredicate<Integer,Integer> biPredicate,Integer a,Integer b){
        return biPredicate.test(a,b);
    }
}
