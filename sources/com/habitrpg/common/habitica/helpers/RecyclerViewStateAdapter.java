package com.habitrpg.common.habitica.helpers;

import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AlphaAnimation;
import android.widget.ProgressBar;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.habitrpg.android.habitica.extensions.ViewGroupExt;
import com.habitrpg.common.habitica.R;
import dc.w;
import qc.q;

/* compiled from: RecyclerViewEmptySupport.kt */
/* loaded from: classes4.dex */
public final class RecyclerViewStateAdapter extends RecyclerView.h<RecyclerView.f0> {
    private EmptyItem emptyItem;
    private pc.a<? extends View> emptyViewBuilder;
    private pc.a<w> onRefresh;
    private final boolean showLoadingAsEmpty;
    private RecyclerViewState state;

    public RecyclerViewStateAdapter() {
        this(false, 1, null);
    }

    public final EmptyItem getEmptyItem() {
        return this.emptyItem;
    }

    public final pc.a<View> getEmptyViewBuilder() {
        return this.emptyViewBuilder;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public int getItemCount() {
        return 1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public int getItemViewType(int i10) {
        RecyclerViewState recyclerViewState = this.state;
        if (recyclerViewState == RecyclerViewState.LOADING && !this.showLoadingAsEmpty) {
            return 0;
        }
        if (recyclerViewState == RecyclerViewState.FAILED) {
            return 1;
        }
        return 2;
    }

    public final pc.a<w> getOnRefresh() {
        return this.onRefresh;
    }

    public final boolean getShowLoadingAsEmpty() {
        return this.showLoadingAsEmpty;
    }

    public final RecyclerViewState getState() {
        return this.state;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public void onBindViewHolder(RecyclerView.f0 f0Var, int i10) {
        EmptyViewHolder emptyViewHolder;
        q.i(f0Var, "holder");
        boolean z10 = f0Var instanceof EmptyViewHolder;
        if (z10) {
            ((EmptyViewHolder) f0Var).bind(this.emptyItem);
        } else if (f0Var instanceof FailedViewHolder) {
            ((FailedViewHolder) f0Var).bind(this.onRefresh);
        }
        if (z10) {
            emptyViewHolder = (EmptyViewHolder) f0Var;
        } else {
            emptyViewHolder = null;
        }
        if (emptyViewHolder != null) {
            emptyViewHolder.bind(this.emptyItem);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public RecyclerView.f0 onCreateViewHolder(ViewGroup viewGroup, int i10) {
        View view;
        q.i(viewGroup, "parent");
        if (i10 != 0) {
            if (i10 != 1) {
                if (this.emptyViewBuilder != null) {
                    pc.a<? extends View> aVar = this.emptyViewBuilder;
                    if (aVar == null || (view = aVar.invoke()) == null) {
                        view = new View(viewGroup.getContext());
                    }
                    return new HolderViewHolder(view);
                }
                return new EmptyViewHolder(ViewGroupExt.inflate$default(viewGroup, R.layout.empty_item, false, 2, null));
            }
            return new FailedViewHolder(ViewGroupExt.inflate$default(viewGroup, R.layout.failed_item, false, 2, null));
        }
        final View inflate$default = ViewGroupExt.inflate$default(viewGroup, R.layout.loading_item, false, 2, null);
        AlphaAnimation alphaAnimation = new AlphaAnimation(0.0f, 1.0f);
        alphaAnimation.setDuration(300L);
        alphaAnimation.setStartOffset(500L);
        alphaAnimation.setFillAfter(true);
        ((ProgressBar) inflate$default.findViewById(R.id.loading_indicator)).startAnimation(alphaAnimation);
        return new RecyclerView.f0(inflate$default) { // from class: com.habitrpg.common.habitica.helpers.RecyclerViewStateAdapter$onCreateViewHolder$1
        };
    }

    public final void setEmptyItem(EmptyItem emptyItem) {
        this.emptyItem = emptyItem;
        notifyItemChanged(0);
    }

    public final void setEmptyViewBuilder(pc.a<? extends View> aVar) {
        this.emptyViewBuilder = aVar;
    }

    public final void setOnRefresh(pc.a<w> aVar) {
        this.onRefresh = aVar;
    }

    public final void setState(RecyclerViewState recyclerViewState) {
        q.i(recyclerViewState, AppMeasurementSdk.ConditionalUserProperty.VALUE);
        this.state = recyclerViewState;
        notifyItemChanged(0);
    }

    public RecyclerViewStateAdapter(boolean z10) {
        this.showLoadingAsEmpty = z10;
        this.state = RecyclerViewState.LOADING;
    }

    public /* synthetic */ RecyclerViewStateAdapter(boolean z10, int i10, qc.h hVar) {
        this((i10 & 1) != 0 ? false : z10);
    }
}
