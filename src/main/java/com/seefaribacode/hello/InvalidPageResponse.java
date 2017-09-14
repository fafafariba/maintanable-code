package com.seefaribacode.hello;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

class InvalidPageResponse
{
    HttpServletRequest servletRequest;
    HttpServletResponse servletResponse;
    PrintWriter writer;


    public InvalidPageResponse(HttpServletRequest servletRequest, HttpServletResponse servletResponse) throws IOException
    {
        this.servletRequest = servletRequest;
        this.servletResponse = servletResponse;
        this.writer = servletResponse.getWriter();
    }

    public void writeToResonseBody(){
        writer.print("The page you are looking for does not exist (yet).");
    }

}
