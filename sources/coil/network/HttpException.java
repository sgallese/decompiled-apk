package coil.network;

import okhttp3.Response;

/* compiled from: HttpException.kt */
/* loaded from: classes.dex */
public final class HttpException extends RuntimeException {

    /* renamed from: f  reason: collision with root package name */
    private final Response f9050f;

    public HttpException(Response response) {
        super("HTTP " + response.code() + ": " + response.message());
        this.f9050f = response;
    }
}
