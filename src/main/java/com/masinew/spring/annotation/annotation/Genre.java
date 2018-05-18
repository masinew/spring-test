package com.masinew.spring.annotation.annotation;

import java.lang.annotation.ElementType;


import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import org.springframework.beans.factory.annotation.Qualifier;



@Target({ElementType.FIELD, ElementType.PARAMETER, ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
// @Qualifier: if sets this annotation class in CustomAutowireConfigurer class. you do not define this annotation
// for a custom Qualifier annotation like this annotation class
public @interface Genre {

    String value();
}