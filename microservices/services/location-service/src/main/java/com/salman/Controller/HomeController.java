package com.salman.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
    @GetMapping()
    public String HomeController()
    {
        return "hello world";
    }
}
