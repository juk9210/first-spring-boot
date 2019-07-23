package com.brain.firstspringboot.configuration;

import com.brain.firstspringboot.model.Taxi;
import com.google.common.collect.Lists;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.DayOfWeek;
import java.util.List;

/**
 * Создаём класс-конфигурацию TaxiConfiguration.Этот класс будет вызываться при запуске программы.
 *
 * @author Shakhov Yevhen.
 */
@Configuration
public class TaxiConfiguration {
    /**
     * Создаём метод taxiList, который будет возвращать список такси и называется точно также как и раннее добавленное
     * поле в TaxiRepository  taxiList. И отмечаем его аннотацией @Bean. В методе инициализируем наши обьекты Taxi.
     *
     * @return
     */
    @Bean
    public List<Taxi> taxiList() {
        Taxi t1 = new Taxi( "Toyota", "1548 SD", "David", DayOfWeek.MONDAY );
        Taxi t2 = new Taxi( "BMW", "4517 DF", "Denis", DayOfWeek.SATURDAY );
        Taxi t3 = new Taxi( "Nissan", "1547 FD", "Jack", DayOfWeek.THURSDAY );
        Taxi t4 = new Taxi( "Mercedes-benz", "0007 FA", "James", DayOfWeek.FRIDAY );
        Taxi t5 = new Taxi( "Chevrolet", "8985 FS", "Hector", DayOfWeek.TUESDAY );
        Taxi t6 = new Taxi( "Mazda", "4578 GD", "Mike", DayOfWeek.SUNDAY );
        return Lists.newArrayList( t1, t2, t3, t4, t5, t6 );
    }


}
