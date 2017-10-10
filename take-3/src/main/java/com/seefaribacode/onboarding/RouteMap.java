package com.seefaribacode.onboarding;

import java.util.HashMap;
import java.util.Map;

class RouteMap implements UriMapping {
    private final Map<String, HttpResponseHandler> handlersByPath;

    public RouteMap(HttpResponseHandler helloHandler, HttpResponseHandler addResponseHandler) {
        handlersByPath = new HashMap<>();
        handlersByPath.put("/hello", helloHandler);
        handlersByPath.put("/add", addResponseHandler);
    }

    @Override
    public HttpResponseHandler getResponseHandler(String uri) {
        return handlersByPath.get(uri);
    }
}
