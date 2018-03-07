/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.javaee8examples.validatorsandconvertersjavaee8.validators;

import com.javaee8examples.validatorsandconvertersjavaee8.models.Person;
import com.javaee8examples.validatorsandconvertersjavaee8.services.PersonService;
import javax.faces.application.FacesMessage;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.validator.Validator;
import javax.faces.validator.ValidatorException;
import javax.inject.Inject;
import javax.inject.Named;

/**
 *
 * @author JmFernandezA
 */
@Named
public class PersonValidator implements Validator<Person>{

    @Inject
    private PersonService personService;
    
    @Override
    public void validate(FacesContext context, UIComponent component, Person value) throws ValidatorException {
        if (value == null) {
            throw new ValidatorException(new FacesMessage(FacesMessage.SEVERITY_ERROR, "Error", "Person is null"));
        }else{
            if (personService.findByNameAndLastnameAndAge(value.getName(), value.getLastname(), value.getAge()) == null) {
                throw new ValidatorException(new FacesMessage(FacesMessage.SEVERITY_ERROR, "Error", "We don't find that person"));
            }
        }
    }
    
}
