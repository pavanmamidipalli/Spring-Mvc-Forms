package com.example.demo.controller;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.controller.pojoo.Data;

@Controller
public class FormController {
@RequestMapping("/register")
public String mainn() {
	return "index";
}
@PostMapping("/register")
public String mainn2(Map<String,Object> model,@ModelAttribute("data")Data data) {
	model.put("data", data);
	return "result";
}
}
