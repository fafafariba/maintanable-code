package com.seefaribacode.hello;

import javax.servlet.ServletOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringWriter;

class HttpServletResponseStub extends HttpServletResponseNotImplemented {
    StringWriter writer = new StringWriter();

    String textDisplayed() {
        return writer.getBuffer().toString();
    }

    @Override
    public PrintWriter getWriter() throws IOException {
        return new PrintWriter(writer);
    }

}
