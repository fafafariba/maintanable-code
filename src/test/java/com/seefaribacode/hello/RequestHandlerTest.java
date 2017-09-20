package com.seefaribacode.hello;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;
import org.junit.Test;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class RequestHandlerTest {
    @Test
    public void forwardRoute(){
        // given
        String requestUri = "request-uri";
        Map<String, ResponseHandler> responseHandlers = new HashMap<>();
        ResponseHandlerStub responseHandler = new ResponseHandlerStub();
        responseHandlers.put(requestUri, responseHandler);
        RouteHandler routeHandler = new RouteHandlerStub(responseHandlers);
        HttpServletRequest request = new RequestStub(requestUri);
        HttpServletResponse response = new ResponseStub();
        RequestHandler requestHandler = new RequestHandler(routeHandler);

        // when
        requestHandler.dispatch(request, response);

        // then
        assertThat(responseHandler.invocations.size(), is(1));
        WriteToResponseBodyInvocation invocation = responseHandler.invocations.get(0);
        assertThat(invocation.servletRequest, is(request));
        assertThat(invocation.servletResponse, is(response));
    }

    class RouteHandlerStub implements RouteHandler{
        final Map<String, ResponseHandler> responseHandlers;

        public RouteHandlerStub(Map<String, ResponseHandler> responseHandlers) {
            this.responseHandlers = responseHandlers;
        }

        @Override
        public ResponseHandler route(String uri) {

            ResponseHandler responseHandler = responseHandlers.get(uri);
            if(responseHandler == null){
                throw new RuntimeException(String.format("No route found for uri '%s'", uri));
            }
            return responseHandler;
        }
    }

    class RequestStub extends HttpServletRequestNotImplemented{
        final String requestUri;

        public RequestStub(String requestUri) {
            this.requestUri = requestUri;
        }

        @Override
        public String getRequestURI() {
            return requestUri;
        }
    }
    class ResponseStub extends HttpServletResponseNotImplemented {

    }

    class ResponseHandlerStub implements ResponseHandler{
        List<WriteToResponseBodyInvocation> invocations = new ArrayList<>();
        @Override
        public void writeToResponseBody(HttpServletRequest servletRequest, HttpServletResponse servletResponse) {
            invocations.add(new WriteToResponseBodyInvocation(servletRequest, servletResponse));
        }
    }

    class WriteToResponseBodyInvocation{
        final HttpServletRequest servletRequest;
        final HttpServletResponse servletResponse;

        public WriteToResponseBodyInvocation(HttpServletRequest servletRequest, HttpServletResponse servletResponse) {
            this.servletRequest = servletRequest;
            this.servletResponse = servletResponse;
        }
    }
}
