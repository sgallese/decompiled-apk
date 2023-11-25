package com.google.android.material.transformation;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewTreeObserver;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.view.p0;
import java.util.List;

@Deprecated
/* loaded from: classes3.dex */
public abstract class ExpandableBehavior extends CoordinatorLayout.c<View> {

    /* renamed from: a  reason: collision with root package name */
    private int f10669a;

    /* loaded from: classes3.dex */
    class a implements ViewTreeObserver.OnPreDrawListener {

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ View f10670f;

        /* renamed from: m  reason: collision with root package name */
        final /* synthetic */ int f10671m;

        /* renamed from: p  reason: collision with root package name */
        final /* synthetic */ h7.a f10672p;

        a(View view, int i10, h7.a aVar) {
            this.f10670f = view;
            this.f10671m = i10;
            this.f10672p = aVar;
        }

        @Override // android.view.ViewTreeObserver.OnPreDrawListener
        public boolean onPreDraw() {
            this.f10670f.getViewTreeObserver().removeOnPreDrawListener(this);
            if (ExpandableBehavior.this.f10669a == this.f10671m) {
                ExpandableBehavior expandableBehavior = ExpandableBehavior.this;
                h7.a aVar = this.f10672p;
                expandableBehavior.H((View) aVar, this.f10670f, aVar.a(), false);
            }
            return false;
        }
    }

    public ExpandableBehavior() {
        this.f10669a = 0;
    }

    private boolean F(boolean z10) {
        if (z10) {
            int i10 = this.f10669a;
            if (i10 != 0 && i10 != 2) {
                return false;
            }
            return true;
        } else if (this.f10669a != 1) {
            return false;
        } else {
            return true;
        }
    }

    protected h7.a G(CoordinatorLayout coordinatorLayout, View view) {
        List<View> l10 = coordinatorLayout.l(view);
        int size = l10.size();
        for (int i10 = 0; i10 < size; i10++) {
            View view2 = l10.get(i10);
            if (e(coordinatorLayout, view, view2)) {
                return (h7.a) view2;
            }
        }
        return null;
    }

    protected abstract boolean H(View view, View view2, boolean z10, boolean z11);

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public abstract boolean e(CoordinatorLayout coordinatorLayout, View view, View view2);

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean h(CoordinatorLayout coordinatorLayout, View view, View view2) {
        int i10;
        h7.a aVar = (h7.a) view2;
        if (F(aVar.a())) {
            if (aVar.a()) {
                i10 = 1;
            } else {
                i10 = 2;
            }
            this.f10669a = i10;
            return H((View) aVar, view, aVar.a(), true);
        }
        return false;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean l(CoordinatorLayout coordinatorLayout, View view, int i10) {
        h7.a G;
        int i11;
        if (!p0.Y(view) && (G = G(coordinatorLayout, view)) != null && F(G.a())) {
            if (G.a()) {
                i11 = 1;
            } else {
                i11 = 2;
            }
            this.f10669a = i11;
            view.getViewTreeObserver().addOnPreDrawListener(new a(view, i11, G));
            return false;
        }
        return false;
    }

    public ExpandableBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f10669a = 0;
    }
}
