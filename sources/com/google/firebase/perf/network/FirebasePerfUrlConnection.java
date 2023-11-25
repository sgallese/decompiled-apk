package com.google.firebase.perf.network;

import aa.k;
import androidx.annotation.Keep;
import com.google.firebase.perf.util.Timer;
import com.google.firebase.perf.util.m;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import javax.net.ssl.HttpsURLConnection;
import w9.h;
import y9.f;

/* loaded from: classes3.dex */
public class FirebasePerfUrlConnection {
    private FirebasePerfUrlConnection() {
    }

    static Object a(m mVar, k kVar, Timer timer) throws IOException {
        timer.g();
        long e10 = timer.e();
        h c10 = h.c(kVar);
        try {
            URLConnection a10 = mVar.a();
            if (a10 instanceof HttpsURLConnection) {
                return new b((HttpsURLConnection) a10, timer, c10).getContent();
            }
            if (a10 instanceof HttpURLConnection) {
                return new a((HttpURLConnection) a10, timer, c10).getContent();
            }
            return a10.getContent();
        } catch (IOException e11) {
            c10.p(e10);
            c10.t(timer.c());
            c10.v(mVar.toString());
            f.d(c10);
            throw e11;
        }
    }

    static Object b(m mVar, Class[] clsArr, k kVar, Timer timer) throws IOException {
        timer.g();
        long e10 = timer.e();
        h c10 = h.c(kVar);
        try {
            URLConnection a10 = mVar.a();
            if (a10 instanceof HttpsURLConnection) {
                return new b((HttpsURLConnection) a10, timer, c10).getContent(clsArr);
            }
            if (a10 instanceof HttpURLConnection) {
                return new a((HttpURLConnection) a10, timer, c10).getContent(clsArr);
            }
            return a10.getContent(clsArr);
        } catch (IOException e11) {
            c10.p(e10);
            c10.t(timer.c());
            c10.v(mVar.toString());
            f.d(c10);
            throw e11;
        }
    }

    static InputStream c(m mVar, k kVar, Timer timer) throws IOException {
        timer.g();
        long e10 = timer.e();
        h c10 = h.c(kVar);
        try {
            URLConnection a10 = mVar.a();
            if (a10 instanceof HttpsURLConnection) {
                return new b((HttpsURLConnection) a10, timer, c10).getInputStream();
            }
            if (a10 instanceof HttpURLConnection) {
                return new a((HttpURLConnection) a10, timer, c10).getInputStream();
            }
            return a10.getInputStream();
        } catch (IOException e11) {
            c10.p(e10);
            c10.t(timer.c());
            c10.v(mVar.toString());
            f.d(c10);
            throw e11;
        }
    }

    @Keep
    public static Object getContent(URL url) throws IOException {
        return a(new m(url), k.k(), new Timer());
    }

    @Keep
    public static Object instrument(Object obj) throws IOException {
        if (obj instanceof HttpsURLConnection) {
            return new b((HttpsURLConnection) obj, new Timer(), h.c(k.k()));
        }
        if (obj instanceof HttpURLConnection) {
            return new a((HttpURLConnection) obj, new Timer(), h.c(k.k()));
        }
        return obj;
    }

    @Keep
    public static InputStream openStream(URL url) throws IOException {
        return c(new m(url), k.k(), new Timer());
    }

    @Keep
    public static Object getContent(URL url, Class[] clsArr) throws IOException {
        return b(new m(url), clsArr, k.k(), new Timer());
    }
}
