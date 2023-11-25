package androidx.compose.ui.platform;

import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;

/* compiled from: WeakCache.kt */
/* loaded from: classes.dex */
public final class s4<T> {

    /* renamed from: a  reason: collision with root package name */
    private final k0.f<Reference<T>> f2823a = new k0.f<>(new Reference[16], 0);

    /* renamed from: b  reason: collision with root package name */
    private final ReferenceQueue<T> f2824b = new ReferenceQueue<>();

    private final void a() {
        Reference<? extends T> poll;
        do {
            poll = this.f2824b.poll();
            if (poll != null) {
                this.f2823a.v(poll);
            }
        } while (poll != null);
    }

    public final int b() {
        a();
        return this.f2823a.o();
    }

    public final T c() {
        a();
        while (this.f2823a.s()) {
            T t10 = this.f2823a.x(r0.o() - 1).get();
            if (t10 != null) {
                return t10;
            }
        }
        return null;
    }

    public final void d(T t10) {
        a();
        this.f2823a.d(new WeakReference(t10, this.f2824b));
    }
}
