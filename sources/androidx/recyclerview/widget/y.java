package androidx.recyclerview.widget;

import android.annotation.SuppressLint;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: SimpleItemAnimator.java */
/* loaded from: classes.dex */
public abstract class y extends RecyclerView.m {
    private static final boolean DEBUG = false;
    private static final String TAG = "SimpleItemAnimator";
    boolean mSupportsChangeAnimations = true;

    @SuppressLint({"UnknownNullness"})
    public abstract boolean animateAdd(RecyclerView.f0 f0Var);

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public boolean animateAppearance(RecyclerView.f0 f0Var, RecyclerView.m.c cVar, RecyclerView.m.c cVar2) {
        int i10;
        int i11;
        if (cVar != null && ((i10 = cVar.f6582a) != (i11 = cVar2.f6582a) || cVar.f6583b != cVar2.f6583b)) {
            return animateMove(f0Var, i10, cVar.f6583b, i11, cVar2.f6583b);
        }
        return animateAdd(f0Var);
    }

    @SuppressLint({"UnknownNullness"})
    public abstract boolean animateChange(RecyclerView.f0 f0Var, RecyclerView.f0 f0Var2, int i10, int i11, int i12, int i13);

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public boolean animateChange(RecyclerView.f0 f0Var, RecyclerView.f0 f0Var2, RecyclerView.m.c cVar, RecyclerView.m.c cVar2) {
        int i10;
        int i11;
        int i12 = cVar.f6582a;
        int i13 = cVar.f6583b;
        if (f0Var2.shouldIgnore()) {
            int i14 = cVar.f6582a;
            i11 = cVar.f6583b;
            i10 = i14;
        } else {
            i10 = cVar2.f6582a;
            i11 = cVar2.f6583b;
        }
        return animateChange(f0Var, f0Var2, i12, i13, i10, i11);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public boolean animateDisappearance(RecyclerView.f0 f0Var, RecyclerView.m.c cVar, RecyclerView.m.c cVar2) {
        int i10;
        int i11;
        int i12 = cVar.f6582a;
        int i13 = cVar.f6583b;
        View view = f0Var.itemView;
        if (cVar2 == null) {
            i10 = view.getLeft();
        } else {
            i10 = cVar2.f6582a;
        }
        int i14 = i10;
        if (cVar2 == null) {
            i11 = view.getTop();
        } else {
            i11 = cVar2.f6583b;
        }
        int i15 = i11;
        if (!f0Var.isRemoved() && (i12 != i14 || i13 != i15)) {
            view.layout(i14, i15, view.getWidth() + i14, view.getHeight() + i15);
            return animateMove(f0Var, i12, i13, i14, i15);
        }
        return animateRemove(f0Var);
    }

    @SuppressLint({"UnknownNullness"})
    public abstract boolean animateMove(RecyclerView.f0 f0Var, int i10, int i11, int i12, int i13);

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public boolean animatePersistence(RecyclerView.f0 f0Var, RecyclerView.m.c cVar, RecyclerView.m.c cVar2) {
        int i10 = cVar.f6582a;
        int i11 = cVar2.f6582a;
        if (i10 == i11 && cVar.f6583b == cVar2.f6583b) {
            dispatchMoveFinished(f0Var);
            return false;
        }
        return animateMove(f0Var, i10, cVar.f6583b, i11, cVar2.f6583b);
    }

    @SuppressLint({"UnknownNullness"})
    public abstract boolean animateRemove(RecyclerView.f0 f0Var);

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public boolean canReuseUpdatedViewHolder(RecyclerView.f0 f0Var) {
        if (this.mSupportsChangeAnimations && !f0Var.isInvalid()) {
            return false;
        }
        return true;
    }

    @SuppressLint({"UnknownNullness"})
    public final void dispatchAddFinished(RecyclerView.f0 f0Var) {
        onAddFinished(f0Var);
        dispatchAnimationFinished(f0Var);
    }

    @SuppressLint({"UnknownNullness"})
    public final void dispatchAddStarting(RecyclerView.f0 f0Var) {
        onAddStarting(f0Var);
    }

    @SuppressLint({"UnknownNullness"})
    public final void dispatchChangeFinished(RecyclerView.f0 f0Var, boolean z10) {
        onChangeFinished(f0Var, z10);
        dispatchAnimationFinished(f0Var);
    }

    @SuppressLint({"UnknownNullness"})
    public final void dispatchChangeStarting(RecyclerView.f0 f0Var, boolean z10) {
        onChangeStarting(f0Var, z10);
    }

    @SuppressLint({"UnknownNullness"})
    public final void dispatchMoveFinished(RecyclerView.f0 f0Var) {
        onMoveFinished(f0Var);
        dispatchAnimationFinished(f0Var);
    }

    @SuppressLint({"UnknownNullness"})
    public final void dispatchMoveStarting(RecyclerView.f0 f0Var) {
        onMoveStarting(f0Var);
    }

    @SuppressLint({"UnknownNullness"})
    public final void dispatchRemoveFinished(RecyclerView.f0 f0Var) {
        onRemoveFinished(f0Var);
        dispatchAnimationFinished(f0Var);
    }

    @SuppressLint({"UnknownNullness"})
    public final void dispatchRemoveStarting(RecyclerView.f0 f0Var) {
        onRemoveStarting(f0Var);
    }

    public boolean getSupportsChangeAnimations() {
        return this.mSupportsChangeAnimations;
    }

    public void setSupportsChangeAnimations(boolean z10) {
        this.mSupportsChangeAnimations = z10;
    }

    @SuppressLint({"UnknownNullness"})
    public void onAddFinished(RecyclerView.f0 f0Var) {
    }

    @SuppressLint({"UnknownNullness"})
    public void onAddStarting(RecyclerView.f0 f0Var) {
    }

    @SuppressLint({"UnknownNullness"})
    public void onMoveFinished(RecyclerView.f0 f0Var) {
    }

    @SuppressLint({"UnknownNullness"})
    public void onMoveStarting(RecyclerView.f0 f0Var) {
    }

    @SuppressLint({"UnknownNullness"})
    public void onRemoveFinished(RecyclerView.f0 f0Var) {
    }

    @SuppressLint({"UnknownNullness"})
    public void onRemoveStarting(RecyclerView.f0 f0Var) {
    }

    @SuppressLint({"UnknownNullness"})
    public void onChangeFinished(RecyclerView.f0 f0Var, boolean z10) {
    }

    @SuppressLint({"UnknownNullness"})
    public void onChangeStarting(RecyclerView.f0 f0Var, boolean z10) {
    }
}
