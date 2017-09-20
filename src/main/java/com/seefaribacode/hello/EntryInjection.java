package com.seefaribacode.hello;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

class EntryInjection {
    public static void inject(HttpServletRequest servletRequest, HttpServletResponse servletResponse)  {

        RequestHandler requestHandler = new RequestHandler();
        requestHandler.dispatch(servletRequest, servletResponse);
    }
}
