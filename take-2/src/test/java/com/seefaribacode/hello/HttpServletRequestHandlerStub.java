package com.seefaribacode.hello;

class HttpServletRequestHandlerStub extends HttpServletRequestNotImplemented {
    String uri;

    public HttpServletRequestHandlerStub(String uri) {
        this.uri = uri;
    }

    @Override
    public String getRequestURI() {
        return uri;
    }
}
