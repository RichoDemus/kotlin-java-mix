package com.richo.test.kotlin_java_mix.main;

import com.richo.test.kotlin_java_mix.java.Service;
import com.richo.test.kotlin_java_mix.kotlin.User;

public class App
{
    public static void main( String[] args )
    {
        final User user = new Service().getUser();
        System.out.println( "Hello World " + user);
    }
}
