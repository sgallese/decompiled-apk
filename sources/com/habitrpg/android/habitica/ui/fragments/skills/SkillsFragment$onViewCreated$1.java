package com.habitrpg.android.habitica.ui.fragments.skills;

import com.habitrpg.android.habitica.models.user.User;
import dc.w;
import pc.l;
import qc.r;

/* compiled from: SkillsFragment.kt */
/* loaded from: classes4.dex */
final class SkillsFragment$onViewCreated$1 extends r implements l<User, w> {
    final /* synthetic */ SkillsFragment this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SkillsFragment$onViewCreated$1(SkillsFragment skillsFragment) {
        super(1);
        this.this$0 = skillsFragment;
    }

    @Override // pc.l
    public /* bridge */ /* synthetic */ w invoke(User user) {
        invoke2(user);
        return w.f13270a;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(User user) {
        if (user != null) {
            this.this$0.checkUserLoadSkills(user);
        }
    }
}
