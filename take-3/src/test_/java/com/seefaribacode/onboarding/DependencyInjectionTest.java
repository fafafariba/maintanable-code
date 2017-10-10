package com.seefaribacode.onboarding;

import org.junit.Ignore;
import org.junit.Test;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import java.io.IOException;

import static org.junit.Assert.assertEquals;

public class DependencyInjectionTest {
    @Test
    public void shouldInvokeDispatch() throws ServletException, IOException {
        //given
        EntryServlet entryServlet = new EntryServlet();
        entryServlet.init();
        HttpServletRequest req = new HttpServletRequestStub("/test");
        HttpServletResponse res = new HttpServletResponseStub();
        UriRouteHandler routeHandler = new RouteHandlerStub();
        UriMapping routeMap = new RouteMapStub();
        RequestHandlerStub reqHandler = new RequestHandlerStub(routeMap, routeHandler);
        entryServlet.dependencyInjection.reqHandler = reqHandler;

        //when
        entryServlet.service(req, res);

        //then
        assertEquals("Dispatcher should receive request", req, reqHandler.req);
        assertEquals("Dispatcher should receive single request", 1, reqHandler.reqCount);
        assertEquals("Dispatcher should receive response", res, reqHandler.res);
        assertEquals("Dispatcher should receive single response", 1, reqHandler.resCount);
    }
}
