package org.example.domain;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

//@Component
public class Car {
    private String model = "F-150";
    private String made = "Ford";
    @Autowired
    private Engin carEngin;

    public Car(Engin engin) {
        this.carEngin = engin;
        System.out.println("Автомобиль создан!");
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getMade() {
        return made;
    }

    public void setMade(String made) {
        this.made = made;
    }

    public Engin getCarEngin() {
        return carEngin;
    }

    public void setEngin(Engin engin) {
        this.carEngin = engin;
    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", made='" + made + '\'' +
                ", carEngin=" + carEngin +
                '}';
    }
}
