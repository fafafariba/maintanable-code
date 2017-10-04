package com.seefaribacode.onboarding;

class RouteMapStub implements UriMapping{
    @Override
    public HttpResponseHandler getResponseHandler(String uri) {
        switch(uri){
            case "/some-uri":
                return new ResponseHandlerStub();
            default:
                return null;
        }
    }
}
