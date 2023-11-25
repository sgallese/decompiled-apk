package com.habitrpg.android.habitica.ui.activities;

import com.habitrpg.android.habitica.data.ChallengeRepository;
import com.habitrpg.android.habitica.data.UserRepository;
import com.habitrpg.android.habitica.models.social.Challenge;
import kotlin.coroutines.Continuation;

/* compiled from: TaskFormActivity.kt */
@kotlin.coroutines.jvm.internal.f(c = "com.habitrpg.android.habitica.ui.activities.TaskFormActivity$showChallengeDeleteTask$1$2$1$1", f = "TaskFormActivity.kt", l = {892, 893}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class TaskFormActivity$showChallengeDeleteTask$1$2$1$1 extends kotlin.coroutines.jvm.internal.l implements pc.p<ad.k0, Continuation<? super dc.w>, Object> {
    final /* synthetic */ Challenge $it;
    int label;
    final /* synthetic */ TaskFormActivity this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TaskFormActivity$showChallengeDeleteTask$1$2$1$1(TaskFormActivity taskFormActivity, Challenge challenge, Continuation<? super TaskFormActivity$showChallengeDeleteTask$1$2$1$1> continuation) {
        super(2, continuation);
        this.this$0 = taskFormActivity;
        this.$it = challenge;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Continuation<dc.w> create(Object obj, Continuation<?> continuation) {
        return new TaskFormActivity$showChallengeDeleteTask$1$2$1$1(this.this$0, this.$it, continuation);
    }

    @Override // pc.p
    public final Object invoke(ad.k0 k0Var, Continuation<? super dc.w> continuation) {
        return ((TaskFormActivity$showChallengeDeleteTask$1$2$1$1) create(k0Var, continuation)).invokeSuspend(dc.w.f13270a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Object d10;
        d10 = ic.d.d();
        int i10 = this.label;
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 == 2) {
                    dc.n.b(obj);
                    return dc.w.f13270a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            dc.n.b(obj);
        } else {
            dc.n.b(obj);
            ChallengeRepository challengeRepository = this.this$0.getChallengeRepository();
            Challenge challenge = this.$it;
            this.label = 1;
            if (challengeRepository.leaveChallenge(challenge, "remove-all", this) == d10) {
                return d10;
            }
        }
        UserRepository userRepository = this.this$0.getUserRepository();
        this.label = 2;
        if (UserRepository.DefaultImpls.retrieveUser$default(userRepository, true, true, false, this, 4, null) == d10) {
            return d10;
        }
        return dc.w.f13270a;
    }
}
