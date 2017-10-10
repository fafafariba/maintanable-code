package com.seefaribacode.onboarding;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class RequestAndResponse {
    final HttpServletRequest req;
    final HttpServletResponse res;

    public RequestAndResponse(HttpServletRequest req, HttpServletResponse res) {
        this.req = req;
        this.res = res;
    }

}
