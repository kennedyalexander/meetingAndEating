package com.meetAndEat.controllers;

import com.meetAndEat.models.UserDetails;
import com.meetAndEat.services.UserManagementServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@EnableAutoConfiguration
@RequestMapping("/api")
public class AppController {

    @Autowired
    UserManagementServiceImpl userManagementServiceImpl;


//        @RequestMapping("/userDetails")
//        public UserDetails userDetails(@RequestParam(value="username") String username) {
//            userManagementServiceImpl.getUserInformation(String username);
//            return new UserDetails( );
//        }

    @GetMapping("/getUserDetails")
    public UserDetails getUserDetails(@RequestParam(value="username") String username) {

        return userManagementServiceImpl.getUserInformation(username);
    }

    @PostMapping("/updateUserDetails")
    public ResponseEntity<?> updateUserDetails(@RequestBody UserDetails userDetails, @RequestParam(value="username") String username) {
//get details for user
        //assemble details into thing
	    System.out.println("Stub Lol");
        return new ResponseEntity<>(HttpStatus.ACCEPTED);
    }

    @PostMapping("/createUserDetails")
    public UserDetails createUserDetails(@RequestParam(value="username") String username) {
		userManagementServiceImpl.createUser(username,)
        return userManagementServiceImpl.getUserInformation(username);
    }

    @GetMapping("/deleteUserDetails")
    public UserDetails deleteUserDetails(@RequestParam(value="username") String username) {

        return userManagementServiceImpl.getUserInformation(username);
    }

//    @RequestMapping(method = RequestMethod.POST)
//    public ResponseEntity<?> addPie(@RequestBody Pie input) {
//        return new ResponseEntity<>(repository.save(input), HttpStatus.CREATED);

    @GetMapping("/getEvent")
    public UserDetails getEvent(@RequestParam(value="eventID") String eventID) {

        return userManagementServiceImpl.getUserInformation(username);
    }

    @PostMapping("/updateEvent")
    public UserDetails updateEvent(@RequestParam(value="username") String username) {

        return userManagementServiceImpl.getUserInformation(username);
    }

    @PostMapping("/createEvent")
    public UserDetails createEvent(@RequestParam(value="username") String username) {

        return userManagementServiceImpl.getUserInformation(username);
    }

    @GetMapping("/deleteEvent")
    public UserDetails deleteEvent(@RequestParam(value="username") String username) {

        return userManagementServiceImpl.getUserInformation(username);
    }

}
