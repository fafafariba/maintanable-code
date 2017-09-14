package com.seefaribacode.hello;

import org.junit.Test;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import static org.junit.Assert.assertEquals;


public class DispatcherTest {
    @Test
    public void shouldGreetTargetValue() {
        // given
        String expected = "hello world";
        String targetValue = "world";
        String url = "/hello";
        HttpServletRequest request = new HttpServletRequestTargetStub(url, targetValue);
        HttpServletResponseStub response = new HttpServletResponseStub();

        // when
        Dispatcher dispatcher = newDispatcher(request, response);
        dispatcher.dispatch();

        // then
        String actual = response.textDisplayed();
        assertEquals("Output should be hello world ", expected, actual);
    }

    @Test
    public void shouldAddTwoNumbers() {
        // given
        String expected = "2 + 3 = 5";
        String left = "2";
        String right = "3";
        String url = "/add";
        HttpServletRequest request = new HttpServletRequestAddStub(url, left, right);
        HttpServletResponseStub response = new HttpServletResponseStub();

        // when
        Dispatcher dispatcher = newDispatcher(request, response);
        dispatcher.dispatch();

        // then
        String actual = response.textDisplayed();
        assertEquals("Output should be 2 + 3 = 5", expected, actual);
    }

    @Test
    public void shouldShowInvalidPage() {

        //given
        String expected = "The page you are looking for does not exist (yet).";
        String url = "/nothelloradd";
        String targetValue = "blah";
        HttpServletRequest request = new HttpServletRequestTargetStub(url, targetValue);
        HttpServletResponseStub response = new HttpServletResponseStub();

        //when
        Dispatcher dispatcher = newDispatcher(request, response);
        dispatcher.dispatch();

        //then
        String actual = response.textDisplayed();
        assertEquals("Output should be 'The page you are looking for does not exist (yet).' ", expected, actual);
    }

    Dispatcher newDispatcher(HttpServletRequest request, HttpServletResponse response) {
        RouteDefinitions routeDefinitions = new HelloAppRouteDefinitions();
        Dispatcher dispatcher = new Dispatcher(request, response, routeDefinitions);
        return dispatcher;
    }
}







