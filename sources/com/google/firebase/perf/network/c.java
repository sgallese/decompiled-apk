package com.google.firebase.perf.network;

import android.os.Build;
import com.google.firebase.perf.util.Timer;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.ProtocolException;
import java.net.URL;
import java.security.Permission;
import java.util.List;
import java.util.Map;
import w9.h;
import y9.f;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: InstrURLConnectionBase.java */
/* loaded from: classes3.dex */
public class c {

    /* renamed from: f  reason: collision with root package name */
    private static final v9.a f11834f = v9.a.e();

    /* renamed from: a  reason: collision with root package name */
    private final HttpURLConnection f11835a;

    /* renamed from: b  reason: collision with root package name */
    private final h f11836b;

    /* renamed from: c  reason: collision with root package name */
    private long f11837c = -1;

    /* renamed from: d  reason: collision with root package name */
    private long f11838d = -1;

    /* renamed from: e  reason: collision with root package name */
    private final Timer f11839e;

    public c(HttpURLConnection httpURLConnection, Timer timer, h hVar) {
        this.f11835a = httpURLConnection;
        this.f11836b = hVar;
        this.f11839e = timer;
        hVar.v(httpURLConnection.getURL().toString());
    }

    private void a0() {
        if (this.f11837c == -1) {
            this.f11839e.g();
            long e10 = this.f11839e.e();
            this.f11837c = e10;
            this.f11836b.p(e10);
        }
        String F = F();
        if (F != null) {
            this.f11836b.k(F);
        } else if (o()) {
            this.f11836b.k("POST");
        } else {
            this.f11836b.k("GET");
        }
    }

    public boolean A() {
        return this.f11835a.getInstanceFollowRedirects();
    }

    public long B() {
        a0();
        return this.f11835a.getLastModified();
    }

    public OutputStream C() throws IOException {
        try {
            OutputStream outputStream = this.f11835a.getOutputStream();
            if (outputStream != null) {
                return new y9.b(outputStream, this.f11836b, this.f11839e);
            }
            return outputStream;
        } catch (IOException e10) {
            this.f11836b.t(this.f11839e.c());
            f.d(this.f11836b);
            throw e10;
        }
    }

    public Permission D() throws IOException {
        try {
            return this.f11835a.getPermission();
        } catch (IOException e10) {
            this.f11836b.t(this.f11839e.c());
            f.d(this.f11836b);
            throw e10;
        }
    }

    public int E() {
        return this.f11835a.getReadTimeout();
    }

    public String F() {
        return this.f11835a.getRequestMethod();
    }

    public Map<String, List<String>> G() {
        return this.f11835a.getRequestProperties();
    }

    public String H(String str) {
        return this.f11835a.getRequestProperty(str);
    }

    public int I() throws IOException {
        a0();
        if (this.f11838d == -1) {
            long c10 = this.f11839e.c();
            this.f11838d = c10;
            this.f11836b.u(c10);
        }
        try {
            int responseCode = this.f11835a.getResponseCode();
            this.f11836b.l(responseCode);
            return responseCode;
        } catch (IOException e10) {
            this.f11836b.t(this.f11839e.c());
            f.d(this.f11836b);
            throw e10;
        }
    }

    public String J() throws IOException {
        a0();
        if (this.f11838d == -1) {
            long c10 = this.f11839e.c();
            this.f11838d = c10;
            this.f11836b.u(c10);
        }
        try {
            String responseMessage = this.f11835a.getResponseMessage();
            this.f11836b.l(this.f11835a.getResponseCode());
            return responseMessage;
        } catch (IOException e10) {
            this.f11836b.t(this.f11839e.c());
            f.d(this.f11836b);
            throw e10;
        }
    }

    public URL K() {
        return this.f11835a.getURL();
    }

    public boolean L() {
        return this.f11835a.getUseCaches();
    }

    public void M(boolean z10) {
        this.f11835a.setAllowUserInteraction(z10);
    }

    public void N(int i10) {
        this.f11835a.setChunkedStreamingMode(i10);
    }

    public void O(int i10) {
        this.f11835a.setConnectTimeout(i10);
    }

    public void P(boolean z10) {
        this.f11835a.setDefaultUseCaches(z10);
    }

    public void Q(boolean z10) {
        this.f11835a.setDoInput(z10);
    }

    public void R(boolean z10) {
        this.f11835a.setDoOutput(z10);
    }

    public void S(int i10) {
        this.f11835a.setFixedLengthStreamingMode(i10);
    }

    public void T(long j10) {
        this.f11835a.setFixedLengthStreamingMode(j10);
    }

    public void U(long j10) {
        this.f11835a.setIfModifiedSince(j10);
    }

    public void V(boolean z10) {
        this.f11835a.setInstanceFollowRedirects(z10);
    }

    public void W(int i10) {
        this.f11835a.setReadTimeout(i10);
    }

    public void X(String str) throws ProtocolException {
        this.f11835a.setRequestMethod(str);
    }

    public void Y(String str, String str2) {
        if ("User-Agent".equalsIgnoreCase(str)) {
            this.f11836b.w(str2);
        }
        this.f11835a.setRequestProperty(str, str2);
    }

    public void Z(boolean z10) {
        this.f11835a.setUseCaches(z10);
    }

