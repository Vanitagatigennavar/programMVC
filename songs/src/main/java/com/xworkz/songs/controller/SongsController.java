package com.xworkz.songs.controller;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;

@Component
@RequestMapping("/")
public class SongsController {

	public SongsController() {
		System.out.println("created default constructor");
	}
	@RequestMapping("/start.do")
	public String onClick() {
		
		System.out.println("running the onclick method");
		return "index.jsp";
		
		
	}

}
