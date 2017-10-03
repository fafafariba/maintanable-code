package com.seefaribacode.onboarding;

public interface UriRouteHandler {
    HttpResponseHandler getRoute(String uri, UriMapping routeMap);
}
