package org.example.domain;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class DiselEngin implements iEngin {
    public DiselEngin() {
        System.out.println("Создан экземпляр DiselEngin");
    }

    @Override
    public void startEngine(){
        System.out.println("Запущен дизель 65 р/л");
    }
}
