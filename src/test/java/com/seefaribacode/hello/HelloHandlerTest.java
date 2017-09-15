package com.seefaribacode.hello;

import org.junit.Test;

import javax.servlet.http.HttpServletRequest;

import static org.junit.Assert.assertEquals;

public class HelloHandlerTest {
    @Test
    public void shouldGreetTargetValue() {
        // given
        String expected = "hello world";
        String targetValue = "world";
        String url = "/hello";
        HttpServletRequest request = new HttpServletRequestTargetStub(url, targetValue);
        HttpServletResponseStub response = new HttpServletResponseStub();
        Handler handler = new HelloHandler();

        // when
        handler.writeToResponseBody(request, response);

        // then
        String actual = response.textDisplayed();
        assertEquals("Output should be hello world ", expected, actual);
    }
}
