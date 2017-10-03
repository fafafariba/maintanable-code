package com.seefaribacode.onboarding;

class RouteMap implements UriMapping {

    @Override
    public HttpResponseHandler getResponseHandler(String uri) {
        switch(uri) {
            case "/hello":
                return new HelloResponseHandler();
            case "/add":
                return new AddResponseHandler();
            default:
                return new NotFoundResponseHandler();
        }
    }
}
