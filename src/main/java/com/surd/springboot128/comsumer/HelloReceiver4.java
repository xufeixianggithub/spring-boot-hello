package com.surd.springboot128.comsumer;

import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

import com.surd.springboot128.entity.User;
@Component
public class HelloReceiver4 {

	//接受者
	@RabbitListener(queues = "topic.message")
	@RabbitHandler
	public void process(String pramas) {
	    System.out.println("topic.message  Receiver object : "+pramas);
	}

}