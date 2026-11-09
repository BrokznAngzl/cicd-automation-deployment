package com.training.open.api.profile_query;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(ApiConstants.OPEN_API + ApiConstants.V1)
public class GreetingController {

    @GetMapping(ApiConstants.GREETING)
    public String greeting() {
        return "I'm on my way !!";
    }

    @GetMapping(ApiConstants.PING)
    public String pingPong() {
        return "PONG !!";
    }
}
