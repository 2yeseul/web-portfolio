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
	@GetMapping(value="/p01")
	public String p01() {
		return "sittingCafe";
	}
	@GetMapping(value="/p02")
	public String p02() {
		return "Easy Baseball";
	}
}
