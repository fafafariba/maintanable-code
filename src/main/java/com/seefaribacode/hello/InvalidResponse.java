package com.seefaribacode.hello;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

class InvalidResponse implements ResponseHandler{

    public void writeToResponseBody(HttpServletRequest servletRequest, HttpServletResponse servletResponse){
        PrintWriter writer = null;
        try {
            writer = servletResponse.getWriter();
        } catch (IOException e) {
            throw new RuntimeException(e.getMessage(), e);
        }
        writer.print("The page you are looking for does not exist (yet).");
    }

}
