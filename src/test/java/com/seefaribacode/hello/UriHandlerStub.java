package com.seefaribacode.hello;

import java.util.HashMap;

class UriHandlerStub implements RouteHandler {
    HashMap<String, ResponseHandler> routeMap;

    UriHandlerStub(HashMap routeMap) {
        this.routeMap = routeMap;
    }

     public ResponseHandler route(String uri) {

        if (routeMap.containsKey(uri)) {
            return routeMap.get(uri);

        } else {
            return null;
        }
    }
}
