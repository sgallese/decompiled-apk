package com.habitrpg.android.habitica.ui.fragments.preferences;

import androidx.lifecycle.g0;
import qc.q;

/* compiled from: BasePreferencesFragment.kt */
/* loaded from: classes4.dex */
final class BasePreferencesFragment$sam$androidx_lifecycle_Observer$0 implements g0, qc.k {
    private final /* synthetic */ pc.l function;

    /* JADX INFO: Access modifiers changed from: package-private */
    public BasePreferencesFragment$sam$androidx_lifecycle_Observer$0(pc.l lVar) {
        q.i(lVar, "function");
        this.function = lVar;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof g0) || !(obj instanceof qc.k)) {
            return false;
        }
        return q.d(getFunctionDelegate(), ((qc.k) obj).getFunctionDelegate());
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
