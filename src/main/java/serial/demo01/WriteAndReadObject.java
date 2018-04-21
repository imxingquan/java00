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
import common.Product;

import java.io.*;

/**
 * @author 402059985@QQ.COM
 * @author
 * @date 2018/4/17
 */
public class WriteAndReadObject implements Serializable {


    @Test
    public void writeAndReadFromFile() throws Exception {
        //对象序列化到文件

        Product product = new Product(100,"西瓜",23.2f,"新疆");

        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("tmp.data"));
        oos.writeObject(product);

        //Read Obj from File
        File file = new File("tmp.data");
        ObjectInputStream ois =new ObjectInputStream(new FileInputStream(file));
        Product p2 = (Product) ois.readObject();

        System.out.println(p2.getName());

    }


}
