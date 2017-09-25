package com.seefaribacode.hello;

import java.util.HashMap;

public class UriHandler implements RouteHandler {
    private final HashMap<String, ResponseHandler> routeMap;
    private final ResponseHandler invalidResponseHandler;

    public UriHandler() {
        this.routeMap = new HashMap<>();
        ResponseHandler helloResponseHandler = new HelloResponseHandler();
        ResponseHandler addResponseHandler = new AddResponseHandler();
        this.invalidResponseHandler = new InvalidResponseHandler();
        routeMap.put("/hello", helloResponseHandler);
        routeMap.put("/add", addResponseHandler);
    }

    public ResponseHandler route(String uri) {
        return routeMap.getOrDefault(uri, invalidResponseHandler);
    }
}
