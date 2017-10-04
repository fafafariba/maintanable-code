package com.seefaribacode.onboarding;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class HelloResponseHandler implements HttpResponseHandler {
    @Override
    public void writeToBody(HttpServletRequest req, HttpServletResponse res) {
        String targetValue = req.getParameter("target");
        res.setContentType("text/html");
        PrintWriter output = Exception.handleWriter(res);
        output.println("<h1>HELLO</h1>");
        output.println(String.format("<p>hello %s</p>", targetValue));
    }
}
