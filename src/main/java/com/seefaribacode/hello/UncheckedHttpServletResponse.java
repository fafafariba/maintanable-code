package com.seefaribacode.hello;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class UncheckedHttpServletResponse {
    public final HttpServletResponse httpServletResponse;

    public UncheckedHttpServletResponse(HttpServletResponse httpServletResponse) {
        this.httpServletResponse = httpServletResponse;
    }

    public PrintWriter getWriter() {
        try {
            return httpServletResponse.getWriter();
        } catch (IOException e) {
            throw new RuntimeException(e.getMessage(), e);
        }
    }
}
