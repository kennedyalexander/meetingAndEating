package com.meetAndEat.controllers;

import java.io.IOException;
import java.security.Principal;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.servlet.ModelAndView;

import com.meetAndEat.dao.UserDao;
import com.meetAndEat.dao.UserDaoImpl;
import com.meetAndEat.models.Event;
import com.meetAndEat.models.User;
import com.meetAndEat.models.UserInformation;
import com.meetAndEat.services.EventCreationServiceImpl;
import com.meetAndEat.services.UserManagementServiceImpl;

@Controller
@EnableAutoConfiguration

public class SiteController {
	@Autowired
	UserManagementServiceImpl userManagementServiceImpl;
	@Autowired
	EventCreationServiceImpl eventCreationServiceImpl;
	// Add login
	// Add event page
	// Add user page
	// Add Create Event call
	// Add Join Event call

	// @RequestMapping("/")
	// public String greeting() {
	// // model.addAttribute("name", name);
	// return "greeting";
	// }

	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public ModelAndView login() {
		ModelAndView model = new ModelAndView();
		model.setViewName("login");
		return model;
	}


	@RequestMapping(value = "/", method = RequestMethod.GET)
	public ModelAndView hello() {
		ModelAndView model = new ModelAndView();
		model.setViewName("home");
		return model;
	}
	
	@RequestMapping(value = "/eventPage", method = RequestMethod.GET)
	public ModelAndView eventPage() {
		ModelAndView model = new ModelAndView();
		model.setViewName("eventPage");
		return model;
	}
	
	@RequestMapping(value = "/createPage", method = RequestMethod.GET)
	public ModelAndView createPage() {
		ModelAndView model = new ModelAndView();
		model.setViewName("createPage");
		return model;
	}

	@RequestMapping(value = "/userProfilePage", method = RequestMethod.GET)
	public ModelAndView userProfilePage( Principal principal) {
		UserInformation userInformation = userManagementServiceImpl.getUserInformation(principal.getName());
		ModelAndView model = new ModelAndView();
		model.setViewName("userProfilePage");
		model.addObject("username", userInformation.getUsername());
		model.addObject("firstName", userInformation.getFirstName());
		model.addObject("lastName", userInformation.getLastName());
		model.addObject("dateOfBirth", userInformation.getDob());
		model.addObject("emailAddress", userInformation.getEmail());
		model.addObject("location", userInformation.getLocation());
		return model;
	}
	
	
	@PostMapping("/createUser")
	@ResponseStatus(value = HttpStatus.OK)
	public void createUser(@ModelAttribute User user) {
		userManagementServiceImpl.createUser(user);
	}
	
	@PostMapping("/createEvent")
	@ResponseStatus(value = HttpStatus.OK)
	public void createEvent(@ModelAttribute Event event, Principal principal) {
		eventCreationServiceImpl.createEvent(event, principal.getName());
	}
	
	@GetMapping("/getEvents")
	@ResponseStatus(value = HttpStatus.OK)
	public void getEvents(@ModelAttribute Event event, Principal principal) {
		
	}
	
	
	

}
