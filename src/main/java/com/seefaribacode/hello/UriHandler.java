package com.seefaribacode.hello;

import java.util.HashMap;

public class UriHandler implements RouteHandler {
    private final HashMap<String, ResponseHandler> routeMap;
    private final ResponseHandler invalidResponseHandler;

    public UriHandler(HashMap<String, ResponseHandler> routeMap) {
        this.routeMap = routeMap;
        this.invalidResponseHandler = new InvalidResponseHandler();
    }

    public ResponseHandler route(String uri) {
        return routeMap.getOrDefault(uri, invalidResponseHandler);
    }
}
