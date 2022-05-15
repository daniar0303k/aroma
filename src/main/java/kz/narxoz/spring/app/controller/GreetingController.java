package kz.narxoz.spring.app.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class GreetingController {

    @GetMapping("/greeting")
    public String greeting(@RequestParam(name="name", required=false, defaultValue="World") String name, Model model,@RequestParam String surname,@RequestParam String car){
        model.addAttribute("surname", surname) ;
        model.addAttribute("car", car) ;
        return "greeting";
    }
}

