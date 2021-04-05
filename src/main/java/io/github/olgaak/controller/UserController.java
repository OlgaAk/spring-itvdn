package io.github.olgaak.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RequestParam;

import io.github.olgaak.entity.User;
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
	
    
    @GetMapping("/users")
    public String getAllUsers(Model model) {
    	model.addAttribute("users", userService.getAllUsers());
    	return "usersList";
    }
    
    @GetMapping("/user/{id}")
    public String getUserById(@PathVariable("id") int id, Model model) {
    	model.addAttribute("user", userService.getUserById(id));
    	return "userPage";
    }
   
    @PostMapping("/adduser")
    public String addUser(@ModelAttribute("user") User user) {
    	userService.saveUser(user);
    	return "redirect:/users";
    }
    
    @GetMapping("/delete/{id}")
    public String deleteUser(@PathVariable("id") int id, Model model) {
    	userService.deleteUser(id);
    	return "redirect:/users";
    }
    
    @PostMapping("/update")
    public String updateUser(@ModelAttribute("user") User user) {
    	userService.updateUser(user);
    	return "redirect:/users";
    }
}
