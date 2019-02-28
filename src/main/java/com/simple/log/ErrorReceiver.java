package com.simple.log;

import lombok.extern.slf4j.Slf4j;
import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

/**
 * @Author: Simple4H
 * @Date: 2019/02/28 17:41:07
 */
@Component
@RabbitListener(queues = "log.error")
@Slf4j
public class ErrorReceiver {

    @RabbitHandler
    public void process(String context) {
        log.error("receiver error:{}", context);
    }
}
