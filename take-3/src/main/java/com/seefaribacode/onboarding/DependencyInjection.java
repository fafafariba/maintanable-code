package com.seefaribacode.onboarding;

class DependencyInjection {
    private final HttpResponseHandler helloHandler = new HelloResponseHandler();
    private final HttpResponseHandler addResponseHandler = new AddResponseHandler();
    private final UriMapping routeMap = new RouteMap(helloHandler, addResponseHandler);
    private final HttpResponseHandler notFoundHandler = new NotFoundResponseHandler();
    private final UriRouteHandler routeHandler = new RouteHandler(routeMap, notFoundHandler);
    private final HttpResponseExceptionHandler exceptionHandler = new GenericErrorPageHandler();
    final RequestHandler reqHandler = new RequestHandlerUsingRouteHandler(routeHandler, exceptionHandler);
}
