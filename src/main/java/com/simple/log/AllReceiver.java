package com.simple.log;

import lombok.extern.slf4j.Slf4j;
import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

/**
 * @Author: Simple4H
 * @Date: 2019/02/28 17:29:46
 */
@Component
@RabbitListener(queues = "log.all")
@Slf4j
public class AllReceiver {

    @RabbitHandler
    public void process(String context) {
        log.info("receive log:{}", context);
    }

}
