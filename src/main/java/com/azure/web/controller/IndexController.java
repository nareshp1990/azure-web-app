package com.azure.web.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class IndexController {

    @RequestMapping(path = "/",method = RequestMethod.GET)
    public String index(){
        return "AZ-204: DEVELOPING SOLUTIONS FOR MICROSOFT AZURE";
    }

}
