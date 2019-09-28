package com.ranokuhl.warehouse.models;

import com.querydsl.core.types.Path;
import com.querydsl.core.types.PathMetadata;
import com.querydsl.core.types.dsl.*;

import javax.annotation.Generated;

import static com.querydsl.core.types.PathMetadataFactory.forVariable;


/**
 * QProduct is a Querydsl query type for Product
 */
@Generated("com.querydsl.codegen.EmbeddableSerializer")
public class QProduct extends BeanPath<Product> {

    private static final long serialVersionUID = 1905822329L;

    public static final QProduct product = new QProduct("product");

    public final ListPath<Parts, SimplePath<Parts>> contain_articles = this.<Parts, SimplePath<Parts>>createList("contain_articles", Parts.class, SimplePath.class, PathInits.DIRECT2);

    public final StringPath name = createString("name");

    public QProduct(String variable) {
        super(Product.class, forVariable(variable));
    }

    public QProduct(Path<? extends Product> path) {
        super(path.getType(), path.getMetadata());
    }

    public QProduct(PathMetadata metadata) {
        super(Product.class, metadata);
    }

}

