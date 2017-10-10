package com.seefaribacode.onboarding;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class AppRequestHandler implements RequestHandler {
    Router router;
    ResponseWriter errorResponseWriter;

    public AppRequestHandler(Router router, ResponseWriter errorResponseWriter) {
        this.router = router;
        this.errorResponseWriter = errorResponseWriter;
    }

    public void dispatch(HttpServletRequest request, HttpServletResponse response) {
        String uri = request.getRequestURI();

        try {
            ResponseWriter responseWriter = router.matchResponseWriter(uri);
            responseWriter.writeToBody(request, response, null);

        } catch (Exception e) {
            errorResponseWriter.writeToBody(null, response, e.getMessage());
        }
    }

}
