package com.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * Created by Rakesh on 9/28/2018.
 */
@RestController
public class TestController {


    @RequestMapping(value="/",method = RequestMethod.GET)
    public String sayHello(){
        System.out.println("Hello World");
        try{
            Thread.sleep(1010);
        }catch (Exception exp){

        }
        return "helloWorld";
    }
}
