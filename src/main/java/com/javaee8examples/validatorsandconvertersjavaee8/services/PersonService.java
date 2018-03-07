/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.javaee8examples.validatorsandconvertersjavaee8.services;

import com.javaee8examples.validatorsandconvertersjavaee8.models.Person;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import javax.annotation.PostConstruct;
import javax.enterprise.context.SessionScoped;
import javax.inject.Named;

/**
 *
 * @author JmFernandezA
 */
@Named
@SessionScoped
public class PersonService implements Serializable{

    //imutable list
    List<Person> persons;

    public PersonService() {

    }

    @PostConstruct
    public void init() {
        persons = new ArrayList<>(Arrays.asList(
                new Person("jhon", "fernandez", 23),
                new Person("jhon1", "fernandez1", 24),
                new Person("jhon2", "fernandez2", 25),
                new Person("jhon3", "fernandez3", 26),
                new Person("jhon4", "fernandez4", 27)
        ));
    }

    public void insert(Person person) {
        persons.add(person);
    }

    public List<Person> findAll() {
        return persons;
    }

    public Person findByName(String name) {
        List<Person> persons =  this.persons.stream()
                .filter(p -> p.getName().equals(name))
                .collect(Collectors.toList());
        return persons != null && !persons.isEmpty()? persons.get(0) : null;
    }
    
    public Person findByNameAndLastnameAndAge(String name, String lastname, int age) {
        
        List<Person> persons =  this.persons.stream()
                .filter(p -> {
                    return p.getName().equals(name)
                            && p.getLastname().equals(lastname)
                            && p.getAge() == age;
                })
                .collect(Collectors.toList());
        return persons != null && !persons.isEmpty()? persons.get(0) : null;
       
    }

}
