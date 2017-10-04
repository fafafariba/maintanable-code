package com.seefaribacode.onboarding;

import java.io.*;

class HttpServletResponseStub extends NotImplementedHttpServletResponse {
    private StringWriter stringWriter;

    @Override
    public void setContentType(String s) {

    }

    @Override
    public PrintWriter getWriter() throws IOException {
        this.stringWriter = new StringWriter();
        PrintWriter printWriter = new PrintWriter(stringWriter);
        return printWriter;
    }

    public String getBody(){
        return stringWriter.getBuffer().toString();
    }

}


