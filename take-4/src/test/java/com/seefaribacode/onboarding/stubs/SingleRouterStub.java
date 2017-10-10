package com.seefaribacode.onboarding.stubs;

import com.seefaribacode.onboarding.ResponseWriter;
import com.seefaribacode.onboarding.Router;

import java.util.HashMap;
import java.util.Map;

public class SingleRouterStub implements Router {
    private final Map<String, ResponseWriter> map;

    public SingleRouterStub(String route, ResponseWriter responseWriter) {
        map = new HashMap<String, ResponseWriter>();
        map.put(route, responseWriter);
    }

    public ResponseWriter matchResponseWriter(String uri) {
        return map.get(uri);
    }
}

