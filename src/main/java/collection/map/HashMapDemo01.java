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

package collection.map;

import org.junit.Assert;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

/**
 * @author 402059985@QQ.COM
 * @author
 * @date 2018/4/21
 */
public class HashMapDemo01 {

    @Test
    public void test_compute() {
        /**
         * <pre>
         * {
         *     @code
         *     V oldValue = map.get(key);
         *     V newValue = remappingFunction.apply(key, oldValue);
         *     if (oldValue != null) {
         *         if (newValue != null)
         *             map.put(key, newValue);
         *         else
         *             map.remove(key);
         *     } else {
         *         if (newValue != null)
         *             map.put(key, newValue);
         *         else
         *             return null;
         *     }
         * }
         * </pre>
         * 
         */
        Map<String, Double> map = new HashMap<>();

        map.put("钢铁是怎样练成的", 128.00);

        // 根据lambda 计算新值,不为null就替换原来的value
        double newValue = map.compute("钢铁是怎样练成的", (k, v) -> {
            return v * 0.9;
        });
        Assert.assertEquals(128 * 0.9, newValue, 2);
        Assert.assertEquals(128 * 0.9, map.get("钢铁是怎样练成的"), 2);

        // 计算的新值为null,则删除原来的k-v
        Double aNullDouble = map.compute("钢铁是怎样练成的", (k, v) -> {
            return null;
        });
        Assert.assertEquals(null, aNullDouble);
        Assert.assertEquals(false, map.containsKey("钢铁是怎样练成的"));

        // 这是一个bug吗?
        map = new HashMap<>();
        map.put("平凡的世界", null);
        System.out.println(map);
        Double aNull = map.compute("平凡的世界", (k, v) -> {
            return null;
        });
        Assert.assertEquals(null, aNull);
        Assert.assertEquals(0, map.size());
        System.out.println(map);

        // Assert.assertEquals(3,map.size());
        /**
         * 总结: 有新值就替换,新值为null就删除,新旧为null不改变
         */

    }

    @Test
    public void test_computeIfAbsent() {
        Map<String, Double> map = new HashMap();

        map.put("钢铁是怎样练成的", null);

        // 如果key的value为null,根据key计算新的value
        double newValue = map.computeIfAbsent("钢铁是怎样练成的", key -> {
            return 9.0;
        });
        Assert.assertEquals(9.0, newValue, 1);
        Assert.assertEquals(9.0, map.get("钢铁是怎样练成的"), 1);
        System.out.println(map);

        // key的value有值,计算结果无效,还是原来的值
        map = new HashMap();
        map.put("钢铁是怎样练成的", 100.2);
        newValue = map.computeIfAbsent("钢铁是怎样练成的", key -> {
            return 9.0;
        });
        Assert.assertEquals(100.2, map.get("钢铁是怎样练成的"), 1);
        System.out.println(map);

        // 总结: computeIfAbsent 如果key的值(null)不存在 计算一个新的value给他
        // 如果没有对应的key,新增一个(k,v)
    }

    @Test
    public void test_computeIfPresent() {
        Map<String, Double> map = new HashMap();

        map.put("钢铁是怎样练成的", 22.0);
        map.put("钢铁是怎样练成的2", 15.2);
        double newValue = map.computeIfPresent("钢铁是怎样练成的", (k, v) -> {
            return 9.0;
        });
        Assert.assertEquals(9.0, map.get("钢铁是怎样练成的"), 1);

        // 新的value为null从map中删除key-value对
        map.computeIfPresent("钢铁是怎样练成的", (k, v) -> {
            return null;
        });
        Assert.assertEquals(1, map.size());

        // 总结: 如果k对应的value存在,用新的value
        // 如果新的value为null,删除map中k-v
    }

    @Test
    public void test_putAbsent() {
        Map<String, Double> map = new HashMap();

        map.put("钢铁是怎样练成的", 22.0);
        map.putIfAbsent("钢铁是怎样练成的", 21.0);
        Assert.assertEquals(22.0, map.get("钢铁是怎样练成的"), 1);

        //如果oldvalue==null 如果newvalue有值,用新值代替旧值
        map.put("铁血战士", null);
        map.putIfAbsent("铁血战士", 256.0);
        Assert.assertEquals(256.0, map.get("铁血战士"), 1);

        // 如果value==null 删除元素
        map.put("铁血战士",123.0);
        map.putIfAbsent("铁血战士",null);
        Assert.assertEquals(false, map.containsKey("铁血战士"));
       
    }
}
