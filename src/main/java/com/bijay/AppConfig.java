package com.bijay;

import com.bijay.entities.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {
    @Bean
    public Game game(){
        return new FootBallGame(mcu(), rmd());
    }

    @Bean
    public Team mcu(){
        return new ManchesterUnited();
    }

    @Bean
    public Team rmd(){
        return new RealMadrid();
    }
}
