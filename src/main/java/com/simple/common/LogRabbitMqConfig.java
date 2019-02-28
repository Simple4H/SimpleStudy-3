package com.simple.common;

import org.springframework.amqp.core.Binding;
import org.springframework.amqp.core.BindingBuilder;
import org.springframework.amqp.core.Queue;
import org.springframework.amqp.core.TopicExchange;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @Author: Simple4H
 * @Date: 2019/02/28 17:03:42
 */

@Configuration
public class LogRabbitMqConfig {

    private final static String QUEUE_LOG_ERROR = "log.error";
    private final static String QUEUE_LOG_ALL = "log.all";

    //创建log.error队列
    @Bean
    public Queue logError() {
        return new Queue(QUEUE_LOG_ERROR);
    }

    //创建log.all队列
    @Bean
    public Queue logAll() {
        return new Queue(QUEUE_LOG_ALL);

    }

    // 创建TopicExchange。topic交换器，将路由键和某模式进行匹配，此时队列需要绑定要一个模式上。
    // 关于模式，符号#匹配一个或多个词，符号*匹配一个词
    // 因此kfs.#能够匹配到kfs.session.message，但是audit.*只会匹配到audit.session。
    @Bean
    TopicExchange exchange() {
        return new TopicExchange("log");
    }

    @Bean
        // 绑定队列log.error到exchange中routingKey为log.error
    Binding bindingExchangeError(Queue logError, TopicExchange exchange) {
        return BindingBuilder.bind(logError).to(exchange).with("log.error");
    }

    @Bean
        //绑定队列log.all到exchange中routingKey为log.all
    Binding bindingExchangeAll(Queue logAll, TopicExchange exchange) {
        return BindingBuilder.bind(logAll).to(exchange).with("log.#");
    }

}