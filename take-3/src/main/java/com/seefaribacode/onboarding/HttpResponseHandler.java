package com.seefaribacode.onboarding;


import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public interface HttpResponseHandler {
    void writeToBody(HttpServletRequest req, HttpServletResponse res);
}
