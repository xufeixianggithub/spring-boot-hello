package com.surd.springboot128.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.surd.springboot128.dao.UserDao;
import com.surd.springboot128.entity.User;
import com.surd.springboot128.provide.FanoutHelloSender;
import com.surd.springboot128.provide.HelloSender1;
import com.surd.springboot128.provide.HelloSender2;
import com.surd.springboot128.provide.HelloSender3;
import com.surd.springboot128.provide.HelloSender4;

@RestController
public class UserController {
	@Autowired
	UserDao UserDao;
	
	@Autowired
    private HelloSender1 helloSender1;
	@Autowired
    private HelloSender2 helloSender2;
	
	@Autowired
    private HelloSender3 helloSender3;
	
	@Autowired
    private HelloSender4 helloSender4;
	
	@Autowired
    private FanoutHelloSender fanoutHelloSender;
	
	
	
	@RequestMapping("hello")
	public String say() {
		
		
		/* for (int i=0;i<100;i++){
			 helloSender1.send(i+"");
			 helloSender2.send(i+"");
		    }*/
		
		
		
		User u=UserDao.findAll();
		
		fanoutHelloSender.send();
		
		//System.out.println(u);
		return "index";
	}
}
