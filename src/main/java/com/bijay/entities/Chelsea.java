package com.bijay.entities;

import org.springframework.stereotype.Component;

@Component
public class Chelsea implements Team{
    @Override
    public String getName() {
        return "Chelsea";
    }
}
