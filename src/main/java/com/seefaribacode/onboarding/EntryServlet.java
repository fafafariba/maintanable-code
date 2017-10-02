package com.seefaribacode.onboarding;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class EntryServlet extends HttpServlet {
    private static DependencyInjection dependencyInjection;

    @Override
    public void init() throws ServletException {
        DependencyInjection dependencyInjection = new DependencyInjection();
    }


    @Override
    protected void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
        dependencyInjection.dispatch(req, res);
    }

}
