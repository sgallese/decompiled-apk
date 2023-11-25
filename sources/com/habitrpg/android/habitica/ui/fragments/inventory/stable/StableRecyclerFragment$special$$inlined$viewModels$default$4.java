package com.habitrpg.android.habitica.ui.fragments.inventory.stable;

import androidx.fragment.app.p0;
import androidx.lifecycle.c1;
import androidx.lifecycle.o;
import j3.a;
import qc.r;

/* compiled from: FragmentViewModelLazy.kt */
/* loaded from: classes4.dex */
public final class StableRecyclerFragment$special$$inlined$viewModels$default$4 extends r implements pc.a<j3.a> {
    final /* synthetic */ pc.a $extrasProducer;
    final /* synthetic */ dc.f $owner$delegate;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StableRecyclerFragment$special$$inlined$viewModels$default$4(pc.a aVar, dc.f fVar) {
        super(0);
        this.$extrasProducer = aVar;
        this.$owner$delegate = fVar;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // pc.a
    public final j3.a invoke() {
        c1 c10;
        j3.a aVar;
        pc.a aVar2 = this.$extrasProducer;
        if (aVar2 == null || (aVar = (j3.a) aVar2.invoke()) == null) {
            c10 = p0.c(this.$owner$delegate);
            o oVar = c10 instanceof o ? (o) c10 : null;
            return oVar != null ? oVar.getDefaultViewModelCreationExtras() : a.C0424a.f19017b;
        }
        return aVar;
    }
}
