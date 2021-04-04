package io.github.olgaak.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import io.github.olgaak.service.UserService;

@Controller
@RequestMapping("/")
public class UserController {
	
	@Autowired
	public UserService userService;

	@GetMapping("/")
	public String index() {
		return "index";
	}
	
    @GetMapping("/hello")
    public String hello(){
    	System.out.println("hello requested");
        return "hello";
    }
    
    @GetMapping("/users")
    public String getAllUsers(Model model) {
    	model.addAttribute("users", userService.getAllUsers());
    	return "usersList";
    }
}
