package com.hendisantika.springbootthymeleafcrud.repository;

import com.hendisantika.springbootthymeleafcrud.entity.Article;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

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
    @Query("from Article a where a.slug = :slug")
    Article findArticle(@Param("slug") String slug);

    Article findBySlug(String slug);
}
