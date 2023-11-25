package com.habitrpg.android.habitica.ui.fragments.inventory.stable;

import androidx.lifecycle.g0;
import pc.l;
import qc.k;
import qc.q;

/* compiled from: MountDetailRecyclerFragment.kt */
/* loaded from: classes4.dex */
final class MountDetailRecyclerFragment$sam$androidx_lifecycle_Observer$0 implements g0, k {
    private final /* synthetic */ l function;

    /* JADX INFO: Access modifiers changed from: package-private */
    public MountDetailRecyclerFragment$sam$androidx_lifecycle_Observer$0(l lVar) {
        q.i(lVar, "function");
        this.function = lVar;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof g0) || !(obj instanceof k)) {
            return false;
        }
        return q.d(getFunctionDelegate(), ((k) obj).getFunctionDelegate());
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
