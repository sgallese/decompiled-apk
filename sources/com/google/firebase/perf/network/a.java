package com.google.firebase.perf.network;

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

/* compiled from: InstrHttpURLConnection.java */
/* loaded from: classes3.dex */
public final class a extends HttpURLConnection {

    /* renamed from: a  reason: collision with root package name */
    private final c f11831a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public a(HttpURLConnection httpURLConnection, Timer timer, h hVar) {
        super(httpURLConnection.getURL());
        this.f11831a = new c(httpURLConnection, timer, hVar);
    }

    @Override // java.net.URLConnection
    public void addRequestProperty(String str, String str2) {
        this.f11831a.a(str, str2);
    }

    @Override // java.net.URLConnection
    public void connect() throws IOException {
        this.f11831a.b();
    }

    @Override // java.net.HttpURLConnection
    public void disconnect() {
        this.f11831a.c();
    }

    public boolean equals(Object obj) {
        return this.f11831a.equals(obj);
    }

    @Override // java.net.URLConnection
    public boolean getAllowUserInteraction() {
        return this.f11831a.d();
    }

    @Override // java.net.URLConnection
    public int getConnectTimeout() {
        return this.f11831a.e();
    }

    @Override // java.net.URLConnection
    public Object getContent() throws IOException {
        return this.f11831a.f();
    }

    @Override // java.net.URLConnection
    public String getContentEncoding() {
        return this.f11831a.h();
    }

    @Override // java.net.URLConnection
    public int getContentLength() {
        return this.f11831a.i();
    }

    @Override // java.net.URLConnection
    public long getContentLengthLong() {
        return this.f11831a.j();
    }

    @Override // java.net.URLConnection
    public String getContentType() {
        return this.f11831a.k();
    }

    @Override // java.net.URLConnection
    public long getDate() {
        return this.f11831a.l();
    }

    @Override // java.net.URLConnection
    public boolean getDefaultUseCaches() {
        return this.f11831a.m();
    }

    @Override // java.net.URLConnection
    public boolean getDoInput() {
        return this.f11831a.n();
    }

    @Override // java.net.URLConnection
    public boolean getDoOutput() {
        return this.f11831a.o();
    }

    @Override // java.net.HttpURLConnection
    public InputStream getErrorStream() {
        return this.f11831a.p();
    }

    @Override // java.net.URLConnection
    public long getExpiration() {
        return this.f11831a.q();
    }

    @Override // java.net.HttpURLConnection, java.net.URLConnection
    public String getHeaderField(int i10) {
        return this.f11831a.r(i10);
    }

    @Override // java.net.HttpURLConnection, java.net.URLConnection
    public long getHeaderFieldDate(String str, long j10) {
        return this.f11831a.t(str, j10);
    }

    @Override // java.net.URLConnection
    public int getHeaderFieldInt(String str, int i10) {
        return this.f11831a.u(str, i10);
    }

    @Override // java.net.HttpURLConnection, java.net.URLConnection
    public String getHeaderFieldKey(int i10) {
        return this.f11831a.v(i10);
    }

    @Override // java.net.URLConnection
    public long getHeaderFieldLong(String str, long j10) {
        return this.f11831a.w(str, j10);
    }

    @Override // java.net.URLConnection
    public Map<String, List<String>> getHeaderFields() {
        return this.f11831a.x();
    }

    @Override // java.net.URLConnection
    public long getIfModifiedSince() {
        return this.f11831a.y();
    }

    @Override // java.net.URLConnection
    public InputStream getInputStream() throws IOException {
        return this.f11831a.z();
    }

    @Override // java.net.HttpURLConnection
    public boolean getInstanceFollowRedirects() {
        return this.f11831a.A();
    }

    @Override // java.net.URLConnection
    public long getLastModified() {
        return this.f11831a.B();
    }

    @Override // java.net.URLConnection
    public OutputStream getOutputStream() throws IOException {
        return this.f11831a.C();
    }

    @Override // java.net.HttpURLConnection, java.net.URLConnection
    public Permission getPermission() throws IOException {
        return this.f11831a.D();
    }

    @Override // java.net.URLConnection
    public int getReadTimeout() {
        return this.f11831a.E();
    }

    @Override // java.net.HttpURLConnection
    public String getRequestMethod() {
        return this.f11831a.F();
    }

    @Override // java.net.URLConnection
    public Map<String, List<String>> getRequestProperties() {
        return this.f11831a.G();
    }

    @Override // java.net.URLConnection
    public String getRequestProperty(String str) {
        return this.f11831a.H(str);
    }

    @Override // java.net.HttpURLConnection
    public int getResponseCode() throws IOException {
        return this.f11831a.I();
    }

    @Override // java.net.HttpURLConnection
    public String getResponseMessage() throws IOException {
        return this.f11831a.J();
    }

    @Override // java.net.URLConnection
    public URL getURL() {
        return this.f11831a.K();
    }

    @Override // java.net.URLConnection
    public boolean getUseCaches() {
        return this.f11831a.L();
    }

    public int hashCode() {
        return this.f11831a.hashCode();
    }

    @Override // java.net.URLConnection
    public void setAllowUserInteraction(boolean z10) {
        this.f11831a.M(z10);
    }

    @Override // java.net.HttpURLConnection
    public void setChunkedStreamingMode(int i10) {
        this.f11831a.N(i10);
    }

    @Override // java.net.URLConnection
    public void setConnectTimeout(int i10) {
        this.f11831a.O(i10);
    }

    @Override // java.net.URLConnection
    public void setDefaultUseCaches(boolean z10) {
        this.f11831a.P(z10);
    }

    @Override // java.net.URLConnection
    public void setDoInput(boolean z10) {
        this.f11831a.Q(z10);
    }

    @Override // java.net.URLConnection
    public void setDoOutput(boolean z10) {
        this.f11831a.R(z10);
    }

    @Override // java.net.HttpURLConnection
    public void setFixedLengthStreamingMode(int i10) {
        this.f11831a.S(i10);
    }

    @Override // java.net.URLConnection
    public void setIfModifiedSince(long j10) {
        this.f11831a.U(j10);
    }

    @Override // java.net.HttpURLConnection
    public void setInstanceFollowRedirects(boolean z10) {
        this.f11831a.V(z10);
    }

    @Override // java.net.URLConnection
    public void setReadTimeout(int i10) {
        this.f11831a.W(i10);
    }

    @Override // java.net.HttpURLConnection
    public void setRequestMethod(String str) throws ProtocolException {
        this.f11831a.X(str);
    }

    @Override // java.net.URLConnection
    public void setRequestProperty(String str, String str2) {
        this.f11831a.Y(str, str2);
    }

    @Override // java.net.URLConnection
    public void setUseCaches(boolean z10) {
        this.f11831a.Z(z10);
    }

    @Override // java.net.URLConnection
    public String toString() {
        return this.f11831a.toString();
    }

    @Override // java.net.HttpURLConnection
    public boolean usingProxy() {
        return this.f11831a.b0();
    }

    @Override // java.net.URLConnection
    public Object getContent(Class[] clsArr) throws IOException {
        return this.f11831a.g(clsArr);
    }

    @Override // java.net.URLConnection
    public String getHeaderField(String str) {
        return this.f11831a.s(str);
    }

    @Override // java.net.HttpURLConnection
    public void setFixedLengthStreamingMode(long j10) {
        this.f11831a.T(j10);
    }
}
