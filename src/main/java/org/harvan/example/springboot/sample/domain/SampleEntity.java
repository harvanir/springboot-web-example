/*
 * Copyright 2018-2018 the original author or authors.
 */

package org.harvan.example.springboot.sample.domain;

import java.io.Serializable;

/**
 * @author Harvan Irsyadi
 * @version 1.0.0
 * @since 1.0.0 (23 Aug 2018)
 */
public class SampleEntity implements Serializable {
    private String message;

    public SampleEntity() {
        // required for jackson
    }

    public SampleEntity(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}