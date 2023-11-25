package dc;

import dc.m;

/* compiled from: Result.kt */
/* loaded from: classes4.dex */
public final class n {
    public static final Object a(Throwable th) {
        qc.q.i(th, "exception");
        return new m.b(th);
    }

    public static final void b(Object obj) {
        if (!(obj instanceof m.b)) {
            return;
        }
        throw ((m.b) obj).f13254f;
    }
}
