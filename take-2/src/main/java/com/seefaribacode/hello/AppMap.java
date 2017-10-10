package com.seefaribacode.hello;

import java.util.HashMap;
import java.util.Map;

public class AppMap implements Mapping {
    private final Map<String, ResponseHandler> routeMap;

    public AppMap() {
        routeMap = new HashMap<>();
        routeMap.put("/hello", new HelloResponseHandler());
        routeMap.put("/add", new AddResponseHandler());
    }

    public ResponseHandler getRoute(String uri) {
        return routeMap.get(uri);
    }

}
