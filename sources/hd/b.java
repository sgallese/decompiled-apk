package hd;

import ad.g0;
import ad.m1;
import fd.h0;
import fd.j0;
import java.util.concurrent.Executor;

/* compiled from: Dispatcher.kt */
/* loaded from: classes4.dex */
public final class b extends m1 implements Executor {

    /* renamed from: p  reason: collision with root package name */
    public static final b f16627p = new b();

    /* renamed from: q  reason: collision with root package name */
    private static final g0 f16628q;

    static {
        int d10;
        int e10;
        m mVar = m.f16648m;
        d10 = vc.l.d(64, h0.a());
        e10 = j0.e("kotlinx.coroutines.io.parallelism", d10, 0, 0, 12, null);
        f16628q = mVar.F0(e10);
    }

    private b() {
    }

    @Override // ad.g0
    public void A0(hc.f fVar, Runnable runnable) {
        f16628q.A0(fVar, runnable);
    }

    @Override // ad.g0
    public void C0(hc.f fVar, Runnable runnable) {
        f16628q.C0(fVar, runnable);
    }

    @Override // ad.g0
    public g0 F0(int i10) {
        return m.f16648m.F0(i10);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        throw new IllegalStateException("Cannot be invoked on Dispatchers.IO".toString());
    }

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        A0(hc.g.f16601f, runnable);
    }

    @Override // ad.g0
    public String toString() {
        return "Dispatchers.IO";
    }
}
