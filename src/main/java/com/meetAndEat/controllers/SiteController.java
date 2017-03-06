package com.meetAndEat.controllers;


import java.io.IOException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@Controller
@EnableAutoConfiguration

public class SiteController {
	
	
	@RequestMapping(value = "/addUser", method = RequestMethod.POST)
	public @ResponseBody String createUser(@RequestParam(value = "url") String url) throws IOException{
		return "HI";
	}
	
	//Add login
	//Add event page
	//Add user page
	//Add Create Event call
	//Add Join Event call

//    @RequestMapping("/")
//    public String greeting() {
//     //   model.addAttribute("name", name);
//        return "greeting";
//    }
    
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
    
    @RequestMapping(value = "/userPage", method = RequestMethod.GET)
   	public ModelAndView hello(@RequestParam(value = "user") String user) {
   		ModelAndView model = new ModelAndView();
   		model.setViewName("userpage");
   		return model;
   	}

}
