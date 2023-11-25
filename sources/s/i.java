package s;

import j0.d3;
import s.q;

/* compiled from: AnimationState.kt */
/* loaded from: classes.dex */
public final class i<T, V extends q> {

    /* renamed from: a  reason: collision with root package name */
    private final i1<T, V> f22707a;

    /* renamed from: b  reason: collision with root package name */
    private final T f22708b;

    /* renamed from: c  reason: collision with root package name */
    private final long f22709c;

    /* renamed from: d  reason: collision with root package name */
    private final pc.a<dc.w> f22710d;

    /* renamed from: e  reason: collision with root package name */
    private final j0.j1 f22711e;

    /* renamed from: f  reason: collision with root package name */
    private V f22712f;

    /* renamed from: g  reason: collision with root package name */
    private long f22713g;

    /* renamed from: h  reason: collision with root package name */
    private long f22714h;

    /* renamed from: i  reason: collision with root package name */
    private final j0.j1 f22715i;

    public i(T t10, i1<T, V> i1Var, V v10, long j10, T t11, long j11, boolean z10, pc.a<dc.w> aVar) {
        j0.j1 e10;
        j0.j1 e11;
        qc.q.i(i1Var, "typeConverter");
        qc.q.i(v10, "initialVelocityVector");
        qc.q.i(aVar, "onCancel");
        this.f22707a = i1Var;
        this.f22708b = t11;
        this.f22709c = j11;
        this.f22710d = aVar;
        e10 = d3.e(t10, null, 2, null);
        this.f22711e = e10;
        this.f22712f = (V) r.b(v10);
        this.f22713g = j10;
        this.f22714h = Long.MIN_VALUE;
        e11 = d3.e(Boolean.valueOf(z10), null, 2, null);
        this.f22715i = e11;
    }

    public final void a() {
        k(false);
        this.f22710d.invoke();
    }

    public final long b() {
        return this.f22714h;
    }

    public final long c() {
        return this.f22713g;
    }

    public final long d() {
        return this.f22709c;
    }

    public final T e() {
        return this.f22711e.getValue();
    }

    public final T f() {
        return this.f22707a.b().invoke(this.f22712f);
    }

    public final V g() {
        return this.f22712f;
    }

    public final boolean h() {
        return ((Boolean) this.f22715i.getValue()).booleanValue();
    }

    public final void i(long j10) {
        this.f22714h = j10;
    }

    public final void j(long j10) {
        this.f22713g = j10;
    }

    public final void k(boolean z10) {
        this.f22715i.setValue(Boolean.valueOf(z10));
    }

    public final void l(T t10) {
        this.f22711e.setValue(t10);
    }

    public final void m(V v10) {
        qc.q.i(v10, "<set-?>");
        this.f22712f = v10;
    }
}
