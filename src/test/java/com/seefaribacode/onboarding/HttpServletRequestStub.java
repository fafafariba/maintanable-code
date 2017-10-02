package com.seefaribacode.onboarding;

class HttpServletRequestStub extends NotImplementedHttpServletRequest {
    private String uri;

    public HttpServletRequestStub(String uri) {
        this.uri = uri;
    }

    @Override
    public String getRequestURI() {
        return uri;
    }
}
