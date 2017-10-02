package com.seefaribacode.onboarding;

class DependencyInjection {
    RequestHandler reqHandler;
    UriMapping routeMap;
    UriRouteHandler routeHandler;

    public DependencyInjection() {
        this.routeMap = new RouteMap();
        this.routeHandler = new RouteHandler();
        this.reqHandler = new RequestHandler(routeMap, routeHandler);
    }

}

