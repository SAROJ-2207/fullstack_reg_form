package com.backendstsform.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.backendstsform.demo.model.UserModel;
import com.backendstsform.demo.service.ServiceInterface;
import com.backendstsform.demo.userdto.UserDto;

import org.springframework.ui.Model;

@Controller
@RequestMapping("/userform")
public class UrController {
	
	@Autowired
	private ServiceInterface iservice;
	
	
	@GetMapping("/message")
	public String message(String message) {
		return "*********** Welcome To User Registration Form ************";
		
	}
	
	@PostMapping("/adduserdata")
	public UserModel useradd(@RequestBody UserDto userdto) {
		return iservice.addData(userdto);
		
	}
		
	
	@GetMapping("/registration") // This ensures hitting the root address passes the userDto object!
	public String registrationPage(Model model) {
	    model.addAttribute("userDto", new UserDto()); 
	    return "index"; // Matches index.html
	}

	@PostMapping("/registerdata")
	public String useradd(@ModelAttribute("userDto") UserDto userdto, RedirectAttributes redirectAttributes) {
	    iservice.addData(userdto);
	    redirectAttributes.addFlashAttribute("successMessage", "Your application has been safely registered!");
	    return "redirect:/userform/registration"; // Redirect back to the root url
	}
		
	
}
