package com.seefaribacode.onboarding;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class ExceptionUtil {

    public static PrintWriter getWriter(HttpServletResponse response) {
        try {
            return response.getWriter();
        } catch (IOException e) {
            throw new RuntimeException(e.getMessage(), e);
        }
    }

}
