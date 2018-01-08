package com.richo.test.kotlin_java_mix.java;

import org.junit.Test;

import static org.junit.Assert.assertNotNull;

public class ServiceTest {
    @Test
    public void name() {
        assertNotNull(new Service().getUser());
    }
}
