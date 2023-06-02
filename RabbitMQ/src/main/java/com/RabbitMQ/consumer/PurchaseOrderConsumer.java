package com.RabbitMQ.consumer;

import org.springframework.amqp.rabbit.annotation.RabbitListener;

import com.RabbitMQ.config.MessagingConfig;
import com.RabbitMQ.model.OrderStatus;

public class PurchaseOrderConsumer {

	@RabbitListener(queues="ust_queue")
	public void consumeMessageFromQueue(OrderStatus orderStatus) {
		System.out.println("Message received from queue :"+ orderStatus);
	}
}
