package com.seefaribacode.onboarding;

import com.seefaribacode.onboarding.stubs.HttpServletParamRequestStub;
import com.seefaribacode.onboarding.stubs.HttpServletResponseStub;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ResponseWriterTest {

    @Test
    public void shouldRenderHelloResponse() {
        //given
        String targetValue = "world";
        String expectedBody = String.format("Hello, %s!", targetValue);
        HttpServletParamRequestStub requestStub = new HttpServletParamRequestStub(targetValue, null);
        HttpServletResponseStub responseStub = new HttpServletResponseStub();
        HelloResponseWriter testHelloResponseWriter = new HelloResponseWriter();

        //when
        testHelloResponseWriter.writeToBody(requestStub, responseStub, null);

        //then
        String actualBody = responseStub.getOutput();
        assertEquals(expectedBody, actualBody);
    }

    @Test
    public void shouldRenderAddResponse() {
        //given

        String expectedBody = "45 + 35 = 80";
        HttpServletParamRequestStub requestStub = new HttpServletParamRequestStub("45", "35");
        HttpServletResponseStub responseStub = new HttpServletResponseStub();
        AddResponseWriter testAddResponseWriter = new AddResponseWriter();

        //when
        testAddResponseWriter.writeToBody(requestStub, responseStub, null);

        //then
        String actualBody = responseStub.getOutput();
        assertEquals(expectedBody, actualBody);
    }

    @Test
    public void shouldRenderErrorResponse() {
        //given
        String expectedBody = "An error has occurred\nError Message";
        Exception exception = new Exception("Error Message");
        HttpServletResponseStub responseStub = new HttpServletResponseStub();
        ErrorResponseWriter testErrorResponseWriter = new ErrorResponseWriter();

        //when
        testErrorResponseWriter.writeToBody(null, responseStub, exception.getMessage());

        //then
        String actualBody = responseStub.getOutput();
        assertEquals(expectedBody, actualBody);
    }
}

