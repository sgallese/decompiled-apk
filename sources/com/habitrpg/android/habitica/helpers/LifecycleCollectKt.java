package com.habitrpg.android.habitica.helpers;

import androidx.compose.ui.platform.j0;
import androidx.lifecycle.k;
import androidx.lifecycle.p;
import androidx.lifecycle.v;
import j0.g3;
import j0.l;
import j0.n;
import j0.y2;
import qc.q;

/* compiled from: LifecycleCollect.kt */
/* loaded from: classes4.dex */
public final class LifecycleCollectKt {
    public static final <T extends R, R> g3<R> collectAsStateLifecycleAware(dd.g<? extends T> gVar, R r10, hc.f fVar, l lVar, int i10, int i11) {
        q.i(gVar, "<this>");
        lVar.e(747680906);
        if ((i11 & 2) != 0) {
            fVar = hc.g.f16601f;
        }
        hc.f fVar2 = fVar;
        if (n.K()) {
            n.V(747680906, i10, -1, "com.habitrpg.android.habitica.helpers.collectAsStateLifecycleAware (LifecycleCollect.kt:26)");
        }
        g3<R> a10 = y2.a(rememberFlow(gVar, null, lVar, 8, 2), r10, fVar2, lVar, (((i10 >> 3) & 8) << 3) | 520 | (i10 & 112), 0);
        if (n.K()) {
            n.U();
        }
        lVar.N();
        return a10;
    }

    public static final <T> dd.g<T> rememberFlow(dd.g<? extends T> gVar, v vVar, l lVar, int i10, int i11) {
        q.i(gVar, "flow");
        lVar.e(-1214383295);
        if ((i11 & 2) != 0) {
            vVar = (v) lVar.C(j0.i());
        }
        if (n.K()) {
            n.V(-1214383295, i10, -1, "com.habitrpg.android.habitica.helpers.rememberFlow (LifecycleCollect.kt:18)");
        }
        lVar.e(511388516);
        boolean Q = lVar.Q(gVar) | lVar.Q(vVar);
        Object f10 = lVar.f();
        if (Q || f10 == l.f18688a.a()) {
            f10 = k.a(gVar, vVar.getLifecycle(), p.b.STARTED);
            lVar.J(f10);
        }
        lVar.N();
        dd.g<T> gVar2 = (dd.g) f10;
        if (n.K()) {
            n.U();
        }
        lVar.N();
        return gVar2;
    }
}
