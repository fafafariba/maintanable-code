package com.seefaribacode.onboarding.stubs;

import com.seefaribacode.onboarding.ResponseWriter;
import com.seefaribacode.onboarding.Router;

import java.util.HashMap;
import java.util.Map;

public class RouterStub implements Router {
    public Boolean invoked = Boolean.FALSE;
    private final Map<String, ResponseWriter> routeMap;
    public String uri;

    public RouterStub(String uri, ResponseWriter responseWriter) {
        this.routeMap = new HashMap<>();
        routeMap.put(uri, responseWriter);
    }

    public ResponseWriter matchResponseWriter(String uri) {
        invoked = Boolean.TRUE;
        this.uri = uri;
        return routeMap.get(uri);
    }
}
