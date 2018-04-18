package com.masinew.app;

import com.masinew.spring.annotation.bean.Messager;
import com.masinew.spring.annotation.config.ApplicationConfiguration;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AnnotationApp {
    public static void main(String[] args) {
        ApplicationContext actx = new AnnotationConfigApplicationContext(
                ApplicationConfiguration.class);
        Messager aMess = actx.getBean(Messager.class);
        System.out.println(aMess.getMessage().getMessage());
    }
}
