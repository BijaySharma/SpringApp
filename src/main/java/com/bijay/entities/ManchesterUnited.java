package com.bijay.entities;

import org.springframework.stereotype.Component;

@Component
public class ManchesterUnited implements Team{
    @Override
    public String getName(){
        return "Manchester United";
    }
}
