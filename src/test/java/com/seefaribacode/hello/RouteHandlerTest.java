package com.seefaribacode.hello;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class RouteHandlerTest {
    @Test
    public void shouldCallHelloResponseHandler(){
        //given
        String uri = "/hello";
        String expected = HelloResponseHandler.class.getSimpleName();
        RouteHandler routeHandler = new UriHandler();

        //when
        ResponseHandler responseHandler = routeHandler.route(uri);

        //then
        String actual = responseHandler.getClass().getSimpleName();
        assertThat("URI calls correct handler", expected, is(actual));
    }

    @Test
    public void shouldCallAddResponseHandler(){
        //given
        String uri = "/add";
        String expected = AddResponseHandler.class.getSimpleName();
        RouteHandler routeHandler = new UriHandler();

        //when
        ResponseHandler responseHandler = routeHandler.route(uri);

        //then
        String actual = responseHandler.getClass().getSimpleName();
        assertThat("URI calls correct handler", expected, is(actual));
    }

    @Test
    public void shouldCallInvalidResponseHandler(){
        //given
        String uri = "/oshkoshbigosh";
        String expected = InvalidResponseHandler.class.getSimpleName();
        RouteHandler routeHandler = new UriHandler();

        //when
        ResponseHandler responseHandler = routeHandler.route(uri);

        //then
        String actual = responseHandler.getClass().getSimpleName();
        assertThat("URI calls correct handler", expected, is(actual));
    }


}
