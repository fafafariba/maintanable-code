package com.seefaribacode.hello;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

class EntryInjection {
    final RouteHandler routeHandler = new UriHandler();
    final RequestHandler requestHandler = new RequestHandler(routeHandler);

    public void inject(HttpServletRequest servletRequest, HttpServletResponse servletResponse)  {
        requestHandler.dispatch(servletRequest, servletResponse);
    }
}

// REquestHandler public or private?