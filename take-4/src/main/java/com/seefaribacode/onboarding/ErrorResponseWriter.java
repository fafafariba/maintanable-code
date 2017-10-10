package com.seefaribacode.onboarding;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.PrintWriter;

public class ErrorResponseWriter implements ResponseWriter {


    public void writeToBody(HttpServletRequest request, HttpServletResponse response, String message) {
        String body = String.format("An error has occurred\n%s", message);
        PrintWriter printWriter = ExceptionUtil.getWriter(response);
        printWriter.print(body);


    }

}
