package com.habitrpg.android.habitica.ui.adapter;

import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView.f0;
import androidx.recyclerview.widget.i;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.habitrpg.android.habitica.models.BaseMainObject;
import ec.t;
import java.util.List;
import qc.q;

/* compiled from: BaseRecyclerViewAdapter.kt */
/* loaded from: classes4.dex */
public abstract class BaseRecyclerViewAdapter<T extends BaseMainObject, VH extends RecyclerView.f0> extends RecyclerView.h<VH> {
    public static final int $stable = 8;
    private List<? extends T> data;

    public BaseRecyclerViewAdapter() {
        List<? extends T> i10;
        i10 = t.i();
        this.data = i10;
    }

    public final List<T> getData() {
        return (List<? extends T>) this.data;
    }

    public DiffCallback<T> getDiffCallback(List<? extends T> list, List<? extends T> list2) {
        q.i(list, "oldList");
        q.i(list2, "newList");
        return null;
    }

    public T getItem(int i10) {
        if (i10 >= 0 && this.data.size() > i10) {
            return this.data.get(i10);
        }
        return null;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public int getItemCount() {
        return this.data.size();
    }

    public final void setData(List<? extends T> list) {
        q.i(list, AppMeasurementSdk.ConditionalUserProperty.VALUE);
        DiffCallback<T> diffCallback = getDiffCallback(this.data, list);
        this.data = list;
        if (diffCallback != null) {
            i.e b10 = i.b(diffCallback);
            q.h(b10, "calculateDiff(...)");
            b10.d(this);
            return;
        }
        notifyDataSetChanged();
    }
}
