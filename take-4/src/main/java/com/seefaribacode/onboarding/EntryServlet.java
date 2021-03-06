package com.seefaribacode.onboarding;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class EntryServlet extends HttpServlet {
    final DependencyInjection dependencyInjection = new DependencyInjection();

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        dependencyInjection.appRequestHandler.dispatch(req, resp);
    }
}
