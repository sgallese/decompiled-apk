package g5;

import dc.m;
import java.io.IOException;
import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.Response;

/* compiled from: Calls.kt */
/* loaded from: classes.dex */
final class n implements Callback, pc.l<Throwable, dc.w> {

    /* renamed from: f  reason: collision with root package name */
    private final Call f16197f;

    /* renamed from: m  reason: collision with root package name */
    private final ad.m<Response> f16198m;

    /* JADX WARN: Multi-variable type inference failed */
    public n(Call call, ad.m<? super Response> mVar) {
        this.f16197f = call;
        this.f16198m = mVar;
    }

    public void a(Throwable th) {
        try {
            this.f16197f.cancel();
        } catch (Throwable unused) {
        }
    }

    @Override // pc.l
    public /* bridge */ /* synthetic */ dc.w invoke(Throwable th) {
        a(th);
        return dc.w.f13270a;
    }

    @Override // okhttp3.Callback
    public void onFailure(Call call, IOException iOException) {
        if (!call.isCanceled()) {
            ad.m<Response> mVar = this.f16198m;
            m.a aVar = dc.m.f13253f;
            mVar.resumeWith(dc.m.a(dc.n.a(iOException)));
        }
    }

    @Override // okhttp3.Callback
    public void onResponse(Call call, Response response) {
        this.f16198m.resumeWith(dc.m.a(response));
    }
}
