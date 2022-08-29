package ru.hello.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author Victoria Zhirnova
 * @project mvc-hello-project
 */

@Controller
public class HelloController {


    @GetMapping("/hello")
    public String getHello(@RequestParam(name="name", required=false, defaultValue="World") String name,
                           Model model) {
        model.addAttribute("name", name);
        return "hello";
    }

    @GetMapping("/")
    public String getDefaultHello(@RequestParam(name="name", required=false, defaultValue="World") String name,
                                  Model model) {
        model.addAttribute("name", name);
        return "hello";
    }
}