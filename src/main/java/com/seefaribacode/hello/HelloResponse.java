package com.seefaribacode.hello;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

class HelloResponse {
    HttpServletRequest servletRequest;
    HttpServletResponse servletResponse;
    String name;
    PrintWriter writer;

    public HelloResponse(HttpServletRequest servletRequest, HttpServletResponse servletResponse)  {
        try {
            init(servletRequest, servletResponse);
        } catch (IOException e) {
            throw new RuntimeException(e.getMessage(), e);
        }
    }

    private void init(HttpServletRequest servletRequest, HttpServletResponse servletResponse) throws IOException {
        this.servletRequest = servletRequest;
        this.servletResponse = servletResponse;
        this.name = servletRequest.getParameter("target");
        this.writer = servletResponse.getWriter();
    }

    public void writeToResponseBody() {
        writer.print(String.format("hello %s", name));
    }

}
