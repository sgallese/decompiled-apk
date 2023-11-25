package androidx.recyclerview.widget;

import android.annotation.SuppressLint;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import android.widget.Scroller;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: SnapHelper.java */
/* loaded from: classes.dex */
public abstract class z extends RecyclerView.s {

    /* renamed from: a  reason: collision with root package name */
    RecyclerView f6949a;

    /* renamed from: b  reason: collision with root package name */
    private Scroller f6950b;

    /* renamed from: c  reason: collision with root package name */
    private final RecyclerView.u f6951c = new a();

    /* compiled from: SnapHelper.java */
    /* loaded from: classes.dex */
    class a extends RecyclerView.u {

        /* renamed from: a  reason: collision with root package name */
        boolean f6952a = false;

        a() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.u
        public void onScrollStateChanged(RecyclerView recyclerView, int i10) {
            super.onScrollStateChanged(recyclerView, i10);
            if (i10 == 0 && this.f6952a) {
                this.f6952a = false;
                z.this.j();
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.u
        public void onScrolled(RecyclerView recyclerView, int i10, int i11) {
            if (i10 != 0 || i11 != 0) {
                this.f6952a = true;
            }
        }
    }

    private void e() {
        this.f6949a.removeOnScrollListener(this.f6951c);
        this.f6949a.setOnFlingListener(null);
    }

    private void h() throws IllegalStateException {
        if (this.f6949a.getOnFlingListener() == null) {
            this.f6949a.addOnScrollListener(this.f6951c);
            this.f6949a.setOnFlingListener(this);
            return;
        }
        throw new IllegalStateException("An instance of OnFlingListener already set.");
    }

    private boolean i(RecyclerView.p pVar, int i10, int i11) {
        RecyclerView.a0 d10;
        int g10;
        if (!(pVar instanceof RecyclerView.a0.b) || (d10 = d(pVar)) == null || (g10 = g(pVar, i10, i11)) == -1) {
            return false;
        }
        d10.p(g10);
        pVar.T1(d10);
        return true;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.s
    public boolean a(int i10, int i11) {
        RecyclerView.p layoutManager = this.f6949a.getLayoutManager();
        if (layoutManager == null || this.f6949a.getAdapter() == null) {
            return false;
        }
        int minFlingVelocity = this.f6949a.getMinFlingVelocity();
        if ((Math.abs(i11) <= minFlingVelocity && Math.abs(i10) <= minFlingVelocity) || !i(layoutManager, i10, i11)) {
            return false;
        }
        return true;
    }

    public void b(RecyclerView recyclerView) throws IllegalStateException {
        RecyclerView recyclerView2 = this.f6949a;
        if (recyclerView2 == recyclerView) {
            return;
        }
        if (recyclerView2 != null) {
            e();
        }
        this.f6949a = recyclerView;
        if (recyclerView != null) {
            h();
            this.f6950b = new Scroller(this.f6949a.getContext(), new DecelerateInterpolator());
            j();
        }
    }

    public abstract int[] c(RecyclerView.p pVar, View view);

    protected abstract RecyclerView.a0 d(RecyclerView.p pVar);

    @SuppressLint({"UnknownNullness"})
    public abstract View f(RecyclerView.p pVar);

    @SuppressLint({"UnknownNullness"})
    public abstract int g(RecyclerView.p pVar, int i10, int i11);

    void j() {
        RecyclerView.p layoutManager;
        View f10;
        RecyclerView recyclerView = this.f6949a;
        if (recyclerView == null || (layoutManager = recyclerView.getLayoutManager()) == null || (f10 = f(layoutManager)) == null) {
            return;
        }
        int[] c10 = c(layoutManager, f10);
        int i10 = c10[0];
        if (i10 != 0 || c10[1] != 0) {
            this.f6949a.smoothScrollBy(i10, c10[1]);
        }
    }
}
