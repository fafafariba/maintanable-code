package com.seefaribacode.hello;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

class Dispatcher {
    final HttpServletRequest servletRequest;
    final HttpServletResponse servletResponse;
    final RouteDefinitions routeDefinitions;

    public Dispatcher(HttpServletRequest servletRequest, HttpServletResponse servletResponse, RouteDefinitions routeDefinitions) {
        this.servletRequest = servletRequest;
        this.servletResponse = servletResponse;
        this.routeDefinitions = routeDefinitions;
    }

    public void dispatch() {
        String url = servletRequest.getRequestURI();
        Handler handler = routeDefinitions.lookup(url);
        handler.writeToResponseBody(servletRequest, servletResponse);
    }

}
