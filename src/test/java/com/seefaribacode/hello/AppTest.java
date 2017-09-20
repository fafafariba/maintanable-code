package com.seefaribacode.hello;

import javax.servlet.http.*;
import org.junit.Test;
import static org.junit.Assert.assertEquals;


public class AppTest {
    @Test
    public void shouldGreetTargetValue() {
        //given
        String expected = "hello world";
        String targetValue = "world";
        String url = "/hello";
        HttpServletRequest request = new HttpServletRequestTargetStub(url, targetValue);
        HttpServletResponseStub response = new HttpServletResponseStub();
        RequestHandler requestHandler = newRequestHandler();

        //when
        requestHandler.dispatch(request, response);

        //then
        String actual = response.textDisplayed();
        assertEquals("Output should be hello world ", expected, actual);
    }

    @Test
    public void shouldAddTwoNumbers() {

        //given
        String expected = "2 + 3 = 5";
        String left = "2";
        String right = "3";
        String url = "/add";
        HttpServletRequest request = new HttpServletRequestAddStub(url, left, right);
        HttpServletResponseStub response = new HttpServletResponseStub();

        RequestHandler requestHandler = newRequestHandler();

        //when
        requestHandler.dispatch(request, response);

        //then
        String actual = response.textDisplayed();
        assertEquals("Output should be 2 + 3 = 5", expected, actual);
    }

    @Test
    public void shouldShowInvalidPage() {

        //given
        String expected = "The page you are looking for does not exist (yet).";
        String url = "/nothelloradd";
        String targetValue = "blah";
        HttpServletRequest request = new HttpServletRequestTargetStub(url, targetValue );
        HttpServletResponseStub response = new HttpServletResponseStub();
        RequestHandler requestHandler = newRequestHandler();

        //when
        requestHandler.dispatch(request, response);

        //then
        String actual = response.textDisplayed();
        assertEquals("Output should be 'The page you are looking for does not exist (yet).' ", expected, actual);
    }

    private RequestHandler newRequestHandler(){
        RouteHandler routeHandler = new UriHandler();
        RequestHandler requestHandler = new RequestHandler(routeHandler);
        return requestHandler;
    }
}







