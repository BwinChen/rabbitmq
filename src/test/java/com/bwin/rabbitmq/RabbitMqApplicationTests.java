package com.bwin.rabbitmq;

import com.bwin.rabbitmq.config.RabbitMqConfig;
import org.junit.jupiter.api.Test;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class RabbitMqApplicationTests {

    @Autowired
    private RabbitTemplate rabbitTemplate;

    @Test
    void topicTest() {
        rabbitTemplate.convertAndSend(RabbitMqConfig.TOPICNAME,
                "xiaomi.news","小米新闻..");
        rabbitTemplate.convertAndSend(RabbitMqConfig.TOPICNAME,
                "huawei.news","华为新闻..");
        rabbitTemplate.convertAndSend(RabbitMqConfig.TOPICNAME,
                "xiaomi.phone","小米手机..");
        rabbitTemplate.convertAndSend(RabbitMqConfig.TOPICNAME,
                "huawei.phone","华为手机..");
        rabbitTemplate.convertAndSend(RabbitMqConfig.TOPICNAME,
                "phone.news","手机新闻..");
    }

}
