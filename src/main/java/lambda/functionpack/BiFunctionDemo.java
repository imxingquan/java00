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

import org.junit.Test;

import java.util.Arrays;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Function;

/**
 * @author 402059985@QQ.COM
 * @author
 * @date 2018/5/31
 *
 * BiFunction<T, U, R>
 * R apply(T t, U u);
 *
 * 定义一个2元操作,有返回值
 *
 */
public class BiFunctionDemo {
    //region---------------Repository--------------------------------

    /**
     * BiFunction<T, U, R>
     * R apply(T t, U u);
     */
    @Test
    public void test_example01(){
        BiFunction<String,String,Integer> strSumLength = (a,b)->a.length()+b.length();

        System.out.println(strSumLength.apply("Hello","World"));
    }

    /**
     * 计算2个值
     * 具体什么操作由使用者自己定义
     */
    @Test
    public void test_example02(){

        class Calculator {
            public String calc(BiFunction<Integer, Integer, String> bi, Integer i1, Integer i2) {
                return bi.apply(i1, i2);
            }
        }


        Calculator calculator = new Calculator();
        String result = calculator.calc((a, b) -> ": " + (a * b),3,  5);
        System.out.println(result);

        String result2 = calculator.calc((a, b) -> {
            return a.toString() + b.toString();
        }, 12, 33);
        System.out.println(result2);

    }





    /**
     * 测试 andThen
     * default <V> BiFunction<T,U,V> andThen(Function<? super R,? extends V> after)
     */
    @Test
    public void test_andThen(){
        BiFunction<String,String,String> strSumLength = (a,b)->{
            return a+b;
        };

        Function<String,String> f = x -> x + "$";

        System.out.println(strSumLength.andThen(f).apply("Hello","World"));
    }


    @Test
    public void test_example03(){
        List<Integer> _numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        Function<Integer,Integer> lambda = value-> value * value;
        _numbers.stream()
                .map(lambda)
                .forEach(e->System.out.println(e));
    }

}
