package com.seefaribacode.onboarding.stubs;

import com.seefaribacode.onboarding.ExceptionUtil;
import com.seefaribacode.onboarding.ResponseWriter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.PrintWriter;

public class ErrorResponseWriterStub implements ResponseWriter {
    public Boolean invoked = Boolean.FALSE;
    public HttpServletResponse response;

    public void writeToBody(HttpServletRequest request, HttpServletResponse response, String message) {
        invoked = Boolean.TRUE;
        this.response = response;
        String body = String.format("An error has occurred\n%s", message);
        PrintWriter printWriter = ExceptionUtil.getWriter(response);
        printWriter.print(body);
    }

}
