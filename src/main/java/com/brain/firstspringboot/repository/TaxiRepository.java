package com.brain.firstspringboot.repository;

import com.brain.firstspringboot.model.Taxi;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.List;

/**
 * Создаём класс-сервис TaxiRepository.
 *
 * @author Shakhov Yevhen.
 */
@Repository
public class TaxiRepository {
    /*
    Создаем поле со списком такси и помечаем аннотацией @Autowired для автосвязывания.
     */
    @Autowired
    List<Taxi> taxiList;

    /**
     * Создаем метод getFreeTaxi, который будет возвращать первое свободное такси из списка такси в зависимости от того
     * выходное ли оно в текущий день.И если такое такси не найдено,то будет возвращать ошибку.
     *
     * @return
     */
    public Taxi getFreeTaxi() {
        return taxiList.stream().filter( taxiList -> !taxiList.getRestDay().equals( LocalDate.now().getDayOfWeek() ) ).
                findFirst().orElseThrow( () -> new RuntimeException( "Not found taxi" ) );
    }
}
