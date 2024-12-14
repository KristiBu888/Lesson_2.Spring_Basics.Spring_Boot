package com.example;

// Это как библиотека классов. таким методом, который показан в этом примере уже не пользуются. Рассматриваем его только для понимания.

import com.example.config.ProjectConfig;
import com.example.domain.Car;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);
        Car simpleCar = context.getBean(Car.class);
        System.out.println(simpleCar.getModel()+ " " +simpleCar.getMade());
        String s = context.getBean(String.class);
        System.out.println(s);
        Integer n = context.getBean(Integer.class);
        System.out.println(n);
    }
}