package com.venesa.mobio.MobileMobio;

import com.venesa.common.Utils.WebClientUtils;
import com.venesa.common.config.EnvironmentConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Import;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;
import org.springframework.web.reactive.function.client.WebClient;

@SpringBootApplication
@EnableJpaAuditing
@Import({EnvironmentConfig.class, WebClientUtils.class})
public class MobileMobioApplication {
    public static void main(String[] args) {
        SpringApplication.run(MobileMobioApplication.class, args);
    }

    @Bean
    public WebClient getWebclient() {
        return WebClient.create();
    }

}
