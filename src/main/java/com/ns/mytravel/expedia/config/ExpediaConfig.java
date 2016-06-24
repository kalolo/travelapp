package com.ns.mytravel.expedia.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.core.env.Environment;

@Configuration
@PropertySource("classpath:expedia.properties")
public class ExpediaConfig {

    private static Environment env;

    public static String getApiKey() {
        return getEnv().getProperty("api.key");
    }

    public static String getApiUrl() {
        return getEnv().getProperty("api.url");
    }

    private static Environment getEnv() {

        if ( null == env ) env = new AnnotationConfigApplicationContext( ExpediaConfig.class ).getBean( Environment.class );

        return env;
    }

}
