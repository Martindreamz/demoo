package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class WakeUpController {

	@RequestMapping("/wakeup")
	public String wakeup(Model model) {
	model.addAttribute("a","Some one like you");
	
		return"wakeup";
	}
}
