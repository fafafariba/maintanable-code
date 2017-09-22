package com.seefaribacode.hello;

import org.junit.Test;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.HashMap;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class RequestHandlerTest {

    @Test
    public void shouldReturnResponseHandler() {
        //given
        String uri = "/Bobloblaw";

        HashMap<String, ResponseHandler> responseHandlerMap = new HashMap<String, ResponseHandler>();
        ResponseHandlerStub responseHandler = new ResponseHandlerStub();
        responseHandlerMap.put(uri, responseHandler);

        RouteHandler routeHandler = new UriHandlerStub(responseHandlerMap);
        RequestHandler requestHandler = new RequestHandler(routeHandler);
        HttpServletRequestHandlerStub request = new HttpServletRequestHandlerStub(uri);
        HttpServletResponse response = new HttpServletResponseStub();

        //when
        requestHandler.dispatch(request, response);

        //then
        assertThat("writeResponseToBody should be passed request parameter", request, is(responseHandler.requestParam));
        assertThat("writeResponseToBody should be passed response parameter", response, is(responseHandler.responseParam));

    }

    class ResponseHandlerStub implements ResponseHandler {
        HttpServletRequest requestParam;
        HttpServletResponse responseParam;


        public void writeToResponseBody(HttpServletRequest servletRequest, HttpServletResponse servletResponse) {
            this.requestParam = servletRequest;
            this.responseParam = servletResponse;
        }


    }

    class UriHandlerStub implements RouteHandler {
        HashMap<String, ResponseHandler> routeMap;

        UriHandlerStub(HashMap routeMap) {
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

