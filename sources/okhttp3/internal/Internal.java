package okhttp3.internal;

import com.google.android.gms.common.internal.ImagesContract;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import javax.net.ssl.SSLSocket;
import okhttp3.Cache;
import okhttp3.ConnectionSpec;
import okhttp3.Cookie;
import okhttp3.Headers;
import okhttp3.HttpUrl;
import okhttp3.Request;
import okhttp3.Response;
import qc.q;

/* compiled from: internal.kt */
/* loaded from: classes4.dex */
public final class Internal {
    public static final Headers.Builder addHeaderLenient(Headers.Builder builder, String str) {
        q.i(builder, "builder");
        q.i(str, "line");
        return builder.addLenient$okhttp(str);
    }

    public static final void applyConnectionSpec(ConnectionSpec connectionSpec, SSLSocket sSLSocket, boolean z10) {
        q.i(connectionSpec, "connectionSpec");
        q.i(sSLSocket, "sslSocket");
        connectionSpec.apply$okhttp(sSLSocket, z10);
    }

    public static final Response cacheGet(Cache cache, Request request) {
        q.i(cache, "cache");
        q.i(request, "request");
        return cache.get$okhttp(request);
    }

    public static final String cookieToString(Cookie cookie, boolean z10) {
        q.i(cookie, "cookie");
        return cookie.toString$okhttp(z10);
    }

    public static final Cookie parseCookie(long j10, HttpUrl httpUrl, String str) {
        q.i(httpUrl, ImagesContract.URL);
        q.i(str, "setCookie");
        return Cookie.Companion.parse$okhttp(j10, httpUrl, str);
    }

    public static final Headers.Builder addHeaderLenient(Headers.Builder builder, String str, String str2) {
        q.i(builder, "builder");
        q.i(str, AppMeasurementSdk.ConditionalUserProperty.NAME);
        q.i(str2, AppMeasurementSdk.ConditionalUserProperty.VALUE);
        return builder.addLenient$okhttp(str, str2);
    }
}
