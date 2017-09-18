package com.seefaribacode.hello;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

class InvalidPageResponse
{
    HttpServletRequest servletRequest;
    HttpServletResponse servletResponse;


    public InvalidPageResponse(HttpServletRequest servletRequest, HttpServletResponse servletResponse) throws IOException
    {
        this.servletRequest = servletRequest;
        this.servletResponse = servletResponse;
    }

    public void writeToResonseBody(){
        PrintWriter writer = null;
        try {
            writer = servletResponse.getWriter();
        } catch (IOException e) {
            throw new RuntimeException(e.getMessage(), e);
        }
        writer.print("The page you are looking for does not exist (yet).");
    }

}
