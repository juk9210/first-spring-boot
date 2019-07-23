package com.brain.firstspringboot;

import com.brain.firstspringboot.component.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;

/**
 * Создаем класс TestApplication для запуска приложения.
 *
 * @author Shakhov Yevhen.
 */
@SpringBootApplication
public class TestApplication {
    /**
     * Создаем поле person для автосвязывания с классом Person.
     */
    @Autowired
    private Person person;

    /**
     * Создаем метод main,в котором запускаем наше приложение.
     *
     * @param args
     */
    public static void main(String[] args) {
        SpringApplication.run( TestApplication.class, args );
    }

    /**
     * Создаем метод onRun, который запускает вызов такси из компонента person.Метод помечаем аннотацией @EventListener
     * для того чтобы запускался вместе с запуском приложения.
     */
    @EventListener(ApplicationReadyEvent.class)
    public void onRun() {
        person.goTaxi();
    }
}
