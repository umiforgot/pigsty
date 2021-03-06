/**
 * pigsty
 * HomeController.java
 *
 * 
 *
 * @author Marc Mahoney
 * @version Mar 23, 2014
 */
package com.marcmahoney.pigsty.controller;

import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.marcmahoney.pigsty.model.Chore;
import com.marcmahoney.pigsty.model.Home;
import com.marcmahoney.pigsty.model.Roommate;
import com.marcmahoney.pigsty.service.ChoreService;
import com.marcmahoney.pigsty.service.HomeService;

@Controller
@Configuration
@ComponentScan("com.marcmahoney.pigsty.service")
@RequestMapping(value="/home")
public class HomeController {
	@Autowired
	HomeService homeService;
	
	@Autowired
	ChoreService choreService;
	
	@RequestMapping(value="/add", method=RequestMethod.GET)
	public ModelAndView addHome() {
		ModelAndView modelAndView = new ModelAndView("add-home-form");
		modelAndView.addObject("home", new Home());
		
		return modelAndView;
	}
	
	@RequestMapping(value="/add", method=RequestMethod.POST)
	public ModelAndView addingHome(@ModelAttribute Home home) {
		ModelAndView modelAndView = new ModelAndView("home");
		homeService.addHome(home);
		
		String message = "Home was successfully added.";
		modelAndView.addObject("message", message);
		
		return modelAndView;
	}
	
	@RequestMapping(value="/list")
	public ModelAndView listOfHomes() {
		ModelAndView modelAndView = new ModelAndView("list-of-homes");
		
		List<Home> homes = homeService.getHomes();
		modelAndView.addObject("homes", homes);
		
		return modelAndView;
	}
	
	@RequestMapping(value = "/{homeId}/roommates", method = RequestMethod.GET)
	public ModelAndView listOfRommates(@PathVariable int homeId){
		ModelAndView modelAndView = new ModelAndView("list-of-roommates");
		
		List<Roommate> roommates = homeService.getRoommates(homeId);
		modelAndView.addObject("roommates", roommates);
		
		return modelAndView;
	}
	
	@RequestMapping(value = "/{roommateId}/chores", method = RequestMethod.GET)
	public ModelAndView listOfChores(@PathVariable int roommateId){
		ModelAndView modelAndView = new ModelAndView("list-of-chores");
		
		List<Chore> chores = choreService.getChores(roommateId);
		modelAndView.addObject("chores", chores);
		
		return modelAndView;
	}
	
	
//	@RequestMapping(value="/edit/address", method=RequestMethod.GET)
//	public ModelAndView editHomePage(@PathVariable int id) {
//		ModelAndView modelAndView = new ModelAndView("edit-home-form");
//		Home home = homeService.getHome(id);
//		modelAndView.addObject("home",home);
//		return modelAndView;
//	}
//	
//	@RequestMapping(value="/edit/address", method=RequestMethod.POST)
//	public ModelAndView edditingHome(@ModelAttribute Home home, @PathVariable Integer id) {
//		
//		ModelAndView modelAndView = new ModelAndView("home");
//		
//		homeService.updateHome(home);
//		
//		String message = "Home was successfully edited.";
//		modelAndView.addObject("message", message);
//		
//		return modelAndView;
//	}
//	
//	@RequestMapping(value="/delete/address", method=RequestMethod.GET)
//	public ModelAndView deleteHome(@PathVariable int id) {
//		ModelAndView modelAndView = new ModelAndView("home");
//		homeService.deleteHome(id);
//		String message = "Home was successfully deleted.";
//		modelAndView.addObject("message", message);
//		return modelAndView;
//	}
	
	
}
