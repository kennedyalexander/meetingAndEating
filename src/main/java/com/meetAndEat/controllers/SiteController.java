package com.meetAndEat.controllers;

import java.security.Principal;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.servlet.ModelAndView;

import com.meetAndEat.dtos.EventDto;
import com.meetAndEat.models.Event;
import com.meetAndEat.models.EventSatus;
import com.meetAndEat.models.User;
import com.meetAndEat.models.UserDetails;
import com.meetAndEat.services.EventManagementServiceImpl;
import com.meetAndEat.services.UserManagementServiceImpl;

@Controller
@EnableAutoConfiguration

public class SiteController {
	@Autowired
	UserManagementServiceImpl userManagementServiceImpl;
	@Autowired
	EventManagementServiceImpl eventManagementServiceImpl;
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
	
	@RequestMapping(value = "/createEventPage", method = RequestMethod.GET)
	public ModelAndView eventPage() {
		ModelAndView model = new ModelAndView();
		model.setViewName("createEventPage");
		return model;
	}
	
	@RequestMapping(value = "/createUserPage", method = RequestMethod.GET)
	public ModelAndView createPage() {
		ModelAndView model = new ModelAndView();
		model.setViewName("createUserPage");
		return model;
	}

	@RequestMapping(value = "/userProfilePage", method = RequestMethod.GET)
	public ModelAndView userProfilePage( Principal principal) {
		UserDetails userDetails = userManagementServiceImpl.getUserInformation(principal.getName());
		ModelAndView model = new ModelAndView();
		model.setViewName("userProfilePage");
		model.addObject("username", userDetails.getUsername());
		model.addObject("firstName", userDetails.getFirstName());
		model.addObject("lastName", userDetails.getLastName());
		model.addObject("dateOfBirth", userDetails.getDob());
		model.addObject("emailAddress", userDetails.getEmail());
		model.addObject("location", userDetails.getLocation());
		return model;
	}
	
	
	@PostMapping("/createUser")
	@ResponseStatus(value = HttpStatus.OK)
	public void createUser(@ModelAttribute User user) {
		userManagementServiceImpl.createUser(user);
	}
	

	
	@PostMapping("/createEvent" )
	@ResponseStatus(value = HttpStatus.OK)
	public void createEvent( Principal principal, @ModelAttribute EventDto eventDto ) {
		Event event = eventDtoToEvent(eventDto, principal.getName(), EventSatus.PENDING);
		eventManagementServiceImpl.createEvent(event);
		System.out.println("Created");
	}
	
	@PostMapping("/activateEvent" )
	@ResponseStatus(value = HttpStatus.OK)
	public void activateEvent( Principal principal, @RequestParam String eventID ) {
//		Event event = eventDtoToEvent(eventDto, principal.getName(), EventSatus.PENDING);
//		eventCreationServiceImpl.createEvent(event);
		eventManagementServiceImpl.activateEvent(eventID);
		System.out.println("Activate " + eventID);
	}
	
	@GetMapping("/getEventsPage")
	@ResponseStatus(value = HttpStatus.OK)
	public ModelAndView getEventPage(Principal principal) {
		List<Event> events = eventManagementServiceImpl.getUsersEvents(principal.getName());
		ModelAndView model = new ModelAndView();
		model.setViewName("userEvents");
		model.addObject("username", principal.getName());	
		model.addObject("events", events);
		return model;
	}
	
	@RequestMapping(value = "/getEventsForUser", method = RequestMethod.POST,  consumes = "application/json")
	public @ResponseBody List<Event> getEventsForUser(Principal principal) {
	List<Event> events = eventManagementServiceImpl.getUsersEvents(principal.getName());
		return events;
	}
	
	public Event eventDtoToEvent(EventDto eventDto, String creator, EventSatus eventStatus){
		return new Event(UUID.randomUUID().toString(), eventDto.getEventName(),eventDto.eventDate, eventDto.minimumGuests, eventDto.maximumGuests, eventDto.location, creator, eventDto.food
				, eventStatus);
	}
	
	@InitBinder
	public void initBinder(WebDataBinder binder){
		binder.registerCustomEditor(Date.class, new CustomDateEditor(new SimpleDateFormat("yyyy-MM-dd"), true, 10));
	}
	

}
