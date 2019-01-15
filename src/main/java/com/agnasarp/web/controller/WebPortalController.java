/**
 * 
 */
package com.agnasarp.web.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Hasitha_08884
 *
 */

@RestController
@RequestMapping("/WebPortal")
public class WebPortalController {

	@RequestMapping(value = "/welcome", method = RequestMethod.GET)
	public String getWelcomeMsg() {

		return "Hello, welcome to the Agnasarp Web Portal!";
	}

}
