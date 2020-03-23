package com.hendisantika.springbootthymeleafcrud.service;

import com.hendisantika.springbootthymeleafcrud.repository.ArticleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by IntelliJ IDEA.
 * Project : springboot-thymeleaf-crud
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 23/03/20
 * Time: 09.14
 */
@Service
public class ArticleService {

    @Autowired
    private ArticleRepository articleRepository;
}
