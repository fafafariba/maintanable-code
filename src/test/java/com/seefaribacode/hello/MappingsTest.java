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
        assertTrue("Returns null", responseHandler == null );
    }

    @Test
    public void shouldBeCorrectSize(){
        //given
        int expected = 2;

        //when
        int actual = Mappings.ROUTE_MAP.size();

        //then
        assertTrue("Map is correct size", expected == actual);
    }
}

// The last test seems overkill but its failure could indicated that a route was added/deleted without updating tests
// However that would mean this test has to be updated each time a new route was added/deleted, could be an annoyance
