package com.seefaribacode.hello;

public class DependencyInjection {
    RouteDefinitions routeDefinitions = new HelloAppRouteDefinitions();
    Dispatcher dispatcher = new Dispatcher(routeDefinitions);
}
