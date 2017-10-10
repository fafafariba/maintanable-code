package com.seefaribacode.onboarding.stubs;

import com.seefaribacode.onboarding.RequestHandler;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class AppRequestHandlerStub implements RequestHandler {
    public HttpServletRequest request;
    public HttpServletResponse response;
    public int invocations = 0;

    public void dispatch(HttpServletRequest request, HttpServletResponse response) {
        this.request = request;
        this.response = response;
        invocations++;
    }
}
