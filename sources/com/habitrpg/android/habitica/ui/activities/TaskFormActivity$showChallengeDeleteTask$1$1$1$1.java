package com.habitrpg.android.habitica.ui.activities;

import com.habitrpg.android.habitica.models.social.Challenge;
import kotlin.coroutines.Continuation;

/* compiled from: TaskFormActivity.kt */
@kotlin.coroutines.jvm.internal.f(c = "com.habitrpg.android.habitica.ui.activities.TaskFormActivity$showChallengeDeleteTask$1$1$1$1", f = "TaskFormActivity.kt", l = {879, 880, 881}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class TaskFormActivity$showChallengeDeleteTask$1$1$1$1 extends kotlin.coroutines.jvm.internal.l implements pc.p<ad.k0, Continuation<? super dc.w>, Object> {
    final /* synthetic */ Challenge $it;
    int label;
    final /* synthetic */ TaskFormActivity this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TaskFormActivity$showChallengeDeleteTask$1$1$1$1(TaskFormActivity taskFormActivity, Challenge challenge, Continuation<? super TaskFormActivity$showChallengeDeleteTask$1$1$1$1> continuation) {
        super(2, continuation);
        this.this$0 = taskFormActivity;
        this.$it = challenge;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Continuation<dc.w> create(Object obj, Continuation<?> continuation) {
        return new TaskFormActivity$showChallengeDeleteTask$1$1$1$1(this.this$0, this.$it, continuation);
    }

    @Override // pc.p
    public final Object invoke(ad.k0 k0Var, Continuation<? super dc.w> continuation) {
        return ((TaskFormActivity$showChallengeDeleteTask$1$1$1$1) create(k0Var, continuation)).invokeSuspend(dc.w.f13270a);
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x006e A[RETURN] */
    @Override // kotlin.coroutines.jvm.internal.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r11) {
        /*
            r10 = this;
            java.lang.Object r0 = ic.b.d()
            int r1 = r10.label
            r2 = 3
            r3 = 2
            r4 = 1
            if (r1 == 0) goto L25
            if (r1 == r4) goto L21
            if (r1 == r3) goto L1d
            if (r1 != r2) goto L15
            dc.n.b(r11)
            goto L6f
        L15:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r0)
            throw r11
        L1d:
            dc.n.b(r11)
            goto L5a
        L21:
            dc.n.b(r11)
            goto L3b
        L25:
            dc.n.b(r11)
            com.habitrpg.android.habitica.ui.activities.TaskFormActivity r11 = r10.this$0
            com.habitrpg.android.habitica.data.ChallengeRepository r11 = r11.getChallengeRepository()
            com.habitrpg.android.habitica.models.social.Challenge r1 = r10.$it
            r10.label = r4
            java.lang.String r4 = "keep-all"
            java.lang.Object r11 = r11.leaveChallenge(r1, r4, r10)
            if (r11 != r0) goto L3b
            return r0
        L3b:
            com.habitrpg.android.habitica.ui.activities.TaskFormActivity r11 = r10.this$0
            com.habitrpg.android.habitica.data.TaskRepository r11 = r11.getTaskRepository()
            com.habitrpg.android.habitica.ui.activities.TaskFormActivity r1 = r10.this$0
            com.habitrpg.android.habitica.models.tasks.Task r1 = com.habitrpg.android.habitica.ui.activities.TaskFormActivity.access$getTask$p(r1)
            if (r1 == 0) goto L4f
            java.lang.String r1 = r1.getId()
            if (r1 != 0) goto L51
        L4f:
            java.lang.String r1 = ""
        L51:
            r10.label = r3
            java.lang.Object r11 = r11.deleteTask(r1, r10)
            if (r11 != r0) goto L5a
            return r0
        L5a:
            com.habitrpg.android.habitica.ui.activities.TaskFormActivity r11 = r10.this$0
            com.habitrpg.android.habitica.data.UserRepository r3 = r11.getUserRepository()
            r4 = 1
            r5 = 1
            r6 = 0
            r8 = 4
            r9 = 0
            r10.label = r2
            r7 = r10
            java.lang.Object r11 = com.habitrpg.android.habitica.data.UserRepository.DefaultImpls.retrieveUser$default(r3, r4, r5, r6, r7, r8, r9)
            if (r11 != r0) goto L6f
            return r0
        L6f:
            dc.w r11 = dc.w.f13270a
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.habitrpg.android.habitica.ui.activities.TaskFormActivity$showChallengeDeleteTask$1$1$1$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
