package com.envibe.envibe.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HomeController {

    @GetMapping("/")
    public String index(Model model) {
        // PARAMETERS: None
        // PATH: "/"
        // TEMPLATE: "/resources/templates/index.html
        return "index";
    }

    @GetMapping("/restricted")
    public String restricted(Model model) {
        // PARAMETERS: None
        // PATH: "/"
        // TEMPLATE: "/resources/templates/index.html
        return "restricted";
    }
}
