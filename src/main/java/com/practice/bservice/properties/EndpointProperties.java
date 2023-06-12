package com.practice.bservice.properties;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;

@Configuration
public class EndpointProperties {
    @Autowired
    private Environment env;

    public String getBHost() {
        return getProperty("spring.endpoints.bHost");
    }
    public String getCHost() {
        return getProperty("spring.endpoints.cHost");
    }

    private String getProperty(String property) {
        return env.getProperty(property);
    }

}
