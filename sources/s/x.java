package s;

import s.q;

/* compiled from: Animation.kt */
/* loaded from: classes.dex */
public final class x<T, V extends q> implements e<T, V> {

    /* renamed from: a  reason: collision with root package name */
    private final o1<V> f22861a;

    /* renamed from: b  reason: collision with root package name */
    private final i1<T, V> f22862b;

    /* renamed from: c  reason: collision with root package name */
    private final T f22863c;

    /* renamed from: d  reason: collision with root package name */
    private final V f22864d;

    /* renamed from: e  reason: collision with root package name */
    private final V f22865e;

    /* renamed from: f  reason: collision with root package name */
    private final V f22866f;

    /* renamed from: g  reason: collision with root package name */
    private final T f22867g;

    /* renamed from: h  reason: collision with root package name */
    private final long f22868h;

    /* renamed from: i  reason: collision with root package name */
    private final boolean f22869i;

    public x(o1<V> o1Var, i1<T, V> i1Var, T t10, V v10) {
        float k10;
        qc.q.i(o1Var, "animationSpec");
        qc.q.i(i1Var, "typeConverter");
        qc.q.i(v10, "initialVelocityVector");
        this.f22861a = o1Var;
        this.f22862b = i1Var;
        this.f22863c = t10;
        V invoke = c().a().invoke(t10);
        this.f22864d = invoke;
        this.f22865e = (V) r.b(v10);
        this.f22867g = c().b().invoke(o1Var.d(invoke, v10));
        this.f22868h = o1Var.c(invoke, v10);
        V v11 = (V) r.b(o1Var.b(b(), invoke, v10));
        this.f22866f = v11;
        int b10 = v11.b();
        for (int i10 = 0; i10 < b10; i10++) {
            V v12 = this.f22866f;
            k10 = vc.l.k(v12.a(i10), -this.f22861a.a(), this.f22861a.a());
            v12.e(i10, k10);
        }
    }

    @Override // s.e
    public boolean a() {
        return this.f22869i;
    }

    @Override // s.e
    public long b() {
        return this.f22868h;
    }

    @Override // s.e
    public i1<T, V> c() {
        return this.f22862b;
    }

    @Override // s.e
    public V d(long j10) {
        if (!e(j10)) {
            return this.f22861a.b(j10, this.f22864d, this.f22865e);
        }
        return this.f22866f;
    }

    @Override // s.e
    public /* synthetic */ boolean e(long j10) {
        return d.a(this, j10);
    }

    @Override // s.e
    public T f(long j10) {
        if (!e(j10)) {
            return c().b().invoke(this.f22861a.e(j10, this.f22864d, this.f22865e));
        }
        return g();
    }

    @Override // s.e
    public T g() {
        return this.f22867g;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public x(y<T> yVar, i1<T, V> i1Var, T t10, V v10) {
        this(yVar.a(i1Var), i1Var, t10, v10);
        qc.q.i(yVar, "animationSpec");
        qc.q.i(i1Var, "typeConverter");
        qc.q.i(v10, "initialVelocityVector");
    }
}
