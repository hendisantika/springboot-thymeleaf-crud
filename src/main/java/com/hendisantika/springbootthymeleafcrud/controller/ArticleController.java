package com.hendisantika.springbootthymeleafcrud.controller;

import com.hendisantika.springbootthymeleafcrud.entity.Article;
import com.hendisantika.springbootthymeleafcrud.service.ArticleService;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.bind.support.SessionStatus;

import static com.hendisantika.springbootthymeleafcrud.util.WordUtil.toSlug;

/**
 * Created by IntelliJ IDEA.
 * Project : springboot-thymeleaf-crud
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 23/03/20
 * Time: 09.18
 */
@Log4j2
@Controller
@RequestMapping("articles")
@SessionAttributes("articles")
public class ArticleController {

    @Autowired
    private ArticleService articleService;

    @GetMapping
    public String index(Model model) {
        model.addAttribute("articles", articleService.getArticles());
        return "articles/index";
    }

    @GetMapping("/search")
    public String search(@RequestParam(value = "term", required = false, defaultValue = "") String term, Model model) {
        model.addAttribute("articles", articleService.search(term));
        return "articles/index";
    }

    @GetMapping("/view/{slug}")
    public String view(@PathVariable String slug, Model model) {
        model.addAttribute("articleView", articleService.getArticle(slug));
        return "articles/view";
    }

    @GetMapping("/create")
    public String create(Article article) {
        return "articles/process";
    }

    @GetMapping("/update/{slug}")
    public String update(@PathVariable String slug, Model model) {
        model.addAttribute("article", articleService.getArticle(slug));
        return "articles/process";
    }

    @PostMapping("/process")
    public String process(Article article, SessionStatus sessionStatus) {
        log.info("Adding New Article");
        String slug = toSlug(article.getTitle());
        article.setSlug(slug);
        articleService.save(article);
        sessionStatus.setComplete();
        log.info("Add New Article success.");
        return "redirect:/articles";
    }

    @GetMapping("/delete/{id}")
    public String delete(@PathVariable Long id) {
        articleService.delete(id);
        log.info("Deleting Article");
        return "redirect:/articles";
    }

}
