package com.liu.annotationUse;
import org.junit.Test;
import java.lang.reflect.Method;
import java.util.Arrays;

/**
 * 注解的解析
 */
public class AnnatationDemo1 {
    @Test
    public void methodAnnatation() throws Exception {
        //1.获取类对象
        Class c = BookStore.class;
        //2.定位方法
        Method m = c.getDeclaredMethod("speak");
        //3.判断方法是否存在这个注解
        if(m.isAnnotationPresent(Book.class)){
            //4.直接获取该注解对象
            Book book = m.getDeclaredAnnotation(Book.class);
            System.out.println(book.value());
            System.out.println(book.price());
            System.out.println(Arrays.toString(book.authors()));

        }
    }

    @Test
    public void classAnnatation() throws Exception {
        //1.获取类对象
        Class c = BookStore.class;

        //3.判断类是否存在这个注解
        if(c.isAnnotationPresent(Book.class)){
            //4.直接获取该注解对象
            Book book = (Book) c.getDeclaredAnnotation(Book.class);
            System.out.println(book.value());
            System.out.println(book.price());
            System.out.println(Arrays.toString(book.authors()));

        }
    }
}
