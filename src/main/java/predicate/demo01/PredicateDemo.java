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

package predicate.demo01;

import common.Product;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.function.Predicate;

/**
 * @author 402059985@QQ.COM
 * @author
 * @date 2018/4/18
 */
public class PredicateDemo {
    @Test
    public void test001(){
        Product product = new Product(100,"西瓜",23.2f,"新疆");
        Product product2 = new Product(101,"西红柿",4.3f,"四川");
        Product product3 = new Product(102,"冬瓜",5.2f,"辽宁");

        List<Product> products = new ArrayList<>();
        products.add(product);
        products.add(product2);
        products.add(product3);

        Product p = find(products,e->e.getPrice()<10);
        Assert.assertEquals(product2,p);
        System.out.println(p.getPrice());
    }

    public Product find(List<Product> products, Predicate<Product> predicate){
        for(Product obj : products){
            if(predicate.test(obj)){
                return obj;
            }
        }
        return null;
    }
}
