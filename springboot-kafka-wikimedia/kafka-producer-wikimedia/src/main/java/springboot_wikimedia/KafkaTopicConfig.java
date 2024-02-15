package springboot_wikimedia;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.TopicBuilder;

//// ---------CREATED A KAFKA TOPIC NAMED WIKIMEDIA_RECENTCHANGE-----------
@Configuration
public class KafkaTopicConfig {
    @Bean
    public NewTopic topic(){
      return TopicBuilder.name("wikimwdia_recentchange")
              .build();
  }
}
