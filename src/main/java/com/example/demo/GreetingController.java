package com.example.demo;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class GreetingController {
    @GetMapping("/greeting")
    public String greeting(@RequestParam(name="name", required=false, defaultValue="World") String name, Model model,
                           @RequestParam(name = "surname", required=false, defaultValue="World") String surname, Model model1) {
        model.addAttribute("name", name );
        model1.addAttribute("surname", surname );
        return "greeting";
    }
}
