package com.simple.common;

import lombok.extern.slf4j.Slf4j;
import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @Author: Simple4H
 * @Date: 2019/02/28 17:22:35
 */
@Component
@Slf4j
public class RabbitMqSender {

    private final AmqpTemplate rabbitTemplate;

    @Autowired
    public RabbitMqSender(AmqpTemplate rabbitTemplate) {
        this.rabbitTemplate = rabbitTemplate;
    }

    public void send() {
        // 向mq服务端发送消息，exchange为log，routingKey为log.error
        String context = "error log";
        this.rabbitTemplate.convertAndSend("log", "log.error", context);

        // 向mq服务端发送消息，exchange为log，routingKey为log.info
        context = "info log";
        log.info("send info context:{}", context);
        this.rabbitTemplate.convertAndSend("log", "log.info", context);

        // 向mq服务端发送消息，exchange为log，routingKey为log.warn
        context = "warm log";
        log.warn("send warm context:{}",context);
        this.rabbitTemplate.convertAndSend("log", "log.warm", context);
    }
}
