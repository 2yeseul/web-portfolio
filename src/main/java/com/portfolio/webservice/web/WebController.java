package com.portfolio.webservice.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class WebController {

	@GetMapping(value="/")
	public String index() {
		return "index";
	}
	@GetMapping(value="/test")
	public String test() {
		return "test";
	}
}
