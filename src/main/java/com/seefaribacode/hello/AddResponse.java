package com.seefaribacode.hello;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.io.Writer;

class AddResponse implements ResponseHandler{
    public void writeToResponseBody(HttpServletRequest servletRequest, HttpServletResponse servletResponse) {
        String left = servletRequest.getParameter("left");
        String right = servletRequest.getParameter("right");
        int sum = Integer.parseInt(left) + Integer.parseInt(right);
        PrintWriter writer = getWriter(servletResponse);
        writer.print(String.format("%s + %s = %d", left, right, sum));
    }

    private PrintWriter getWriter(HttpServletResponse response){
        try {
            return response.getWriter();
        } catch (IOException e) {
            throw new RuntimeException(e.getMessage(), e);
        }
    }
}
