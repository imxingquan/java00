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

package collection;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @author 402059985@QQ.COM
 * @author
 * @date 2018/4/21
 */
public class CollectionsDemo {

    @Test
    public void test(){
        List<Integer> nums = new ArrayList<>();
        nums.add(3);
        nums.add(-1);
        nums.add(5);
        nums.add(10);
        nums.add(-3);

        System.out.println(nums);
        //反转
        Collections.reverse(nums);
        System.out.println(nums);
        //排序
        Collections.sort(nums);
        System.out.println(nums);
        //随机
        Collections.shuffle(nums);
        System.out.println(nums);
    }
}
