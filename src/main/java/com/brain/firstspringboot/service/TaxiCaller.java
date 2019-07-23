package com.brain.firstspringboot.service;

import org.springframework.stereotype.Service;

@Service
public class TaxiCaller {
    public void call(String person){
        System.out.println("Call taxi for "+person);
    }
}
