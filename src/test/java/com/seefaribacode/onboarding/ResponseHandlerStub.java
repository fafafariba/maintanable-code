package com.seefaribacode.onboarding;

import javax.servlet.http.HttpServletResponse;

class ResponseHandlerStub implements HttpResponseHandler{
    static int invokeCount = 0;
    static HttpServletResponse res;

    @Override
    public void writeToBody(HttpServletResponse response) {
        invokeCount++;
        res = response;
    }
}
