package com.seefaribacode.hello;

import org.junit.Test;

import java.util.HashMap;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class RouteHandlerTest {
    @Test
    public void shouldCallHelloResponseHandler() {
        //given
        String uri = "/hello";
        String expected = HelloResponseHandler.class.getSimpleName();
        HashMap<String, ResponseHandler> routeMap = Mappings.ROUTE_MAP;
        RouteHandler routeHandler = new UriHandler(routeMap);

        //when
        ResponseHandler responseHandler = routeHandler.route(uri);

        //then
        String actual = responseHandler.getClass().getSimpleName();
        assertThat("URI calls correct handler", expected, is(actual));
    }

    @Test
    public void shouldCallAddResponseHandler() {
        //given
        String uri = "/add";
        String expected = AddResponseHandler.class.getSimpleName();
        HashMap<String, ResponseHandler> routeMap = Mappings.ROUTE_MAP;
        RouteHandler routeHandler = new UriHandler(routeMap);

        //when
        ResponseHandler responseHandler = routeHandler.route(uri);

        //then
        String actual = responseHandler.getClass().getSimpleName();
        assertThat("URI calls correct handler", expected, is(actual));
    }

    @Test
    public void shouldCallInvalidResponseHandler() {
        //given
        String uri = "/oshkoshbigosh";
        String expected = InvalidResponseHandler.class.getSimpleName();
        HashMap<String, ResponseHandler> routeMap = Mappings.ROUTE_MAP;
        RouteHandler routeHandler = new UriHandler(routeMap);

        //when
        ResponseHandler responseHandler = routeHandler.route(uri);

        //then
        String actual = responseHandler.getClass().getSimpleName();
        assertThat("URI calls correct handler", expected, is(actual));
    }


}
