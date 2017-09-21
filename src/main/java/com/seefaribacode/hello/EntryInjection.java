package com.seefaribacode.hello;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

class EntryInjection {
    RequestHandler requestHandler = new RequestHandler();
    RouteHandler map = new UriHandler();

    public void inject(HttpServletRequest servletRequest, HttpServletResponse servletResponse)  {
        requestHandler.dispatch(servletRequest, servletResponse, map);
    }
}
