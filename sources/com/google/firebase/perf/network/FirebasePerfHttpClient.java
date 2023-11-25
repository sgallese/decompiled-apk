package com.google.firebase.perf.network;

import aa.k;
import androidx.annotation.Keep;
import com.google.firebase.perf.util.Timer;
import java.io.IOException;
import org.apache.http.HttpHost;
import org.apache.http.HttpRequest;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.ResponseHandler;
import org.apache.http.client.methods.HttpUriRequest;
import org.apache.http.protocol.HttpContext;
import w9.h;
import y9.e;
import y9.f;

/* loaded from: classes3.dex */
public class FirebasePerfHttpClient {
    private FirebasePerfHttpClient() {
    }

    static <T> T a(HttpClient httpClient, HttpHost httpHost, HttpRequest httpRequest, ResponseHandler<? extends T> responseHandler, Timer timer, k kVar) throws IOException {
        h c10 = h.c(kVar);
        try {
            c10.v(httpHost.toURI() + httpRequest.getRequestLine().getUri()).k(httpRequest.getRequestLine().getMethod());
            Long a10 = f.a(httpRequest);
            if (a10 != null) {
                c10.o(a10.longValue());
            }
            timer.g();
            c10.p(timer.e());
            return (T) httpClient.execute(httpHost, httpRequest, new e(responseHandler, timer, c10));
        } catch (IOException e10) {
            c10.t(timer.c());
            f.d(c10);
            throw e10;
        }
    }

    static <T> T b(HttpClient httpClient, HttpHost httpHost, HttpRequest httpRequest, ResponseHandler<? extends T> responseHandler, HttpContext httpContext, Timer timer, k kVar) throws IOException {
        h c10 = h.c(kVar);
        try {
            c10.v(httpHost.toURI() + httpRequest.getRequestLine().getUri()).k(httpRequest.getRequestLine().getMethod());
            Long a10 = f.a(httpRequest);
            if (a10 != null) {
                c10.o(a10.longValue());
            }
            timer.g();
            c10.p(timer.e());
            return (T) httpClient.execute(httpHost, httpRequest, new e(responseHandler, timer, c10), httpContext);
        } catch (IOException e10) {
            c10.t(timer.c());
            f.d(c10);
            throw e10;
        }
    }

    static <T> T c(HttpClient httpClient, HttpUriRequest httpUriRequest, ResponseHandler<T> responseHandler, Timer timer, k kVar) throws IOException {
        h c10 = h.c(kVar);
        try {
            c10.v(httpUriRequest.getURI().toString()).k(httpUriRequest.getMethod());
            Long a10 = f.a(httpUriRequest);
            if (a10 != null) {
                c10.o(a10.longValue());
            }
            timer.g();
            c10.p(timer.e());
            return (T) httpClient.execute(httpUriRequest, new e(responseHandler, timer, c10));
        } catch (IOException e10) {
            c10.t(timer.c());
            f.d(c10);
            throw e10;
        }
    }

    static <T> T d(HttpClient httpClient, HttpUriRequest httpUriRequest, ResponseHandler<T> responseHandler, HttpContext httpContext, Timer timer, k kVar) throws IOException {
        h c10 = h.c(kVar);
        try {
            c10.v(httpUriRequest.getURI().toString()).k(httpUriRequest.getMethod());
            Long a10 = f.a(httpUriRequest);
            if (a10 != null) {
                c10.o(a10.longValue());
            }
            timer.g();
            c10.p(timer.e());
            return (T) httpClient.execute(httpUriRequest, new e(responseHandler, timer, c10), httpContext);
        } catch (IOException e10) {
            c10.t(timer.c());
            f.d(c10);
            throw e10;
        }
    }

    static HttpResponse e(HttpClient httpClient, HttpHost httpHost, HttpRequest httpRequest, Timer timer, k kVar) throws IOException {
        h c10 = h.c(kVar);
        try {
            c10.v(httpHost.toURI() + httpRequest.getRequestLine().getUri()).k(httpRequest.getRequestLine().getMethod());
            Long a10 = f.a(httpRequest);
            if (a10 != null) {
                c10.o(a10.longValue());
            }
            timer.g();
            c10.p(timer.e());
            HttpResponse execute = httpClient.execute(httpHost, httpRequest);
            c10.t(timer.c());
            c10.l(execute.getStatusLine().getStatusCode());
            Long a11 = f.a(execute);
            if (a11 != null) {
                c10.r(a11.longValue());
            }
            String b10 = f.b(execute);
            if (b10 != null) {
                c10.q(b10);
            }
            c10.b();
            return execute;
        } catch (IOException e10) {
            c10.t(timer.c());
            f.d(c10);
            throw e10;
        }
    }

    @Keep
    public static HttpResponse execute(HttpClient httpClient, HttpUriRequest httpUriRequest) throws IOException {
        return g(httpClient, httpUriRequest, new Timer(), k.k());
    }

