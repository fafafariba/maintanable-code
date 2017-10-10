package com.seefaribacode.onboarding;

import com.seefaribacode.onboarding.stubs.AppRequestHandlerStub;
import com.seefaribacode.onboarding.stubs.HttpServletRequestUriStub;
import com.seefaribacode.onboarding.stubs.HttpServletResponseStub;
import org.junit.Test;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

import static org.junit.Assert.assertEquals;

public class EntryServletTest {

    @Test
    public void shouldInvokeDispatch() throws ServletException, IOException {
        //given
        EntryServlet entryServlet = new EntryServlet();
        HttpServletRequestUriStub requestStub = new HttpServletRequestUriStub("/entry-servlet-test");
        HttpServletResponse responseStub = new HttpServletResponseStub();
        AppRequestHandlerStub appRequestHandlerStub = new AppRequestHandlerStub();
        entryServlet.dependencyInjection.appRequestHandler = appRequestHandlerStub;

        //when
        entryServlet.service(requestStub, responseStub);

        //then
        assertEquals("Should pass same request parameter", requestStub, appRequestHandlerStub.request);
        assertEquals("Should pass same response parameter", responseStub, appRequestHandlerStub.response);
        assertEquals("Should invoke dispatch once", 1, appRequestHandlerStub.invocations);
    }
}


