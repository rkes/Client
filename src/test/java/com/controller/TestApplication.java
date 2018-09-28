package com.controller;

import org.apache.http.client.config.RequestConfig;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClientBuilder;

import java.net.URI;

/**
 * Created by Rakesh on 9/28/2018.
 */
public class TestApplication {
    public static void main(String []args){
        HttpClientBuilder httpClientBuilder = HttpClientBuilder.create();
        RequestConfig requestConfig = RequestConfig.custom().setConnectionRequestTimeout(2).setSocketTimeout(2).build();
        CloseableHttpClient closeableHttpClient =  httpClientBuilder.setDefaultRequestConfig(requestConfig).build();
        HttpGet httpGet = new HttpGet();
        try {
            httpGet.setURI(new URI("http://localhost:8080/"));
            closeableHttpClient.execute(httpGet);
        }catch(Exception exp){
            System.out.println("Exception Caught "+exp.getMessage());
        }
    }
}
