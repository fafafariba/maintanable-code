package com.seefaribacode.onboarding;

class HttpServletAddRequestStub extends NotImplementedHttpServletRequest {
    private final String left;
    private final String right;

    public HttpServletAddRequestStub(String left, String right) {
        this.left = left;
        this.right = right;
    }

    @Override
    public String getParameter(String s) {
        switch(s){
            case "left":
                return left;
            case "right":
                return right;
            default:
                return null;
        }
    }
}
