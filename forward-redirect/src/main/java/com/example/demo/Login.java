package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Login {

	/** 转发 **/
	@RequestMapping("forward")
	public String login(Model model) {
		model.addAttribute("message", "hello");
		return "forward:index"; // forward在跳转后可以取到message值
	}

	@RequestMapping("index")
	public String index(Model model) {
		return "welcome";
	}

	/** 重定向 **/
	@RequestMapping("redirect")
	public String logout(Model model) { 
		model.addAttribute("message", "hello");
		return "redirect:register"; // redirect在跳转后无法取到message值
	}

	@RequestMapping("register")
	public String register(Model model) {
		return "register";
	}
}
