package com.ranokuhl.warehouse.models;

import com.querydsl.core.types.Path;
import com.querydsl.core.types.PathMetadata;
import com.querydsl.core.types.dsl.BeanPath;
import com.querydsl.core.types.dsl.StringPath;

import javax.annotation.Generated;

import static com.querydsl.core.types.PathMetadataFactory.forVariable;


/**
 * QArticle is a Querydsl query type for Article
 */
@Generated("com.querydsl.codegen.EmbeddableSerializer")
public class QArticle extends BeanPath<Article> {

    private static final long serialVersionUID = 1482918528L;

    public static final QArticle article = new QArticle("article");

    public final StringPath articleId = createString("articleId");

    public final StringPath articleName = createString("articleName");

    public final StringPath stock = createString("stock");

    public QArticle(String variable) {
        super(Article.class, forVariable(variable));
    }

    public QArticle(Path<? extends Article> path) {
        super(path.getType(), path.getMetadata());
    }

    public QArticle(PathMetadata metadata) {
        super(Article.class, metadata);
    }

}

