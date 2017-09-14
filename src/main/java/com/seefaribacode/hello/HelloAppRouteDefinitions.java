package com.seefaribacode.hello;

public class HelloAppRouteDefinitions implements RouteDefinitions {
    public Handler lookup(String url) {
        if (url.equals("/hello")) {
            return new HelloResponse();
        } else if (url.equals("/add")) {
            return new AddResponse();
        } else {
            return new InvalidPageResponse();
        }
    }
}
