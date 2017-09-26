package com.seefaribacode.hello;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

class EntryInjection {
    final Mapping map = new AppMap();
    final ResponseHandler noUriMatchResponseHandler = new InvalidResponseHandler();
    final RouteHandler routeHandler = new UriHandler(map, noUriMatchResponseHandler);
    final RequestHandler requestHandler = new RequestHandler(routeHandler);

    public void inject(HttpServletRequest servletRequest, HttpServletResponse servletResponse)  {
        requestHandler.dispatch(servletRequest, servletResponse);
    }
}


