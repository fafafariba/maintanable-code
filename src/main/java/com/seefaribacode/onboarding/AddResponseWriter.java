package com.seefaribacode.onboarding;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.PrintWriter;

public class AddResponseWriter implements ResponseWriter {

    @Override
    public void writeToBody(HttpServletRequest request, HttpServletResponse response, String message) {
        if (request != null) {
            int num1 = Integer.parseInt(request.getParameter("left"));
            int num2 = Integer.parseInt(request.getParameter("right"));
            int sum = num1 + num2;
            String body = String.format("%d + %d = %d", num1, num2, sum);
            PrintWriter printWriter = ExceptionUtil.getWriter(response);
            printWriter.print(body);
        }
    }
}
