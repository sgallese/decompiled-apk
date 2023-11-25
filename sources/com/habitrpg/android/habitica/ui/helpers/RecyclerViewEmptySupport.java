package com.habitrpg.android.habitica.ui.helpers;

import android.content.Context;
import android.util.AttributeSet;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.habitrpg.common.habitica.helpers.EmptyItem;
import com.habitrpg.common.habitica.helpers.RecyclerViewState;
import com.habitrpg.common.habitica.helpers.RecyclerViewStateAdapter;
import dc.w;
import qc.h;
import qc.q;

/* compiled from: RecyclerViewEmptySupport.kt */
/* loaded from: classes4.dex */
public final class RecyclerViewEmptySupport extends RecyclerView {
    public static final int $stable = 8;
    private RecyclerView.h<?> actualAdapter;
    private final RecyclerViewStateAdapter emptyAdapter;
    private final RecyclerViewEmptySupport$observer$1 observer;
    private RecyclerViewState state;

    /* compiled from: RecyclerViewEmptySupport.kt */
    /* loaded from: classes4.dex */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[RecyclerViewState.values().length];
            try {
                iArr[RecyclerViewState.DISPLAYING_DATA.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Type inference failed for: r0v1, types: [android.util.AttributeSet, qc.h] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public RecyclerViewEmptySupport(android.content.Context r3) {
        /*
            r2 = this;
            java.lang.String r0 = "context"
            qc.q.i(r3, r0)
            r0 = 0
            r1 = 2
            r2.<init>(r3, r0, r1, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.habitrpg.android.habitica.ui.helpers.RecyclerViewEmptySupport.<init>(android.content.Context):void");
    }

    private final void updateAdapter(RecyclerView.h<?> hVar) {
        if (!q.d(getAdapter(), hVar)) {
            super.setAdapter(hVar);
        }
    }

    public static /* synthetic */ void updateState$Habitica_2311256681_prodRelease$default(RecyclerViewEmptySupport recyclerViewEmptySupport, boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = false;
        }
        recyclerViewEmptySupport.updateState$Habitica_2311256681_prodRelease(z10);
    }

    public final EmptyItem getEmptyItem() {
        return this.emptyAdapter.getEmptyItem();
    }

    public final pc.a<w> getOnRefresh() {
        return this.emptyAdapter.getOnRefresh();
    }

    public final RecyclerViewState getState() {
        return this.state;
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public void setAdapter(RecyclerView.h<?> hVar) {
        RecyclerView.h<?> hVar2 = this.actualAdapter;
        if (hVar2 != null) {
            hVar2.unregisterAdapterDataObserver(this.observer);
        }
        super.setAdapter(hVar);
        if (hVar != null) {
            hVar.registerAdapterDataObserver(this.observer);
        }
        this.actualAdapter = hVar;
        updateState$Habitica_2311256681_prodRelease(true);
    }

    public final void setEmptyItem(EmptyItem emptyItem) {
        this.emptyAdapter.setEmptyItem(emptyItem);
    }

    public final void setOnRefresh(pc.a<w> aVar) {
        this.emptyAdapter.setOnRefresh(aVar);
    }

    public final void setState(RecyclerViewState recyclerViewState) {
        q.i(recyclerViewState, AppMeasurementSdk.ConditionalUserProperty.VALUE);
        this.state = recyclerViewState;
        if (WhenMappings.$EnumSwitchMapping$0[recyclerViewState.ordinal()] == 1) {
            updateAdapter(this.actualAdapter);
            return;
        }
        updateAdapter(this.emptyAdapter);
        this.emptyAdapter.setState(recyclerViewState);
    }

    public final void updateState$Habitica_2311256681_prodRelease(boolean z10) {
        RecyclerViewState recyclerViewState;
        RecyclerView.h<?> hVar = this.actualAdapter;
        if (hVar != null && !z10) {
            boolean z11 = false;
            if (hVar != null && hVar.getItemCount() == 0) {
                z11 = true;
            }
            if (z11) {
                recyclerViewState = RecyclerViewState.EMPTY;
            } else {
                recyclerViewState = RecyclerViewState.DISPLAYING_DATA;
            }
        } else {
            recyclerViewState = RecyclerViewState.LOADING;
        }
        setState(recyclerViewState);
    }

    public /* synthetic */ RecyclerViewEmptySupport(Context context, AttributeSet attributeSet, int i10, h hVar) {
        this(context, (i10 & 2) != 0 ? null : attributeSet);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r3v3, types: [com.habitrpg.android.habitica.ui.helpers.RecyclerViewEmptySupport$observer$1] */
    public RecyclerViewEmptySupport(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        q.i(context, "context");
        this.state = RecyclerViewState.LOADING;
        this.emptyAdapter = new RecyclerViewStateAdapter(false, 1, null);
        this.observer = new RecyclerView.j() { // from class: com.habitrpg.android.habitica.ui.helpers.RecyclerViewEmptySupport$observer$1
            @Override // androidx.recyclerview.widget.RecyclerView.j
            public void onChanged() {
                RecyclerViewEmptySupport.updateState$Habitica_2311256681_prodRelease$default(RecyclerViewEmptySupport.this, false, 1, null);
            }

            @Override // androidx.recyclerview.widget.RecyclerView.j
            public void onItemRangeInserted(int i10, int i11) {
                RecyclerViewEmptySupport.updateState$Habitica_2311256681_prodRelease$default(RecyclerViewEmptySupport.this, false, 1, null);
            }

            @Override // androidx.recyclerview.widget.RecyclerView.j
            public void onItemRangeRemoved(int i10, int i11) {
                RecyclerViewEmptySupport.updateState$Habitica_2311256681_prodRelease$default(RecyclerViewEmptySupport.this, false, 1, null);
            }
        };
    }
}
