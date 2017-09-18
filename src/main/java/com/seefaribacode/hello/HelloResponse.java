package com.seefaribacode.hello;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

class HelloResponse {
    HttpServletRequest servletRequest;
    HttpServletResponse servletResponse;

    public HelloResponse(HttpServletRequest servletRequest, HttpServletResponse servletResponse)  {
        this.servletRequest = servletRequest;
        this.servletResponse = servletResponse;
    }

    public void writeToResponseBody() {
        String name = servletRequest.getParameter("target");
        PrintWriter writer = null;
        try {
            writer = servletResponse.getWriter();
        } catch (IOException e) {
            throw new RuntimeException(e.getMessage(), e);
        }

        writer.print(String.format("hello %s", name));
    }

}
