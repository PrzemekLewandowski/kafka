package consumer.demo;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class Consumer {

    @KafkaListener(topics = "horror")
    public void reader(String message) {
        System.out.println(message);
    }
}
