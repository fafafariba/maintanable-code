package com.seefaribacode.hello;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

class RequestHandler {
    private final RouteHandler routeHandler;

    public RequestHandler(RouteHandler routeHandler) {
        this.routeHandler = routeHandler;
    }

    public void dispatch(HttpServletRequest servletRequest, HttpServletResponse servletResponse)  {
        String uri = servletRequest.getRequestURI();
        routeHandler.getResponseHandler(uri).writeToResponseBody(servletRequest, servletResponse);
    }

}
