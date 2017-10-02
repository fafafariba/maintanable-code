package com.seefaribacode.onboarding;

import java.util.HashMap;

class RouteMap implements UriMapping {
    HashMap routeMap;
    public RouteMap() {
        this.routeMap = new HashMap<String, HttpResponseHandler>();
    }

    @Override
    public HttpResponseHandler getResponseHandler(String uri) {
        return null;
    }
}
