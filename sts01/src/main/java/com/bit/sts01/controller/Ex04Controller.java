package com.bit.sts01.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/test")
public class Ex04Controller {

	@RequestMapping(value = "/ex05",params = {"page"},method = RequestMethod.GET)
	public String ex04(HttpServletRequest req) {
		System.out.println(req.getParameter("page"));
		return "ex05";
	}
	@RequestMapping(value="/ex05",method=RequestMethod.GET)
	public String ex03() {
		System.out.println("page��û����");
		return "ex05";
	}
	@RequestMapping("/ex/ex05")
	public String ex02() {
		return "ex05";
	}
}







