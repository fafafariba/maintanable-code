package com.seefaribacode.onboarding;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RouteMapTest {

    @Test
    public void shouldReturnHelloResponseHandler(){
        //given
        UriMapping routeMap = new RouteMap();
        String uri = "/hello";

        //when
        HttpResponseHandler responseHandler = routeMap.getResponseHandler(uri);

        //then
        assertEquals("Should return HelloResponseHandler", "HelloResponseHandler", responseHandler.getClass().getSimpleName());


    } @Test
    public void shouldReturnAddResponseHandler(){
        //given
        UriMapping routeMap = new RouteMap();
        String uri = "/add";

        //when
        HttpResponseHandler responseHandler = routeMap.getResponseHandler(uri);

        //then
        assertEquals("Should return AddResponseHandler", "AddResponseHandler", responseHandler.getClass().getSimpleName());


    } @Test
    public void shouldReturnNotFoundResponseHandler(){
        //given
        UriMapping routeMap = new RouteMap();
        String uri = "/not-found";

        //when
        HttpResponseHandler responseHandler = routeMap.getResponseHandler(uri);

        //then
        assertEquals("Should return NotFoundResponseHandler", "NotFoundResponseHandler", responseHandler.getClass().getSimpleName());


    }
}
