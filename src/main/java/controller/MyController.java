package controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MyController {

	@RequestMapping("ooo")
	public String xxx() {
		return "/WEB-INF/success.html";
	}
}
