package com.seefaribacode.hello;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public interface Handler {
    void writeToResponseBody(HttpServletRequest servletRequest, HttpServletResponse servletResponse);
}
