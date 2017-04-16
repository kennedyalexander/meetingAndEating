package com.meetAndEat.controllers;

import com.meetAndEat.models.Event;
import com.meetAndEat.models.User;
import com.meetAndEat.models.UserDetails;
import com.meetAndEat.services.EventManagementServiceImpl;
import com.meetAndEat.services.UserDetailsManagementService;
import com.meetAndEat.services.UserDetailsManagementServiceImpl;
import com.meetAndEat.services.UserManagementServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@EnableAutoConfiguration
@RequestMapping("/api")
public class AppController {

    @Autowired
    UserManagementServiceImpl userManagementServiceImpl;

    @Autowired
	UserDetailsManagementServiceImpl userDetailsManagementService;

	@Autowired
	EventManagementServiceImpl eventManagementService;


    @GetMapping("/getUserDetails")
    public UserDetails getUserDetails(@RequestParam(value="username") String username) {
        return userDetailsManagementService.getUserDetails(username);
    }

	@PostMapping("/createUserDetails")
	public HttpStatus createUserDetails(@RequestBody UserDetails userDetails, @RequestParam(value="username") String username) {
		return userDetailsManagementService.createUserDetails(userDetails);
	}

    @PostMapping("/updateUserDetails")
    public HttpStatus updateUserDetails(@RequestBody UserDetails userDetails, @RequestParam(value="username") String username) {
	    System.out.println("Stub Lol");
        return userDetailsManagementService.updateUserDetails(userDetails);
    }

    @GetMapping("/deleteUserDetails")
    public HttpStatus deleteUserDetails(@RequestParam(value="username") String username) {
        return userDetailsManagementService.deleteUserDetails(username);
    }

//    @RequestMapping(method = RequestMethod.POST)
//    public ResponseEntity<?> addPie(@RequestBody Pie input) {
//        return new ResponseEntity<>(repository.save(input), HttpStatus.CREATED);

    @GetMapping("/getEvent")
    public Event getEvent(@RequestParam(value="eventID") String eventID) {
        return eventManagementService.getEvent(eventID);
    }

    @PostMapping("/updateEvent")
    public HttpStatus updateEvent(@RequestBody Event event) {
        return eventManagementService.updateEvent(event);
    }

    @PostMapping("/createEvent")
    public HttpStatus createEvent(@RequestBody Event event) {
        return eventManagementService.createEvent(event);
    }

    @GetMapping("/deleteEvent")
    public HttpStatus deleteEvent(@RequestParam(value="eventId") String eventId) {
        return eventManagementService.deleteEvent(eventId);
    }

    @GetMapping("/getEvents")
	public List<Event> getEvents(){
    	return eventManagementService.getEvents();
    }

	@GetMapping("/createSampleEvents")
	public HttpStatus makeEvents(String user){
		return eventManagementService.makeEvent(user);
	}

}
