package com.habitrpg.android.habitica.ui.fragments.skills;

import ad.k0;
import com.habitrpg.android.habitica.data.UserRepository;
import com.habitrpg.android.habitica.models.Skill;
import com.habitrpg.android.habitica.models.responses.SkillResponse;
import dc.n;
import dc.w;
import ic.d;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import pc.p;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: SkillsFragment.kt */
@f(c = "com.habitrpg.android.habitica.ui.fragments.skills.SkillsFragment$useSkill$1", f = "SkillsFragment.kt", l = {167, 169}, m = "invokeSuspend")
/* loaded from: classes4.dex */
public final class SkillsFragment$useSkill$1 extends l implements p<k0, Continuation<? super w>, Object> {
    final /* synthetic */ Skill $skill;
    final /* synthetic */ String $taskId;
    int label;
    final /* synthetic */ SkillsFragment this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SkillsFragment$useSkill$1(String str, SkillsFragment skillsFragment, Skill skill, Continuation<? super SkillsFragment$useSkill$1> continuation) {
        super(2, continuation);
        this.$taskId = str;
        this.this$0 = skillsFragment;
        this.$skill = skill;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Continuation<w> create(Object obj, Continuation<?> continuation) {
        return new SkillsFragment$useSkill$1(this.$taskId, this.this$0, this.$skill, continuation);
    }

    @Override // pc.p
    public final Object invoke(k0 k0Var, Continuation<? super w> continuation) {
        return ((SkillsFragment$useSkill$1) create(k0Var, continuation)).invokeSuspend(w.f13270a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Object d10;
        SkillResponse skillResponse;
        d10 = d.d();
        int i10 = this.label;
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 == 2) {
                    n.b(obj);
                    skillResponse = (SkillResponse) obj;
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                n.b(obj);
                skillResponse = (SkillResponse) obj;
            }
        } else {
            n.b(obj);
            if (this.$taskId != null) {
                UserRepository userRepository = this.this$0.getUserRepository();
                String key = this.$skill.getKey();
                String target = this.$skill.getTarget();
                String str = this.$taskId;
                this.label = 1;
                obj = userRepository.useSkill(key, target, str, this);
                if (obj == d10) {
                    return d10;
                }
                skillResponse = (SkillResponse) obj;
            } else {
                UserRepository userRepository2 = this.this$0.getUserRepository();
                String key2 = this.$skill.getKey();
                String target2 = this.$skill.getTarget();
                this.label = 2;
                obj = userRepository2.useSkill(key2, target2, this);
                if (obj == d10) {
                    return d10;
                }
                skillResponse = (SkillResponse) obj;
            }
        }
        if (skillResponse != null) {
            this.this$0.displaySkillResult(this.$skill, skillResponse);
        }
        return w.f13270a;
    }
}
