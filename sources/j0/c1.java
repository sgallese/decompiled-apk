package j0;

import java.util.List;

/* compiled from: Composer.kt */
/* loaded from: classes.dex */
public final class c1 {

    /* renamed from: a  reason: collision with root package name */
    private final a1<Object> f18620a;

    /* renamed from: b  reason: collision with root package name */
    private final Object f18621b;

    /* renamed from: c  reason: collision with root package name */
    private final y f18622c;

    /* renamed from: d  reason: collision with root package name */
    private final k2 f18623d;

    /* renamed from: e  reason: collision with root package name */
    private final d f18624e;

    /* renamed from: f  reason: collision with root package name */
    private List<dc.l<y1, k0.c<Object>>> f18625f;

    /* renamed from: g  reason: collision with root package name */
    private final p1 f18626g;

    public c1(a1<Object> a1Var, Object obj, y yVar, k2 k2Var, d dVar, List<dc.l<y1, k0.c<Object>>> list, p1 p1Var) {
        qc.q.i(a1Var, "content");
        qc.q.i(yVar, "composition");
        qc.q.i(k2Var, "slotTable");
        qc.q.i(dVar, "anchor");
        qc.q.i(list, "invalidations");
        qc.q.i(p1Var, "locals");
        this.f18620a = a1Var;
        this.f18621b = obj;
        this.f18622c = yVar;
        this.f18623d = k2Var;
        this.f18624e = dVar;
        this.f18625f = list;
        this.f18626g = p1Var;
    }

    public final d a() {
        return this.f18624e;
    }

    public final y b() {
        return this.f18622c;
    }

    public final a1<Object> c() {
        return this.f18620a;
    }

    public final List<dc.l<y1, k0.c<Object>>> d() {
        return this.f18625f;
    }

    public final p1 e() {
        return this.f18626g;
    }

    public final Object f() {
        return this.f18621b;
    }

    public final k2 g() {
        return this.f18623d;
    }

    public final void h(List<dc.l<y1, k0.c<Object>>> list) {
        qc.q.i(list, "<set-?>");
        this.f18625f = list;
    }
}
