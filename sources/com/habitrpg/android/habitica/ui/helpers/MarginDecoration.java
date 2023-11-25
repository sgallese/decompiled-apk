package com.habitrpg.android.habitica.ui.helpers;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.habitrpg.android.habitica.R;
import ec.b0;
import ec.u0;
import java.util.Set;
import qc.h;
import qc.q;

/* compiled from: MarginDecoration.kt */
/* loaded from: classes4.dex */
public final class MarginDecoration extends RecyclerView.o {
    public static final int $stable = 8;
    private final int margin;
    private Set<Integer> noMarginViewTypes;

    public MarginDecoration(Context context, Set<Integer> set) {
        Resources resources;
        q.i(set, "noMarginViewTypes");
        this.noMarginViewTypes = set;
        this.margin = (context == null || (resources = context.getResources()) == null) ? 0 : resources.getDimensionPixelSize(R.dimen.grid_item_margin);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.b0 b0Var) {
        Integer num;
        boolean T;
        q.i(rect, "outRect");
        q.i(view, "view");
        q.i(recyclerView, "parent");
        q.i(b0Var, "state");
        int childAdapterPosition = recyclerView.getChildAdapterPosition(view);
        RecyclerView.h adapter = recyclerView.getAdapter();
        if (adapter != null) {
            num = Integer.valueOf(adapter.getItemViewType(childAdapterPosition));
        } else {
            num = null;
        }
        T = b0.T(this.noMarginViewTypes, num);
        if (T) {
            rect.setEmpty();
            return;
        }
        int i10 = this.margin;
        rect.set(i10, i10, i10, i10);
    }

    public /* synthetic */ MarginDecoration(Context context, Set set, int i10, h hVar) {
        this(context, (i10 & 2) != 0 ? u0.b() : set);
    }
}
