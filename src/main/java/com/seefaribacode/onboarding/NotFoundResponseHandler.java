package com.seefaribacode.onboarding;

import javax.servlet.http.HttpServletResponse;

class NotFoundResponseHandler implements HttpResponseHandler{
    @Override
    public void writeToBody(HttpServletResponse res) {
        throw new UnsupportedOperationException("Not Implemented!");
    }
}
