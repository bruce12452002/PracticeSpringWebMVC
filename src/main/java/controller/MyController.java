package controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import bean.Animal;
import bean.Bird;

@Controller
@ComponentScan("bean")
public class MyController {
	@Autowired
	private Animal a;

	@Autowired
	private Bird b;

	@RequestMapping("ooo")
	public String xxx() {
		System.out.println(a);
		System.out.println(b);
		return "/WEB-INF/success.html";
	}
}
