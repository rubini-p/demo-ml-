package com.ml.demoapp.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoAppController {
  @GetMapping
  public String hello() {
    return "Hello merge request2";
  }
}
