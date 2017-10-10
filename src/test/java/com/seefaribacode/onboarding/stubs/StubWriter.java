package com.seefaribacode.onboarding.stubs;

import java.io.IOException;
import java.io.Writer;

public class StubWriter extends Writer {


    public void write(char[] cbuf, int off, int len) throws IOException {
        throw new UnsupportedOperationException("Not Implemented!");
    }

    public void flush() throws IOException {
        throw new UnsupportedOperationException("Not Implemented!");
    }

    public void close() throws IOException {
        throw new UnsupportedOperationException("Not Implemented!");
    }
}
