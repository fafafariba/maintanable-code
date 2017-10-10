package com.seefaribacode.onboarding;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

class ResponseHandlerStub implements HttpResponseHandler{
    static int invokeCount = 0;
    static HttpServletResponse res;
    static HttpServletRequest req;

    @Override
    public void writeToBody(HttpServletRequest request, HttpServletResponse response) {
        invokeCount++;
        req = request;
        res = response;
    }
}
