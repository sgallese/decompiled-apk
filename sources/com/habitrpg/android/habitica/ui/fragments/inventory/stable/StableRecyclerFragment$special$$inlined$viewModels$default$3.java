package com.habitrpg.android.habitica.ui.fragments.inventory.stable;

import androidx.fragment.app.p0;
import androidx.lifecycle.b1;
import androidx.lifecycle.c1;
import qc.r;

/* compiled from: FragmentViewModelLazy.kt */
/* loaded from: classes4.dex */
public final class StableRecyclerFragment$special$$inlined$viewModels$default$3 extends r implements pc.a<b1> {
    final /* synthetic */ dc.f $owner$delegate;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StableRecyclerFragment$special$$inlined$viewModels$default$3(dc.f fVar) {
        super(0);
        this.$owner$delegate = fVar;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // pc.a
    public final b1 invoke() {
        c1 c10;
        c10 = p0.c(this.$owner$delegate);
        return c10.getViewModelStore();
    }
}
