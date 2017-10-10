package com.seefaribacode.onboarding;

class HttpServletHelloRequestStub extends NotImplementedHttpServletRequest {
    private final String targetValue;

    public HttpServletHelloRequestStub(String targetValue) {
        this.targetValue = targetValue;
    }

    @Override
    public String getParameter(String s) {
        switch(s){
            case "target":
                return targetValue;
            default:
                return null;
        }
    }
}
