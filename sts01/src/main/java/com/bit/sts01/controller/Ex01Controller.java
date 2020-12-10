package com.bit.sts01.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/*
 * POJO(Plain Old Java Object, 간단히 POJO는 말 그대로 해석을 하면 
 * 								오래된 방식의 간단한 자바 오브젝트)
*/
@Controller
public class Ex01Controller {

	@RequestMapping("/ex01.bit")
	public ModelAndView ex01(){
		return new ModelAndView("ex01");
	}

}
