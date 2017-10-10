package com.seefaribacode.onboarding;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RouteHandlerTest {

    @Test
    public void shouldInvokeGetResponseHandler(){
        //given
        String uriStub = "/some-uri";
        UriMapping routeMapStub = new RouteMapStub();
        UriRouteHandler routeHandler = new RouteHandler();

        //when
        HttpResponseHandler responseHandler = routeHandler.getRoute(uriStub, routeMapStub);

        //then
        String actual = responseHandler.getClass().getSimpleName();
        assertEquals("Returns corresponding responseHandler", "ResponseHandlerStub", actual);
    }

}
