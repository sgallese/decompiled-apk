package com.habitrpg.android.habitica.ui.fragments.social.party;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.p0;
import androidx.lifecycle.c1;
import androidx.lifecycle.y0;

/* compiled from: FragmentViewModelLazy.kt */
/* loaded from: classes4.dex */
public final class PartyInviteFragment$special$$inlined$viewModels$default$5 extends qc.r implements pc.a<y0.b> {
    final /* synthetic */ dc.f $owner$delegate;
    final /* synthetic */ Fragment $this_viewModels;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PartyInviteFragment$special$$inlined$viewModels$default$5(Fragment fragment, dc.f fVar) {
        super(0);
        this.$this_viewModels = fragment;
        this.$owner$delegate = fVar;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // pc.a
    public final y0.b invoke() {
        c1 c10;
        y0.b defaultViewModelProviderFactory;
        c10 = p0.c(this.$owner$delegate);
        androidx.lifecycle.o oVar = c10 instanceof androidx.lifecycle.o ? (androidx.lifecycle.o) c10 : null;
        if (oVar == null || (defaultViewModelProviderFactory = oVar.getDefaultViewModelProviderFactory()) == null) {
            y0.b defaultViewModelProviderFactory2 = this.$this_viewModels.getDefaultViewModelProviderFactory();
            qc.q.h(defaultViewModelProviderFactory2, "defaultViewModelProviderFactory");
            return defaultViewModelProviderFactory2;
        }
        return defaultViewModelProviderFactory;
    }
}
