package com.seefaribacode.hello;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

class AddResponse {
    HttpServletRequest servletRequest;
    HttpServletResponse servletResponse;
    String left;
    String right;
    int sum;
    PrintWriter writer;

    public AddResponse(HttpServletRequest servletRequest, HttpServletResponse servletResponse) {
        try {
            init(servletRequest, servletResponse);
        } catch (IOException e) {
            throw new RuntimeException(e.getMessage(), e);
        }
    }

    private void init(HttpServletRequest servletRequest, HttpServletResponse servletResponse) throws IOException {
        this.servletRequest = servletRequest;
        this.servletResponse = servletResponse;
        this.left = servletRequest.getParameter("left");
        this.right = servletRequest.getParameter("right");
        this.sum = Integer.parseInt(left) + Integer.parseInt(right);
        this.writer = servletResponse.getWriter();
    }

    public void writeToResponseBody(){
        writer.print(String.format("%s + %s = %d", left, right, sum));
    }

}
