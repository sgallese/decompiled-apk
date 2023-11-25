package com.habitrpg.android.habitica.ui.fragments.social.guilds;

import com.habitrpg.android.habitica.models.social.Group;
import dc.w;
import pc.l;
import qc.r;

/* compiled from: GuildFragment.kt */
/* loaded from: classes4.dex */
final class GuildFragment$onViewCreated$1 extends r implements l<Group, w> {
    final /* synthetic */ GuildFragment this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GuildFragment$onViewCreated$1(GuildFragment guildFragment) {
        super(1);
        this.this$0 = guildFragment;
    }

    @Override // pc.l
    public /* bridge */ /* synthetic */ w invoke(Group group) {
        invoke2(group);
        return w.f13270a;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(Group group) {
        this.this$0.setGroup(group);
    }
}
