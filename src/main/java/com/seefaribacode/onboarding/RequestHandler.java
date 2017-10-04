package com.seefaribacode.onboarding;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

class RequestHandler {
    final UriMapping routeMap;
    final UriRouteHandler routeHandler;

    public RequestHandler(UriMapping routeMap, UriRouteHandler routeHandler) {
        this.routeMap = routeMap;
        this.routeHandler = routeHandler;
    }

    public void dispatch(HttpServletRequest req, HttpServletResponse res) {
        String uri = req.getRequestURI();
        HttpResponseHandler responseHandler = routeHandler.getRoute(uri, routeMap);
        responseHandler.writeToBody(req, res);
    }

}

