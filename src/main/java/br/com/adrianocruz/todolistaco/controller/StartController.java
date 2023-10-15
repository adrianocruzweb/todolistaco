package br.com.adrianocruz.todolistaco.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RestController;

@Controller
@RestController
public class StartController {
    public String firstMessage(){
        return "it works";
    }
}
