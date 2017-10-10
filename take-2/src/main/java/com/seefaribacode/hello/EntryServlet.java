package com.seefaribacode.hello;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class EntryServlet extends HttpServlet {
    private EntryInjection entryInjection;

    @Override
    public void init() throws ServletException {
        entryInjection = new EntryInjection();
    }

    @Override
    protected void service(HttpServletRequest servletRequest, HttpServletResponse servletResponse) throws ServletException, IOException {
        entryInjection.requestHandler.dispatch(servletRequest, servletResponse);
    }
}

