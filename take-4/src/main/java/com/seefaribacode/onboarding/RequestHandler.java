package com.seefaribacode.onboarding;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public interface RequestHandler {

    void dispatch(HttpServletRequest request, HttpServletResponse response);
}
