package ad;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* compiled from: JobSupport.kt */
/* loaded from: classes4.dex */
final class v1 extends y1 {

    /* renamed from: s  reason: collision with root package name */
    private static final AtomicIntegerFieldUpdater f564s = AtomicIntegerFieldUpdater.newUpdater(v1.class, "_invoked");
    private volatile int _invoked;

    /* renamed from: r  reason: collision with root package name */
    private final pc.l<Throwable, dc.w> f565r;

    /* JADX WARN: Multi-variable type inference failed */
    public v1(pc.l<? super Throwable, dc.w> lVar) {
        this.f565r = lVar;
    }

    @Override // pc.l
    public /* bridge */ /* synthetic */ dc.w invoke(Throwable th) {
        r(th);
        return dc.w.f13270a;
    }

    @Override // ad.c0
    public void r(Throwable th) {
        if (f564s.compareAndSet(this, 0, 1)) {
            this.f565r.invoke(th);
        }
    }
}
