package com.seefaribacode.onboarding;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RouteMapTest {
    @Test
    public void shouldReturnHelloResponseWriter() {
        //given
        String uri = "/hello";
        AppRouter routeMap = new AppRouter();

        //when
        ResponseWriter responseWriter = routeMap.matchResponseWriter(uri);

        //then
        String actual = responseWriter.getClass().getSimpleName();
        assertEquals("HelloResponseWriter", actual);


    }

    @Test
    public void shouldReturnAddResponseWriter() {
        //given
        String uri = "/add";
        AppRouter routeMap = new AppRouter();

        //when
        ResponseWriter responseWriter = routeMap.matchResponseWriter(uri);

        //then
        String actual = responseWriter.getClass().getSimpleName();
        assertEquals("AddResponseWriter", actual);


    }

    @Test
    public void shouldReturnNull() {
        //given
        String uri = "/not-a-route";
        AppRouter routeMap = new AppRouter();

        //when
        ResponseWriter responseWriter = routeMap.matchResponseWriter(uri);

        //then
        assertEquals(null, responseWriter);
    }

}

