package com.seefaribacode.hello;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;


public class EntryServlet extends HttpServlet {
    @Override
    protected void service(HttpServletRequest servletRequest, HttpServletResponse servletResponse) throws ServletException, IOException {
        EntryInjection entryInjection = new EntryInjection();
        EntryInjection.inject(servletRequest, servletResponse);
    }
}

// Qs
// 1 Handle exception with throw or try/catch ?
// 2 Have to invoke EntryServlet.service to start, good thing or bad thing?
//   (vs. init where just creating a new instance of Entry Servlet would be enough to invoke inject
//   Or does it not matter?