package com.seefaribacode.onboarding;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

class RequestHandlerStub implements RequestHandler {
    UriMapping routeMap;
    UriRouteHandler routeHandler;
    HttpServletRequest req;
    HttpServletResponse res;
    static int reqCount = 0;
    static int resCount = 0;


    public RequestHandlerStub(UriMapping routeMap, UriRouteHandler routeHandler) {
        this.req = null;
        this.res = null;
    }


    @Override
    public void dispatch(HttpServletRequest req, HttpServletResponse res) {
        reqCount++;
        resCount++;
        this.req = req;
        this.res = res;

    }
}
