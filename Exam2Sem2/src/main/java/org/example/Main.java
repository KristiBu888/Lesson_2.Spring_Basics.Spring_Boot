package org.example;

import org.example.config.ProjectConfig;
import org.example.domain.Car;
import org.example.domain.Engin;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

// мы создали Been обьекты, но не стали их использовать, а Spring при запуске кода сам их применяет.
// Been в прошлом, и после него стали использовать @Component и @ComponentScan (basePackages = "org.example.domain").
// @Qualifier нужен чтоб выбрать один из двигателей в классе Engin.
// Spring контролирует и помогает, и если обьект уже был создан ранее, то спринг не будет его создавать снова.

public class Main {
    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);

        Car c = context.getBean(Car.class);
        Engin e = context.getBean(Engin.class);

        System.out.println(c);
        System.out.println(e);
    }
}