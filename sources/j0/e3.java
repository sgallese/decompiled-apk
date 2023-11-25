package j0;

import java.util.concurrent.atomic.AtomicReference;

/* compiled from: ActualJvm.jvm.kt */
/* loaded from: classes.dex */
public final class e3<T> {

    /* renamed from: a  reason: collision with root package name */
    private final AtomicReference<q0.f> f18633a = new AtomicReference<>(q0.g.a());

    /* renamed from: b  reason: collision with root package name */
    private final Object f18634b = new Object();

    public final T a() {
        return (T) this.f18633a.get().b(Thread.currentThread().getId());
    }

    public final void b(T t10) {
        long id2 = Thread.currentThread().getId();
        synchronized (this.f18634b) {
            q0.f fVar = this.f18633a.get();
            if (fVar.d(id2, t10)) {
                return;
            }
            this.f18633a.set(fVar.c(id2, t10));
            dc.w wVar = dc.w.f13270a;
        }
    }
}
