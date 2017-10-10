package com.seefaribacode.onboarding;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

class HandleCheckedException extends Throwable {
    static PrintWriter getWriter(HttpServletResponse res) {
        try {
            return res.getWriter();
        } catch (IOException e) {
            System.out.println("Could not invoke getWriter()");
            System.out.println(e.toString());;
            throw new RuntimeException(e.getMessage(), e);
        }
    }
}
