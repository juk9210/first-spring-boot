package com.brain.firstspringboot.service;

import com.brain.firstspringboot.model.Taxi;
import com.brain.firstspringboot.repository.TaxiRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Создаем класс-сервис TaxiCaller
 *
 * @author Shakhov Yevhen.
 */
@Service
public class TaxiCaller {
    /*
    Создаём поле taxiRepository для автосвязывания с классом TaxiRepository.
     */
    @Autowired
    private TaxiRepository taxiRepository;

    /**
     * Создаем метод call для вызова такси, в который передаем в виде параметра person.
     *
     * @param person
     */
    public void call(String person) {
        System.out.println( "System started..." );  // система стартует
        Taxi car = taxiRepository.getFreeTaxi();  // вызываем поиск такси
        System.out.println( "Call taxi for " + person );  //выводим для кого такси
        System.out.println( "Car : " + car );  //выводим на экран какое такси свободное и приедет за клиентом
    }
}
