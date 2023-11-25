package com.habitrpg.android.habitica.ui.fragments.skills;

import ad.k0;
import com.habitrpg.android.habitica.data.UserRepository;
import dc.n;
import dc.w;
import ic.d;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import pc.p;

/* compiled from: SkillsFragment.kt */
@f(c = "com.habitrpg.android.habitica.ui.fragments.skills.SkillsFragment$displaySkillResult$3", f = "SkillsFragment.kt", l = {145}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class SkillsFragment$displaySkillResult$3 extends l implements p<k0, Continuation<? super w>, Object> {
    int label;
    final /* synthetic */ SkillsFragment this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SkillsFragment$displaySkillResult$3(SkillsFragment skillsFragment, Continuation<? super SkillsFragment$displaySkillResult$3> continuation) {
        super(2, continuation);
        this.this$0 = skillsFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Continuation<w> create(Object obj, Continuation<?> continuation) {
        return new SkillsFragment$displaySkillResult$3(this.this$0, continuation);
    }

    @Override // pc.p
    public final Object invoke(k0 k0Var, Continuation<? super w> continuation) {
        return ((SkillsFragment$displaySkillResult$3) create(k0Var, continuation)).invokeSuspend(w.f13270a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Object d10;
        d10 = d.d();
        int i10 = this.label;
        if (i10 != 0) {
            if (i10 == 1) {
                n.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            n.b(obj);
            UserRepository userRepository = this.this$0.getUserRepository();
            this.label = 1;
            if (UserRepository.DefaultImpls.retrieveUser$default(userRepository, true, false, false, this, 6, null) == d10) {
                return d10;
            }
        }
        return w.f13270a;
    }
}
