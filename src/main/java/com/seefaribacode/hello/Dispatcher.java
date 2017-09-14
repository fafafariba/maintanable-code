package com.seefaribacode.hello;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

class Dispatcher {
    final RouteDefinitions routeDefinitions;

    public Dispatcher(RouteDefinitions routeDefinitions) {
        this.routeDefinitions = routeDefinitions;
    }

    public void dispatch(HttpServletRequest servletRequest, HttpServletResponse servletResponse) {
        String url = servletRequest.getRequestURI();
        Handler handler = routeDefinitions.lookup(url);
        handler.writeToResponseBody(servletRequest, servletResponse);
    }

}
