package com.seefaribacode.hello;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

class EntryInjection {
    final RequestHandler requestHandler = new RequestHandler(new UriHandler());

    public void inject(HttpServletRequest servletRequest, HttpServletResponse servletResponse)  {
        requestHandler.dispatch(servletRequest, servletResponse);
    }
}

// REquestHandler public or private?