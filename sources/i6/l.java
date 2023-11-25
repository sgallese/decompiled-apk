package i6;

import android.annotation.SuppressLint;

/* compiled from: ForcedSender.java */
/* loaded from: classes.dex */
public final class l {
    @SuppressLint({"DiscouragedApi"})
    public static void a(g6.f<?> fVar, g6.d dVar) {
        if (fVar instanceof s) {
            u.c().e().u(((s) fVar).d().f(dVar), 1);
            return;
        }
        m6.a.g("ForcedSender", "Expected instance of `TransportImpl`, got `%s`.", fVar);
    }
}
