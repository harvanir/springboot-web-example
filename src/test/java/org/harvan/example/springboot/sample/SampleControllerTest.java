/*
 * Copyright 2018-2018 the original author or authors.
 */

package org.harvan.example.springboot.sample;

import org.harvan.example.springboot.Application;
import org.harvan.example.springboot.sample.domain.SampleEntity;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

/**
 * @author Harvan Irsyadi
 * @version 1.0.0
 */
@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT, classes = Application.class)
public class SampleControllerTest {
    @Autowired
    private TestRestTemplate restTemplate;

    @Test
    public void testHome() {
        ResponseEntity<SampleEntity> responseEntity = restTemplate.getForEntity("/", SampleEntity.class);
        String body = responseEntity.getBody().getMessage();

        assertNotNull(body);
        assertEquals("Hello World! using properties", body);
    }
}