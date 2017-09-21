package com.seefaribacode.hello;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
import org.junit.Test;
import static org.junit.Assert.assertEquals;


public class AppTest {
    @Test
    public void shouldGreetTargetValue() throws ServletException, IOException {
        //given
        String expected = "hello world";
        String targetValue = "world";
        String url = "/hello";
        HttpServletRequest request = new HttpServletRequestTargetStub(url, targetValue);
        HttpServletResponseStub response = new HttpServletResponseStub();

        //when
        launchEntryServlet(request, response);


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

        //when
        launchEntryServlet(request, response);

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

        //when
        launchEntryServlet(request, response);


        //then
        String actual = response.textDisplayed();
        assertEquals("Output should be 'The page you are looking for does not exist (yet).' ", expected, actual);
    }

    private void launchEntryServlet(HttpServletRequest request, HttpServletResponse response) {
        EntryServlet entryServlet = new EntryServlet();

        try {
            entryServlet.init();
        } catch (ServletException e) {
            throw new RuntimeException(e.getMessage(), e);
        }

        try {
            entryServlet.service(request, response);
        } catch (ServletException e) {
            throw new RuntimeException(e.getMessage(), e);
        } catch (IOException e) {
            throw new RuntimeException(e.getMessage(), e);
        }
    }
}






