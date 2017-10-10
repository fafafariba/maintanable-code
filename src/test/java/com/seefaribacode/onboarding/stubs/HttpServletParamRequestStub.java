package com.seefaribacode.onboarding.stubs;

public class HttpServletParamRequestStub extends NotImplementedHttpServletRequest {
    public String param1;
    public String param2;

    public HttpServletParamRequestStub(String param1, String param2) {
        this.param1 = param1;
        this.param2 = param2;
    }

    @Override
    public String getParameter(String s) {
        if (s == "target" || s == "left") {
            return param1;
        } else if (s == "right") {
            return param2;
        } else {
            throw new RuntimeException("Invalid Parameter");
        }
    }
}
