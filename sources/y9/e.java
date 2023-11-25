package y9;

import com.google.firebase.perf.util.Timer;
import java.io.IOException;
import org.apache.http.HttpResponse;
import org.apache.http.client.ResponseHandler;
import w9.h;

/* compiled from: InstrumentApacheHttpResponseHandler.java */
/* loaded from: classes3.dex */
public class e<T> implements ResponseHandler<T> {

    /* renamed from: a  reason: collision with root package name */
    private final ResponseHandler<? extends T> f26293a;

    /* renamed from: b  reason: collision with root package name */
    private final Timer f26294b;

    /* renamed from: c  reason: collision with root package name */
    private final h f26295c;

    public e(ResponseHandler<? extends T> responseHandler, Timer timer, h hVar) {
        this.f26293a = responseHandler;
        this.f26294b = timer;
        this.f26295c = hVar;
    }

    @Override // org.apache.http.client.ResponseHandler
    public T handleResponse(HttpResponse httpResponse) throws IOException {
        this.f26295c.t(this.f26294b.c());
        this.f26295c.l(httpResponse.getStatusLine().getStatusCode());
        Long a10 = f.a(httpResponse);
        if (a10 != null) {
            this.f26295c.r(a10.longValue());
        }
        String b10 = f.b(httpResponse);
        if (b10 != null) {
            this.f26295c.q(b10);
        }
        this.f26295c.b();
        return this.f26293a.handleResponse(httpResponse);
    }
}
