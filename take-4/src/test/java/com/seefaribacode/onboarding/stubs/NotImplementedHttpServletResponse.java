package com.seefaribacode.onboarding.stubs;

import javax.servlet.ServletOutputStream;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Collection;
import java.util.Locale;

public class NotImplementedHttpServletResponse implements HttpServletResponse {
    public void addCookie(Cookie cookie) {
        throw new UnsupportedOperationException("Not Implemented!");
    }

    public boolean containsHeader(String s) {
        throw new UnsupportedOperationException("Not Implemented!");
    }

    public String encodeURL(String s) {
        throw new UnsupportedOperationException("Not Implemented!");
    }

    public String encodeRedirectURL(String s) {
        throw new UnsupportedOperationException("Not Implemented!");
    }

    public String encodeUrl(String s) {
        throw new UnsupportedOperationException("Not Implemented!");
    }

    public String encodeRedirectUrl(String s) {
        throw new UnsupportedOperationException("Not Implemented!");
    }

    public void sendError(int i, String s) throws IOException {
        throw new UnsupportedOperationException("Not Implemented!");
    }

    public void sendError(int i) throws IOException {
        throw new UnsupportedOperationException("Not Implemented!");
    }

    public void sendRedirect(String s) throws IOException {
        throw new UnsupportedOperationException("Not Implemented!");
    }

    public void setDateHeader(String s, long l) {
        throw new UnsupportedOperationException("Not Implemented!");
    }

    public void addDateHeader(String s, long l) {
        throw new UnsupportedOperationException("Not Implemented!");
    }

    public void setHeader(String s, String s1) {
        throw new UnsupportedOperationException("Not Implemented!");
    }

    public void addHeader(String s, String s1) {
        throw new UnsupportedOperationException("Not Implemented!");
    }

    public void setIntHeader(String s, int i) {
        throw new UnsupportedOperationException("Not Implemented!");
    }

    public void addIntHeader(String s, int i) {
        throw new UnsupportedOperationException("Not Implemented!");
    }

    public void setStatus(int i) {
        throw new UnsupportedOperationException("Not Implemented!");
    }

    public void setStatus(int i, String s) {
        throw new UnsupportedOperationException("Not Implemented!");
    }

    public int getStatus() {
        throw new UnsupportedOperationException("Not Implemented!");
    }

    public String getHeader(String s) {
        throw new UnsupportedOperationException("Not Implemented!");
    }

    public Collection<String> getHeaders(String s) {
        throw new UnsupportedOperationException("Not Implemented!");
    }

    public Collection<String> getHeaderNames() {
        throw new UnsupportedOperationException("Not Implemented!");
    }

    public String getCharacterEncoding() {
        throw new UnsupportedOperationException("Not Implemented!");
    }

    public String getContentType() {
        throw new UnsupportedOperationException("Not Implemented!");
    }

    public ServletOutputStream getOutputStream() throws IOException {
        throw new UnsupportedOperationException("Not Implemented!");
    }

    public PrintWriter getWriter() throws IOException {
        throw new UnsupportedOperationException("Not Implemented!");
    }

    public void setCharacterEncoding(String s) {
        throw new UnsupportedOperationException("Not Implemented!");
    }

    public void setContentLength(int i) {
        throw new UnsupportedOperationException("Not Implemented!");
    }

    public void setContentType(String s) {
        throw new UnsupportedOperationException("Not Implemented!");
    }

    public void setBufferSize(int i) {
        throw new UnsupportedOperationException("Not Implemented!");
    }

    public int getBufferSize() {
        throw new UnsupportedOperationException("Not Implemented!");
    }

    public void flushBuffer() throws IOException {
        throw new UnsupportedOperationException("Not Implemented!");
    }

    public void resetBuffer() {
        throw new UnsupportedOperationException("Not Implemented!");
    }

    public boolean isCommitted() {
        throw new UnsupportedOperationException("Not Implemented!");
    }

    public void reset() {
        throw new UnsupportedOperationException("Not Implemented!");
    }

    public void setLocale(Locale locale) {
        throw new UnsupportedOperationException("Not Implemented!");
    }

    public Locale getLocale() {
        throw new UnsupportedOperationException("Not Implemented!");
    }
}
