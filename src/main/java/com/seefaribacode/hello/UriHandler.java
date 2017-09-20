package com.seefaribacode.hello;

import java.util.HashMap;
import java.util.Map;

public class UriHandler implements RouteHandler {
    private final Map<String, ResponseHandler> routeMap;
    private final ResponseHandler invalidResponse;

    public UriHandler() {
        this.routeMap = new HashMap<>();
        ResponseHandler helloHandler = new HelloResponse();
        ResponseHandler addHandler = new AddResponse();
        routeMap.put("/hello", helloHandler);
        routeMap.put("/add", addHandler);
        invalidResponse = new InvalidResponse();
    }

    public ResponseHandler route(String uri) {
        ResponseHandler responseHandler = routeMap.get(uri);
        if(responseHandler == null){
            return invalidResponse;
        } else {
            return responseHandler;
        }
    }
}
