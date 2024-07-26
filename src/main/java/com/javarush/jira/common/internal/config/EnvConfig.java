package com.javarush.jira.common.internal.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;


@Configuration
@PropertySource(value = "classpath:application.yaml", factory = EnvPropertySourceLoader.class)
public class EnvConfig {

}
