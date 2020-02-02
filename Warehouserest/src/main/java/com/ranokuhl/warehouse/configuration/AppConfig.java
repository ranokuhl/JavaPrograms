package com.ranokuhl.warehouse.configuration;

import com.mongodb.Mongo;
import com.mongodb.MongoClient;
import com.ranokuhl.warehouse.repositories.ProductRepository;
import com.ranokuhl.warehouse.services.ProductService;
import com.ranokuhl.warehouse.services.ProductServiceImpl;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;
import org.springframework.data.mongodb.core.MongoTemplate;

@Configuration
@ComponentScan({"com.ranokuhl"})
public class AppConfig {

    @Bean
    public MongoClient mongoClient() {
        return new MongoClient("localhost");
    }

    @Bean
    public MongoTemplate mongoTemplate() {
        return new MongoTemplate(mongoClient(), "warehouse");
    }

/*   @Bean(name = "productService")
    @Scope(value= BeanDefinition.SCOPE_SINGLETON)
    public ProductService getSpeakerService() {
        //SpeakerServiceImpl service = new SpeakerServiceImpl(getSpeakerRepository());
       //service.setRepository(getSpeakerRepository());
        return new ProductServiceImpl();
    }*/
}
