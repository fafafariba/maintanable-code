package com.seefaribacode.onboarding;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

interface RequestHandler {
    void dispatch(HttpServletRequest req, HttpServletResponse res);
}