    static HttpResponse f(HttpClient httpClient, HttpHost httpHost, HttpRequest httpRequest, HttpContext httpContext, Timer timer, k kVar) throws IOException {
        h c10 = h.c(kVar);
        try {
            c10.v(httpHost.toURI() + httpRequest.getRequestLine().getUri()).k(httpRequest.getRequestLine().getMethod());
            Long a10 = f.a(httpRequest);
            if (a10 != null) {
                c10.o(a10.longValue());
            }
            timer.g();
            c10.p(timer.e());
            HttpResponse execute = httpClient.execute(httpHost, httpRequest, httpContext);
            c10.t(timer.c());
            c10.l(execute.getStatusLine().getStatusCode());
            Long a11 = f.a(execute);
            if (a11 != null) {
                c10.r(a11.longValue());
            }
            String b10 = f.b(execute);
            if (b10 != null) {
                c10.q(b10);
            }
            c10.b();
            return execute;
        } catch (IOException e10) {
            c10.t(timer.c());
            f.d(c10);
            throw e10;
        }
    }

    static HttpResponse g(HttpClient httpClient, HttpUriRequest httpUriRequest, Timer timer, k kVar) throws IOException {
        h c10 = h.c(kVar);
        try {
            c10.v(httpUriRequest.getURI().toString()).k(httpUriRequest.getMethod());
            Long a10 = f.a(httpUriRequest);
            if (a10 != null) {
                c10.o(a10.longValue());
            }
            timer.g();
            c10.p(timer.e());
            HttpResponse execute = httpClient.execute(httpUriRequest);
            c10.t(timer.c());
            c10.l(execute.getStatusLine().getStatusCode());
            Long a11 = f.a(execute);
            if (a11 != null) {
                c10.r(a11.longValue());
            }
            String b10 = f.b(execute);
            if (b10 != null) {
                c10.q(b10);
            }
            c10.b();
            return execute;
        } catch (IOException e10) {
            c10.t(timer.c());
            f.d(c10);
            throw e10;
        }
    }

    static HttpResponse h(HttpClient httpClient, HttpUriRequest httpUriRequest, HttpContext httpContext, Timer timer, k kVar) throws IOException {
        h c10 = h.c(kVar);
        try {
            c10.v(httpUriRequest.getURI().toString()).k(httpUriRequest.getMethod());
            Long a10 = f.a(httpUriRequest);
            if (a10 != null) {
                c10.o(a10.longValue());
            }
            timer.g();
            c10.p(timer.e());
            HttpResponse execute = httpClient.execute(httpUriRequest, httpContext);
            c10.t(timer.c());
            c10.l(execute.getStatusLine().getStatusCode());
            Long a11 = f.a(execute);
            if (a11 != null) {
                c10.r(a11.longValue());
            }
            String b10 = f.b(execute);
            if (b10 != null) {
                c10.q(b10);
            }
            c10.b();
            return execute;
        } catch (IOException e10) {
            c10.t(timer.c());
            f.d(c10);
            throw e10;
        }
    }

    @Keep
    public static HttpResponse execute(HttpClient httpClient, HttpUriRequest httpUriRequest, HttpContext httpContext) throws IOException {
        return h(httpClient, httpUriRequest, httpContext, new Timer(), k.k());
    }

    @Keep
    public static <T> T execute(HttpClient httpClient, HttpUriRequest httpUriRequest, ResponseHandler<T> responseHandler) throws IOException {
        return (T) c(httpClient, httpUriRequest, responseHandler, new Timer(), k.k());
    }

    @Keep
    public static <T> T execute(HttpClient httpClient, HttpUriRequest httpUriRequest, ResponseHandler<T> responseHandler, HttpContext httpContext) throws IOException {
        return (T) d(httpClient, httpUriRequest, responseHandler, httpContext, new Timer(), k.k());
    }

    @Keep
    public static HttpResponse execute(HttpClient httpClient, HttpHost httpHost, HttpRequest httpRequest) throws IOException {
        return e(httpClient, httpHost, httpRequest, new Timer(), k.k());
    }

    @Keep
    public static HttpResponse execute(HttpClient httpClient, HttpHost httpHost, HttpRequest httpRequest, HttpContext httpContext) throws IOException {
        return f(httpClient, httpHost, httpRequest, httpContext, new Timer(), k.k());
    }

    @Keep
    public static <T> T execute(HttpClient httpClient, HttpHost httpHost, HttpRequest httpRequest, ResponseHandler<? extends T> responseHandler) throws IOException {
        return (T) a(httpClient, httpHost, httpRequest, responseHandler, new Timer(), k.k());
    }

    @Keep
    public static <T> T execute(HttpClient httpClient, HttpHost httpHost, HttpRequest httpRequest, ResponseHandler<? extends T> responseHandler, HttpContext httpContext) throws IOException {
        return (T) b(httpClient, httpHost, httpRequest, responseHandler, httpContext, new Timer(), k.k());
    }
}
