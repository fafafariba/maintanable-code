package com.seefaribacode.onboarding.stubs;

import java.io.IOException;
import java.io.PrintWriter;
import java.io.Writer;

public class HttpServletResponseStub extends NotImplementedHttpServletResponse {
    private PrintWriterStub printWriter;

    @Override
    public PrintWriter getWriter() throws IOException {
        Writer stubWriter = new StubWriter();
        PrintWriterStub printWriter = new PrintWriterStub(stubWriter);
        this.printWriter = printWriter;
        return printWriter;
    }

    public String getOutput() {
        return printWriter.buffer;
    }
}

