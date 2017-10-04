package com.seefaribacode.onboarding;

class RouteHandler implements UriRouteHandler{
    @Override
    public HttpResponseHandler getRoute(String uri, UriMapping routeMap) {
        return routeMap.getResponseHandler(uri);
    }
}

