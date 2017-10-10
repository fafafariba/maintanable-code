package com.seefaribacode.onboarding;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.PrintWriter;

public class AddResponseHandler implements HttpResponseHandler {
    @Override
    public void writeToBody(HttpServletRequest req, HttpServletResponse res) {
        String leftNumAsString = req.getParameter("left");
        String rightNumAsString = req.getParameter("right");
        int leftNum = Integer.parseInt(leftNumAsString);
        int rightNum = Integer.parseInt(rightNumAsString);
        PrintWriter output = HandleCheckedException.getWriter(res);
        res.setContentType("text/html");
        int sum = leftNum + rightNum;
        String sumString = String.format("<p>%s + %s = %d</p>", leftNumAsString, rightNumAsString, sum);
        output.println("<h1>ADD</h1>");
        output.println(sumString);
    }
}

