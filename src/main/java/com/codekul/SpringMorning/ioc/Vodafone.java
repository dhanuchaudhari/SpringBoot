package com.codekul.SpringMorning.ioc;

public class Vodafone implements Sim{
    @Override
    public void calling() {
        System.out.println("calling vodafone");
    }

    @Override
    public void data() {
        System.out.println("data vodafone");
    }
}
