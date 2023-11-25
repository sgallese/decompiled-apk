package ad;

import java.util.concurrent.Future;

/* compiled from: Future.kt */
/* loaded from: classes4.dex */
final class j extends k {

    /* renamed from: f  reason: collision with root package name */
    private final Future<?> f528f;

    public j(Future<?> future) {
        this.f528f = future;
    }

    @Override // ad.l
    public void g(Throwable th) {
        if (th != null) {
            this.f528f.cancel(false);
        }
    }

    @Override // pc.l
    public /* bridge */ /* synthetic */ dc.w invoke(Throwable th) {
        g(th);
        return dc.w.f13270a;
    }

    public String toString() {
        return "CancelFutureOnCancel[" + this.f528f + ']';
    }
}
