package com.habitrpg.android.habitica.ui.activities;

import com.habitrpg.android.habitica.R;
import com.habitrpg.android.habitica.data.ChallengeRepository;
import com.habitrpg.android.habitica.databinding.ActivityTaskFormBinding;
import com.habitrpg.android.habitica.models.social.Challenge;
import kotlin.coroutines.Continuation;

/* compiled from: TaskFormActivity.kt */
@kotlin.coroutines.jvm.internal.f(c = "com.habitrpg.android.habitica.ui.activities.TaskFormActivity$onCreate$8$1$1", f = "TaskFormActivity.kt", l = {272}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class TaskFormActivity$onCreate$8$1$1 extends kotlin.coroutines.jvm.internal.l implements pc.p<ad.k0, Continuation<? super dc.w>, Object> {
    final /* synthetic */ String $challengeID;
    int label;
    final /* synthetic */ TaskFormActivity this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TaskFormActivity$onCreate$8$1$1(TaskFormActivity taskFormActivity, String str, Continuation<? super TaskFormActivity$onCreate$8$1$1> continuation) {
        super(2, continuation);
        this.this$0 = taskFormActivity;
        this.$challengeID = str;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Continuation<dc.w> create(Object obj, Continuation<?> continuation) {
        return new TaskFormActivity$onCreate$8$1$1(this.this$0, this.$challengeID, continuation);
    }

    @Override // pc.p
    public final Object invoke(ad.k0 k0Var, Continuation<? super dc.w> continuation) {
        return ((TaskFormActivity$onCreate$8$1$1) create(k0Var, continuation)).invokeSuspend(dc.w.f13270a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Object d10;
        ActivityTaskFormBinding activityTaskFormBinding;
        ActivityTaskFormBinding activityTaskFormBinding2;
        d10 = ic.d.d();
        int i10 = this.label;
        if (i10 != 0) {
            if (i10 == 1) {
                dc.n.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            dc.n.b(obj);
            ChallengeRepository challengeRepository = this.this$0.getChallengeRepository();
            String str = this.$challengeID;
            this.label = 1;
            obj = challengeRepository.retrieveChallenge(str, this);
            if (obj == d10) {
                return d10;
            }
        }
        Challenge challenge = (Challenge) obj;
        if (challenge != null) {
            this.this$0.challenge = challenge;
            activityTaskFormBinding = this.this$0.binding;
            ActivityTaskFormBinding activityTaskFormBinding3 = null;
            if (activityTaskFormBinding == null) {
                qc.q.z("binding");
                activityTaskFormBinding = null;
            }
            activityTaskFormBinding.challengeNameView.setText(this.this$0.getString(R.string.challenge_task_name, challenge.getName()));
            activityTaskFormBinding2 = this.this$0.binding;
            if (activityTaskFormBinding2 == null) {
                qc.q.z("binding");
            } else {
                activityTaskFormBinding3 = activityTaskFormBinding2;
            }
            activityTaskFormBinding3.challengeNameView.setVisibility(0);
            this.this$0.disableEditingForUneditableFieldsInChallengeTask();
            return dc.w.f13270a;
        }
        return dc.w.f13270a;
    }
}
