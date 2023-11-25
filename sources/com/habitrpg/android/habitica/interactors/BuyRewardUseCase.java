package com.habitrpg.android.habitica.interactors;

import com.habitrpg.android.habitica.data.TaskRepository;
import com.habitrpg.android.habitica.helpers.SoundManager;
import com.habitrpg.android.habitica.interactors.UseCase;
import com.habitrpg.android.habitica.models.tasks.Task;
import com.habitrpg.android.habitica.models.user.User;
import com.habitrpg.shared.habitica.models.responses.TaskScoringResult;
import dc.w;
import pc.l;
import qc.q;

/* compiled from: BuyRewardUseCase.kt */
/* loaded from: classes4.dex */
public final class BuyRewardUseCase extends UseCase<RequestValues, TaskScoringResult> {
    public static final int $stable = 8;
    private final SoundManager soundManager;
    private final TaskRepository taskRepository;

    /* compiled from: BuyRewardUseCase.kt */
    /* loaded from: classes4.dex */
    public static final class RequestValues implements UseCase.RequestValues {
        public static final int $stable = 8;
        private final l<TaskScoringResult, w> notifyFunc;
        private final Task task;
        private final User user;

        /* JADX WARN: Multi-variable type inference failed */
        public RequestValues(User user, Task task, l<? super TaskScoringResult, w> lVar) {
            q.i(task, "task");
            q.i(lVar, "notifyFunc");
            this.user = user;
            this.task = task;
            this.notifyFunc = lVar;
        }

        public final l<TaskScoringResult, w> getNotifyFunc() {
            return this.notifyFunc;
        }

        public final Task getTask() {
            return this.task;
        }

        public final User getUser$Habitica_2311256681_prodRelease() {
            return this.user;
        }
    }

    public BuyRewardUseCase(TaskRepository taskRepository, SoundManager soundManager) {
        q.i(taskRepository, "taskRepository");
        q.i(soundManager, "soundManager");
        this.taskRepository = taskRepository;
        this.soundManager = soundManager;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0036  */
    @Override // com.habitrpg.android.habitica.interactors.UseCase
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object run(com.habitrpg.android.habitica.interactors.BuyRewardUseCase.RequestValues r9, kotlin.coroutines.Continuation<? super com.habitrpg.shared.habitica.models.responses.TaskScoringResult> r10) {
        /*
            r8 = this;
            boolean r0 = r10 instanceof com.habitrpg.android.habitica.interactors.BuyRewardUseCase$run$1
            if (r0 == 0) goto L13
            r0 = r10
            com.habitrpg.android.habitica.interactors.BuyRewardUseCase$run$1 r0 = (com.habitrpg.android.habitica.interactors.BuyRewardUseCase$run$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.habitrpg.android.habitica.interactors.BuyRewardUseCase$run$1 r0 = new com.habitrpg.android.habitica.interactors.BuyRewardUseCase$run$1
            r0.<init>(r8, r10)
        L18:
            r7 = r0
            java.lang.Object r10 = r7.result
            java.lang.Object r0 = ic.b.d()
            int r1 = r7.label
            r2 = 1
            if (r1 == 0) goto L36
            if (r1 != r2) goto L2e
            java.lang.Object r9 = r7.L$0
            com.habitrpg.android.habitica.interactors.BuyRewardUseCase r9 = (com.habitrpg.android.habitica.interactors.BuyRewardUseCase) r9
            dc.n.b(r10)
            goto L56
        L2e:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L36:
            dc.n.b(r10)
            com.habitrpg.android.habitica.data.TaskRepository r1 = r8.taskRepository
            com.habitrpg.android.habitica.models.user.User r10 = r9.getUser$Habitica_2311256681_prodRelease()
            com.habitrpg.android.habitica.models.tasks.Task r3 = r9.getTask()
            r4 = 0
            r5 = 0
            pc.l r6 = r9.getNotifyFunc()
            r7.L$0 = r8
            r7.label = r2
            r2 = r10
            java.lang.Object r10 = r1.taskChecked(r2, r3, r4, r5, r6, r7)
            if (r10 != r0) goto L55
            return r0
        L55:
            r9 = r8
        L56:
            com.habitrpg.shared.habitica.models.responses.TaskScoringResult r10 = (com.habitrpg.shared.habitica.models.responses.TaskScoringResult) r10
            com.habitrpg.android.habitica.helpers.SoundManager r9 = r9.soundManager
            java.lang.String r0 = "Reward"
            r9.loadAndPlayAudio(r0)
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.habitrpg.android.habitica.interactors.BuyRewardUseCase.run(com.habitrpg.android.habitica.interactors.BuyRewardUseCase$RequestValues, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
