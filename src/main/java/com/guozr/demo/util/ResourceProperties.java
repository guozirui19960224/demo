package com.guozr.demo.util;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;

@Configuration
@PropertySource(name = "resource",value = {"classpath:/resource.properties"})
//@PropertySource(name = "resource",value = {"classpath:/resource-${spring.profiles.active}.properties"})
public class ResourceProperties {
    @Autowired
    private Environment env;

    public String getProperty(String key) {
       return env.getProperty(key);
    }
}