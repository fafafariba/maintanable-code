package com.seefaribacode.hello;

import javax.servlet.ServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class ExceptionHandler {
    PrintWriter writer;

    public ExceptionHandler(ServletResponse servletResponse) {
        try {
            this.writer = servletResponse.getWriter();
        } catch (IOException e) {
            throw new RuntimeException(e.getMessage(), e);
        }
    }

    public PrintWriter handle() {
        return writer;
    }
}
