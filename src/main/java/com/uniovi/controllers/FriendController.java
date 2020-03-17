package com.uniovi.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.uniovi.services.FriendService;

@Controller
public class FriendController {

	
	@Autowired
	private FriendService friendService;
	
	
	@RequestMapping("/friend/list")
	public String getListado(Model model) {
		
			model.addAttribute("requestList",friendService.getFriends());
		
		
		return "friend/list";
	}
}
