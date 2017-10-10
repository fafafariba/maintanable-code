package com.seefaribacode.onboarding.stubs;

import java.io.PrintWriter;
import java.io.Writer;

public class PrintWriterStub extends PrintWriter {
    String buffer = "";

    public PrintWriterStub(Writer out) {
        super(out);
    }

    @Override
    public void print(String s) {
        buffer += s;
    }
}
