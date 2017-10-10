package com.seefaribacode.onboarding;

import com.seefaribacode.onboarding.stubs.*;
import org.junit.Test;

import javax.servlet.http.HttpServletResponse;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class RequestHandlerTest {

    @Test
    public void dispatchWithNoExceptions() {
        //given
        String uri = "/test";
        ResponseWriterStub responseWriterStub = new ResponseWriterStub();
        RouterStub routerStub = new RouterStub(uri, responseWriterStub);
        ResponseWriter errorResponseWriterStub = new ErrorResponseWriterStub();
        RequestHandler testRequestHandler = new AppRequestHandler(routerStub, errorResponseWriterStub);
        HttpServletRequestUriStub requestStub = new HttpServletRequestUriStub(uri);
        HttpServletResponse responseStub = new HttpServletResponseStub();

        //then
        testRequestHandler.dispatch(requestStub, responseStub);

        //when
        assertTrue("Dispatch invokes router.matchResponseWriter", routerStub.invoked);
        assertEquals("Passes parameter uri", uri, routerStub.uri);
        assertTrue("Invokes responseWriter.writeToBody", responseWriterStub.invoked);
        assertEquals("Passes parameter request", requestStub, responseWriterStub.request);
        assertEquals("Passes parameter response", responseStub, responseWriterStub.response);
    }

    @Test
    public void dispatchWithNullRouter() {
        //given
        HttpServletRequestUriStub requestStub = new HttpServletRequestUriStub(null);
        HttpServletResponse responseStub = new HttpServletResponseStub();
        ErrorResponseWriterStub errorResponseWriterStub = new ErrorResponseWriterStub();
        RequestHandler testRequestHandler = new AppRequestHandler(null, errorResponseWriterStub);

        //when
        testRequestHandler.dispatch(requestStub, responseStub);

        //then
        assertTrue("Null router invokes ErrorResponseWriter", errorResponseWriterStub.invoked);
        assertEquals("Passes parameter response", responseStub, errorResponseWriterStub.response);
    }

    @Test
    public void dispatchWithNullResponseWriter() {
        //given
        ErrorResponseWriterStub errorResponseWriterStub = new ErrorResponseWriterStub();
        RouterStub routerStub = new RouterStub("/no-matching-response-writer", null);
        RequestHandler testRequestHandler = new AppRequestHandler(routerStub, errorResponseWriterStub);
        HttpServletRequestUriStub requestStub = new HttpServletRequestUriStub("/no-matching-response-writer");
        HttpServletResponse responseStub = new HttpServletResponseStub();

        //when
        testRequestHandler.dispatch(requestStub, responseStub);

        //then
        assertTrue("Null response invokes ErrorResponseWriter", errorResponseWriterStub.invoked);
        assertEquals("Passes parameter response", responseStub, errorResponseWriterStub.response);
    }

    @Test
    public void dispatchWithThrownException() {
        //given
        String messageStub = "java.lang.NumberFormatException: NumberFormatException";
        ResponseWriter responseWriterStub = new ResponseWriterThatThrowsExceptionStub(messageStub);
        Router routerStub = new RouterStub("/foo", responseWriterStub);
        ErrorResponseWriterStub errorResponseWriterStub = new ErrorResponseWriterStub();
        final RequestHandler testRequestHandler = new AppRequestHandler(routerStub, errorResponseWriterStub);
        final HttpServletRequestUriStub requestStub = new HttpServletRequestUriStub("/foo");
        final HttpServletResponseStub responseStub = new HttpServletResponseStub();
        String expectedBody = "An error has occurred\njava.lang.NumberFormatException: NumberFormatException";

        //when
        testRequestHandler.dispatch(requestStub, responseStub);

        //then
        assertTrue("ResponseWriter that throws invokes ErrorResponseWriter", errorResponseWriterStub.invoked);
        assertEquals("Passes parameter response", responseStub, errorResponseWriterStub.response);
        assertEquals(expectedBody, responseStub.getOutput());
    }


}

