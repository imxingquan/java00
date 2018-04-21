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

import java.io.*;

/**
 * @author 402059985@QQ.COM
 * @author
 * @date 2018/4/17
 */
public class Product implements Serializable {

    private static final long serialVersionUID = 7307336268363759434L;

    private int id;
    private String name;
    private float price;
    private String madeFrom;

    public Product() {
    }

    public Product(int id, String name, float price, String madeFrom) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.madeFrom = madeFrom;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public String getMadeFrom() {
        return madeFrom;
    }

    public void setMadeFrom(String madeFrom) {
        this.madeFrom = madeFrom;
    }

    public static void main(String[] args) throws Exception {

        Product product = new Product(100,"西瓜",23.2f,"新疆");

        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("tmp.data"));
        oos.writeObject(product);

        //Read Obj from File
        File file = new File("tmp.data");
        ObjectInputStream ois =new ObjectInputStream(new FileInputStream(file));
        Product newProduct = (Product) ois.readObject();

        System.out.println(newProduct.name);

    }
}
