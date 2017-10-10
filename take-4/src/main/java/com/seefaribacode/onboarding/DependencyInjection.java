package com.seefaribacode.onboarding;

public class DependencyInjection {
    Router appRouter = new AppRouter();
    ResponseWriter errorResponseWriter = new ErrorResponseWriter();
    RequestHandler appRequestHandler = new AppRequestHandler(appRouter, errorResponseWriter);
}

