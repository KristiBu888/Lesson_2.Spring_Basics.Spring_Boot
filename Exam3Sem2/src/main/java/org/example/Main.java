package org.example;

import org.example.config.ProjectConfig;
import org.example.domain.Car;
import org.example.domain.GasolinEngin;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

// в переменной вместо типа данных используется интерфейс iEngin (private iEngin carEngin;).
// Spring сам увидел что нужно создать экземпляр Car, а Car принимает интерфейс, ...
// ...по этому Spring посмотрел какие классы реализует интерфейс и выбрал нужный.
// @Lazy это ленивая загрузка - она нужна когда обьект очень большой и нужно загрузить только его экземпляр,...
// ...а сам обьект загрузить позднее при необходимости, и теперь когда необходимо просто закомментируем ...
// ...аннотацию и этот обьект загрузится.

public class Main {
    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);

        Car p = context.getBean(Car.class);
        p.go();

        System.out.println("-------------------------------");

        GasolinEngin gEng = context.getBean(GasolinEngin.class);

    }
}