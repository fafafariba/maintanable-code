package com.seefaribacode.hello;

class HttpServletRequestAddStub extends HttpServletRequestNotImplemented {
    final int left;
    final int right;
    final String url;

    public HttpServletRequestAddStub(String url, String leftStr, String rightStr) {
        this.left = Integer.parseInt(leftStr);
        this.right = Integer.parseInt(rightStr);
        this.url = url;
    }

    @Override
    public String getParameter(String key) {
        if (key.equals("left")) {
            return left + "";
        } else if (key.equals("right")) {
            return right + "";
        } else {
            return "";
        }
    }


    @Override
    public String getRequestURI() {
        return url;
    }
}