    public void a(String str, String str2) {
        this.f11835a.addRequestProperty(str, str2);
    }

    public void b() throws IOException {
        if (this.f11837c == -1) {
            this.f11839e.g();
            long e10 = this.f11839e.e();
            this.f11837c = e10;
            this.f11836b.p(e10);
        }
        try {
            this.f11835a.connect();
        } catch (IOException e11) {
            this.f11836b.t(this.f11839e.c());
            f.d(this.f11836b);
            throw e11;
        }
    }

    public boolean b0() {
        return this.f11835a.usingProxy();
    }

    public void c() {
        this.f11836b.t(this.f11839e.c());
        this.f11836b.b();
        this.f11835a.disconnect();
    }

    public boolean d() {
        return this.f11835a.getAllowUserInteraction();
    }

    public int e() {
        return this.f11835a.getConnectTimeout();
    }

    public boolean equals(Object obj) {
        return this.f11835a.equals(obj);
    }

    public Object f() throws IOException {
        a0();
        this.f11836b.l(this.f11835a.getResponseCode());
        try {
            Object content = this.f11835a.getContent();
            if (content instanceof InputStream) {
                this.f11836b.q(this.f11835a.getContentType());
                return new y9.a((InputStream) content, this.f11836b, this.f11839e);
            }
            this.f11836b.q(this.f11835a.getContentType());
            this.f11836b.r(this.f11835a.getContentLength());
            this.f11836b.t(this.f11839e.c());
            this.f11836b.b();
            return content;
        } catch (IOException e10) {
            this.f11836b.t(this.f11839e.c());
            f.d(this.f11836b);
            throw e10;
        }
    }

    public Object g(Class[] clsArr) throws IOException {
        a0();
        this.f11836b.l(this.f11835a.getResponseCode());
        try {
            Object content = this.f11835a.getContent(clsArr);
            if (content instanceof InputStream) {
                this.f11836b.q(this.f11835a.getContentType());
                return new y9.a((InputStream) content, this.f11836b, this.f11839e);
            }
            this.f11836b.q(this.f11835a.getContentType());
            this.f11836b.r(this.f11835a.getContentLength());
            this.f11836b.t(this.f11839e.c());
            this.f11836b.b();
            return content;
        } catch (IOException e10) {
            this.f11836b.t(this.f11839e.c());
            f.d(this.f11836b);
            throw e10;
        }
    }

    public String h() {
        a0();
        return this.f11835a.getContentEncoding();
    }

    public int hashCode() {
        return this.f11835a.hashCode();
    }

    public int i() {
        a0();
        return this.f11835a.getContentLength();
    }

    public long j() {
        long contentLengthLong;
        a0();
        if (Build.VERSION.SDK_INT >= 24) {
            contentLengthLong = this.f11835a.getContentLengthLong();
            return contentLengthLong;
        }
        return 0L;
    }

    public String k() {
        a0();
        return this.f11835a.getContentType();
    }

    public long l() {
        a0();
        return this.f11835a.getDate();
    }

    public boolean m() {
        return this.f11835a.getDefaultUseCaches();
    }

    public boolean n() {
        return this.f11835a.getDoInput();
    }

    public boolean o() {
        return this.f11835a.getDoOutput();
    }

    public InputStream p() {
        a0();
        try {
            this.f11836b.l(this.f11835a.getResponseCode());
        } catch (IOException unused) {
            f11834f.a("IOException thrown trying to obtain the response code");
        }
        InputStream errorStream = this.f11835a.getErrorStream();
        if (errorStream != null) {
            return new y9.a(errorStream, this.f11836b, this.f11839e);
        }
        return errorStream;
    }

    public long q() {
        a0();
        return this.f11835a.getExpiration();
    }

    public String r(int i10) {
        a0();
        return this.f11835a.getHeaderField(i10);
    }

    public String s(String str) {
        a0();
        return this.f11835a.getHeaderField(str);
    }

    public long t(String str, long j10) {
        a0();
        return this.f11835a.getHeaderFieldDate(str, j10);
    }

    public String toString() {
        return this.f11835a.toString();
    }

    public int u(String str, int i10) {
        a0();
        return this.f11835a.getHeaderFieldInt(str, i10);
    }

    public String v(int i10) {
        a0();
        return this.f11835a.getHeaderFieldKey(i10);
    }

    public long w(String str, long j10) {
        long headerFieldLong;
        a0();
        if (Build.VERSION.SDK_INT >= 24) {
            headerFieldLong = this.f11835a.getHeaderFieldLong(str, j10);
            return headerFieldLong;
        }
        return 0L;
    }

    public Map<String, List<String>> x() {
        a0();
        return this.f11835a.getHeaderFields();
    }

    public long y() {
        return this.f11835a.getIfModifiedSince();
    }

    public InputStream z() throws IOException {
        a0();
        this.f11836b.l(this.f11835a.getResponseCode());
        this.f11836b.q(this.f11835a.getContentType());
        try {
            InputStream inputStream = this.f11835a.getInputStream();
            if (inputStream != null) {
                return new y9.a(inputStream, this.f11836b, this.f11839e);
            }
            return inputStream;
        } catch (IOException e10) {
            this.f11836b.t(this.f11839e.c());
            f.d(this.f11836b);
            throw e10;
        }
    }
}
