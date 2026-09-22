package com.yonsai.rest.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
// @CrossOrigin(origins = { "http://127.0.0.1:5500", "http://localhost:5500" },
// methods = {
// org.springframework.web.bind.annotation.RequestMethod.GET })
@CrossOrigin
public class FrontController {

  @GetMapping("/hello")
  public String hello() {
    System.out.println("FrontController - hello() - fetch");
    return "안녕하세요 fetch";
  }

  @GetMapping("/hello2")
  public String hello2() {
    System.out.println("FrontController - hello2() - axios");
    return "안녕하세요 Axios";
  }

  // @GetMapping("/login")
  // public String login(@RequestParam("userId") String id) {
  // System.out.println("FrontController - login() - axios");
  // // return "login";
  // if (id.equals("admin")) {
  // return "true";
  // }

  // return "false";
  // }
}
