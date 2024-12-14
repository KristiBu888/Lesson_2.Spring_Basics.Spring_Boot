package org.example.config;

import org.example.domain.Car;
import org.example.domain.Engin;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
//@ComponentScan (basePackages = "org.example.domain")
public class ProjectConfig {

    @Bean
    @Primary
    Engin engin1()
    {
        Engin eng = new Engin();
        eng.setTypeEngin("Бензиновый");
        return eng;
    }

    @Bean
    Engin engin2()
    {
        Engin eng = new Engin();
        eng.setTypeEngin("Дизельный");
        return eng;
    }

    @Bean
    @Primary
    Car car1(@Qualifier ("engin1") Engin eng)
    {
        Car obCar = new Car(eng);
        obCar.setModel("F-150");
        obCar.setMade("Ford");
        return obCar;
    }

    @Bean
    Car car2(@Qualifier ("engin2") Engin eng)
    {
        Car obCar = new Car(eng);
        obCar.setModel("F-150");
        obCar.setMade("Ford");
        return obCar;
    }
}
