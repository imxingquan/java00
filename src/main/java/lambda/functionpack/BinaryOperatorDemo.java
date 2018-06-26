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

import java.util.function.BinaryOperator;

/**
 * @author 402059985@QQ.COM
 * @author
 * @date 2018/6/2
 *
 *
 * BinaryOperator 继承自BiFunction,
 * 表示T类型的两个数操作,结果也是T类型
 *
 * 同类型的2元操作, 简化版的BiFunction
 */
public class BinaryOperatorDemo {

    public static void main(String[] args) {

        BinaryOperator<Integer> lambda = (a,b)-> a + b;

        System.out.println(lambda.apply(3,4));
    }
}
