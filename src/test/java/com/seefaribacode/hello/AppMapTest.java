package com.seefaribacode.hello;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class AppMapTest {

    @Test
    public void shouldReturnHelloResponseHandler(){
        //given
        String uri = "/hello";
        String expected = "HelloResponseHandler";
        Mapping map = new AppMap();

        //when
        ResponseHandler responseHandler = map.getRoute(uri);

        //then
        String actual = responseHandler.getClass().getSimpleName();
        assertEquals("Returns HelloResponseHandler", expected, actual);
    }

    @Test
    public void shouldReturnAddResponseHandler(){
        //given
        String uri = "/add";
        String expected = "AddResponseHandler";
        Mapping map = new AppMap();

        //when
        ResponseHandler responseHandler = map.getRoute(uri);

        //then
        String actual = responseHandler.getClass().getSimpleName();
        assertEquals("Returns AddResponseHandler", expected, actual);

    }

    @Test
    public void shouldReturnNull(){
        //given
        String uri = "/nonexistent";
        Mapping map = new AppMap();

        //when
        ResponseHandler responseHandler = map.getRoute(uri);

        //then
        assertTrue("Returns null", responseHandler == null );
    }
}
