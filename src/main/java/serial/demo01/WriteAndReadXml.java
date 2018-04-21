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

package serial.demo01;

import org.junit.Test;
import common.Carts;
import common.Product;

import java.beans.XMLDecoder;
import java.beans.XMLEncoder;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.util.ArrayList;
import java.util.List;

/**
 * @author 402059985@QQ.COM
 * @author
 * @date 2018/4/17
 */
public class WriteAndReadXml {

    public static <T> T parserXML(String xml) {
        ByteArrayInputStream in = new ByteArrayInputStream(xml.getBytes());
        XMLDecoder decoder = new XMLDecoder(new BufferedInputStream(in));
        decoder.close();
        return (T) decoder.readObject();
    }

    public static <T> String formatXML(T entity) {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        XMLEncoder encoder = new XMLEncoder(new BufferedOutputStream(out));
        encoder.writeObject(entity);
        encoder.close();
        return out.toString();
    }

    @Test
    public void testWriteAndReadXml(){
        //单个类的xml序列化
        Product product = new Product(100,"西瓜",23.2f,"新疆");
        String pXml = formatXML(product);
        System.out.println(pXml);

        Product p2 =parserXML(pXml);
        System.out.println(p2.getName());
    }

    @Test
    public void testWriteAndReadXml2(){
        //复核类的xml序列化
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

        String pXml = formatXML(carts);
        System.out.println(pXml);

        Carts newCarts =parserXML(pXml);
        System.out.println(newCarts.getName()+newCarts.getProducts());
    }


}
