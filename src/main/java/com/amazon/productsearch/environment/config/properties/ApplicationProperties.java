package com.amazon.productsearch.environment.config.properties;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;

@PropertySource("classpath:/resources/application.properties")
public class ApplicationProperties {

    @Value("#{amazon.awsAccessKeyId }")
    private String awsAccessKeyId;
    @Value("#{amazon.awsSecretKey}")
    private String awsSecretKey;
    @Value("#{amazon.endpoint}")
    private String endpoint;

}
