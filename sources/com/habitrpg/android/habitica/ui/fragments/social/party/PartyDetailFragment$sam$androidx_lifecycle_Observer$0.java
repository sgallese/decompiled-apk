package com.habitrpg.android.habitica.ui.fragments.social.party;

import androidx.lifecycle.g0;

/* compiled from: PartyDetailFragment.kt */
/* loaded from: classes4.dex */
final class PartyDetailFragment$sam$androidx_lifecycle_Observer$0 implements g0, qc.k {
    private final /* synthetic */ pc.l function;

    /* JADX INFO: Access modifiers changed from: package-private */
    public PartyDetailFragment$sam$androidx_lifecycle_Observer$0(pc.l lVar) {
        qc.q.i(lVar, "function");
        this.function = lVar;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof g0) || !(obj instanceof qc.k)) {
            return false;
        }
        return qc.q.d(getFunctionDelegate(), ((qc.k) obj).getFunctionDelegate());
    }

    @Override // qc.k
    public final dc.c<?> getFunctionDelegate() {
        return this.function;
    }

    public final int hashCode() {
        return getFunctionDelegate().hashCode();
    }

    @Override // androidx.lifecycle.g0
    public final /* synthetic */ void onChanged(Object obj) {
        this.function.invoke(obj);
    }
}
