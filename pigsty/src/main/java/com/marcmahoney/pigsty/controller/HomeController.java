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

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.marcmahoney.pigsty.model.Home;
import com.marcmahoney.pigsty.service.HomeService;

@Controller
@RequestMapping(value="/home")
public class HomeController {
	
	@Autowired
	HomeService homeService;
	
	@RequestMapping(value="/add", method=RequestMethod.GET)
	public ModelAndView addHome() {
		ModelAndView modelAndView = new ModelAndView("add-home");
		modelAndView.addObject("home", new Home());
		System.out.println("at least I'm in th right place");
		return modelAndView;
	}
	
//	@RequestMapping(value="/add", method=RequestMethod.POST)
//	public ModelAndView addingHome(@ModelAttribute Home home) {
//		ModelAndView modelAndView = new ModelAndView("home");
//		homeService.addHome(home);
//		
//		String message = "Home was successfully added.";
//		modelAndView.addObject("message", message);
//		
//		return modelAndView;
//	}
	
	@RequestMapping(value="/list")
	public ModelAndView listOfHomes() {
		ModelAndView modelAndView = new ModelAndView("list-of-homes");
		
		List<Home> homes = homeService.getHomes();
		modelAndView.addObject("homes", homes);
		
		return modelAndView;
	}
	
	@RequestMapping(value="/edit/address", method=RequestMethod.GET)
	public ModelAndView editHomePage(@PathVariable String address) {
		ModelAndView modelAndView = new ModelAndView("edit-home-form");
		Home home = homeService.getHome(address);
		modelAndView.addObject("home",home);
		return modelAndView;
	}
	
	@RequestMapping(value="/edit/address", method=RequestMethod.POST)
	public ModelAndView edditingHome(@ModelAttribute Home home, @PathVariable Integer id) {
		
		ModelAndView modelAndView = new ModelAndView("home");
		
		homeService.updateHome(home);
		
		String message = "Home was successfully edited.";
		modelAndView.addObject("message", message);
		
		return modelAndView;
	}
	
	@RequestMapping(value="/delete/address", method=RequestMethod.GET)
	public ModelAndView deleteHome(@PathVariable String address) {
		ModelAndView modelAndView = new ModelAndView("home");
		homeService.deleteHome(address);
		String message = "Home was successfully deleted.";
		modelAndView.addObject("message", message);
		return modelAndView;
	}
}
