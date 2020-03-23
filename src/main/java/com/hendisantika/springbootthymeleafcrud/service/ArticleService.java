package com.hendisantika.springbootthymeleafcrud.service;

import com.hendisantika.springbootthymeleafcrud.entity.Article;
import com.hendisantika.springbootthymeleafcrud.exception.ArticleNotFoundException;
import com.hendisantika.springbootthymeleafcrud.repository.ArticleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

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

    public List<Article> getArticles() {
        return articleRepository.findAll();
    }

    public Article save(Article article) {
        return articleRepository.save(article);
    }

    public Article getArticle(Long id) throws ArticleNotFoundException {
        Article article =
                articleRepository.findById(id).orElseThrow(() -> new ArticleNotFoundException(String.format("Article " +
                        "id %s is not found", id)));
        return article;
    }

    public Article getArticle(String slug) throws ArticleNotFoundException {
        Article article = articleRepository.findBySlug(slug);
        if (article == null)
            throw new ArticleNotFoundException(String.format("Article id %s is not found", slug));
        return article;
    }
}
