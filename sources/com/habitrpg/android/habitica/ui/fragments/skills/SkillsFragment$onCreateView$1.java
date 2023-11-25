package com.habitrpg.android.habitica.ui.fragments.skills;

import com.habitrpg.android.habitica.models.Skill;
import dc.w;
import pc.l;
import qc.q;
import qc.r;

/* compiled from: SkillsFragment.kt */
/* loaded from: classes4.dex */
final class SkillsFragment$onCreateView$1 extends r implements l<Skill, w> {
    final /* synthetic */ SkillsFragment this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SkillsFragment$onCreateView$1(SkillsFragment skillsFragment) {
        super(1);
        this.this$0 = skillsFragment;
    }

    @Override // pc.l
    public /* bridge */ /* synthetic */ w invoke(Skill skill) {
        invoke2(skill);
        return w.f13270a;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(Skill skill) {
        q.i(skill, "it");
        this.this$0.onSkillSelected(skill);
    }
}
