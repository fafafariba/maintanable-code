package com.seefaribacode.hello;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.PrintWriter;

class HelloHandler implements Handler {
    public void writeToResponseBody(HttpServletRequest servletRequest, HttpServletResponse servletResponse) {
        String name = servletRequest.getParameter("target");
        PrintWriter writer = UncheckedUtil.getWriter(servletResponse);
        writer.print(String.format("hello %s", name));
    }
}
