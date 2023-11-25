package com.google.firebase.perf.network;

import aa.k;
import androidx.annotation.Keep;
import com.google.firebase.perf.util.Timer;
import java.io.IOException;
import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.HttpUrl;
import okhttp3.MediaType;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.ResponseBody;
import w9.h;
import y9.f;

/* loaded from: classes3.dex */
public class FirebasePerfOkHttpClient {
    private FirebasePerfOkHttpClient() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void a(Response response, h hVar, long j10, long j11) throws IOException {
        Request request = response.request();
        if (request == null) {
            return;
        }
        hVar.v(request.url().url().toString());
        hVar.k(request.method());
        if (request.body() != null) {
            long contentLength = request.body().contentLength();
            if (contentLength != -1) {
                hVar.o(contentLength);
            }
        }
        ResponseBody body = response.body();
        if (body != null) {
            long contentLength2 = body.contentLength();
            if (contentLength2 != -1) {
                hVar.r(contentLength2);
            }
            MediaType contentType = body.contentType();
            if (contentType != null) {
                hVar.q(contentType.toString());
            }
        }
        hVar.l(response.code());
        hVar.p(j10);
        hVar.t(j11);
        hVar.b();
    }

    @Keep
    public static void enqueue(Call call, Callback callback) {
        Timer timer = new Timer();
        call.enqueue(new d(callback, k.k(), timer, timer.e()));
    }

    @Keep
    public static Response execute(Call call) throws IOException {
        h c10 = h.c(k.k());
        Timer timer = new Timer();
        long e10 = timer.e();
        try {
            Response execute = call.execute();
            a(execute, c10, e10, timer.c());
            return execute;
        } catch (IOException e11) {
            Request request = call.request();
            if (request != null) {
                HttpUrl url = request.url();
                if (url != null) {
                    c10.v(url.url().toString());
                }
                if (request.method() != null) {
                    c10.k(request.method());
                }
            }
            c10.p(e10);
            c10.t(timer.c());
            f.d(c10);
            throw e11;
        }
    }
}
