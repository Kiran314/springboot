package com.training.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.training.mvc.model.Customer;

@Controller
public class CustomerController {

	@RequestMapping(value = "/addCustomer", method = RequestMethod.POST)
	public String addCustomer(@ModelAttribute Customer customer, Model model) {
		model.addAttribute("customer", customer);
		return "customer";
	}

	@RequestMapping(value = "/customer", method = RequestMethod.GET)
	public ModelAndView customer() {
		return new ModelAndView("addCust", "customer", new Customer());
	}

}
