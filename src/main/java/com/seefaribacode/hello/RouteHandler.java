package com.seefaribacode.hello;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

class RouteHandler {
    HttpServletRequest servletRequest;
    HttpServletResponse servletResponse;

    public RouteHandler(HttpServletRequest servletRequest, HttpServletResponse servletResponse) {
        this.servletRequest = servletRequest;
        this.servletResponse = servletResponse;
    }

    public void dispatch() throws IOException {
        String url = servletRequest.getRequestURI();
        if (url.equals("/hello")) {

            HelloResponse responseBody = new HelloResponse(servletRequest, servletResponse);
            responseBody.writeToResponseBody();

        } else if (url.equals("/add")) {

            AddResponse responseBody = new AddResponse(servletRequest, servletResponse);
            responseBody.writeToResponseBody();

        } else {
            InvalidPageResponse responseBody = new InvalidPageResponse(servletRequest, servletResponse);
            responseBody.writeToResonseBody();
        }
    }

}
