package j0;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: Composer.kt */
/* loaded from: classes.dex */
public final class o0 {

    /* renamed from: a  reason: collision with root package name */
    private final y1 f18852a;

    /* renamed from: b  reason: collision with root package name */
    private final int f18853b;

    /* renamed from: c  reason: collision with root package name */
    private k0.c<Object> f18854c;

    public o0(y1 y1Var, int i10, k0.c<Object> cVar) {
        qc.q.i(y1Var, "scope");
        this.f18852a = y1Var;
        this.f18853b = i10;
        this.f18854c = cVar;
    }

    public final k0.c<Object> a() {
        return this.f18854c;
    }

    public final int b() {
        return this.f18853b;
    }

    public final y1 c() {
        return this.f18852a;
    }

    public final boolean d() {
        return this.f18852a.u(this.f18854c);
    }

    public final void e(k0.c<Object> cVar) {
        this.f18854c = cVar;
    }
}
