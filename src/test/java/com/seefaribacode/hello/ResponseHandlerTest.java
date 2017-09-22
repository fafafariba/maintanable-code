package com.seefaribacode.hello;

import org.junit.Test;

import javax.servlet.http.HttpServletResponse;

import java.io.IOException;

import static org.junit.Assert.assertEquals;

public class ResponseHandlerTest {

    @Test
    public void shouldOutputHelloResponse()  {
        //given
        HttpServletRequestTargetStub request = new HttpServletRequestTargetStub("/hello", "Bobloblaw");
        HttpServletResponseStub response = new HttpServletResponseStub();
        ResponseHandler responseHandler = new HelloResponseHandler();
        //when
        responseHandler.writeToResponseBody(request, response);

        //then
        assertEquals("Output should be 'hello <targetValue>'", "hello Bobloblaw", response.textDisplayed());
    }

    @Test
    public void shouldOutputAddResponse()  {
        //given
        HttpServletRequestAddStub request = new HttpServletRequestAddStub("/add", "57", "84");
        HttpServletResponseStub response = new HttpServletResponseStub();
        ResponseHandler responseHandler = new AddResponseHandler();
        //when
        responseHandler.writeToResponseBody(request, response);

        //then
        assertEquals("Output should be '<leftStr> + <rightStr> = <sum>' ", "57 + 84 = 141", response.textDisplayed());
    }

    @Test
    public void shouldOutputInvalidResponse()  {
        //given
        String uri = "/w4ru8";
        HttpServletRequestTargetStub request = new HttpServletRequestTargetStub(uri, "Bobloblaw");
        HttpServletResponseStub response = new HttpServletResponseStub();
        ResponseHandler responseHandler = new InvalidResponseHandler();
        //when
        responseHandler.writeToResponseBody(request, response);

        //then
        assertEquals("Output should not be hello or add", String.format("The page %s does not exist", uri), response.textDisplayed());
    }



}
