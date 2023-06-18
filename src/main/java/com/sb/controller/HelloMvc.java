package com.sb.controller;


//https://stackoverflow.com/questions/26005483/org-springframework-web-servlet-dispatcherservlet-nohandlerfound
//imp

import org.springframework.stereotype.Controller;
	import org.springframework.web.bind.annotation.RequestMapping;
	import org.springframework.web.servlet.ModelAndView; 
	 
	@Controller
	public class HelloMvc {
		@RequestMapping("/Hello")
		public ModelAndView showMessage() {
			ModelAndView mv = new ModelAndView("HelloPage");
			String msg="hello world";
			mv.addObject("hi",msg);
			
			return mv;
		}
	}

