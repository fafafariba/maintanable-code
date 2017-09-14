package com.seefaribacode.hello;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.PrintWriter;

class AddResponse {
    HttpServletRequest servletRequest;
    HttpServletResponse servletResponse;
    String left;
    String right;
    int sum;
    PrintWriter writer;

    public AddResponse(HttpServletRequest servletRequest, HttpServletResponse servletResponse) {
        this.servletRequest = servletRequest;
        this.servletResponse = servletResponse;
        this.left = servletRequest.getParameter("left");
        this.right = servletRequest.getParameter("right");
        this.sum = Integer.parseInt(left) + Integer.parseInt(right);
        this.writer = UncheckedUtil.getWriter(servletResponse);
    }

    public void writeToResponseBody() {
        writer.print(String.format("%s + %s = %d", left, right, sum));
    }

}
