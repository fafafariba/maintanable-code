package com.seefaribacode.onboarding;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

class DependencyInjection {
    public RequestHandler reqHandler;

    public DependencyInjection() {
        this.reqHandler = new RequestHandler();

    }
}

class RequestHandler {
    static UriMapping routeMap = new RouteMap();

    public void dispatch(HttpServletRequest req, HttpServletResponse res) {

    }

}

