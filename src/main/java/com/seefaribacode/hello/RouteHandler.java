package com.seefaribacode.hello;


public interface RouteHandler {
    ResponseHandler getResponseHandler(String uri);
}
