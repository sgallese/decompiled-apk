package com.google.android.material.internal;

import android.view.View;
import android.view.ViewGroup;
import androidx.core.view.p0;

/* compiled from: FlowLayout.java */
/* loaded from: classes3.dex */
public class g extends ViewGroup {

    /* renamed from: f  reason: collision with root package name */
    private int f10144f;

    /* renamed from: m  reason: collision with root package name */
    private int f10145m;

    /* renamed from: p  reason: collision with root package name */
    private boolean f10146p;

    /* renamed from: q  reason: collision with root package name */
    private int f10147q;

    private static int a(int i10, int i11, int i12) {
        if (i11 != Integer.MIN_VALUE) {
            if (i11 != 1073741824) {
                return i12;
            }
            return i10;
        }
        return Math.min(i12, i10);
    }

    public int b(View view) {
        Object tag = view.getTag(v6.f.K);
        if (!(tag instanceof Integer)) {
            return -1;
        }
        return ((Integer) tag).intValue();
    }

    public boolean c() {
        return this.f10146p;
    }

    protected int getItemSpacing() {
        return this.f10145m;
    }

    protected int getLineSpacing() {
        return this.f10144f;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public int getRowCount() {
        return this.f10147q;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        boolean z11;
        int paddingLeft;
        int paddingRight;
        int i14;
        int i15;
        if (getChildCount() == 0) {
            this.f10147q = 0;
            return;
        }
        this.f10147q = 1;
        if (p0.E(this) == 1) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (z11) {
            paddingLeft = getPaddingRight();
        } else {
            paddingLeft = getPaddingLeft();
        }
        if (z11) {
            paddingRight = getPaddingLeft();
        } else {
            paddingRight = getPaddingRight();
        }
        int paddingTop = getPaddingTop();
        int i16 = (i12 - i10) - paddingRight;
        int i17 = paddingLeft;
        int i18 = paddingTop;
        for (int i19 = 0; i19 < getChildCount(); i19++) {
            View childAt = getChildAt(i19);
            if (childAt.getVisibility() == 8) {
                childAt.setTag(v6.f.K, -1);
            } else {
                ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
                if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                    i15 = androidx.core.view.s.b(marginLayoutParams);
                    i14 = androidx.core.view.s.a(marginLayoutParams);
                } else {
                    i14 = 0;
                    i15 = 0;
                }
                int measuredWidth = i17 + i15 + childAt.getMeasuredWidth();
                if (!this.f10146p && measuredWidth > i16) {
                    i18 = this.f10144f + paddingTop;
                    this.f10147q++;
                    i17 = paddingLeft;
                }
                childAt.setTag(v6.f.K, Integer.valueOf(this.f10147q - 1));
                int i20 = i17 + i15;
                int measuredWidth2 = childAt.getMeasuredWidth() + i20;
                int measuredHeight = childAt.getMeasuredHeight() + i18;
                if (z11) {
                    childAt.layout(i16 - measuredWidth2, i18, (i16 - i17) - i15, measuredHeight);
                } else {
                    childAt.layout(i20, i18, measuredWidth2, measuredHeight);
                }
                i17 += i15 + i14 + childAt.getMeasuredWidth() + this.f10145m;
                paddingTop = measuredHeight;
            }
        }
    }

    @Override // android.view.View
    protected void onMeasure(int i10, int i11) {
        int i12;
        int i13;
        int i14;
        int i15;
        int size = View.MeasureSpec.getSize(i10);
        int mode = View.MeasureSpec.getMode(i10);
        int size2 = View.MeasureSpec.getSize(i11);
        int mode2 = View.MeasureSpec.getMode(i11);
        if (mode != Integer.MIN_VALUE && mode != 1073741824) {
            i12 = Integer.MAX_VALUE;
        } else {
            i12 = size;
        }
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        int paddingRight = i12 - getPaddingRight();
        int i16 = paddingTop;
        int i17 = 0;
        for (int i18 = 0; i18 < getChildCount(); i18++) {
            View childAt = getChildAt(i18);
            if (childAt.getVisibility() != 8) {
                measureChild(childAt, i10, i11);
                ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
                if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                    i13 = marginLayoutParams.leftMargin + 0;
                    i14 = marginLayoutParams.rightMargin + 0;
                } else {
                    i13 = 0;
                    i14 = 0;
                }
                int i19 = paddingLeft;
                if (paddingLeft + i13 + childAt.getMeasuredWidth() > paddingRight && !c()) {
                    i15 = getPaddingLeft();
                    i16 = this.f10144f + paddingTop;
                } else {
                    i15 = i19;
                }
                int measuredWidth = i15 + i13 + childAt.getMeasuredWidth();
                int measuredHeight = i16 + childAt.getMeasuredHeight();
                if (measuredWidth > i17) {
                    i17 = measuredWidth;
                }
                paddingLeft = i15 + i13 + i14 + childAt.getMeasuredWidth() + this.f10145m;
                if (i18 == getChildCount() - 1) {
                    i17 += i14;
                }
                paddingTop = measuredHeight;
            }
        }
        setMeasuredDimension(a(size, mode, i17 + getPaddingRight()), a(size2, mode2, paddingTop + getPaddingBottom()));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void setItemSpacing(int i10) {
        this.f10145m = i10;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void setLineSpacing(int i10) {
        this.f10144f = i10;
    }

    public void setSingleLine(boolean z10) {
        this.f10146p = z10;
    }
}
