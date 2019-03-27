package org.dubbo.web;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class KafkaConsumer {
	
	@KafkaListener(topics = {"app_log"})
	public void receive(String message) {
		System.out.println("app_log--消费消息：" + message);
	}

}
