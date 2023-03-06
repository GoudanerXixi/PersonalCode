package com.liu.annotationUse;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;


@Target({ElementType.METHOD, ElementType.TYPE})//只能在方法和类上注解
@Retention(RetentionPolicy.RUNTIME)//生命周期一直存在
public @interface Book {

        String value();
        double price() default 100.0;
        String[] authors();

}

