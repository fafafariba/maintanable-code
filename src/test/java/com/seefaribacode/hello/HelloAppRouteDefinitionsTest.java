package com.seefaribacode.hello;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class HelloAppRouteDefinitionsTest {
    @Test
    public void helloRouteMapsToHelloHandler(){
        // given
        HelloAppRouteDefinitions definitions = new HelloAppRouteDefinitions();

        // when
        Handler handler = definitions.lookup("/hello");

        // then
        assertThat(handler.getClass().getSimpleName(), is("HelloHandler"));
    }

    @Test
    public void addRouteMapsToAddHandler(){
        // given
        HelloAppRouteDefinitions definitions = new HelloAppRouteDefinitions();

        // when
        Handler handler = definitions.lookup("/add");

        // then
        assertThat(handler.getClass().getSimpleName(), is("AddHandler"));
    }

    @Test
    public void unknownRouteMapsToInvalidPageHandler(){
        // given
        HelloAppRouteDefinitions definitions = new HelloAppRouteDefinitions();

        // when
        Handler handler = definitions.lookup("/foo");

        // then
        assertThat(handler.getClass().getSimpleName(), is("InvalidPageHandler"));
    }
}
