package com.amazon.productsearch.environment.config.properties;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource("classpath:application.properties")
public class SpringConfiguration {


    @Bean
    public ApplicationProperties getProperties(){
        return new ApplicationProperties();
    }
}
