package com.seefaribacode.hello;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.HashMap;

class EntryInjection {
    final HashMap<String, ResponseHandler> routeMap = Mappings.ROUTE_MAP;
    final RouteHandler routeHandler = new UriHandler(routeMap);
    final RequestHandler requestHandler = new RequestHandler(routeHandler);

    public void inject(HttpServletRequest servletRequest, HttpServletResponse servletResponse)  {
        requestHandler.dispatch(servletRequest, servletResponse);
    }
}

// REquestHandler public or private?