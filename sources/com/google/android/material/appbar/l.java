package com.google.android.material.appbar;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.view.p;
import androidx.core.view.p0;
import androidx.core.view.p1;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: HeaderScrollingViewBehavior.java */
/* loaded from: classes3.dex */
public abstract class l extends m<View> {

    /* renamed from: d  reason: collision with root package name */
    final Rect f9496d;

    /* renamed from: e  reason: collision with root package name */
    final Rect f9497e;

    /* renamed from: f  reason: collision with root package name */
    private int f9498f;

    /* renamed from: g  reason: collision with root package name */
    private int f9499g;

    public l() {
        this.f9496d = new Rect();
        this.f9497e = new Rect();
        this.f9498f = 0;
    }

    private static int N(int i10) {
        if (i10 == 0) {
            return 8388659;
        }
        return i10;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.material.appbar.m
    public void F(CoordinatorLayout coordinatorLayout, View view, int i10) {
        View H = H(coordinatorLayout.l(view));
        if (H != null) {
            CoordinatorLayout.f fVar = (CoordinatorLayout.f) view.getLayoutParams();
            Rect rect = this.f9496d;
            rect.set(coordinatorLayout.getPaddingLeft() + ((ViewGroup.MarginLayoutParams) fVar).leftMargin, H.getBottom() + ((ViewGroup.MarginLayoutParams) fVar).topMargin, (coordinatorLayout.getWidth() - coordinatorLayout.getPaddingRight()) - ((ViewGroup.MarginLayoutParams) fVar).rightMargin, ((coordinatorLayout.getHeight() + H.getBottom()) - coordinatorLayout.getPaddingBottom()) - ((ViewGroup.MarginLayoutParams) fVar).bottomMargin);
            p1 lastWindowInsets = coordinatorLayout.getLastWindowInsets();
            if (lastWindowInsets != null && p0.B(coordinatorLayout) && !p0.B(view)) {
                rect.left += lastWindowInsets.j();
                rect.right -= lastWindowInsets.k();
            }
            Rect rect2 = this.f9497e;
            p.a(N(fVar.f3594c), view.getMeasuredWidth(), view.getMeasuredHeight(), rect, rect2, i10);
            int I = I(H);
            view.layout(rect2.left, rect2.top - I, rect2.right, rect2.bottom - I);
            this.f9498f = rect2.top - H.getBottom();
            return;
        }
        super.F(coordinatorLayout, view, i10);
        this.f9498f = 0;
    }

    abstract View H(List<View> list);

    /* JADX INFO: Access modifiers changed from: package-private */
    public final int I(View view) {
        if (this.f9499g == 0) {
            return 0;
        }
        float J = J(view);
        int i10 = this.f9499g;
        return t2.a.b((int) (J * i10), 0, i10);
    }

    float J(View view) {
        return 1.0f;
    }

    public final int K() {
        return this.f9499g;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int L(View view) {
        return view.getMeasuredHeight();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final int M() {
        return this.f9498f;
    }

    public final void O(int i10) {
        this.f9499g = i10;
    }

    protected boolean P() {
        return false;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean m(CoordinatorLayout coordinatorLayout, View view, int i10, int i11, int i12, int i13) {
        View H;
        int i14;
        p1 lastWindowInsets;
        int i15 = view.getLayoutParams().height;
        if ((i15 == -1 || i15 == -2) && (H = H(coordinatorLayout.l(view))) != null) {
            int size = View.MeasureSpec.getSize(i12);
            if (size > 0) {
                if (p0.B(H) && (lastWindowInsets = coordinatorLayout.getLastWindowInsets()) != null) {
                    size += lastWindowInsets.l() + lastWindowInsets.i();
                }
            } else {
                size = coordinatorLayout.getHeight();
            }
            int L = size + L(H);
            int measuredHeight = H.getMeasuredHeight();
            if (P()) {
                view.setTranslationY(-measuredHeight);
            } else {
                view.setTranslationY(0.0f);
                L -= measuredHeight;
            }
            if (i15 == -1) {
                i14 = 1073741824;
            } else {
                i14 = RecyclerView.UNDEFINED_DURATION;
            }
            coordinatorLayout.D(view, i10, i11, View.MeasureSpec.makeMeasureSpec(L, i14), i13);
            return true;
        }
        return false;
    }

    public l(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f9496d = new Rect();
        this.f9497e = new Rect();
        this.f9498f = 0;
    }
}
