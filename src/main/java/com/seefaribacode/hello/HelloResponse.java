package com.seefaribacode.hello;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.PrintWriter;

class HelloResponse {
    HttpServletRequest servletRequest;
    HttpServletResponse servletResponse;

    public HelloResponse(HttpServletRequest servletRequest, HttpServletResponse servletResponse) {
        this.servletRequest = servletRequest;
        this.servletResponse = servletResponse;
    }

    public void writeToResponseBody() {
        String name = servletRequest.getParameter("target");
        PrintWriter writer = UncheckedUtil.getWriter(servletResponse);
        writer.print(String.format("hello %s", name));
    }

}
