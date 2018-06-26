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

import java.util.function.BooleanSupplier;

/**
 * @author 402059985@QQ.COM
 * @author
 * @date 2018/6/2
 *
 *
 *
 *
 */
public class BooleanSupplierDemo {

    public static void main(String[] args) {

        int x=1,y=2;

        BooleanSupplier bs = ()-> x > y;

        System.out.println(bs.getAsBoolean());

    }
}
