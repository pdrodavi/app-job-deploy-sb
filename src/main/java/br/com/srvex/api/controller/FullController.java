package br.com.srvex.api.controller;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FullController {

    @GetMapping("/hello")
    public ResponseEntity<String> hello() {
        return ResponseEntity.status(200).body("Full Deploy Pipe with Registry Image Docker in Jfrog");
    }

}