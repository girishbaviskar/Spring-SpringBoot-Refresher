package com.girish.SpringCoreDemo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.girish.SpringCoreDemo.common.Coach;
import com.girish.SpringCoreDemo.common.SwimCoach;

@Configuration
public class SportConfig {
    @Bean
    public Coach swimCoach() {
        return new SwimCoach();
    }
}
