package com.habitrpg.android.habitica.ui.adapter;

import com.habitrpg.android.habitica.databinding.SkillTaskItemCardBinding;
import com.habitrpg.android.habitica.ui.adapter.SkillTasksRecyclerViewAdapter;
import dc.w;
import pc.l;
import qc.q;
import qc.r;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: SkillTasksRecyclerViewAdapter.kt */
/* loaded from: classes4.dex */
public final class SkillTasksRecyclerViewAdapter$TaskViewHolder$bindHolder$2 extends r implements l<CharSequence, w> {
    final /* synthetic */ SkillTasksRecyclerViewAdapter.TaskViewHolder this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SkillTasksRecyclerViewAdapter$TaskViewHolder$bindHolder$2(SkillTasksRecyclerViewAdapter.TaskViewHolder taskViewHolder) {
        super(1);
        this.this$0 = taskViewHolder;
    }

    @Override // pc.l
    public /* bridge */ /* synthetic */ w invoke(CharSequence charSequence) {
        invoke2(charSequence);
        return w.f13270a;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(CharSequence charSequence) {
        SkillTaskItemCardBinding skillTaskItemCardBinding;
        q.i(charSequence, "it");
        skillTaskItemCardBinding = this.this$0.binding;
        skillTaskItemCardBinding.notesTextView.setText(charSequence);
    }
}
