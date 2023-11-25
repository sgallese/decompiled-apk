package s;

import s.q;

/* compiled from: Animation.kt */
/* loaded from: classes.dex */
public final class d1<T, V extends q> implements e<T, V> {

    /* renamed from: a  reason: collision with root package name */
    private final m1<V> f22633a;

    /* renamed from: b  reason: collision with root package name */
    private final i1<T, V> f22634b;

    /* renamed from: c  reason: collision with root package name */
    private final T f22635c;

    /* renamed from: d  reason: collision with root package name */
    private final T f22636d;

    /* renamed from: e  reason: collision with root package name */
    private final V f22637e;

    /* renamed from: f  reason: collision with root package name */
    private final V f22638f;

    /* renamed from: g  reason: collision with root package name */
    private final V f22639g;

    /* renamed from: h  reason: collision with root package name */
    private final long f22640h;

    /* renamed from: i  reason: collision with root package name */
    private final V f22641i;

    public d1(m1<V> m1Var, i1<T, V> i1Var, T t10, T t11, V v10) {
        qc.q.i(m1Var, "animationSpec");
        qc.q.i(i1Var, "typeConverter");
        this.f22633a = m1Var;
        this.f22634b = i1Var;
        this.f22635c = t10;
        this.f22636d = t11;
        V invoke = c().a().invoke(t10);
        this.f22637e = invoke;
        V invoke2 = c().a().invoke(g());
        this.f22638f = invoke2;
        V v11 = (v10 == null || (v11 = (V) r.b(v10)) == null) ? (V) r.d(c().a().invoke(t10)) : v11;
        this.f22639g = v11;
        this.f22640h = m1Var.b(invoke, invoke2, v11);
        this.f22641i = m1Var.g(invoke, invoke2, v11);
    }

    @Override // s.e
    public boolean a() {
        return this.f22633a.a();
    }

    @Override // s.e
    public long b() {
        return this.f22640h;
    }

    @Override // s.e
    public i1<T, V> c() {
        return this.f22634b;
    }

    @Override // s.e
    public V d(long j10) {
        if (!e(j10)) {
            return this.f22633a.c(j10, this.f22637e, this.f22638f, this.f22639g);
        }
        return this.f22641i;
    }

    @Override // s.e
    public /* synthetic */ boolean e(long j10) {
        return d.a(this, j10);
    }

    @Override // s.e
    public T f(long j10) {
        if (!e(j10)) {
            V d10 = this.f22633a.d(j10, this.f22637e, this.f22638f, this.f22639g);
            int b10 = d10.b();
            for (int i10 = 0; i10 < b10; i10++) {
                if ((!Float.isNaN(d10.a(i10))) == false) {
                    throw new IllegalStateException(("AnimationVector cannot contain a NaN. " + d10 + ". Animation: " + this + ", playTimeNanos: " + j10).toString());
                }
            }
            return c().b().invoke(d10);
        }
        return g();
    }

    @Override // s.e
    public T g() {
        return this.f22636d;
    }

    public final T h() {
        return this.f22635c;
    }

    public String toString() {
        return "TargetBasedAnimation: " + this.f22635c + " -> " + g() + ",initial velocity: " + this.f22639g + ", duration: " + g.b(this) + " ms,animationSpec: " + this.f22633a;
    }

    public /* synthetic */ d1(j jVar, i1 i1Var, Object obj, Object obj2, q qVar, int i10, qc.h hVar) {
        this(jVar, i1Var, obj, obj2, (i10 & 16) != 0 ? null : qVar);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public d1(j<T> jVar, i1<T, V> i1Var, T t10, T t11, V v10) {
        this(jVar.a(i1Var), i1Var, t10, t11, v10);
        qc.q.i(jVar, "animationSpec");
        qc.q.i(i1Var, "typeConverter");
    }
}
