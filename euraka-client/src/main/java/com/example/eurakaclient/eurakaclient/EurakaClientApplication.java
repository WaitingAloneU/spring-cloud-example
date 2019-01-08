package com.example.eurakaclient.eurakaclient;

import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class EurakaClientApplication {

    public static void main(String[] args) {
        new SpringApplicationBuilder(EurakaClientApplication.class).web(WebApplicationType.SERVLET).run(args);
    }

}

