package com.seefaribacode.hello;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class ExceptionHandler {
    static PrintWriter getWriter(HttpServletResponse servletResponse) {
        try {
            return servletResponse.getWriter();
        } catch (IOException e) {
            throw new RuntimeException(e.getMessage(), e);
        }
    }
}

// Why can't handledResponse be final? And why no public?
