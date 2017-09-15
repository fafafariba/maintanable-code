package com.seefaribacode.hello;

import org.junit.Test;

import javax.servlet.http.HttpServletRequest;

import static org.junit.Assert.assertEquals;

public class AddHandlerTest {
    @Test
    public void shouldAddTwoNumbers() {
        // given
        String expected = "2 + 3 = 5";
        String left = "2";
        String right = "3";
        String url = "/add";
        HttpServletRequest request = new HttpServletRequestAddStub(url, left, right);
        HttpServletResponseStub response = new HttpServletResponseStub();
        Handler handler = new AddHandler();

        // when
        handler.writeToResponseBody(request, response);

        // then
        String actual = response.textDisplayed();
        assertEquals("Output should be 2 + 3 = 5", expected, actual);
    }
}
