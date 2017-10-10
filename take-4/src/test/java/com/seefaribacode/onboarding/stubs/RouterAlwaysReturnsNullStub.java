package com.seefaribacode.onboarding.stubs;

import com.seefaribacode.onboarding.ResponseWriter;
import com.seefaribacode.onboarding.Router;

public class RouterAlwaysReturnsNullStub implements Router {
    public ResponseWriter matchResponseWriter(String uri) {
        return null;
    }
}

