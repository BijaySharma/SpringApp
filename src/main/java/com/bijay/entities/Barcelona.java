package com.bijay.entities;

import org.springframework.stereotype.Component;

@Component
public class Barcelona implements Team{
    @Override
    public String getName() {
        return "Barcelona";
    }
}
