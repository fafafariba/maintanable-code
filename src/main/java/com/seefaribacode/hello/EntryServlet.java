package com.seefaribacode.hello;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class EntryServlet extends HttpServlet {
    @Override
    protected void service(HttpServletRequest servletRequest, HttpServletResponse servletResponse) throws ServletException, IOException {
        RouteDefinitions routeDefinitions = new HelloAppRouteDefinitions();
        Dispatcher dispatcher = new Dispatcher(servletRequest, servletResponse, routeDefinitions);
        dispatcher.dispatch();
    }
}
