package com.seefaribacode.hello;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.PrintWriter;

class AddHandler implements Handler {
    public void writeToResponseBody(HttpServletRequest servletRequest, HttpServletResponse checkedServletResponse) {
        UncheckedHttpServletResponse servletResponse = new UncheckedHttpServletResponse(checkedServletResponse);

        String left = servletRequest.getParameter("left");
        String right = servletRequest.getParameter("right");
        int sum = Integer.parseInt(left) + Integer.parseInt(right);
        PrintWriter writer = servletResponse.getWriter();
        writer.print(String.format("%s + %s = %d", left, right, sum));
    }
}
