package com.seefaribacode.onboarding;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.PrintWriter;

public class HelloResponseWriter implements ResponseWriter {

    @Override
    public void writeToBody(HttpServletRequest request, HttpServletResponse response, String message) {
        String targetValue = request.getParameter("target");
        String body = String.format("Hello, %s!", targetValue);
        PrintWriter printWriter = ExceptionUtil.getWriter(response);
        printWriter.print(body);
    }
}

