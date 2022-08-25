package com.spring.spring_jpa;

import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author bhagyapurba
 */
@Configuration
public class ConfigurationProperties {

    @Bean()
    public ModelMapper modelMapper() {
        return new ModelMapper();
    }
}
