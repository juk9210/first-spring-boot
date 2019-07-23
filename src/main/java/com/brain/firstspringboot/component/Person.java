package com.brain.firstspringboot.component;

import com.brain.firstspringboot.service.TaxiCaller;
import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * Создаем класс-сервис Person.
 *
 * @author Shakhov Yevhen.
 */
@Component
public class Person {
    /**
     * Создаём два поля - имя и телефон персоны.Инициализируем эти поля с помощью данных из настроек в файле
     * application.properties.
     */
    @Getter
    @Setter
    @Value("${user.properties.person.name}")
    private String name;
    @Getter
    @Setter
    @Value("${user.properties.person.phone}")
    private String phone;
    /**
     * Создаем поле taxiCaller. Помечаем его аннотоцией @Autowired для связывания с классом TaxiCaller
     */
    @Autowired
    private TaxiCaller taxiCaller;

    /**
     * Создаём метод goTaxi для вызова такси с помощью сервиса TaxiCaller.
     */
    public void goTaxi() {
        taxiCaller.call( name );
    }
}
