package com.seefaribacode.hello;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class MappingsTest {

    @Test
    public void shouldReturnHelloResponseHandler(){
        //given
        String uri = "/hello";
        String expected = "HelloResponseHandler";

        //when
        ResponseHandler responseHandler = Mappings.ROUTE_MAP.get(uri);

        //then
        String actual = responseHandler.getClass().getSimpleName();
        assertEquals("Returns HelloResponseHandler", expected, actual);
    }

    @Test
    public void shouldReturnAddResponseHandler(){
        //given
        String uri = "/add";
        String expected = "AddResponseHandler";

        //when
        ResponseHandler responseHandler = Mappings.ROUTE_MAP.get(uri);

        //then
        String actual = responseHandler.getClass().getSimpleName();
        assertEquals("Returns AddResponseHandler", expected, actual);

    }

    @Test
    public void shouldReturnNull(){
        //given
        String uri = "/nonexistent";

        //when
        ResponseHandler responseHandler = Mappings.ROUTE_MAP.get(uri);

        //then
        assertTrue(responseHandler == null );
    }
}
