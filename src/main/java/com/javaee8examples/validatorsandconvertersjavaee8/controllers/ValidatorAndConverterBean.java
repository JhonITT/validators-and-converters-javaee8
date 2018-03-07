/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.javaee8examples.validatorsandconvertersjavaee8.controllers;

import com.javaee8examples.validatorsandconvertersjavaee8.models.Person;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import javax.annotation.PostConstruct;
import javax.faces.view.ViewScoped;
import javax.inject.Named;
import javax.validation.constraints.AssertFalse;
import javax.validation.constraints.AssertTrue;
import javax.validation.constraints.DecimalMax;
import javax.validation.constraints.DecimalMin;
import javax.validation.constraints.Digits;
import javax.validation.constraints.Future;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Null;
import javax.validation.constraints.Past;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

/**
 *
 * @author JmFernandezA
 */
@Named
@ViewScoped
public class ValidatorAndConverterBean implements Serializable {
    
    
    @AssertFalse
    boolean isUnsupported;

    @AssertTrue
    boolean isActive;

    @DecimalMax("30.00")
    BigDecimal discountMax;

    @DecimalMin("5.00")
    BigDecimal discountMin;

    @Digits(integer = 6, fraction = 2)
    BigDecimal price;
    
    @Future
    Date eventDate;
    
    @NotNull
    @Past
    Date birthday;

    @Max(10)
    int quantityMax;

    @Min(5)
    int quantityMin;
    
    @Min(50)
    @Max(60)
    int quantityMinAndMax;

    @NotBlank
    String username;

    @Null
    String unusedString;

    @Pattern(regexp = "\\(\\d{3}\\)\\d{3}-\\d{4}")
    String phoneNumber;

    @Size(min = 2, max = 240)
    String briefMessage;
    
    Person person;

    public ValidatorAndConverterBean() {
        System.out.println(username);
    }
    
    @PostConstruct
    public void init(){
        System.out.println("hola");
    }
    
    public String action(){
        System.out.println(username);
        return null;
    }
    
    public String action2(){
        return null;
    }

    public boolean isIsUnsupported() {
        return isUnsupported;
    }

    public void setIsUnsupported(boolean isUnsupported) {
        this.isUnsupported = isUnsupported;
    }

    public boolean isIsActive() {
        return isActive;
    }

    public void setIsActive(boolean isActive) {
        this.isActive = isActive;
    }

    public BigDecimal getDiscountMax() {
        return discountMax;
    }

    public void setDiscountMax(BigDecimal discountMax) {
        this.discountMax = discountMax;
    }

    public BigDecimal getDiscountMin() {
        return discountMin;
    }

    public void setDiscountMin(BigDecimal discountMin) {
        this.discountMin = discountMin;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public Date getEventDate() {
        return eventDate;
    }

    public void setEventDate(Date eventDate) {
        this.eventDate = eventDate;
    }

    public int getQuantityMax() {
        return quantityMax;
    }

    public void setQuantityMax(int quantityMax) {
        this.quantityMax = quantityMax;
    }

    public int getQuantityMin() {
        return quantityMin;
    }

    public void setQuantityMin(int quantityMin) {
        this.quantityMin = quantityMin;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getUnusedString() {
        return unusedString;
    }

    public void setUnusedString(String unusedString) {
        this.unusedString = unusedString;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getBriefMessage() {
        return briefMessage;
    }

    public void setBriefMessage(String briefMessage) {
        this.briefMessage = briefMessage;
    }

    public int getQuantityMinAndMax() {
        return quantityMinAndMax;
    }

    public void setQuantityMinAndMax(int quantityMinAndMax) {
        this.quantityMinAndMax = quantityMinAndMax;
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }
    
    
    
    
    
    
}
