package com.richo.test.kotlin_java_mix.java;

import com.richo.test.kotlin_java_mix.kotlin.User;

public class Service {
    public User getUser() {
        final User user = new User("Richo");
        System.out.println(user.doSomethingCircular());
        return user;
    }
}
