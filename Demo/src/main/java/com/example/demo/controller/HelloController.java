package com.example.demo.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Topic;

@RestController
public class HelloController {
    @RequestMapping("/hello")
	public String get() {
		return "hai world";
	}
   
}
