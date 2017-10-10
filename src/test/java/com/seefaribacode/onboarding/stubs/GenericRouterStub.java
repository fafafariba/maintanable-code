package com.seefaribacode.onboarding.stubs;

import com.seefaribacode.onboarding.ResponseWriter;
import com.seefaribacode.onboarding.Router;

import java.util.Map;

public class GenericRouterStub implements Router {
    private final Map<String, ResponseWriter> map;

    public GenericRouterStub(Map<String, ResponseWriter> map) {
        this.map = map;
    }

    public ResponseWriter matchResponseWriter(String uri) {
        return map.get(uri);
    }
}

