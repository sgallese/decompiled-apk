package u;

import java.util.List;
import k1.c0;

/* compiled from: AndroidScrollable.android.kt */
/* loaded from: classes.dex */
final class a implements s {

    /* renamed from: a  reason: collision with root package name */
    public static final a f23757a = new a();

    private a() {
    }

    @Override // u.s
    public long a(j2.e eVar, k1.r rVar, long j10) {
        qc.q.i(eVar, "$this$calculateMouseWheelScroll");
        qc.q.i(rVar, "event");
        List<c0> c10 = rVar.c();
        z0.f d10 = z0.f.d(z0.f.f26354b.c());
        int size = c10.size();
        for (int i10 = 0; i10 < size; i10++) {
            d10 = z0.f.d(z0.f.t(d10.x(), c10.get(i10).l()));
        }
        return z0.f.u(d10.x(), -eVar.v0(j2.h.j(64)));
    }
}
