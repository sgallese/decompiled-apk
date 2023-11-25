package r;

import j0.e1;
import j0.q1;

/* compiled from: AnimatedContent.kt */
/* loaded from: classes.dex */
public final class o {

    /* renamed from: a  reason: collision with root package name */
    private final r f21975a;

    /* renamed from: b  reason: collision with root package name */
    private final t f21976b;

    /* renamed from: c  reason: collision with root package name */
    private final e1 f21977c;

    /* renamed from: d  reason: collision with root package name */
    private e0 f21978d;

    public o(r rVar, t tVar, float f10, e0 e0Var) {
        qc.q.i(rVar, "targetContentEnter");
        qc.q.i(tVar, "initialContentExit");
        this.f21975a = rVar;
        this.f21976b = tVar;
        this.f21977c = q1.a(f10);
        this.f21978d = e0Var;
    }

    public final t a() {
        return this.f21976b;
    }

    public final e0 b() {
        return this.f21978d;
    }

    public final r c() {
        return this.f21975a;
    }

    public final float d() {
        return this.f21977c.b();
    }

    public /* synthetic */ o(r rVar, t tVar, float f10, e0 e0Var, int i10, qc.h hVar) {
        this(rVar, tVar, (i10 & 4) != 0 ? 0.0f : f10, (i10 & 8) != 0 ? b.d(false, null, 3, null) : e0Var);
    }
}
