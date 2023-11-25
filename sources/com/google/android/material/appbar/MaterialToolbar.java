package com.google.android.material.appbar;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.Pair;
import android.view.Menu;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.p0;
import com.google.android.material.internal.q;

/* loaded from: classes3.dex */
public class MaterialToolbar extends Toolbar {

    /* renamed from: p0  reason: collision with root package name */
    private static final int f9469p0 = v6.k.H;

    /* renamed from: q0  reason: collision with root package name */
    private static final ImageView.ScaleType[] f9470q0 = {ImageView.ScaleType.MATRIX, ImageView.ScaleType.FIT_XY, ImageView.ScaleType.FIT_START, ImageView.ScaleType.FIT_CENTER, ImageView.ScaleType.FIT_END, ImageView.ScaleType.CENTER, ImageView.ScaleType.CENTER_CROP, ImageView.ScaleType.CENTER_INSIDE};

    /* renamed from: k0  reason: collision with root package name */
    private Integer f9471k0;

    /* renamed from: l0  reason: collision with root package name */
    private boolean f9472l0;

    /* renamed from: m0  reason: collision with root package name */
    private boolean f9473m0;

    /* renamed from: n0  reason: collision with root package name */
    private ImageView.ScaleType f9474n0;

    /* renamed from: o0  reason: collision with root package name */
    private Boolean f9475o0;

