package com.seefaribacode.onboarding;

import org.junit.Test;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import java.io.IOException;

import static org.junit.Assert.assertEquals;

public class DependencyInjectionTest {
    static EntryServlet entryServlet = new EntryServlet();

    @Test
    public void shouldInstantiateRouteMap(){
        //given
        try {
            entryServlet.init();
        } catch (ServletException e) {
            throw new RuntimeException(e.getMessage(), e);
        }

        //when
        DependencyInjection dep = entryServlet.dependencyInjection;
        String actual = dep.routeHandler.getClass().getSimpleName();

        //then
        assertEquals("Instance of RouteHandler is created", "RouteHandler" , actual);

    }

    @Test
    public void shouldInstantiateRouteHandler(){
        //given
        try {
            entryServlet.init();
        } catch (ServletException e) {
            throw new RuntimeException(e.getMessage(), e);
        }

        //when
        DependencyInjection dep = entryServlet.dependencyInjection;
        String actual = dep.routeMap.getClass().getSimpleName();

        //then
        assertEquals("Instance of RouteMap is created", "RouteMap" , actual);

    }

    @Test
    public void shouldInstantiateRequestHandler(){
        //given
        try {
            entryServlet.init();
        } catch (ServletException e) {
            throw new RuntimeException(e.getMessage(), e);
        }

        //when
        DependencyInjection dep = entryServlet.dependencyInjection;
        String actual = dep.reqHandler.getClass().getSimpleName();

        //then
        assertEquals("Instance of RequestHandler is created", "RequestHandler" , actual);

    }


    @Test
    public void shouldInvokeDispatch(){
        //given
        try {
            entryServlet.init();
        } catch (ServletException e) {
            throw new RuntimeException(e.getMessage(), e);
        }
        HttpServletRequest req = new HttpServletRequestStub("/test");
        HttpServletResponse res = new HttpServletResponseStub();
        UriRouteHandler routeHandler = new RouteHandlerStub();
        UriMapping routeMap = new RouteMapStub();
        RequestHandlerStub reqHandler = new RequestHandlerStub(routeMap, routeHandler);
        entryServlet.dependencyInjection.reqHandler = reqHandler;

        //when
        try {
            entryServlet.service(req, res);
        } catch (ServletException e) {
            throw new RuntimeException(e.getMessage(), e);
        } catch (IOException e) {
            throw new RuntimeException(e.getMessage(), e);
        }

        //then
        assertEquals("Dispatcher should receive request", req, reqHandler.req);
        assertEquals("Dispatcher should receive single request", 1, reqHandler.reqCount);
        assertEquals("Dispatcher should receive response", res, reqHandler.res);
        assertEquals("Dispatcher should receive single response", 1, reqHandler.resCount);
    }



}


