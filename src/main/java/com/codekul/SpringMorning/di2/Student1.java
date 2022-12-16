package com.codekul.SpringMorning.di2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Student1 {
    @Autowired
    private Subject subject;

    @Autowired
    private Subject subject1;


//    public Student(Subject subject) {
//        this.subject = subject;
//    }

    public void show(){
        subject.display();
        subject.Subject1();

    }
}
