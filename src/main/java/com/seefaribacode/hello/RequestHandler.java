package com.seefaribacode.hello;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

class RequestHandler {

    public void dispatch(HttpServletRequest servletRequest, HttpServletResponse servletResponse)  {
        String uri = servletRequest.getRequestURI();
        RouteHandler map = new UriHandler();
        map.route(uri).writeToResponseBody(servletRequest, servletResponse);
    }

}
