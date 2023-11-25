package com.habitrpg.android.habitica.ui.fragments.social.guilds;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.p0;
import androidx.lifecycle.c1;
import androidx.lifecycle.o;
import androidx.lifecycle.y0;
import qc.q;
import qc.r;

/* compiled from: FragmentViewModelLazy.kt */
/* loaded from: classes4.dex */
public final class GuildFragment$special$$inlined$viewModels$default$5 extends r implements pc.a<y0.b> {
    final /* synthetic */ dc.f $owner$delegate;
    final /* synthetic */ Fragment $this_viewModels;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GuildFragment$special$$inlined$viewModels$default$5(Fragment fragment, dc.f fVar) {
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
        o oVar = c10 instanceof o ? (o) c10 : null;
        if (oVar == null || (defaultViewModelProviderFactory = oVar.getDefaultViewModelProviderFactory()) == null) {
            y0.b defaultViewModelProviderFactory2 = this.$this_viewModels.getDefaultViewModelProviderFactory();
            q.h(defaultViewModelProviderFactory2, "defaultViewModelProviderFactory");
            return defaultViewModelProviderFactory2;
        }
        return defaultViewModelProviderFactory;
    }
}
