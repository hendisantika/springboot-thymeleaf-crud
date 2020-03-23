package com.hendisantika.springbootthymeleafcrud.entity;

import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * Project : springboot-thymeleaf-crud
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 23/03/20
 * Time: 09.10
 */
@Entity
@Table(name = "categories")
public class Category extends AbstractEntity {

    private String name;

    @ManyToMany(mappedBy = "categories")
    private List<Article> articles;
}
