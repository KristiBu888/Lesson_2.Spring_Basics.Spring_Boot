package org.example.domain;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
@Lazy
public class GasolinEngin implements iEngin {
    public GasolinEngin() {
        System.out.println("Создан экземпляр GasolinEngin");
    }

    @Override
    public void startEngine(){
        System.out.println("Запущен бензин 44 р/л");
    }
}
