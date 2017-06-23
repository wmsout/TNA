package com.oracle.tna.user.controller;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.oracle.tna.domain.User;
import com.oracle.tna.service.LoginService;


@Controller

public class LoginController {
	
   
	private LoginService login = LoginService.getLoginService();
	
    @RequestMapping("/login.do")
    public String Login(Model model, String account,String password) throws Exception {
    	
    	User user;
    	user = login.getUser(account);
    	model.addAttribute("password",user.getPassword());
        return "form2";
        }
}

