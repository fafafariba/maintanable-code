package com.seefaribacode.hello;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.PrintWriter;

class InvalidPageHandler implements Handler {
    public void writeToResponseBody(HttpServletRequest servletRequest, HttpServletResponse servletResponse) {
        PrintWriter writer = UncheckedUtil.getWriter(servletResponse);
        writer.print("The page you are looking for does not exist (yet).");
    }
}
