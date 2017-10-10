package com.seefaribacode.hello;

class HttpServletRequestTargetStub extends HttpServletRequestNotImplemented {
    final String targetValue;
    final String uri;

    @Override
    public String getRequestURI() {
        return uri;
    }

    public HttpServletRequestTargetStub(String uri, String targetValue) {
        this.uri = uri;
        this.targetValue = targetValue;
    }


    @Override
    public String getParameter(String key) {
        return targetValue;
    }


}
