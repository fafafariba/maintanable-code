package com.seefaribacode.onboarding;

import java.util.HashMap;
import java.util.Map;

public class AppRouter implements Router {
    private final Map<String, ResponseWriter> map = new HashMap<String, ResponseWriter>();

    public AppRouter() {
        map.put("/hello", new HelloResponseWriter());
        map.put("/add", new AddResponseWriter());
    }

    public ResponseWriter matchResponseWriter(String uri) {
        return map.get(uri);
    }
}
