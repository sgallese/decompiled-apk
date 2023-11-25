package com.habitrpg.android.habitica.ui.fragments.inventory.stable;

import com.habitrpg.android.habitica.models.inventory.Mount;
import com.habitrpg.android.habitica.ui.adapter.inventory.StableRecyclerAdapter;
import dc.w;
import java.util.List;
import pc.l;
import qc.q;
import qc.r;

/* compiled from: StableRecyclerFragment.kt */
/* loaded from: classes4.dex */
final class StableRecyclerFragment$loadItems$4 extends r implements l<List<? extends Mount>, w> {
    final /* synthetic */ StableRecyclerFragment this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StableRecyclerFragment$loadItems$4(StableRecyclerFragment stableRecyclerFragment) {
        super(1);
        this.this$0 = stableRecyclerFragment;
    }

    @Override // pc.l
    public /* bridge */ /* synthetic */ w invoke(List<? extends Mount> list) {
        invoke2(list);
        return w.f13270a;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(List<? extends Mount> list) {
        StableRecyclerAdapter adapter = this.this$0.getAdapter();
        if (adapter != null) {
            q.f(list);
            adapter.setExistingMounts(list);
        }
    }
}
