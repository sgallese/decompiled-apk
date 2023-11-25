package com.habitrpg.android.habitica.ui.fragments.tasks;

import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.habitrpg.android.habitica.databinding.FragmentRefreshRecyclerviewBinding;
import dc.w;
import qc.r;

/* compiled from: TaskRecyclerViewFragment.kt */
/* loaded from: classes4.dex */
final class TaskRecyclerViewFragment$onRefresh$1 extends r implements pc.a<w> {
    final /* synthetic */ TaskRecyclerViewFragment this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TaskRecyclerViewFragment$onRefresh$1(TaskRecyclerViewFragment taskRecyclerViewFragment) {
        super(0);
        this.this$0 = taskRecyclerViewFragment;
    }

    @Override // pc.a
    public /* bridge */ /* synthetic */ w invoke() {
        invoke2();
        return w.f13270a;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2() {
        FragmentRefreshRecyclerviewBinding binding = this.this$0.getBinding();
        SwipeRefreshLayout swipeRefreshLayout = binding != null ? binding.refreshLayout : null;
        if (swipeRefreshLayout == null) {
            return;
        }
        swipeRefreshLayout.setRefreshing(false);
    }
}
