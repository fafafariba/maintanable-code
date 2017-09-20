package com.seefaribacode.hello;

class EntryInjection {
    final RouteHandler routeHandler = new UriHandler();
    public final RequestHandler requestHandler = new RequestHandler(routeHandler);
}
