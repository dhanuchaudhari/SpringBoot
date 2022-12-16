package com.codekul.SpringMorning.di2;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import static org.apache.naming.ResourceRef.SCOPE;
import static org.springframework.beans.factory.config.BeanDefinition.SCOPE_PROTOTYPE;

@Component
@Scope(SCOPE_PROTOTYPE)
public class Subject {
    public void display(){
        System.out.println("Studen have subject ");

    }


    public Subject() {
        System.out.println("in constructor");
    }
    public void Subject1() {
        System.out.println("stuent have subject 2");
    }


}
