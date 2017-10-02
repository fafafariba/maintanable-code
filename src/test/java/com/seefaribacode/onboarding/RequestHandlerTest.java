package com.seefaribacode.onboarding;

import org.junit.Ignore;
import org.junit.Test;

import javax.servlet.http.HttpServletResponse;
import java.util.Map;

import static org.junit.Assert.assertEquals;

public class RequestHandlerTest {

    @Test
    public void shouldInvokeGetRouteWhenDispatchCalled(){
        //given
        RouteMapStub routeMapStub = new RouteMapStub();
        RouteHandlerStub routeHandlerStub = new RouteHandlerStub();
        RequestHandler reqHandler = new RequestHandler(routeMapStub, routeHandlerStub);
        HttpServletRequestStub req = new HttpServletRequestStub("\route-handler-test");
        HttpServletResponse res = new HttpServletResponseStub();

        //when
        reqHandler.dispatch(req, res);

        //then
        assertEquals("Invokes getRoute once", 1, routeHandlerStub.invokeCount);
        assertEquals("Uri matches", "/route-handler-test", routeHandlerStub.uri);
        assertEquals("RouteMap matches", reqHandler.routeMap, routeHandler.routeMap);

    }

    @Ignore
    public void shouldInvokeWriteToBody(){

    }
}

class RouteHandlerStub implements UriRouteHandler {
    static int invokeCount = 0;
    String uri;
    UriMapping routeMap;

    @Override
    public HttpResponseHandler getRoute(String uri, UriMapping routeMap) {
        invokeCount++;
        this.uri = uri;
        this.routeMap = routeMap;
        return null;
    }
}