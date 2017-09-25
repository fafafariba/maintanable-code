package com.seefaribacode.hello;

import org.junit.Test;

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
        assertThat("exactly one invocation", responseHandler.invocations.size(), is(1));
        RequestAndResponse requestAndResponse = responseHandler.invocations.get(0);
        assertThat("writeResponseToBody should be passed request parameter", request, is(requestAndResponse.requestParam));
        assertThat("writeResponseToBody should be passed response parameter", response, is(requestAndResponse.responseParam));

    }

}

