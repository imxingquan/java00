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
 * @date 2018/4/17
 */
public class Carts {

    private String name;

    private List<Product> products = new ArrayList<>();

    public Carts() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }
}
