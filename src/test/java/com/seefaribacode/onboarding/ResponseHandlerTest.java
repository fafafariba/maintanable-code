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
                "<p>300 + 700 = 1000</p>\n";
        HttpResponseHandler addResponseHandler = new AddResponseHandler();
        HttpServletAddRequestStub reqStub = new HttpServletAddRequestStub("300", "700");
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

class HttpServletAddRequestStub extends NotImplementedHttpServletRequest {
    private final String left;
    private final String right;

    public HttpServletAddRequestStub(String left, String right) {
        this.left = left;
        this.right = right;
    }

    @Override
    public String getParameter(String s) {
        switch(s){
            case "left":
                return left;
            case "right":
                return right;
            default:
                return null;
        }
    }
}

class HttpServletHelloRequestStub extends NotImplementedHttpServletRequest {
    private final String targetValue;

    public HttpServletHelloRequestStub(String targetValue) {
        this.targetValue = targetValue;
    }

    @Override
    public String getParameter(String s) {
        switch(s){
            case "target":
                return targetValue;
            default:
                return null;
        }
    }
}
