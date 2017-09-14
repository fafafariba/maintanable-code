package com.seefaribacode.hello;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.PrintWriter;

class InvalidPageResponse {
    HttpServletRequest servletRequest;
    HttpServletResponse servletResponse;

    public InvalidPageResponse(HttpServletRequest servletRequest, HttpServletResponse servletResponse) {
        this.servletRequest = servletRequest;
        this.servletResponse = servletResponse;
    }

    public void writeToResonseBody() {
        PrintWriter writer = UncheckedUtil.getWriter(servletResponse);
        writer.print("The page you are looking for does not exist (yet).");
    }
}
