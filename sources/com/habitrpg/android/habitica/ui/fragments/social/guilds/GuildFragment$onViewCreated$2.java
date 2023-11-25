package com.habitrpg.android.habitica.ui.fragments.social.guilds;

import com.habitrpg.android.habitica.ui.activities.MainActivity;
import dc.w;
import pc.l;
import qc.r;

/* compiled from: GuildFragment.kt */
/* loaded from: classes4.dex */
final class GuildFragment$onViewCreated$2 extends r implements l<Boolean, w> {
    final /* synthetic */ GuildFragment this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GuildFragment$onViewCreated$2(GuildFragment guildFragment) {
        super(1);
        this.this$0 = guildFragment;
    }

    @Override // pc.l
    public /* bridge */ /* synthetic */ w invoke(Boolean bool) {
        invoke2(bool);
        return w.f13270a;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(Boolean bool) {
        MainActivity mainActivity = this.this$0.getMainActivity();
        if (mainActivity != null) {
            mainActivity.invalidateOptionsMenu();
        }
    }
}
