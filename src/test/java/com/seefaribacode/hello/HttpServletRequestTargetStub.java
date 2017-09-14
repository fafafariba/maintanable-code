package com.seefaribacode.hello;

class HttpServletRequestTargetStub extends HttpServletRequestNotImplemented {
    final String targetValue;
    final String url;

    @Override
    public String getRequestURI() {
        return url;
    }

    public HttpServletRequestTargetStub(String url, String targetValue) {
        this.url = url;
        this.targetValue = targetValue;
    }


    @Override
    public String getParameter(String key) {
        return targetValue;
    }


}
