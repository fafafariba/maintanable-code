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

// Entry Injection really only needs to know about Request Handler...
// Could you move routeMap to constructor of UriHandler or create getMap method in RouteHandler interface?
// ^ Same thing for RequestHandler constructor invoking UriHandler

