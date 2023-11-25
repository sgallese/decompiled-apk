package com.habitrpg.android.habitica.ui.fragments.social.challenges;

import com.habitrpg.android.habitica.models.tasks.ChecklistItem;
import com.habitrpg.android.habitica.models.tasks.Task;
import dc.w;
import pc.p;
import qc.q;
import qc.r;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ChallengeDetailFragment.kt */
/* loaded from: classes4.dex */
public final class ChallengeDetailFragment$addTodos$viewHolder$2 extends r implements p<Task, ChecklistItem, w> {
    public static final ChallengeDetailFragment$addTodos$viewHolder$2 INSTANCE = new ChallengeDetailFragment$addTodos$viewHolder$2();

    ChallengeDetailFragment$addTodos$viewHolder$2() {
        super(2);
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(Task task, ChecklistItem checklistItem) {
        q.i(task, "<anonymous parameter 0>");
        q.i(checklistItem, "<anonymous parameter 1>");
    }

    @Override // pc.p
    public /* bridge */ /* synthetic */ w invoke(Task task, ChecklistItem checklistItem) {
        invoke2(task, checklistItem);
        return w.f13270a;
    }
}
