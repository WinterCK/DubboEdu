package org.dubbo.kafka.producer;

import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;
import org.springframework.util.concurrent.ListenableFuture;

/**
 * 生产者
 * 使用@EnableScheduling注解开启定时任务
 */
@Component
@EnableScheduling//SPRING的定时任务
public class KafkaProducer {
	@Autowired
	private KafkaTemplate kafkaTemplate;
	
	/**
     * 定时任务
     */
    @SuppressWarnings({ "unchecked", "rawtypes" })
	@Scheduled(cron = "0/55 * * * * ?")
	public void send() {
		String message = "12433";
		ListenableFuture future = kafkaTemplate.send("app_log", message);
		future.addCallback(o -> System.out.println("send-消息发送成功：" + message)
				, throwable -> System.out.println("消息发送失败：" + message));
	}
}
