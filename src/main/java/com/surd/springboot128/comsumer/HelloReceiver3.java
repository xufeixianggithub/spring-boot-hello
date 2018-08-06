package com.surd.springboot128.comsumer;

import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

import com.surd.springboot128.entity.User;

@Component
@RabbitListener(queues = "hello")
public class HelloReceiver3 {

	//接受者
	@RabbitHandler
	public void process(User user) {
	    System.out.println("Receiver object : " + user);
	}

}