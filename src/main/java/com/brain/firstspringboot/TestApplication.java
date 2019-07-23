package com.brain.firstspringboot;

import com.brain.firstspringboot.component.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;

@SpringBootApplication
public class TestApplication {
	@Autowired
	private Person person;
	public static void main(String[] args) {
		SpringApplication.run(TestApplication.class, args);
	}
	@EventListener(ApplicationReadyEvent.class)
	public void onRun(){
		person.goTaxi();
	}
}
