package com.habitrpg.android.habitica.ui.fragments.tasks;

import androidx.fragment.app.Fragment;
import androidx.lifecycle.c1;
import qc.q;
import qc.r;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: TaskRecyclerViewFragment.kt */
/* loaded from: classes4.dex */
public final class TaskRecyclerViewFragment$viewModel$2 extends r implements pc.a<c1> {
    final /* synthetic */ TaskRecyclerViewFragment this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TaskRecyclerViewFragment$viewModel$2(TaskRecyclerViewFragment taskRecyclerViewFragment) {
        super(0);
        this.this$0 = taskRecyclerViewFragment;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // pc.a
    public final c1 invoke() {
        Fragment requireParentFragment = this.this$0.requireParentFragment();
        q.h(requireParentFragment, "requireParentFragment(...)");
        return requireParentFragment;
    }
}
