package com.liu.annotationUse;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * 模拟JUnit框架，定义若干个方法，只要加了Mytest注解，就可以在启动时被触发执行
 */
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
public @interface Mytest {

}

