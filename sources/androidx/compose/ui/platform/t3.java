package androidx.compose.ui.platform;

import java.util.List;

/* compiled from: AndroidComposeViewAccessibilityDelegateCompat.android.kt */
/* loaded from: classes.dex */
public final class t3 implements p1.j1 {

    /* renamed from: f  reason: collision with root package name */
    private final int f2840f;

    /* renamed from: m  reason: collision with root package name */
    private final List<t3> f2841m;

    /* renamed from: p  reason: collision with root package name */
    private Float f2842p;

    /* renamed from: q  reason: collision with root package name */
    private Float f2843q;

    /* renamed from: r  reason: collision with root package name */
    private t1.j f2844r;

    /* renamed from: s  reason: collision with root package name */
    private t1.j f2845s;

    public t3(int i10, List<t3> list, Float f10, Float f11, t1.j jVar, t1.j jVar2) {
        qc.q.i(list, "allScopes");
        this.f2840f = i10;
        this.f2841m = list;
        this.f2842p = f10;
        this.f2843q = f11;
        this.f2844r = jVar;
        this.f2845s = jVar2;
    }

    @Override // p1.j1
    public boolean M() {
        return this.f2841m.contains(this);
    }

    public final t1.j a() {
        return this.f2844r;
    }

    public final Float b() {
        return this.f2842p;
    }

    public final Float c() {
        return this.f2843q;
    }

    public final int d() {
        return this.f2840f;
    }

    public final t1.j e() {
        return this.f2845s;
    }

    public final void f(t1.j jVar) {
        this.f2844r = jVar;
    }

    public final void g(Float f10) {
        this.f2842p = f10;
    }

    public final void h(Float f10) {
        this.f2843q = f10;
    }

    public final void i(t1.j jVar) {
        this.f2845s = jVar;
    }
}
