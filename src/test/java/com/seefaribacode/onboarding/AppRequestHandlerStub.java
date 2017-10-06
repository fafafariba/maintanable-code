package com.seefaribacode.onboarding;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

class AppRequestHandlerStub implements RequestHandler {
    HttpServletRequest request;
    HttpServletResponse response;
    int invocations = 0;

    public void dispatch(HttpServletRequest request, HttpServletResponse response) {
        this.request = request;
        this.response = response;
        invocations++;
    }
}
