package com.seefaribacode.hello;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class RequestAndResponse {
    final HttpServletRequest requestParam;
    final HttpServletResponse responseParam;

    public RequestAndResponse(HttpServletRequest requestParam, HttpServletResponse responseParam) {
        this.requestParam = requestParam;
        this.responseParam = responseParam;
    }
}