    public MaterialToolbar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, v6.b.f24639i0);
    }

    private Pair<Integer, Integer> S(TextView textView, TextView textView2) {
        int measuredWidth = getMeasuredWidth();
        int i10 = measuredWidth / 2;
        int paddingLeft = getPaddingLeft();
        int paddingRight = measuredWidth - getPaddingRight();
        for (int i11 = 0; i11 < getChildCount(); i11++) {
            View childAt = getChildAt(i11);
            if (childAt.getVisibility() != 8 && childAt != textView && childAt != textView2) {
                if (childAt.getRight() < i10 && childAt.getRight() > paddingLeft) {
                    paddingLeft = childAt.getRight();
                }
                if (childAt.getLeft() > i10 && childAt.getLeft() < paddingRight) {
                    paddingRight = childAt.getLeft();
                }
            }
        }
        return new Pair<>(Integer.valueOf(paddingLeft), Integer.valueOf(paddingRight));
    }

    private void T(Context context) {
        int i10;
        Drawable background = getBackground();
        if (background != null && !(background instanceof ColorDrawable)) {
            return;
        }
        p7.g gVar = new p7.g();
        if (background != null) {
            i10 = ((ColorDrawable) background).getColor();
        } else {
            i10 = 0;
        }
        gVar.b0(ColorStateList.valueOf(i10));
        gVar.Q(context);
        gVar.a0(p0.y(this));
        p0.y0(this, gVar);
    }

    private void U(View view, Pair<Integer, Integer> pair) {
        int measuredWidth = getMeasuredWidth();
        int measuredWidth2 = view.getMeasuredWidth();
        int i10 = (measuredWidth / 2) - (measuredWidth2 / 2);
        int i11 = measuredWidth2 + i10;
        int max = Math.max(Math.max(((Integer) pair.first).intValue() - i10, 0), Math.max(i11 - ((Integer) pair.second).intValue(), 0));
        if (max > 0) {
            i10 += max;
            i11 -= max;
            view.measure(View.MeasureSpec.makeMeasureSpec(i11 - i10, 1073741824), view.getMeasuredHeightAndState());
        }
        view.layout(i10, view.getTop(), i11, view.getBottom());
    }

    private void V() {
        if (!this.f9472l0 && !this.f9473m0) {
            return;
        }
        TextView f10 = q.f(this);
        TextView d10 = q.d(this);
        if (f10 == null && d10 == null) {
            return;
        }
        Pair<Integer, Integer> S = S(f10, d10);
        if (this.f9472l0 && f10 != null) {
            U(f10, S);
        }
        if (this.f9473m0 && d10 != null) {
            U(d10, S);
        }
    }

    private Drawable W(Drawable drawable) {
        if (drawable != null && this.f9471k0 != null) {
            Drawable r10 = androidx.core.graphics.drawable.a.r(drawable.mutate());
            androidx.core.graphics.drawable.a.n(r10, this.f9471k0.intValue());
            return r10;
        }
        return drawable;
    }

    private void X() {
        ImageView b10 = q.b(this);
        if (b10 != null) {
            Boolean bool = this.f9475o0;
            if (bool != null) {
                b10.setAdjustViewBounds(bool.booleanValue());
            }
            ImageView.ScaleType scaleType = this.f9474n0;
            if (scaleType != null) {
                b10.setScaleType(scaleType);
            }
        }
    }

    public ImageView.ScaleType getLogoScaleType() {
        return this.f9474n0;
    }

    public Integer getNavigationIconTint() {
        return this.f9471k0;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.appcompat.widget.Toolbar, android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        p7.h.e(this);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.appcompat.widget.Toolbar, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        V();
        X();
    }

    @Override // android.view.View
    public void setElevation(float f10) {
        super.setElevation(f10);
        p7.h.d(this, f10);
    }

    public void setLogoAdjustViewBounds(boolean z10) {
        Boolean bool = this.f9475o0;
        if (bool == null || bool.booleanValue() != z10) {
            this.f9475o0 = Boolean.valueOf(z10);
            requestLayout();
        }
    }

    public void setLogoScaleType(ImageView.ScaleType scaleType) {
        if (this.f9474n0 != scaleType) {
            this.f9474n0 = scaleType;
            requestLayout();
        }
    }

    @Override // androidx.appcompat.widget.Toolbar
    public void setNavigationIcon(Drawable drawable) {
        super.setNavigationIcon(W(drawable));
    }

    public void setNavigationIconTint(int i10) {
        this.f9471k0 = Integer.valueOf(i10);
        Drawable navigationIcon = getNavigationIcon();
        if (navigationIcon != null) {
            setNavigationIcon(navigationIcon);
        }
    }

    public void setSubtitleCentered(boolean z10) {
        if (this.f9473m0 != z10) {
            this.f9473m0 = z10;
            requestLayout();
        }
    }

    public void setTitleCentered(boolean z10) {
        if (this.f9472l0 != z10) {
            this.f9472l0 = z10;
            requestLayout();
        }
    }

    @Override // androidx.appcompat.widget.Toolbar
    public void x(int i10) {
        Menu menu = getMenu();
        boolean z10 = menu instanceof androidx.appcompat.view.menu.g;
        if (z10) {
            ((androidx.appcompat.view.menu.g) menu).d0();
        }
        super.x(i10);
        if (z10) {
            ((androidx.appcompat.view.menu.g) menu).c0();
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public MaterialToolbar(android.content.Context r8, android.util.AttributeSet r9, int r10) {
        /*
            r7 = this;
            int r4 = com.google.android.material.appbar.MaterialToolbar.f9469p0
            android.content.Context r8 = s7.a.c(r8, r9, r10, r4)
            r7.<init>(r8, r9, r10)
            android.content.Context r8 = r7.getContext()
            int[] r2 = v6.l.f24823a5
            r6 = 0
            int[] r5 = new int[r6]
            r0 = r8
            r1 = r9
            r3 = r10
            android.content.res.TypedArray r9 = com.google.android.material.internal.p.i(r0, r1, r2, r3, r4, r5)
            int r10 = v6.l.f24853d5
            boolean r0 = r9.hasValue(r10)
            r1 = -1
            if (r0 == 0) goto L29
            int r10 = r9.getColor(r10, r1)
            r7.setNavigationIconTint(r10)
        L29:
            int r10 = v6.l.f24873f5
            boolean r10 = r9.getBoolean(r10, r6)
            r7.f9472l0 = r10
            int r10 = v6.l.f24863e5
            boolean r10 = r9.getBoolean(r10, r6)
            r7.f9473m0 = r10
            int r10 = v6.l.f24843c5
            int r10 = r9.getInt(r10, r1)
            if (r10 < 0) goto L4a
            android.widget.ImageView$ScaleType[] r0 = com.google.android.material.appbar.MaterialToolbar.f9470q0
            int r1 = r0.length
            if (r10 >= r1) goto L4a
            r10 = r0[r10]
            r7.f9474n0 = r10
        L4a:
            int r10 = v6.l.f24833b5
            boolean r0 = r9.hasValue(r10)
            if (r0 == 0) goto L5c
            boolean r10 = r9.getBoolean(r10, r6)
            java.lang.Boolean r10 = java.lang.Boolean.valueOf(r10)
            r7.f9475o0 = r10
        L5c:
            r9.recycle()
            r7.T(r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.appbar.MaterialToolbar.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }
}
