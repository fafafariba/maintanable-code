package com.seefaribacode.onboarding;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class GenericErrorPageHandler implements HttpResponseExceptionHandler {
    @Override
    public void handleException(HttpServletRequest req, HttpServletResponse res, Exception exception) {
        throw new UnsupportedOperationException("Not Implemented!");
    }
}
