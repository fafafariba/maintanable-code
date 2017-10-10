package com.seefaribacode.onboarding;

public interface Router {

    ResponseWriter matchResponseWriter(String uri);
}
