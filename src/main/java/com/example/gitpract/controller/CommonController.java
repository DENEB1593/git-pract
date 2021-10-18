package com.example.gitpract.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(path = "/common")
public class CommonController {
    public String common() {
        return "common";
    }
}
