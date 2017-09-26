package com.seefaribacode.hello;

import java.util.HashMap;

public class Mappings {

    static HashMap<String, ResponseHandler> ROUTE_MAP = new HashMap<String, ResponseHandler> () {{
        put("/hello", new HelloResponseHandler());
        put("/add", new AddResponseHandler());
    }};

}

// Alternative

//public class Mappings {
//    static HashMap<String, ResponseHandler> routeMap;
//
//    public Mappings() {
//
//        HashMap<String, ResponseHandler> routeMap = new HashMap<String, ResponseHandler>(){{
//            put("/hello", new HelloResponseHandler());
//            put("/add", new AddResponseHandler());
//        }};
//    }
//}


// In actual code, would you have array of [uri, responseHandler] pairs in a separate file
// Then here iterate through array and add to Hashmap

// Best place to invoke Mappings.ROUTE_MAP?

// Test: does "/hello" return
