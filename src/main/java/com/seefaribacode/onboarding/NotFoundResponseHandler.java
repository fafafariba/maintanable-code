package com.seefaribacode.onboarding;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.PrintWriter;

class NotFoundResponseHandler implements HttpResponseHandler{
    @Override
    public void writeToBody(HttpServletRequest req, HttpServletResponse res) {
        res.setContentType("text/html");
        PrintWriter output = Exception.handleWriter(res);
        output.println("<h1>Page Not Found</h1>");
    }
}
