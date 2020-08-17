package com.venesa.mobio.MobileMobio;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.reactive.function.client.WebClient;

@SpringBootApplication
public class MobileMobioApplication {
    public static void main(String[] args) {
        SpringApplication.run(MobileMobioApplication.class, args);
    }

    @Bean
    public WebClient getWebclient() {
        return WebClient.create();
    }

}
