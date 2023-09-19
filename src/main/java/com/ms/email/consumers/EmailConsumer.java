package com.ms.email.consumers;

import com.ms.email.dtos.EmailDto;
import com.ms.email.services.EmailService;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Component;


@Component
public class EmailConsumer {
  @Autowired
  EmailService emailService;
  
  /*
   * método que vai escutar as filas já definidas no application properties e na classe de configuração.
   */

  @RabbitListener(queues = "${spring.rabbitmq.queue}")
  public void listen(@Payload EmailDto emailDto) {
      emailService.sendEmail(emailDto.convertToEmailModel());

  }
}


