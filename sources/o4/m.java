package o4;

import androidx.work.impl.WorkDatabase;
import androidx.work.u;

/* compiled from: StopWorkRunnable.java */
/* loaded from: classes.dex */
public class m implements Runnable {

    /* renamed from: q  reason: collision with root package name */
    private static final String f20496q = androidx.work.l.f("StopWorkRunnable");

    /* renamed from: f  reason: collision with root package name */
    private final g4.j f20497f;

    /* renamed from: m  reason: collision with root package name */
    private final String f20498m;

    /* renamed from: p  reason: collision with root package name */
    private final boolean f20499p;

    public m(g4.j jVar, String str, boolean z10) {
        this.f20497f = jVar;
        this.f20498m = str;
        this.f20499p = z10;
    }

    @Override // java.lang.Runnable
    public void run() {
        boolean o10;
        WorkDatabase o11 = this.f20497f.o();
        g4.d m10 = this.f20497f.m();
        n4.q B = o11.B();
        o11.c();
        try {
            boolean h10 = m10.h(this.f20498m);
            if (this.f20499p) {
                o10 = this.f20497f.m().n(this.f20498m);
            } else {
                if (!h10 && B.m(this.f20498m) == u.a.RUNNING) {
                    B.b(u.a.ENQUEUED, this.f20498m);
                }
                o10 = this.f20497f.m().o(this.f20498m);
            }
            androidx.work.l.c().a(f20496q, String.format("StopWorkRunnable for %s; Processor.stopWork = %s", this.f20498m, Boolean.valueOf(o10)), new Throwable[0]);
            o11.r();
        } finally {
            o11.g();
        }
    }
}
