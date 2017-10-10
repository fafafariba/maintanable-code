package com.seefaribacode.onboarding;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public interface HttpResponseExceptionHandler {
void handleException(HttpServletRequest req, HttpServletResponse res, Exception exception);
}

