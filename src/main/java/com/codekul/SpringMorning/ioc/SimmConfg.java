package com.codekul.SpringMorning.ioc;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
@Configuration
public class SimmConfg  {
    @Bean
    public Vodafone getVodafone(){
        return new Vodafone();
    }

}
