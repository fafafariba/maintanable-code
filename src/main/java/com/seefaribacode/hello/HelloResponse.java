package com.seefaribacode.hello;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

class HelloResponse implements ResponseHandler{

    public void writeToResponseBody(HttpServletRequest servletRequest, HttpServletResponse servletResponse) {
        String name = servletRequest.getParameter("target");
        PrintWriter writer =  ExceptionHandler.getWriter(servletResponse);
        writer.print(String.format("hello %s", name));
    }

}
