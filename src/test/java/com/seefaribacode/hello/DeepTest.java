package com.seefaribacode.hello;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
import org.junit.Test;
import static org.junit.Assert.assertEquals;


public class DeepTest {
    @Test
    public void shouldGreetTargetValue() throws ServletException, IOException {
        //given
        String targetValue = "BobLoblaw";
        String expected = String.format("hello %s", targetValue);
        String url = "/hello";
        HttpServletRequest request = new HttpServletRequestTargetStub(url, targetValue);
        HttpServletResponseStub response = new HttpServletResponseStub();

        //when
        launchServlet(request, response);
        
        //then
        String actual = response.textDisplayed();
        assertEquals(String.format("Output should be hello %s ", targetValue), expected, actual) ;
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

        //when
        launchServlet(request, response);

        //then
        String actual = response.textDisplayed();
        assertEquals("Output should be 2 + 3 = 5", expected, actual);
    }

    @Test
    public void shouldShowInvalidPage() {

        //given
        String url = "/notHellOrAdd";
        String expected = String.format("The page %s does not exist", url);
        String targetValue = "BobLoblaw";
        HttpServletRequest request = new HttpServletRequestTargetStub(url, targetValue );
        HttpServletResponseStub response = new HttpServletResponseStub();

        //when
        launchServlet(request, response);


        //then
        String actual = response.textDisplayed();
        assertEquals(String.format("Output should be 'The page %s does not exist.' ", url), expected, actual);
    }

    private void launchServlet(HttpServletRequest request, HttpServletResponse response) {

        RequestHandler requestHandler = new RequestHandler(new UriHandler());
        requestHandler.dispatch(request, response);
    }
}






