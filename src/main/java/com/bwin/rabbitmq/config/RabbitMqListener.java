package com.bwin.rabbitmq.config;

import lombok.extern.slf4j.Slf4j;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

/**
 * @author McAfee
 */
@Slf4j
@Component
public class RabbitMqListener {

    @RabbitListener(queues = "phone")
    public void handler1(String message) {
        log.info("PhoneReceiver:" + message);
    }

    @RabbitListener(queues = "xiaomi")
    public void handler2(String message) {
        log.info("XiaoMiReceiver:"+message);
    }

    @RabbitListener(queues = "huawei")
    public void handler3(String message) {
        log.info("HuaWeiReceiver:"+message);
    }

}
