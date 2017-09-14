package com.seefaribacode.hello;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.PrintWriter;

class AddHandler implements Handler {
    public void writeToResponseBody(HttpServletRequest servletRequest, HttpServletResponse servletResponse) {
        String left = servletRequest.getParameter("left");
        String right = servletRequest.getParameter("right");
        int sum = Integer.parseInt(left) + Integer.parseInt(right);
        PrintWriter writer = UncheckedUtil.getWriter(servletResponse);
        writer.print(String.format("%s + %s = %d", left, right, sum));
    }
}
