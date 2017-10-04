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
        String sumString = String.format("<p>%s + %s = %d</p>", leftNum, rightNum, Integer.parseInt(leftNum) + Integer.parseInt(rightNum));

        res.setContentType("text/html");

        PrintWriter output = Exception.handleWriter(res);

        output.println("<h1>ADD</h1>");
        output.println(sumString);
    }


}

