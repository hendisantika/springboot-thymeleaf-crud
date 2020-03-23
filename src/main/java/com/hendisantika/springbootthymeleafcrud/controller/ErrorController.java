package com.hendisantika.springbootthymeleafcrud.controller;

import com.hendisantika.springbootthymeleafcrud.exception.ArticleNotFoundException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

/**
 * Created by IntelliJ IDEA.
 * Project : springboot-thymeleaf-crud
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 23/03/20
 * Time: 09.18
 */
@ControllerAdvice
public class ErrorController {

    @ExceptionHandler(value = {NumberFormatException.class, ArticleNotFoundException.class})
    public String error404() {
        return "error/404";
    }

}