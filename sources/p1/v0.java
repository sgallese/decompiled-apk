package p1;

import java.util.List;

/* compiled from: MutableVectorWithMutationTracking.kt */
/* loaded from: classes.dex */
public final class v0<T> {

    /* renamed from: a  reason: collision with root package name */
    private final k0.f<T> f20951a;

    /* renamed from: b  reason: collision with root package name */
    private final pc.a<dc.w> f20952b;

    public v0(k0.f<T> fVar, pc.a<dc.w> aVar) {
        qc.q.i(fVar, "vector");
        qc.q.i(aVar, "onVectorMutated");
        this.f20951a = fVar;
        this.f20952b = aVar;
    }

    public final void a(int i10, T t10) {
        this.f20951a.a(i10, t10);
        this.f20952b.invoke();
    }

    public final List<T> b() {
        return this.f20951a.h();
    }

    public final void c() {
        this.f20951a.i();
        this.f20952b.invoke();
    }

    public final T d(int i10) {
        return this.f20951a.n()[i10];
    }

    public final int e() {
        return this.f20951a.o();
    }

    public final k0.f<T> f() {
        return this.f20951a;
    }

    public final T g(int i10) {
        T x10 = this.f20951a.x(i10);
        this.f20952b.invoke();
        return x10;
    }
}
