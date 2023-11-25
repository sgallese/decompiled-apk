package com.google.firebase.perf.util;

import java.io.IOException;
import java.net.URL;
import java.net.URLConnection;

/* compiled from: URLWrapper.java */
/* loaded from: classes3.dex */
public class m {

    /* renamed from: a  reason: collision with root package name */
    private final URL f11902a;

    public m(URL url) {
        this.f11902a = url;
    }

    public URLConnection a() throws IOException {
        return this.f11902a.openConnection();
    }

    public String toString() {
        return this.f11902a.toString();
    }
}
