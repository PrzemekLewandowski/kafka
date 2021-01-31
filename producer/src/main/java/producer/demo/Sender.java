package producer.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Sender {

    @Autowired
    private KafkaTemplate kafkaTemplate;

    @GetMapping
    public String sendToKafka(@RequestParam String category, @RequestParam String movie) {
        kafkaTemplate.send(category, movie);
        return "sent";
    }
}
