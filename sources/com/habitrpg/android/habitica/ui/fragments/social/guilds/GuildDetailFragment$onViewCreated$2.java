package com.habitrpg.android.habitica.ui.fragments.social.guilds;

import com.habitrpg.android.habitica.models.social.Group;
import dc.w;
import pc.l;
import qc.r;

/* compiled from: GuildDetailFragment.kt */
/* loaded from: classes4.dex */
final class GuildDetailFragment$onViewCreated$2 extends r implements l<Group, w> {
    final /* synthetic */ GuildDetailFragment this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GuildDetailFragment$onViewCreated$2(GuildDetailFragment guildDetailFragment) {
        super(1);
        this.this$0 = guildDetailFragment;
    }

    @Override // pc.l
    public /* bridge */ /* synthetic */ w invoke(Group group) {
        invoke2(group);
        return w.f13270a;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(Group group) {
        this.this$0.updateGuild(group);
    }
}
