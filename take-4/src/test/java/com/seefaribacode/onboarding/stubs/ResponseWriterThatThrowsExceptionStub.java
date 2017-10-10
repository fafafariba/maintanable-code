package com.seefaribacode.onboarding.stubs;

import com.seefaribacode.onboarding.ResponseWriter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ResponseWriterThatThrowsExceptionStub implements ResponseWriter {
    public String errorMessage;

    public ResponseWriterThatThrowsExceptionStub(String errorMessage) {
        this.errorMessage = errorMessage;
    }

    public void writeToBody(HttpServletRequest request, HttpServletResponse response, String message) {
        throw new NumberFormatException(errorMessage);
    }
}
