package com.seefaribacode.hello;

public class UriHandler implements RouteHandler {
    private final Mapping map;
    private final ResponseHandler invalidResponseHandler;

    public UriHandler(Mapping map, ResponseHandler invalidResponseHandler) {
        this.map = map;
        this.invalidResponseHandler = invalidResponseHandler;
    }

    public ResponseHandler getResponseHandler(String uri) {
        ResponseHandler responseHandler = map.getRoute(uri);
        if (responseHandler != null) {
            return responseHandler;
        } else {
            return invalidResponseHandler;
        }
    }
}
