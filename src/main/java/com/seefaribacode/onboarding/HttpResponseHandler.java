package com.seefaribacode.onboarding;


import javax.servlet.http.HttpServletResponse;

public interface HttpResponseHandler {
    void writeToBody(HttpServletResponse res);
}
