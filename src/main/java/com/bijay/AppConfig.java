package com.bijay;

import com.bijay.entities.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

import javax.sql.DataSource;

@Configuration
@ComponentScan(basePackages = "com.bijay")
public class AppConfig {
    @Autowired
    private DataSource dataSource;

    @Autowired @Qualifier("manchesterUnited")
    private Team home;

    @Autowired @Qualifier("realMadrid")
    private Team away;

    @Bean
    public Game game(){
        FootBallGame game = new FootBallGame(home, away);
        game.setDataSource(dataSource);
        return game;
    }

}
