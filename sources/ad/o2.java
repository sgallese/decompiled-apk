package ad;

import dc.m;
import kotlin.coroutines.Continuation;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: JobSupport.kt */
/* loaded from: classes4.dex */
public final class o2 extends d2 {

    /* renamed from: r  reason: collision with root package name */
    private final Continuation<dc.w> f545r;

    /* JADX WARN: Multi-variable type inference failed */
    public o2(Continuation<? super dc.w> continuation) {
        this.f545r = continuation;
    }

    @Override // pc.l
    public /* bridge */ /* synthetic */ dc.w invoke(Throwable th) {
        r(th);
        return dc.w.f13270a;
    }

    @Override // ad.c0
    public void r(Throwable th) {
        Continuation<dc.w> continuation = this.f545r;
        m.a aVar = dc.m.f13253f;
        continuation.resumeWith(dc.m.a(dc.w.f13270a));
    }
}
