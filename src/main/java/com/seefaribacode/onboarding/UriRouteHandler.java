package com.seefaribacode.onboarding;

import java.util.Map;

public interface UriRouteHandler {
    HttpResponseHandler getRoute(String uri, UriMapping routeMap);
}
