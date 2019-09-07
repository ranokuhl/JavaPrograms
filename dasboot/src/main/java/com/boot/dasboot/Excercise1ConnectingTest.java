package com.boot.dasboot;

import com.mongodb.client.MongoClient;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;


public class Excercise1ConnectingTest {

    @Test
    public void shouldCreateANewMongoClientConnectedToLocalhost() throws Exception {

        MongoClient mongoClient = null;

        assertThat(mongoClient, is(notNullValue()));
    }
}
