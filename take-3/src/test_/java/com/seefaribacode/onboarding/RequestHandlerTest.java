package com.seefaribacode.onboarding;

import org.junit.Test;

import javax.servlet.http.HttpServletResponse;

import static org.junit.Assert.assertEquals;

public class RequestHandlerTest {


    @Test
    public void shouldInvokeGetRouteWhenDispatchCalled(){
        //given
        RouteMapStub routeMapStub = new RouteMapStub();
        HttpServletRequestStub reqStub = new HttpServletRequestStub("/route-handler-test");
        HttpServletResponse resStub = new HttpServletResponseStub();
        ResponseHandlerStub responseHandlerStub = new ResponseHandlerStub();
        RouteHandlerStub routeHandlerStub = new RouteHandlerStub();
        RequestHandler reqHandler = new RequestHandlerUsingRouteHandler(new RouteHandlerStub());

        //when
        reqHandler.dispatch(reqStub, resStub);

        //then
        assertEquals("Invokes getRoute once", 1, routeHandlerStub.invokeCount);
        assertEquals("Uri matches", "/route-handler-test", routeHandlerStub.uri);
        assertEquals("RouteMap matches", reqHandler.routeMap, routeHandlerStub.routeMap);
        assertEquals("Invokes writeToBody once",1, responseHandlerStub.invokeCount);
        assertEquals("Response matches", reqStub, responseHandlerStub.req);
        assertEquals("Response matches", resStub, responseHandlerStub.res);    }

}

// Refactor given variables?
// Significance of counting invocations?