package com.seefaribacode.hello;

public class UriHandler implements RouteHandler {
    public ResponseHandler route(String uri) {

        if (uri.equals("/hello")) {

            return new HelloResponse();

        } else if (uri.equals("/add")) {

            return new AddResponse();

        } else {

            return new InvalidResponse();
        }
    }
}
