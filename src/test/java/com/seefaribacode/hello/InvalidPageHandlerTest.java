package com.seefaribacode.hello;

import org.junit.Test;

import javax.servlet.http.HttpServletRequest;

import static org.junit.Assert.assertEquals;

public class InvalidPageHandlerTest {
    @Test
    public void shouldShowInvalidPage() {
        //given
        String expected = "The page you are looking for does not exist (yet).";
        String url = "/nothelloradd";
        String targetValue = "blah";
        HttpServletRequest request = new HttpServletRequestTargetStub(url, targetValue);
        HttpServletResponseStub response = new HttpServletResponseStub();
        Handler handler = new InvalidPageHandler();

        //when
        handler.writeToResponseBody(request, response);

        //then
        String actual = response.textDisplayed();
        assertEquals("Output should be 'The page you are looking for does not exist (yet).' ", expected, actual);
    }
}
