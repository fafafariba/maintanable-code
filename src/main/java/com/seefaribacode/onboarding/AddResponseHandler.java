package com.seefaribacode.onboarding;

import javax.servlet.http.HttpServletResponse;

public class AddResponseHandler implements HttpResponseHandler {
    @Override
    public void writeToBody(HttpServletResponse res) {
        throw new UnsupportedOperationException("Not Implemented!");
    }
}
