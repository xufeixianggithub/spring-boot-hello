package com.surd.springboot128.provide;

import java.util.Date;

import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
@Component
public class HelloSender1 {

    @Autowired
    private AmqpTemplate rabbitTemplate;

    public void send(String pramas) {
        String context = "hello1 "+pramas;
  
        //System.out.println("Sender : " + context);
        
        this.rabbitTemplate.convertAndSend("hello", context);
    }

}