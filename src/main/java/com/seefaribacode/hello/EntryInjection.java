package com.seefaribacode.hello;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

class EntryInjection {
    public static void inject(HttpServletRequest servletRequest, HttpServletResponse servletResponse)  {

        RouteHandler routeHandler = new RouteHandler(servletRequest, servletResponse);
        try {
            routeHandler.dispatch();
        } catch (IOException e) {
            throw new RuntimeException(e.getMessage(), e);
        }

    }
}
