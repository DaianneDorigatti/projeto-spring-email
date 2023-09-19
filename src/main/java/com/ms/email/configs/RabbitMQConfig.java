package com.ms.email.configs;

import org.springframework.amqp.core.Queue;
import org.springframework.amqp.support.converter.Jackson2JsonMessageConverter;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


/*
 * Usamos o bean para gerar uma nova fila que vai cuidar dos envios de email.
 */

@Configuration
public class RabbitMQConfig {
  @Value("${spring.rabbitmq.queue}")
  private String queue;
  

  @Bean
  public Queue queue() {
      return new Queue(queue, true);
  }
  
  /*
   * Conversor global para o payload de EmailDto no método listen.
   */

  @Bean
  public Jackson2JsonMessageConverter messageConverter() {
      return new Jackson2JsonMessageConverter();
  }

}
