package com.bit.sts01.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/*
 * POJO(Plain Old Java Object, ������ POJO�� �� �״�� �ؼ��� �ϸ� 
 * 								������ ����� ������ �ڹ� ������Ʈ)
*/
@Controller
public class Ex01Controller {

	@RequestMapping("/ex01.bit")
	public ModelAndView ex01(){
		return new ModelAndView("ex01");
	}

}
