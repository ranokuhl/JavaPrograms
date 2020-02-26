package com.ranokuhl.grunderapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Map;

@Controller
public class GreetingController {

    @GetMapping("greeting")
    public String greeting(Map<String, Object> model) {
        model.put("message", "Hello Rano");
        return "greeting";
    }

    @GetMapping("appie")
    public String appie(Map<String, Object> model) {
        model.put("appie", "Hello Appie");
        return "appie";
    }

    @GetMapping("jordan")
    public String jordan(Map<String, Object> model) {
        model.put("jordan", "Hello Jordan");
        return "jordan";
    }


}
