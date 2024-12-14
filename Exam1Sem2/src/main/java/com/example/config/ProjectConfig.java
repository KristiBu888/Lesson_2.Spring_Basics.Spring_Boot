package com.example.config;

import com.example.domain.Car;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class ProjectConfig {

    @Bean("BMV")
    Car car1()
    {
        Car obCar = new Car();
        obCar.setModel("X1");
        obCar.setMade("BMV");
        return obCar;
    }

    @Bean("Ford")
    Car car2()
    {
        Car obCar = new Car();
        obCar.setModel("F-150");
        obCar.setMade("Ford");
        return obCar;
    }

    @Bean
    @Primary
    Car car3()
    {
        Car obCar = new Car();
        obCar.setModel("RAV4");
        obCar.setMade("Toyota");
        return obCar;
    }

    @Bean
    String hello () {return "Hello!";}

    @Bean
    Integer ten () {return 10;}
}
