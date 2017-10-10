package com.seefaribacode.onboarding;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public interface ResponseWriter {
    void writeToBody(HttpServletRequest request, HttpServletResponse response, String message);
}
