package com.seefaribacode.onboarding;

import org.junit.Ignore;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ResponseHandlerTest {

    @Test
    public void shouldWriteHelloResponse(){
        //given
        String expectedBody = "<h1>HELLO</h1>\n" +
                "<p>hello world</p>\n";
        HttpServletHelloRequestStub reqStub = new HttpServletHelloRequestStub("world");
        HttpServletResponseStub resStub = new HttpServletResponseStub();
        HelloResponseHandler helloResponseHandler = new HelloResponseHandler();

        //when
        helloResponseHandler.writeToBody(reqStub, resStub);

        //then
        assertEquals("Output matches hello response", expectedBody, resStub.getBody());

    }

    @Test
    public void shouldWriteAddResponse(){
        //given
        String expectedBody = "<h1>ADD</h1>\n" +
                "<p>3 + 7 = 10</p>\n";
        HttpResponseHandler addResponseHandler = new AddResponseHandler();
        HttpServletAddRequestStub reqStub = new HttpServletAddRequestStub("3", "7");
        HttpServletResponseStub resStub = new HttpServletResponseStub();

        //when
        addResponseHandler.writeToBody(reqStub, resStub);

        //then
        assertEquals("Output matches add response", expectedBody, resStub.getBody());


    }

    @Test
    public void shouldWriteGenericErrorResponseWhenAddResponseThrowsException(){
        //given
        String expectedBody = "<h1>ADD ERROR</h1>\n" +
                "<p>Check the logs</p>\n";
        HttpResponseHandler addResponseHandler = new AddResponseHandler();
        HttpServletAddRequestStub reqStub = new HttpServletAddRequestStub("a", "b");
        HttpServletResponseStub resStub = new HttpServletResponseStub();

        //when
        addResponseHandler.writeToBody(reqStub, resStub);

        //then
        assertEquals("Output matches add response", expectedBody, resStub.getBody());


    }

    @Test
    public void shouldWriteNotFoundResponse(){
        //given
        String expectedBody = "<h1>Page Not Found</h1>\n";
        HttpResponseHandler notFoundResponseHandler = new NotFoundResponseHandler();
        HttpServletRequestStub reqStub = new HttpServletRequestStub("/fake-uri");
        HttpServletResponseStub resStub = new HttpServletResponseStub();

        //when
        notFoundResponseHandler.writeToBody(reqStub, resStub);

        //then
        assertEquals("Output matches invalid response", expectedBody, resStub.getBody());
    }
}

