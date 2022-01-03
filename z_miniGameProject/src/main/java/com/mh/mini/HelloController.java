package com.mh.mini;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloController {

	@GetMapping("/")
	public String index() {
		return "Greet ings from Strping Boot!! 미니게임 프로젝트!";
	}
}
