package com.seefaribacode.hello;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

class InvalidResponseHandler implements ResponseHandler{

    public void writeToResponseBody(HttpServletRequest servletRequest, HttpServletResponse servletResponse){
        PrintWriter writer = ExceptionHandler.getWriter(servletResponse);
        String uri = servletRequest.getRequestURI();
        writer.print(String.format("The page %s does not exist", uri));
    }

}
