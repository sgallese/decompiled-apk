package com.habitrpg.android.habitica.ui.fragments.social.guilds;

import androidx.fragment.app.q;
import com.habitrpg.android.habitica.R;
import com.habitrpg.android.habitica.ui.views.SnackbarActivity;
import dc.w;
import qc.r;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: GuildDetailFragment.kt */
/* loaded from: classes4.dex */
public final class GuildDetailFragment$onViewCreated$6$1 extends r implements pc.a<w> {
    final /* synthetic */ GuildDetailFragment this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GuildDetailFragment$onViewCreated$6$1(GuildDetailFragment guildDetailFragment) {
        super(0);
        this.this$0 = guildDetailFragment;
    }

    @Override // pc.a
    public /* bridge */ /* synthetic */ w invoke() {
        invoke2();
        return w.f13270a;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2() {
        q activity = this.this$0.getActivity();
        SnackbarActivity snackbarActivity = activity instanceof SnackbarActivity ? (SnackbarActivity) activity : null;
        if (snackbarActivity != null) {
            SnackbarActivity.DefaultImpls.showSnackbar$default(snackbarActivity, null, this.this$0.getString(R.string.joined_guild), null, null, null, null, null, null, false, 509, null);
        }
    }
}
