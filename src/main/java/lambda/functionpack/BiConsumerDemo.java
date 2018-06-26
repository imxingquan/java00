package lambda.functionpack;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.function.BiConsumer;

import org.junit.Assert;
import org.junit.Test;

/**
 *
 * BiConsumer
 *
 * 定义一个2元操作没有返回值
 *
 *
 *  void accept(T t, U u)
 * 接收2个参数, 没有返回值
 */
public class BiConsumerDemo {

    @Test
    public void test_BiComsumer() {

        BiConsumer<String, String> biConsumer = (x, y) -> {
            System.out.println(x);
            System.out.println(y);
        };

        BiConsumer<String, String> biConsumer2 = (x, y) -> {
            System.out.println(String.format("%s - %s",x,y));
        };

        biConsumer.andThen(biConsumer2).andThen(biConsumer).accept("Hello", " World");
    }

    @Test
    public void test_Print(){
        final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
 
        System.setOut(new PrintStream(outContent));
        System.out.print("hello");
        Assert.assertEquals("hello", outContent.toString());
    }

}