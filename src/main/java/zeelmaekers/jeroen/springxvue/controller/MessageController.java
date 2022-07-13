package zeelmaekers.jeroen.springxvue.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/api/messages")
public class MessageController {

    @GetMapping("/hello")
    public Mono<String> hello() {
        return Mono.just("Full stack Java Development with Spring Boot & VueJS");
    }

}
