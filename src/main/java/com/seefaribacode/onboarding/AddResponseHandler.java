package com.seefaribacode.onboarding;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class AddResponseHandler implements HttpResponseHandler {

    @Override
    public void writeToBody(HttpServletRequest req, HttpServletResponse res) {
        String leftNum = req.getParameter("left");
        String rightNum = req.getParameter("right");

        PrintWriter output = Exception.handleWriter(res);
        res.setContentType("text/html");
        String sumString = null;
        try {
            sumString = String.format("<p>%s + %s = %d</p>", leftNum, rightNum, Integer.parseInt(leftNum) + Integer.parseInt(rightNum));
            output.println("<h1>ADD</h1>");
            output.println(sumString);
        } catch(NumberFormatException e) {
            output.println("<h1>ADD ERROR</h1>");
            output.println("<p>Check the logs</p>");
            System.out.println(e);
        }

    }


}

