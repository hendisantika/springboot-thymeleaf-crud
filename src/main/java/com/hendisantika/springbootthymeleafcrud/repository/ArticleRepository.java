package com.hendisantika.springbootthymeleafcrud.repository;

import com.hendisantika.springbootthymeleafcrud.entity.Article;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by IntelliJ IDEA.
 * Project : springboot-thymeleaf-crud
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 23/03/20
 * Time: 09.12
 */
public interface ArticleRepository extends JpaRepository<Article, Long> {

}
