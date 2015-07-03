package com.showoffs.zingrides.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ZingController {
    @RequestMapping("/home")
    public String hello() {
      return "Hello World!\n";
    }
}
