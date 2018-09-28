package com.app;


import org.apache.http.client.HttpClient;
import org.apache.http.client.config.RequestConfig;
import org.apache.http.conn.HttpClientConnectionManager;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.impl.conn.BasicHttpClientConnectionManager;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.client.RestTemplate;

/**
 * Created by Rakesh on 9/28/2018.
 */
@SpringBootApplication
@ComponentScan(basePackages = "com.app")
public class Application {
    public static void main(String []args){
        SpringApplication.run(Application.class,args);
    }
    @Bean
    public CloseableHttpClient getHttpClient(){
        HttpClientBuilder httpClientBuilder = HttpClientBuilder.create();
        RequestConfig requestConfig = RequestConfig.custom().setConnectionRequestTimeout(100).setSocketTimeout(100).build();
        httpClientBuilder.create().setDefaultRequestConfig(requestConfig);
        return httpClientBuilder.build();
    }
}
