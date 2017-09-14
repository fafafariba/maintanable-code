package com.seefaribacode.hello;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.PrintWriter;

class HelloResponse {
    HttpServletRequest servletRequest;
    HttpServletResponse servletResponse;
    String name;
    PrintWriter writer;

    public HelloResponse(HttpServletRequest servletRequest, HttpServletResponse servletResponse) {
        this.servletRequest = servletRequest;
        this.servletResponse = servletResponse;
        this.name = servletRequest.getParameter("target");
        this.writer = UncheckedUtil.getWriter(servletResponse);
    }

    public void writeToResponseBody() {
        writer.print(String.format("hello %s", name));
    }

}
