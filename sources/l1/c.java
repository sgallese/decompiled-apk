package l1;

import j2.w;
import z0.f;

/* compiled from: VelocityTracker.kt */
/* loaded from: classes.dex */
public final class c {

    /* renamed from: a  reason: collision with root package name */
    private final b f19493a;

    /* renamed from: b  reason: collision with root package name */
    private final b f19494b;

    /* renamed from: c  reason: collision with root package name */
    private long f19495c = f.f26354b.c();

    /* JADX WARN: Type inference failed for: r2v0, types: [l1.b$a, qc.h] */
    public c() {
        boolean z10 = false;
        ?? r22 = 0;
        int i10 = 3;
        this.f19493a = new b(z10, r22, i10, r22);
        this.f19494b = new b(z10, r22, i10, r22);
    }

    public final void a(long j10, long j11) {
        this.f19493a.a(j10, f.o(j11));
        this.f19494b.a(j10, f.p(j11));
    }

    public final long b() {
        return w.a(this.f19493a.c(), this.f19494b.c());
    }

    public final long c() {
        return this.f19495c;
    }

    public final void d() {
        this.f19493a.d();
        this.f19494b.d();
    }

    public final void e(long j10) {
        this.f19495c = j10;
    }
}
