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

package common;

import java.util.ArrayList;
import java.util.List;

/**
 * @author 402059985@QQ.COM
 * @author
 * @date 2018/4/18
 */
public class DemoData {

    public static Carts getCartsData(){
        Product product = new Product(100,"西瓜",23.2f,"新疆");
        Product product2 = new Product(101,"西红柿",4.3f,"四川");
        Product product3 = new Product(102,"冬瓜",5.2f,"辽宁");
        List<Product> products = new ArrayList<>();
        products.add(product);
        products.add(product2);
        products.add(product3);
        Carts carts = new Carts();
        carts.setName("购物车1");
        carts.setProducts(products);
        return carts;
    }


}
