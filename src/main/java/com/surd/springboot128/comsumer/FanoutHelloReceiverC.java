package com.surd.springboot128.comsumer;

import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
@RabbitListener(queues = "fanout.C")
public class FanoutHelloReceiverC {

    @RabbitHandler
    public void process(String hello) {
        System.out.println("FanoutHelloReceiverC  : " + hello);
    }

}