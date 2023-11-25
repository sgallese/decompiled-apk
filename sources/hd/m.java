package hd;

import ad.g0;
import fd.o;

/* compiled from: Dispatcher.kt */
/* loaded from: classes4.dex */
final class m extends g0 {

    /* renamed from: m  reason: collision with root package name */
    public static final m f16648m = new m();

    private m() {
    }

    @Override // ad.g0
    public void A0(hc.f fVar, Runnable runnable) {
        c.f16629u.J0(runnable, l.f16647h, false);
    }

    @Override // ad.g0
    public void C0(hc.f fVar, Runnable runnable) {
        c.f16629u.J0(runnable, l.f16647h, true);
    }

    @Override // ad.g0
    public g0 F0(int i10) {
        o.a(i10);
        if (i10 >= l.f16643d) {
            return this;
        }
        return super.F0(i10);
    }
}
