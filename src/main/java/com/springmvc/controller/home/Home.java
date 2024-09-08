package com.springmvc.controller.home;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.web.authentication.logout.SecurityContextLogoutHandler;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.springmvc.model.UserEntity;
import com.springmvc.service.UserService;

@Controller
public class Home {
	
	@Autowired
	private UserService userService;
	
	@RequestMapping(value = "home", method = RequestMethod.GET)
	public ModelAndView homePage() {
		ModelAndView mav = new ModelAndView("home");
		return mav;
	}
	
	@RequestMapping(value = "login", method = RequestMethod.GET)
	public ModelAndView loginPage() {
		ModelAndView mav = new ModelAndView("login");
		return mav;
	}
	
	@RequestMapping(value = "logout", method = RequestMethod.GET)
	public ModelAndView logoutPage(HttpServletRequest request, HttpServletResponse response) {
		Authentication auth = SecurityContextHolder.getContext().getAuthentication();
		if (auth != null) {
			new SecurityContextLogoutHandler().logout(request, response, auth);
		}
		return new ModelAndView("login");
	}
	
	@RequestMapping(value = "register", method = RequestMethod.GET)
	public ModelAndView showRegisterPage(ModelMap model) {
		UserEntity user = new UserEntity();
		model.put("UserEntity", user);
		return new ModelAndView("register");
	}
	
	@RequestMapping(value = "register", method = RequestMethod.POST)
	public ModelAndView addNewUser(UserEntity user, BindingResult result) {
		if(result.hasErrors()) {
			return new ModelAndView("register");
		}
		BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
		user.setPassword(passwordEncoder.encode(user.getPassword()));
		userService.addUser(user);
		return new ModelAndView("login");
	}
}
