package s;

import j0.d3;

/* compiled from: Transition.kt */
/* loaded from: classes.dex */
public final class q0<S> {

    /* renamed from: a  reason: collision with root package name */
    private final j0.j1 f22821a;

    /* renamed from: b  reason: collision with root package name */
    private final j0.j1 f22822b;

    /* renamed from: c  reason: collision with root package name */
    private final j0.j1 f22823c;

    public q0(S s10) {
        j0.j1 e10;
        j0.j1 e11;
        j0.j1 e12;
        e10 = d3.e(s10, null, 2, null);
        this.f22821a = e10;
        e11 = d3.e(s10, null, 2, null);
        this.f22822b = e11;
        e12 = d3.e(Boolean.FALSE, null, 2, null);
        this.f22823c = e12;
    }

    public final S a() {
        return (S) this.f22821a.getValue();
    }

    public final void b(S s10) {
        this.f22821a.setValue(s10);
    }

    public final void c(boolean z10) {
        this.f22823c.setValue(Boolean.valueOf(z10));
    }
}
