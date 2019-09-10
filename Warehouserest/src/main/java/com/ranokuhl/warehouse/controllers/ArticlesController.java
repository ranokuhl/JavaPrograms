package com.ranokuhl.warehouse.controllers;

import com.ranokuhl.warehouse.models.Articles;
import com.ranokuhl.warehouse.repositories.ArticlesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "api/v1")
public class ArticlesController {

    @Autowired
    private ArticlesRepository articlesRepository;


    // Methods for articles
    @RequestMapping(value = "/articles", method = RequestMethod.GET)
    public List<Articles> getAllArticles() {
        return articlesRepository.findAll();
    }
}
