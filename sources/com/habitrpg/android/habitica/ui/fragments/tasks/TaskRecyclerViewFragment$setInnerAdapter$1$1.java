package com.habitrpg.android.habitica.ui.fragments.tasks;

import com.habitrpg.android.habitica.ui.adapter.tasks.TaskRecyclerViewAdapter;
import dc.q;
import dc.w;
import java.util.List;
import pc.l;
import qc.r;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: TaskRecyclerViewFragment.kt */
/* loaded from: classes4.dex */
public final class TaskRecyclerViewFragment$setInnerAdapter$1$1 extends r implements l<q<? extends String, ? extends String, ? extends List<? extends String>>, w> {
    final /* synthetic */ TaskRecyclerViewFragment this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TaskRecyclerViewFragment$setInnerAdapter$1$1(TaskRecyclerViewFragment taskRecyclerViewFragment) {
        super(1);
        this.this$0 = taskRecyclerViewFragment;
    }

    @Override // pc.l
    public /* bridge */ /* synthetic */ w invoke(q<? extends String, ? extends String, ? extends List<? extends String>> qVar) {
        invoke2((q<String, String, ? extends List<String>>) qVar);
        return w.f13270a;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(q<String, String, ? extends List<String>> qVar) {
        TaskRecyclerViewAdapter recyclerAdapter = this.this$0.getRecyclerAdapter();
        if (recyclerAdapter != null) {
            recyclerAdapter.filter();
        }
    }
}
