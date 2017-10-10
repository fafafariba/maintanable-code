package com.seefaribacode.onboarding.stubs;

import com.seefaribacode.onboarding.ResponseWriter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ResponseWriterStub implements ResponseWriter {
    public Boolean invoked = Boolean.FALSE;
    public HttpServletRequest request;
    public HttpServletResponse response;

    public void writeToBody(HttpServletRequest request, HttpServletResponse response, String message) {
        invoked = Boolean.TRUE;
        this.request = request;
        this.response = response;
    }

}
