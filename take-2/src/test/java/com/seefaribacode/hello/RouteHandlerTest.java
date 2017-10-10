package com.seefaribacode.hello;

import org.junit.Test;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.HashMap;
import java.util.Map;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class RouteHandlerTest {
    @Test
    public void invokeMatchingHandler() {
        //given
        String uri = "/expected-path";
        ResponseHandler expectedHandler = new ExpectedHandler();
        ResponseHandler defaultHandler = new DefaultHandler();
        String expected = expectedHandler.getClass().getSimpleName();
        Mapping mappings = new MappingsStub(uri, expectedHandler);
        RouteHandler routeHandler = new UriHandler(mappings, defaultHandler);

        //when
        ResponseHandler responseHandler = routeHandler.getResponseHandler(uri);

        //then
        String actual = responseHandler.getClass().getSimpleName();
        assertThat("URI calls correct handler", expected, is(actual));
    }

    @Test
    public void invokeDefaultHandlerIfNoMatchingHandlerFound() {
        //given
        String uri = "/unexpected-path";
        ResponseHandler expectedHandler = new ExpectedHandler();
        ResponseHandler defaultHandler = new DefaultHandler();
        String expected = defaultHandler.getClass().getSimpleName();
        Mapping mappings = new MappingsStub("/expected-path", expectedHandler);
        RouteHandler routeHandler = new UriHandler(mappings, defaultHandler);

        //when
        ResponseHandler responseHandler = routeHandler.getResponseHandler(uri);

        //then
        String actual = responseHandler.getClass().getSimpleName();
        assertThat("URI calls correct handler", expected, is(actual));
    }

    class MappingsStub implements Mapping {
        final Map<String, ResponseHandler> routeMap;

        public MappingsStub(String uri, ResponseHandler responseHandler) {
            routeMap = new HashMap<>();
            routeMap.put(uri, responseHandler);
        }

        public ResponseHandler getRoute(String uri) {
            return routeMap.get(uri);
        }
    }

    class ExpectedHandler implements ResponseHandler{
        @Override
        public void writeToResponseBody(HttpServletRequest servletRequest, HttpServletResponse servletResponse) {
            throw new UnsupportedOperationException("Not Implemented!");
        }
    }

    class DefaultHandler implements ResponseHandler{
        @Override
        public void writeToResponseBody(HttpServletRequest servletRequest, HttpServletResponse servletResponse) {
            throw new UnsupportedOperationException("Not Implemented!");
        }
    }
}
