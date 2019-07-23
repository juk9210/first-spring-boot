package com.brain.firstspringboot.component;

import com.brain.firstspringboot.service.TaxiCaller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Person {
    @Value("${user.properties.person.name}")
    private String name;
    @Value("${user.properties.person.phone}")
    private String phone;
    @Autowired
    private TaxiCaller taxiCaller;
    public void goTaxi(){
        taxiCaller.call(name);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}
