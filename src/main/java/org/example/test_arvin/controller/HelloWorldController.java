package org.example.test_arvin.controller;

import org.example.test_arvin.model.HelloWorldResponse;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RequestMethod;

@RestController
@RequestMapping("/hello")
public class HelloWorldController {
    @RequestMapping(value = "/test1", method = {RequestMethod.GET, RequestMethod.POST})
    @ResponseBody
    public HelloWorldResponse hello() {
        return new HelloWorldResponse("helloworld");
    }
}
