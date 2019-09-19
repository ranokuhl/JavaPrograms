package com.ranokuhl.mongostore.services;

import com.ranokuhl.mongostore.models.DeliveryInfo;
import com.ranokuhl.mongostore.models.LegoSet;
import com.ranokuhl.mongostore.models.LegoSetDifficulty;
import com.ranokuhl.mongostore.models.ProductReview;
import org.springframework.boot.CommandLineRunner;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.Collection;

@Service
public class DbSeeder implements CommandLineRunner {

    private MongoTemplate mongoTemplate;

    public DbSeeder(MongoTemplate mongoTemplate) {
        this.mongoTemplate = mongoTemplate;
    }

    @Override
    public void run(String... args) {
        this.mongoTemplate.dropCollection(LegoSet.class);

        LegoSet milleniumFalcon = new LegoSet(
                "Millennium Falcon",
                "Star Wars",
                LegoSetDifficulty.HARD,
                new DeliveryInfo(
                        LocalDate.now().plusDays(1),
                        30,
                        true),
                Arrays.asList(
                        new ProductReview("Dan", 7),
                        new ProductReview("Anna", 10),
                        new ProductReview("John", 8)
                )
        );

        LegoSet skyPolice = new LegoSet(
                "skyPolice",
                "City",
                LegoSetDifficulty.MEDIUM,
                new DeliveryInfo(LocalDate.now().plusDays(3), 50, true),
                Arrays.asList(
                        new ProductReview("Dan", 9),
                        new ProductReview("Andrew", 9)
                )
        );

        LegoSet mcLarenSenna = new LegoSet(
                "McLaren Senna",
                "Speed Champions",
                LegoSetDifficulty.EASY,
                new DeliveryInfo(LocalDate.now().plusDays(7), 70, false),
                Arrays.asList(
                        new ProductReview("Bogdan", 7),
                        new ProductReview("Christa", 10)
                )
        );

        LegoSet mindstormsEye = new LegoSet(
                "MindStorms eve",
                "Mindstorms",
                LegoSetDifficulty.HARD,
                new DeliveryInfo(LocalDate.now().plusDays(10), 100, false),
                Arrays.asList(
                        new ProductReview("Cosmin", 10),
                        new ProductReview("Jane", 9),
                        new ProductReview("James", 10)
                )
        );

        Collection<LegoSet> initialProducts = Arrays.asList(
                milleniumFalcon,
                mindstormsEye,
                mcLarenSenna,
                skyPolice);
        this.mongoTemplate.insertAll(initialProducts);
    }




}
