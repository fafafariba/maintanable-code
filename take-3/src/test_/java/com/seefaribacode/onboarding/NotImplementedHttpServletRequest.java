package com.seefaribacode.onboarding;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.security.Principal;
import java.util.Collection;
import java.util.Enumeration;
import java.util.Locale;
import java.util.Map;

public class NotImplementedHttpServletRequest implements HttpServletRequest {
    @Override
    public String getAuthType() {
        throw new UnsupportedOperationException("Not Implemented!");
    }

    @Override
    public Cookie[] getCookies() {
        throw new UnsupportedOperationException("Not Implemented!");
    }

    @Override
    public long getDateHeader(String s) {
        throw new UnsupportedOperationException("Not Implemented!");
    }

    @Override
    public String getHeader(String s) {
        throw new UnsupportedOperationException("Not Implemented!");
    }

    @Override
    public Enumeration<String> getHeaders(String s) {
        throw new UnsupportedOperationException("Not Implemented!");
    }

    @Override
    public Enumeration<String> getHeaderNames() {
        throw new UnsupportedOperationException("Not Implemented!");
    }

    @Override
    public int getIntHeader(String s) {
        throw new UnsupportedOperationException("Not Implemented!");
    }

    @Override
    public String getMethod() {
        throw new UnsupportedOperationException("Not Implemented!");
    }

    @Override
    public String getPathInfo() {
        throw new UnsupportedOperationException("Not Implemented!");
    }

    @Override
    public String getPathTranslated() {
        throw new UnsupportedOperationException("Not Implemented!");
    }

    @Override
    public String getContextPath() {
        throw new UnsupportedOperationException("Not Implemented!");
    }

    @Override
    public String getQueryString() {
        throw new UnsupportedOperationException("Not Implemented!");
    }

    @Override
    public String getRemoteUser() {
        throw new UnsupportedOperationException("Not Implemented!");
    }

    @Override
    public boolean isUserInRole(String s) {
        throw new UnsupportedOperationException("Not Implemented!");
    }

    @Override
    public Principal getUserPrincipal() {
        throw new UnsupportedOperationException("Not Implemented!");
    }

    @Override
    public String getRequestedSessionId() {
        throw new UnsupportedOperationException("Not Implemented!");
    }

    @Override
    public String getRequestURI() {
        throw new UnsupportedOperationException("Not Implemented!");
    }

    @Override
    public StringBuffer getRequestURL() {
        throw new UnsupportedOperationException("Not Implemented!");
    }

    @Override
    public String getServletPath() {
        throw new UnsupportedOperationException("Not Implemented!");
    }

    @Override
    public HttpSession getSession(boolean b) {
        throw new UnsupportedOperationException("Not Implemented!");
    }

    @Override
    public HttpSession getSession() {
        throw new UnsupportedOperationException("Not Implemented!");
    }

    @Override
    public boolean isRequestedSessionIdValid() {
        throw new UnsupportedOperationException("Not Implemented!");
    }

    @Override
    public boolean isRequestedSessionIdFromCookie() {
        throw new UnsupportedOperationException("Not Implemented!");
    }

    @Override
    public boolean isRequestedSessionIdFromURL() {
        throw new UnsupportedOperationException("Not Implemented!");
    }

    @Override
    public boolean isRequestedSessionIdFromUrl() {
        throw new UnsupportedOperationException("Not Implemented!");
    }

    @Override
    public boolean authenticate(HttpServletResponse httpServletResponse) throws IOException, ServletException {
        throw new UnsupportedOperationException("Not Implemented!");
    }

    @Override
    public void login(String s, String s1) throws ServletException {
        throw new UnsupportedOperationException("Not Implemented!");
    }

    @Override
    public void logout() throws ServletException {
        throw new UnsupportedOperationException("Not Implemented!");
    }

    @Override
    public Collection<Part> getParts() throws IOException, ServletException {
        throw new UnsupportedOperationException("Not Implemented!");
    }

    @Override
    public Part getPart(String s) throws IOException, ServletException {
        throw new UnsupportedOperationException("Not Implemented!");
    }

    @Override
    public Object getAttribute(String s) {
        throw new UnsupportedOperationException("Not Implemented!");
    }

