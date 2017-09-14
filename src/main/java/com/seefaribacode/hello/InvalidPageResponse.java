package com.seefaribacode.hello;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.PrintWriter;

class InvalidPageResponse {
    HttpServletRequest servletRequest;
    HttpServletResponse servletResponse;
    PrintWriter writer;

    public InvalidPageResponse(HttpServletRequest servletRequest, HttpServletResponse servletResponse) {
        this.servletRequest = servletRequest;
        this.servletResponse = servletResponse;
        this.writer = UncheckedUtil.getWriter(servletResponse);
    }

    public void writeToResonseBody() {
        writer.print("The page you are looking for does not exist (yet).");
    }

}
