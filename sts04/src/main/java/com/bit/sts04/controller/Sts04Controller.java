package com.bit.sts04.controller;

import java.sql.SQLException;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Sts04Controller {

	@RequestMapping("/")
	public String index(Model model,HttpServletRequest req) throws SQLException {
		String[] arr= {
				"big01.jpg",
				"big02.jpg",
				"big03.jpg",
				"big04.jpg",
				"big05.jpg",
				"big06.jpg"
		};
//		model.addAttribute("imgs", arr);
		req.setAttribute("imgs", arr);
		return "home";
	}
}
