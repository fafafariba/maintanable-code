package com.seefaribacode.hello;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

class RequestHandler {

    public void dispatch(HttpServletRequest servletRequest, HttpServletResponse servletResponse, RouteHandler map)  {
        String uri = servletRequest.getRequestURI();
        map.route(uri).writeToResponseBody(servletRequest, servletResponse);
    }

}
