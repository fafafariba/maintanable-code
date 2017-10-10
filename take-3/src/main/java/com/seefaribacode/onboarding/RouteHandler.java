package com.seefaribacode.onboarding;

class RouteHandler implements UriRouteHandler{
    private final UriMapping routeMap;
    private final HttpResponseHandler notFoundHandler;

    public RouteHandler(UriMapping routeMap, HttpResponseHandler notFoundHandler) {
        this.routeMap = routeMap;
        this.notFoundHandler = notFoundHandler;
    }

    @Override
    public HttpResponseHandler getRoute(String uri) {
        HttpResponseHandler handlerFromRouteMap = routeMap.getResponseHandler(uri);
        if(handlerFromRouteMap == null){
            return notFoundHandler;
        } else {
            return handlerFromRouteMap;
        }
    }
}

