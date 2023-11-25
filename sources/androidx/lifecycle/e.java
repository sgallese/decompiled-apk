package androidx.lifecycle;

import ad.c2;
import java.io.Closeable;

/* compiled from: ViewModel.kt */
/* loaded from: classes.dex */
public final class e implements Closeable, ad.k0 {

    /* renamed from: f  reason: collision with root package name */
    private final hc.f f4964f;

    public e(hc.f fVar) {
        qc.q.i(fVar, "context");
        this.f4964f = fVar;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        c2.f(getCoroutineContext(), null, 1, null);
    }

    @Override // ad.k0
    public hc.f getCoroutineContext() {
        return this.f4964f;
    }
}
