package com.seefaribacode.onboarding;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

class RequestHandlerStub extends RequestHandler {
    UriMapping routeMap;
    UriRouteHandler routeHandler;
    HttpServletRequest req;
    HttpServletResponse res;
    int reqCount;
    int resCount;


    public RequestHandlerStub(UriMapping routeMap, UriRouteHandler routeHandler) {
        super(routeMap, routeHandler);
        this.req = null;
        this.res = null;
        this.reqCount = 0;
        this.resCount = 0;
    }


    @Override
    public void dispatch(HttpServletRequest req, HttpServletResponse res) {
        reqCount++;
        resCount++;
        this.req = req;
        this.res = res;

    }
}
