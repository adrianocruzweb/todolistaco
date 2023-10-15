package br.com.adrianocruz.todolistaco.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
@RestController
@RequestMapping("/firstRoute")
public class StartController {
    @GetMapping("/")
    public String firstMessage(){
        return "it works";
    }
}
