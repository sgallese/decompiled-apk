package com.habitrpg.android.habitica.ui.fragments.social.challenges;

import com.habitrpg.android.habitica.models.tasks.Task;
import dc.w;
import qc.q;
import qc.r;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ChallengeDetailFragment.kt */
/* loaded from: classes4.dex */
public final class ChallengeDetailFragment$addHabits$viewHolder$3 extends r implements pc.l<Task, w> {
    public static final ChallengeDetailFragment$addHabits$viewHolder$3 INSTANCE = new ChallengeDetailFragment$addHabits$viewHolder$3();

    ChallengeDetailFragment$addHabits$viewHolder$3() {
        super(1);
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(Task task) {
        q.i(task, "it");
    }

    @Override // pc.l
    public /* bridge */ /* synthetic */ w invoke(Task task) {
        invoke2(task);
        return w.f13270a;
    }
}