    @Override
    public Enumeration<String> getAttributeNames() {
        throw new UnsupportedOperationException("Not Implemented!");
    }

    @Override
    public String getCharacterEncoding() {
        throw new UnsupportedOperationException("Not Implemented!");
    }

    @Override
    public void setCharacterEncoding(String s) throws UnsupportedEncodingException {
        throw new UnsupportedOperationException("Not Implemented!");
    }

    @Override
    public int getContentLength() {
        throw new UnsupportedOperationException("Not Implemented!");
    }

    @Override
    public String getContentType() {
        throw new UnsupportedOperationException("Not Implemented!");
    }

    @Override
    public ServletInputStream getInputStream() throws IOException {
        throw new UnsupportedOperationException("Not Implemented!");
    }

    @Override
    public String getParameter(String s) {
        throw new UnsupportedOperationException("Not Implemented!");
    }

    @Override
    public Enumeration<String> getParameterNames() {
        throw new UnsupportedOperationException("Not Implemented!");
    }

    @Override
    public String[] getParameterValues(String s) {
        throw new UnsupportedOperationException("Not Implemented!");
    }

    @Override
    public Map<String, String[]> getParameterMap() {
        throw new UnsupportedOperationException("Not Implemented!");
    }

    @Override
    public String getProtocol() {
        throw new UnsupportedOperationException("Not Implemented!");
    }

    @Override
    public String getScheme() {
        throw new UnsupportedOperationException("Not Implemented!");
    }

    @Override
    public String getServerName() {
        throw new UnsupportedOperationException("Not Implemented!");
    }

    @Override
    public int getServerPort() {
        throw new UnsupportedOperationException("Not Implemented!");
    }

    @Override
    public BufferedReader getReader() throws IOException {
        throw new UnsupportedOperationException("Not Implemented!");
    }

    @Override
    public String getRemoteAddr() {
        throw new UnsupportedOperationException("Not Implemented!");
    }

    @Override
    public String getRemoteHost() {
        throw new UnsupportedOperationException("Not Implemented!");
    }

    @Override
    public void setAttribute(String s, Object o) {
        throw new UnsupportedOperationException("Not Implemented!");
    }

    @Override
    public void removeAttribute(String s) {
        throw new UnsupportedOperationException("Not Implemented!");
    }

    @Override
    public Locale getLocale() {
        throw new UnsupportedOperationException("Not Implemented!");
    }

    @Override
    public Enumeration<Locale> getLocales() {
        throw new UnsupportedOperationException("Not Implemented!");
    }

    @Override
    public boolean isSecure() {
        throw new UnsupportedOperationException("Not Implemented!");
    }

    @Override
    public RequestDispatcher getRequestDispatcher(String s) {
        throw new UnsupportedOperationException("Not Implemented!");
    }

    @Override
    public String getRealPath(String s) {
        throw new UnsupportedOperationException("Not Implemented!");
    }

    @Override
    public int getRemotePort() {
        throw new UnsupportedOperationException("Not Implemented!");
    }

    @Override
    public String getLocalName() {
        throw new UnsupportedOperationException("Not Implemented!");
    }

    @Override
    public String getLocalAddr() {
        throw new UnsupportedOperationException("Not Implemented!");
    }

    @Override
    public int getLocalPort() {
        throw new UnsupportedOperationException("Not Implemented!");
    }

    @Override
    public ServletContext getServletContext() {
        throw new UnsupportedOperationException("Not Implemented!");
    }

    @Override
    public AsyncContext startAsync() throws IllegalStateException {
        throw new UnsupportedOperationException("Not Implemented!");
    }

    @Override
    public AsyncContext startAsync(ServletRequest servletRequest, ServletResponse servletResponse) throws IllegalStateException {
        throw new UnsupportedOperationException("Not Implemented!");
    }

    @Override
    public boolean isAsyncStarted() {
        throw new UnsupportedOperationException("Not Implemented!");
    }

    @Override
    public boolean isAsyncSupported() {
        throw new UnsupportedOperationException("Not Implemented!");
    }

    @Override
    public AsyncContext getAsyncContext() {
        throw new UnsupportedOperationException("Not Implemented!");
    }

    @Override
    public DispatcherType getDispatcherType() {
        throw new UnsupportedOperationException("Not Implemented!");
    }
}
