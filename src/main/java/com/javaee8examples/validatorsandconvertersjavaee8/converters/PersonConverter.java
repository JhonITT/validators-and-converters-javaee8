/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.javaee8examples.validatorsandconvertersjavaee8.converters;

import com.javaee8examples.validatorsandconvertersjavaee8.models.Person;
import com.javaee8examples.validatorsandconvertersjavaee8.services.PersonService;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.inject.Inject;
import javax.inject.Named;

/**
 *
 * @author JmFernandezA
 */
@Named
public class PersonConverter implements Converter<Person> {
    
    @Inject
    private PersonService personService;
    
    @Override
    public Person getAsObject(FacesContext context, UIComponent component, String value) {
        return personService.findByName(value);
    }

    @Override
    public String getAsString(FacesContext context, UIComponent component, Person value) {
        return value.getName();
    }
    
}
