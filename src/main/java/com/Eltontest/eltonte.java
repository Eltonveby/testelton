package com.Eltontest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;


@Controller
public class eltonte {
	@RequestMapping("name")
	@ResponseBody
	public String name() {
		return "ELTON";
	}

	@RequestMapping("el")
	public String first(HttpServletRequest request) {
		HttpSession s = request.getSession();
		String s1=request.getParameter("name");
		String s2=request.getParameter("no");
		
	    s.setAttribute("user",s1);
	    s.setAttribute("number", s2);
	    return "el";
	}
	
	
	}
	

