package com.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.ui.Model;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.List;
import com.example.domain.Example;
import com.example.service.ExampleService;

@Controller
public class HomeController {

    @Autowired
    private ExampleService exampleService;

    @RequestMapping("/")
    public String home(Model model) {
        List<Example> list = exampleService.getExamples();
        model.addAttribute("examples", list);
        return "home"; // → /WEB-INF/views/home.jsp
    }
}

