package com.seefaribacode.hello;

import org.junit.Test;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.HashMap;
import java.util.Map;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;


public class DispatcherTest {
    @Test
    public void sendToCorrectPlace() {
        // given
        String requestUri = "/foo";
        HttpServletRequest request = new HttpServletRequestStub(requestUri);
        HttpServletResponseStub response = null;
        Map<String, Handler> handlerMap = new HashMap<String, Handler>();
        HandlerStub fooHandler = new HandlerStub();
        handlerMap.put("/foo", fooHandler);

        RouteDefinitions routeDefinitions = new RouteDefinitionsStub(handlerMap);
        Dispatcher dispatcher = new Dispatcher(routeDefinitions);

        // when
        dispatcher.dispatch(request, response);

        // then
        assertThat(fooHandler.invocationCount, is(1));
    }

    class RouteDefinitionsStub implements RouteDefinitions {
        final Map<String, Handler> map;

        public RouteDefinitionsStub(Map<String, Handler> map) {
            this.map = map;
        }

        public Handler lookup(String url) {
            return map.get(url);
        }
    }

    class HandlerStub implements Handler{
        int invocationCount = 0;

        public void writeToResponseBody(HttpServletRequest servletRequest, HttpServletResponse servletResponse) {
           invocationCount++;
        }
    }

    class HttpServletRequestStub extends HttpServletRequestNotImplemented {
        final String requestUri;

        public HttpServletRequestStub(String requestUri) {
            this.requestUri = requestUri;
        }

        @Override
        public String getRequestURI() {
            return requestUri;
        }
    }
}
