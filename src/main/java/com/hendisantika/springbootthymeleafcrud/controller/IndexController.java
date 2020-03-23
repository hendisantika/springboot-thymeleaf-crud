package com.hendisantika.springbootthymeleafcrud.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.time.LocalDateTime;

/**
 * Created by IntelliJ IDEA.
 * Project : springboot-thymeleaf-crud
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 23/03/20
 * Time: 10.38
 */
@Controller
@RequestMapping("/")
public class IndexController {
    @GetMapping
    public String index(Model model) {
        model.addAttribute("waktu", LocalDateTime.now());
        return "index";
    }
}
