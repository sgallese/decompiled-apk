package androidx.recyclerview.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.PointF;
import android.util.DisplayMetrics;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: PagerSnapHelper.java */
/* loaded from: classes.dex */
public class v extends z {

    /* renamed from: d  reason: collision with root package name */
    private u f6942d;

    /* renamed from: e  reason: collision with root package name */
    private u f6943e;

    /* compiled from: PagerSnapHelper.java */
    /* loaded from: classes.dex */
    class a extends q {
        a(Context context) {
            super(context);
        }

        @Override // androidx.recyclerview.widget.q, androidx.recyclerview.widget.RecyclerView.a0
        protected void o(View view, RecyclerView.b0 b0Var, RecyclerView.a0.a aVar) {
            v vVar = v.this;
            int[] c10 = vVar.c(vVar.f6949a.getLayoutManager(), view);
            int i10 = c10[0];
            int i11 = c10[1];
            int w10 = w(Math.max(Math.abs(i10), Math.abs(i11)));
            if (w10 > 0) {
                aVar.d(i10, i11, w10, this.f6924j);
            }
        }

        @Override // androidx.recyclerview.widget.q
        protected float v(DisplayMetrics displayMetrics) {
            return 100.0f / displayMetrics.densityDpi;
        }

        @Override // androidx.recyclerview.widget.q
        protected int x(int i10) {
            return Math.min(100, super.x(i10));
        }
    }

    private int k(View view, u uVar) {
        return (uVar.g(view) + (uVar.e(view) / 2)) - (uVar.m() + (uVar.n() / 2));
    }

    private View l(RecyclerView.p pVar, u uVar) {
        int V = pVar.V();
        View view = null;
        if (V == 0) {
            return null;
        }
        int m10 = uVar.m() + (uVar.n() / 2);
        int i10 = Integer.MAX_VALUE;
        for (int i11 = 0; i11 < V; i11++) {
            View U = pVar.U(i11);
            int abs = Math.abs((uVar.g(U) + (uVar.e(U) / 2)) - m10);
            if (abs < i10) {
                view = U;
                i10 = abs;
            }
        }
        return view;
    }

    private u m(RecyclerView.p pVar) {
        u uVar = this.f6943e;
        if (uVar == null || uVar.f6939a != pVar) {
            this.f6943e = u.a(pVar);
        }
        return this.f6943e;
    }

    private u n(RecyclerView.p pVar) {
        if (pVar.x()) {
            return o(pVar);
        }
        if (pVar.w()) {
            return m(pVar);
        }
        return null;
    }

    private u o(RecyclerView.p pVar) {
        u uVar = this.f6942d;
        if (uVar == null || uVar.f6939a != pVar) {
            this.f6942d = u.c(pVar);
        }
        return this.f6942d;
    }

    private boolean p(RecyclerView.p pVar, int i10, int i11) {
        if (pVar.w()) {
            if (i10 > 0) {
                return true;
            }
            return false;
        } else if (i11 > 0) {
            return true;
        } else {
            return false;
        }
    }

    private boolean q(RecyclerView.p pVar) {
        PointF b10;
        int k02 = pVar.k0();
        if (!(pVar instanceof RecyclerView.a0.b) || (b10 = ((RecyclerView.a0.b) pVar).b(k02 - 1)) == null) {
            return false;
        }
        if (b10.x >= 0.0f && b10.y >= 0.0f) {
            return false;
        }
        return true;
    }

    @Override // androidx.recyclerview.widget.z
    public int[] c(RecyclerView.p pVar, View view) {
        int[] iArr = new int[2];
        if (pVar.w()) {
            iArr[0] = k(view, m(pVar));
        } else {
            iArr[0] = 0;
        }
        if (pVar.x()) {
            iArr[1] = k(view, o(pVar));
        } else {
            iArr[1] = 0;
        }
        return iArr;
    }

    @Override // androidx.recyclerview.widget.z
    protected RecyclerView.a0 d(RecyclerView.p pVar) {
        if (!(pVar instanceof RecyclerView.a0.b)) {
            return null;
        }
        return new a(this.f6949a.getContext());
    }

    @Override // androidx.recyclerview.widget.z
    @SuppressLint({"UnknownNullness"})
    public View f(RecyclerView.p pVar) {
        if (pVar.x()) {
            return l(pVar, o(pVar));
        }
        if (pVar.w()) {
            return l(pVar, m(pVar));
        }
        return null;
    }

    @Override // androidx.recyclerview.widget.z
    @SuppressLint({"UnknownNullness"})
    public int g(RecyclerView.p pVar, int i10, int i11) {
        u n10;
        int i12;
        int k02 = pVar.k0();
        if (k02 == 0 || (n10 = n(pVar)) == null) {
            return -1;
        }
        int V = pVar.V();
        View view = null;
        View view2 = null;
        int i13 = RecyclerView.UNDEFINED_DURATION;
        int i14 = Integer.MAX_VALUE;
        for (int i15 = 0; i15 < V; i15++) {
            View U = pVar.U(i15);
            if (U != null) {
                int k10 = k(U, n10);
                if (k10 <= 0 && k10 > i13) {
                    view2 = U;
                    i13 = k10;
                }
                if (k10 >= 0 && k10 < i14) {
                    view = U;
                    i14 = k10;
                }
            }
        }
        boolean p10 = p(pVar, i10, i11);
        if (p10 && view != null) {
            return pVar.p0(view);
        }
        if (!p10 && view2 != null) {
            return pVar.p0(view2);
        }
        if (p10) {
            view = view2;
        }
        if (view == null) {
            return -1;
        }
        int p02 = pVar.p0(view);
        if (q(pVar) == p10) {
            i12 = -1;
        } else {
            i12 = 1;
        }
        int i16 = p02 + i12;
        if (i16 < 0 || i16 >= k02) {
            return -1;
        }
        return i16;
    }
}
