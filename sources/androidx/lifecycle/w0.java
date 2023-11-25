package androidx.lifecycle;

import ad.s2;

/* compiled from: ViewModel.kt */
/* loaded from: classes.dex */
public final class w0 {
    public static final ad.k0 a(v0 v0Var) {
        qc.q.i(v0Var, "<this>");
        ad.k0 k0Var = (ad.k0) v0Var.getTag("androidx.lifecycle.ViewModelCoroutineScope.JOB_KEY");
        if (k0Var != null) {
            return k0Var;
        }
        Object tagIfAbsent = v0Var.setTagIfAbsent("androidx.lifecycle.ViewModelCoroutineScope.JOB_KEY", new e(s2.b(null, 1, null).plus(ad.a1.c().N0())));
        qc.q.h(tagIfAbsent, "setTagIfAbsent(\n        …Main.immediate)\n        )");
        return (ad.k0) tagIfAbsent;
    }
}
