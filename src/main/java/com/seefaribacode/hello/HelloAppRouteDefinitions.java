package com.seefaribacode.hello;

public class HelloAppRouteDefinitions implements RouteDefinitions {
    public Handler lookup(String url) {
        if (url.equals("/hello")) {
            return new HelloHandler();
        } else if (url.equals("/add")) {
            return new AddHandler();
        } else {
            return new InvalidPageHandler();
        }
    }
}
