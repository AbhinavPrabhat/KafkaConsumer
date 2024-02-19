package com.fareye.ops.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HealthCheckController {
    @GetMapping("/api/rest/v1/health-check")
    public ResponseEntity<Object> live() {
        return new ResponseEntity<>("Ops Dashboard Event Consumer service is live", HttpStatus.OK);
    }

}
