package com.seefaribacode.onboarding.stubs;

public class HttpServletRequestUriStub extends NotImplementedHttpServletRequest {
    public String uri;

    public HttpServletRequestUriStub(String uri) {
        this.uri = uri;
    }

    @Override
    public String getRequestURI() {
        return uri;
    }
}
