package t;

import kotlin.coroutines.Continuation;

/* compiled from: Overscroll.kt */
/* loaded from: classes.dex */
public final class f0 implements i0 {

    /* renamed from: a  reason: collision with root package name */
    public static final f0 f23173a = new f0();

    private f0() {
    }

    @Override // t.i0
    public long a(long j10, int i10, pc.l<? super z0.f, z0.f> lVar) {
        qc.q.i(lVar, "performScroll");
        return lVar.invoke(z0.f.d(j10)).x();
    }

    @Override // t.i0
    public androidx.compose.ui.e b() {
        return androidx.compose.ui.e.f2335a;
    }

    @Override // t.i0
    public boolean c() {
        return false;
    }

    @Override // t.i0
    public Object d(long j10, pc.p<? super j2.v, ? super Continuation<? super j2.v>, ? extends Object> pVar, Continuation<? super dc.w> continuation) {
        Object d10;
        Object invoke = pVar.invoke(j2.v.b(j10), continuation);
        d10 = ic.d.d();
        if (invoke == d10) {
            return invoke;
        }
        return dc.w.f13270a;
    }
}
