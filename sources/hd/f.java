package hd;

import ad.m1;

/* compiled from: Dispatcher.kt */
/* loaded from: classes4.dex */
public class f extends m1 {

    /* renamed from: p  reason: collision with root package name */
    private final int f16631p;

    /* renamed from: q  reason: collision with root package name */
    private final int f16632q;

    /* renamed from: r  reason: collision with root package name */
    private final long f16633r;

    /* renamed from: s  reason: collision with root package name */
    private final String f16634s;

    /* renamed from: t  reason: collision with root package name */
    private a f16635t = I0();

    public f(int i10, int i11, long j10, String str) {
        this.f16631p = i10;
        this.f16632q = i11;
        this.f16633r = j10;
        this.f16634s = str;
    }

    private final a I0() {
        return new a(this.f16631p, this.f16632q, this.f16633r, this.f16634s);
    }

    @Override // ad.g0
    public void A0(hc.f fVar, Runnable runnable) {
        a.x(this.f16635t, runnable, null, false, 6, null);
    }

    @Override // ad.g0
    public void C0(hc.f fVar, Runnable runnable) {
        a.x(this.f16635t, runnable, null, true, 2, null);
    }

    public final void J0(Runnable runnable, i iVar, boolean z10) {
        this.f16635t.q(runnable, iVar, z10);
    }
}
