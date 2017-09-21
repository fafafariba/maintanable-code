package com.seefaribacode.hello;

import java.util.HashMap;

public class UriHandler implements RouteHandler {
    HashMap<String, ResponseHandler> routeMap;
    ResponseHandler invalidResponseHandler;

    public UriHandler() {
        this.routeMap = new HashMap();
        ResponseHandler helloResponseHandler = new HelloResponse();
        ResponseHandler addResponseHandler = new AddResponse();
        this.invalidResponseHandler = new InvalidResponse();
        routeMap.put("/hello", helloResponseHandler);
        routeMap.put("/add", addResponseHandler);
    }

    public ResponseHandler route(String uri) {

        if (routeMap.containsKey(uri)) {
            return routeMap.get(uri);

        } else {
            return invalidResponseHandler;
        }
    }
}

