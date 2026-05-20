package com.wafaq.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.HashMap;
import java.util.Map;

@RestController
public class HomeController {
    @GetMapping("/health")
    public Map<String, Object> getData() {
        Map<String, Object> data = new HashMap<>();
        data.put("status", "ok");
        // Spring automatically sets HTTP status 200 OK
        return data;
    }
}