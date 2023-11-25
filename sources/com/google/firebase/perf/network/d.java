package com.google.firebase.perf.network;

import aa.k;
import com.google.firebase.perf.util.Timer;
import java.io.IOException;
import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.HttpUrl;
import okhttp3.Request;
import okhttp3.Response;
import w9.h;
import y9.f;

/* compiled from: InstrumentOkHttpEnqueueCallback.java */
/* loaded from: classes3.dex */
public class d implements Callback {

    /* renamed from: f  reason: collision with root package name */
    private final Callback f11840f;

    /* renamed from: m  reason: collision with root package name */
    private final h f11841m;

    /* renamed from: p  reason: collision with root package name */
    private final Timer f11842p;

    /* renamed from: q  reason: collision with root package name */
    private final long f11843q;

    public d(Callback callback, k kVar, Timer timer, long j10) {
        this.f11840f = callback;
        this.f11841m = h.c(kVar);
        this.f11843q = j10;
        this.f11842p = timer;
    }

    @Override // okhttp3.Callback
    public void onFailure(Call call, IOException iOException) {
        Request request = call.request();
        if (request != null) {
            HttpUrl url = request.url();
            if (url != null) {
                this.f11841m.v(url.url().toString());
            }
            if (request.method() != null) {
                this.f11841m.k(request.method());
            }
        }
        this.f11841m.p(this.f11843q);
        this.f11841m.t(this.f11842p.c());
        f.d(this.f11841m);
        this.f11840f.onFailure(call, iOException);
    }

    @Override // okhttp3.Callback
    public void onResponse(Call call, Response response) throws IOException {
        FirebasePerfOkHttpClient.a(response, this.f11841m, this.f11843q, this.f11842p.c());
        this.f11840f.onResponse(call, response);
    }
}
