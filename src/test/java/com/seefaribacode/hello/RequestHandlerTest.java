package com.seefaribacode.hello;

import org.junit.Test;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import java.util.HashMap;

import static org.junit.Assert.assertEquals;

public class RequestHandlerTest {

    @Test
    public void shouldReturnResponseHandler() {
        //given
        String uri = "/Bobloblaw";

        HashMap<String, ResponseHandler> responseHandlerMap = new HashMap();
        ResponseHandlerStub responseHandler = new ResponseHandlerStub();
        responseHandlerMap.put(uri, responseHandler);

        RouteHandler routeHandler = new UriHandlerStub(responseHandlerMap);
        RequestHandler requestHandler = new RequestHandler(routeHandler);
        HttpServletRequestHandlerStub request = new HttpServletRequestHandlerStub(uri);
        HttpServletResponse response = new HttpServletResponseStub();

        int expectedCount = 1;

        //when
        requestHandler.dispatch(request, response);

        //then
        int actualCount = responseHandler.invocations();
        assertEquals("writeResponseToBody should be invoked", expectedCount, actualCount);

    }

    class ResponseHandlerStub implements ResponseHandler {
        int count = 0;

        public void writeToResponseBody(HttpServletRequest servletRequest, HttpServletResponse servletResponse) {
            count++;
        }

        public int invocations(){
            return count;
        }
    }

    class HttpServletRequestHandlerStub extends HttpServletRequestNotImplemented {
        String uri;

        public HttpServletRequestHandlerStub(String uri) {
            this.uri = uri;
        }

        @Override
        public String getRequestURI() {
            return uri;
        }
    }

    class UriHandlerStub implements RouteHandler {
        HashMap<String, ResponseHandler> routeMap;

        public UriHandlerStub(HashMap routeMap) {
        this.routeMap = routeMap;
        }

        public ResponseHandler route(String uri) {

            if (routeMap.containsKey(uri)) {
                return routeMap.get(uri);

            } else {
                return null;
            }
        }
    }
}

