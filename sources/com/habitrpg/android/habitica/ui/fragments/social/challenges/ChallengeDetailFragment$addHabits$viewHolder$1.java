package com.habitrpg.android.habitica.ui.fragments.social.challenges;

import com.habitrpg.android.habitica.models.tasks.Task;
import com.habitrpg.shared.habitica.models.responses.TaskDirection;
import dc.w;
import pc.p;
import qc.q;
import qc.r;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ChallengeDetailFragment.kt */
/* loaded from: classes4.dex */
public final class ChallengeDetailFragment$addHabits$viewHolder$1 extends r implements p<Task, TaskDirection, w> {
    public static final ChallengeDetailFragment$addHabits$viewHolder$1 INSTANCE = new ChallengeDetailFragment$addHabits$viewHolder$1();

    ChallengeDetailFragment$addHabits$viewHolder$1() {
        super(2);
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(Task task, TaskDirection taskDirection) {
        q.i(task, "<anonymous parameter 0>");
        q.i(taskDirection, "<anonymous parameter 1>");
    }

    @Override // pc.p
    public /* bridge */ /* synthetic */ w invoke(Task task, TaskDirection taskDirection) {
        invoke2(task, taskDirection);
        return w.f13270a;
    }
}
