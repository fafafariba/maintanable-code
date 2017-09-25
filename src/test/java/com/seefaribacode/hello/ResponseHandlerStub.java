package com.seefaribacode.hello;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.ArrayList;
import java.util.List;

class ResponseHandlerStub implements ResponseHandler {
    List<RequestAndResponse> invocations = new ArrayList<>();

    public void writeToResponseBody(HttpServletRequest servletRequest, HttpServletResponse servletResponse) {
        RequestAndResponse requestAndResponse = new RequestAndResponse(servletRequest, servletResponse);
        invocations.add(requestAndResponse);
    }



}
