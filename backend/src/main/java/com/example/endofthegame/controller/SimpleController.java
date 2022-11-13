package com.example.endofthegame.controller;


import com.example.endofthegame.entity.Address;
import com.example.endofthegame.entity.Person;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SimpleController {

    private static final Logger log = LoggerFactory.getLogger(SimpleController.class);

    // /me?my-name=Mariusz&my-surname=P.
    @GetMapping("/me")
    public Person showMyData(@RequestParam(value = "my-name", defaultValue = "John") String myName, //required = false
                             @RequestParam(value = "my-surname", defaultValue = "Smith") String mySurname) {
        log.info("showing my personal data");
        log.info("received name: [{}], and surname: [{}]", myName, mySurname);

        return new Person(myName, mySurname, 18,
                new Address("Estonia", "Tallinn"));
    }
}

