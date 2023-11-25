package com.habitrpg.android.habitica.ui.adapter;

import androidx.recyclerview.widget.i;
import com.habitrpg.android.habitica.models.BaseMainObject;
import java.util.List;
import qc.q;

/* compiled from: BaseRecyclerViewAdapter.kt */
/* loaded from: classes4.dex */
public class DiffCallback<T extends BaseMainObject> extends i.b {
    public static final int $stable = 8;
    private final List<BaseMainObject> newList;
    private final List<BaseMainObject> oldList;

    /* JADX WARN: Multi-variable type inference failed */
    public DiffCallback(List<? extends BaseMainObject> list, List<? extends BaseMainObject> list2) {
        q.i(list, "oldList");
        q.i(list2, "newList");
        this.oldList = list;
        this.newList = list2;
    }

    @Override // androidx.recyclerview.widget.i.b
    public boolean areContentsTheSame(int i10, int i11) {
        return q.d(this.oldList.get(i10), this.newList.get(i11));
    }

    @Override // androidx.recyclerview.widget.i.b
    public boolean areItemsTheSame(int i10, int i11) {
        return q.d(this.oldList.get(i10).getPrimaryIdentifier(), this.newList.get(i11).getPrimaryIdentifier());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final List<BaseMainObject> getNewList() {
        return this.newList;
    }

    @Override // androidx.recyclerview.widget.i.b
    public int getNewListSize() {
        return this.newList.size();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final List<BaseMainObject> getOldList() {
        return this.oldList;
    }

    @Override // androidx.recyclerview.widget.i.b
    public int getOldListSize() {
        return this.oldList.size();
    }
}
