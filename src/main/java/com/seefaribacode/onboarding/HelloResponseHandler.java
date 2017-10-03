package com.seefaribacode.onboarding;

import javax.servlet.http.HttpServletResponse;

public class HelloResponseHandler implements HttpResponseHandler {
    @Override
    public void writeToBody(HttpServletResponse res) {
        throw new UnsupportedOperationException("Not Implemented!");
    }
}
