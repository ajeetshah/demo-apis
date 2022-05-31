package com.example.demo.quote;

import com.example.demo.user.UserResponse;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/v1/quotes")
@RestController
public class QuoteController {

    @GetMapping("/quote-of-the-day")
    public QuoteResponse getQuoteOfTheDay () {
        return new QuoteResponse();
    }

}
