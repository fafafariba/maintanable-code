package com.seefaribacode.onboarding;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

class RequestHandlerUsingRouteHandler implements RequestHandler {
    final UriRouteHandler routeHandler;
    final HttpResponseExceptionHandler topLevelErrorHandler;

    public RequestHandlerUsingRouteHandler(UriRouteHandler routeHandler, HttpResponseExceptionHandler topLevelErrorHandler) {
        this.routeHandler = routeHandler;
        this.topLevelErrorHandler = topLevelErrorHandler;
    }

    public void dispatch(HttpServletRequest req, HttpServletResponse res) {
        try {
            dispatchThatCouldThrowException(req, res);
        } catch (Exception ex){
            topLevelErrorHandler.handleException(req, res, ex);
        }
    }

    private void dispatchThatCouldThrowException(HttpServletRequest req, HttpServletResponse res) {
        String uri = req.getRequestURI();
        HttpResponseHandler responseHandler = routeHandler.getRoute(uri);
        responseHandler.writeToBody(req, res);
    }
}
