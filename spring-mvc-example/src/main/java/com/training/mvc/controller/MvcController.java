package com.training.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MvcController {
	@RequestMapping(value = "/getName", method = RequestMethod.GET)
	public String getName(Model model) {
		model.addAttribute("name", "Kiran Kumar");
		model.addAttribute("age", 25);
		return "detail";
	}

	@RequestMapping(value = "/getDetail", method = RequestMethod.GET)
	@ResponseBody
	public String getDetails(Model model) {
		model.addAttribute("name", "Kiran Kumar");
		model.addAttribute("age", 25);
		return "detail";
	}

}
