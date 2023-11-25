package t;

import a1.p1;
import a1.r1;

/* compiled from: OverscrollConfiguration.kt */
/* loaded from: classes.dex */
public final class g0 {

    /* renamed from: a  reason: collision with root package name */
    private final long f23176a;

    /* renamed from: b  reason: collision with root package name */
    private final w.s f23177b;

    public /* synthetic */ g0(long j10, w.s sVar, qc.h hVar) {
        this(j10, sVar);
    }

    public final w.s a() {
        return this.f23177b;
    }

    public final long b() {
        return this.f23176a;
    }

    public boolean equals(Object obj) {
        Class<?> cls;
        if (this == obj) {
            return true;
        }
        if (obj != null) {
            cls = obj.getClass();
        } else {
            cls = null;
        }
        if (!qc.q.d(g0.class, cls)) {
            return false;
        }
        qc.q.g(obj, "null cannot be cast to non-null type androidx.compose.foundation.OverscrollConfiguration");
        g0 g0Var = (g0) obj;
        if (p1.q(this.f23176a, g0Var.f23176a) && qc.q.d(this.f23177b, g0Var.f23177b)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return (p1.w(this.f23176a) * 31) + this.f23177b.hashCode();
    }

    public String toString() {
        return "OverscrollConfiguration(glowColor=" + ((Object) p1.x(this.f23176a)) + ", drawPadding=" + this.f23177b + ')';
    }

    private g0(long j10, w.s sVar) {
        qc.q.i(sVar, "drawPadding");
        this.f23176a = j10;
        this.f23177b = sVar;
    }

    public /* synthetic */ g0(long j10, w.s sVar, int i10, qc.h hVar) {
        this((i10 & 1) != 0 ? r1.d(4284900966L) : j10, (i10 & 2) != 0 ? androidx.compose.foundation.layout.j.c(0.0f, 0.0f, 3, null) : sVar, null);
    }
}
