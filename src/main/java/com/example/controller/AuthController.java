package com.example.controller;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.domain.User;
import com.example.service.UserService;

@Controller
@RequestMapping(value = "/auth")
public class AuthController {
	private static final Logger logger = LoggerFactory.getLogger(AuthController.class);

	@Autowired
	private UserService userService;
	
	// Spring 2.x 이상 지원
	@RequestMapping(value = "/login", method = RequestMethod.POST)
	@ResponseBody
	public String test(@RequestParam String username, @RequestParam String password, HttpServletRequest request) {
        String ip = request.getRemoteAddr();
        
        logger.info("사용자 로그인 시도 : username = {}, ip = {}", username, ip);
        
		return "OK";
	}

	@RequestMapping(value = "/login")
	public String loginSubmit() {
		return "login";
	}
	
	@RequestMapping("/login-success")
	public String loginSuccess() {
	    return "login-success";
	}
	
	@RequestMapping(value = "/signup", method = RequestMethod.GET)
	public String signupForm(Model model) {
	    model.addAttribute("user", new User());
	    return "signup";
	}
	
	@RequestMapping(value = "/signup", method = RequestMethod.POST)
	public String signupSubmit(@ModelAttribute User user) {
		logger.info("회원가입 시도 : {}.", user);
		userService.registerUser(user); 
	    return "redirect:/auth/signup-success";
	}
	
	@RequestMapping("/signup-success")
	public String signupSuccess() {
	    return "signup-success";
	}
}
