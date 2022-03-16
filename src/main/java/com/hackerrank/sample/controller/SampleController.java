package com.hackerrank.sample.controller;

import com.fasterxml.jackson.core.JsonParser;
import org.springframework.beans.factory.annotation.Required;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class SampleController {

    @RequestMapping(method = RequestMethod.POST, value = "/customHello")
    public String customHello(@RequestParam(value="message") String message)
    {
        if(message.isEmpty()) return "{\"echo\" : \"Custom \"}";
        return "{\"echo\" : \"Custom Custom Hello World!\"}";
    }

    @RequestMapping(method = RequestMethod.GET, value = "/defaultHello")
    public String defaultHelloWithParam(@RequestParam(value = "message", required=false) String message)
    {
        String defaultMessage = "{\"echo\" : \"Default Hello World!\"}";
        return defaultMessage;
    }

}
