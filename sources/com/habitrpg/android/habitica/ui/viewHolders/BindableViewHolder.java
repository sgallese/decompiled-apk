package com.habitrpg.android.habitica.ui.viewHolders;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import qc.q;

/* compiled from: BindableViewHolder.kt */
/* loaded from: classes4.dex */
public abstract class BindableViewHolder<T> extends RecyclerView.f0 {
    public static final int $stable = 0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BindableViewHolder(View view) {
        super(view);
        q.i(view, "itemView");
    }

    public abstract void bind(T t10, int i10, String str);
}
