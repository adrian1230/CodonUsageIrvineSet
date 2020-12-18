package com._.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class NetworkController {
    @GetMapping
    public String getNetworks() {
        return "Your Network";
    }
}
