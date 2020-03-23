package com.hendisantika.springbootthymeleafcrud.controller;

import com.hendisantika.springbootthymeleafcrud.service.ArticleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.SessionAttributes;

/**
 * Created by IntelliJ IDEA.
 * Project : springboot-thymeleaf-crud
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 23/03/20
 * Time: 09.18
 */
@Controller
@SessionAttributes("article")
public class ArticleController {

    @Autowired
    private ArticleService articleService;
}
