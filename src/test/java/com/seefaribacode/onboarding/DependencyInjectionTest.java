package com.seefaribacode.onboarding;

import org.junit.Ignore;
import org.junit.Test;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import static org.junit.Assert.assertEquals;

public class DependencyInjectionTest {
    @Test
    public void shouldInstantiateRequestHandler(){
        //given
        HttpServletRequest req = new HttpServletRequestStub();
        HttpServletResponse res = new HttpServletResponseStub();
        DependencyInjection dependencyInjection = new DependencyInjection();

        //when
        String actual = dependencyInjection.reqHandler.getClass().getSimpleName();

        //then
        assertEquals("Instance of RequestHandler is created", "RequestHandler" , actual);

    }


    @Ignore
    public void shouldInvokeDispatch(){
        //given
        String uri = "";
        DependencyInjection dependencyInjection = new DependencyInjection();
        HttpServletRequest req = new HttpServletRequestStub();
        HttpServletResponse res = new HttpServletResponseStub();



        //when
        dependencyInjection.dispatch(req, res);

        //then

        assertEquals("Dispatcher should receive request", "hi", "hi");
    }



}

class HttpServletRequestStub extends NotImplementedHttpServletRequest {

}

class HttpServletResponseStub extends NotImplementedHttpServletResponse {

}
