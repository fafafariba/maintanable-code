package com.seefaribacode.hello;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

class InvalidResponseHandler implements ResponseHandler{

    public void writeToResponseBody(HttpServletRequest servletRequest, HttpServletResponse servletResponse){
        PrintWriter writer = ExceptionHandler.getWriter(servletResponse);
        writer.print("The page you are looking for does not exist (yet).");
    }

}
