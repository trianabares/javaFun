package com.triana.enrutamientos.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/coding")
public class CodingController {
	@RequestMapping("")
    public String index(){
      return "Hola, Coding Dojo!";
    }
	@RequestMapping("/python")
    public String python(){
      return "Python/Djando fue increible!";
    }
	@RequestMapping("/java")
    public String java(){
      return "Java/Spring es lo mejor!";
    }

}
