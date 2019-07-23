package com.brain.firstspringboot.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.time.DayOfWeek;

/**
 * Создаём класс Taxi для создания модели авто с данными.
 *
 * @author Shakhov Yevhen.
 */
@ToString
@AllArgsConstructor
public class Taxi {
    /*
    Создаем поля car - модель авто,carNumber - номер авто,driverName - имя водителя,restDay - выходной день.
     */
    @Getter
    @Setter
    private String car;
    @Getter
    @Setter
    private String carNumber;
    @Getter
    @Setter
    private String driverName;
    @Getter
    @Setter
    private DayOfWeek restDay;

}
