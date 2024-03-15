package com.maersk.containerManagement.client;

import org.springframework.context.annotation.Bean;
import org.springframework.http.client.HttpComponentsClientHttpRequestFactory;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;


@Component
public class HttpConfig {
    @Bean("secureRestTemplate")
    public RestTemplate restTemplate(){
        return new RestTemplate();
    }
}
