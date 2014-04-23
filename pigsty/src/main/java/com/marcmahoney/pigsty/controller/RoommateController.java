/**
 * pigsty
 * RoommateController.java
 *
 * 
 *
 * @author Marc Mahoney
 * @version Apr 21, 2014
 */
package com.marcmahoney.pigsty.controller;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@Configuration
@ComponentScan("com.marcmahoney.pigsty.service")
@RequestMapping(value="/roommate")
public class RoommateController {
	
	
}
