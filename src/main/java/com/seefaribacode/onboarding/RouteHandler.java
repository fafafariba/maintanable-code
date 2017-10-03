package com.seefaribacode.onboarding;

import javax.servlet.http.HttpServletResponse;

class RouteHandler implements UriRouteHandler{
    @Override
    public HttpResponseHandler getRoute(String uri, UriMapping routeMap) {
        return new ResponseHandler();
    }
}

class ResponseHandler implements HttpResponseHandler{
    @Override
    public void writeToBody(HttpServletResponse res) {
        throw new UnsupportedOperationException("Not Implemented!");
    }
}