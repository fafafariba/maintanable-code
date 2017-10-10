package com.seefaribacode.onboarding;

class RouteHandlerStub implements UriRouteHandler {
    static int invokeCount = 0;
    static String uri;
    static UriMapping routeMap;

    public RouteHandlerStub() {
        invokeCount = 0;
        this.uri = null;
        this.routeMap = null;
    }

    @Override
    public HttpResponseHandler getRoute(String uriStub, UriMapping routeMapStub) {
        invokeCount++;
        uri = uriStub;
        routeMap = routeMapStub;
        return new ResponseHandlerStub();
    }
}

// Problem

//class RouteHandlerStub implements UriRouteHandler {
//    static int invokeCount = 0;
//    String uri;
//    UriMapping routeMap;
//
//    public RouteHandlerStub() {
//        invokeCount = 0;
//        this.uri = null;
//        this.routeMap = null;
//    }
//
//    @Override
//    public HttpResponseHandler getRoute(String uriStub, UriMapping routeMapStub) {
//        invokeCount++;
//        uri = uriStub; <<< This does not change the value of this.uri
//        routeMap = routeMapStub; <<< This does not change the value of routeMap
//        return new ResponseHandlerStub();
//    }
//}