package com.viewpagerindicator;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.LinearLayout;

/* compiled from: IcsLinearLayout.java */
/* loaded from: classes4.dex */
class a extends LinearLayout {

    /* renamed from: s  reason: collision with root package name */
    private static final int[] f12948s = {16843049, 16843561, 16843562};

    /* renamed from: f  reason: collision with root package name */
    private Drawable f12949f;

    /* renamed from: m  reason: collision with root package name */
    private int f12950m;

    /* renamed from: p  reason: collision with root package name */
    private int f12951p;

    /* renamed from: q  reason: collision with root package name */
    private int f12952q;

    /* renamed from: r  reason: collision with root package name */
    private int f12953r;

    public a(Context context, int i10) {
        super(context);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(null, f12948s, i10, 0);
        setDividerDrawable(obtainStyledAttributes.getDrawable(0));
        this.f12953r = obtainStyledAttributes.getDimensionPixelSize(2, 0);
        this.f12952q = obtainStyledAttributes.getInteger(1, 0);
        obtainStyledAttributes.recycle();
    }

    private void a(Canvas canvas) {
        int right;
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            if (childAt != null && childAt.getVisibility() != 8 && e(i10)) {
                d(canvas, childAt.getLeft() - ((LinearLayout.LayoutParams) childAt.getLayoutParams()).leftMargin);
            }
        }
        if (e(childCount)) {
            View childAt2 = getChildAt(childCount - 1);
            if (childAt2 == null) {
                right = (getWidth() - getPaddingRight()) - this.f12950m;
            } else {
                right = childAt2.getRight();
            }
            d(canvas, right);
        }
    }

    private void b(Canvas canvas) {
        int bottom;
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            if (childAt != null && childAt.getVisibility() != 8 && e(i10)) {
                c(canvas, childAt.getTop() - ((LinearLayout.LayoutParams) childAt.getLayoutParams()).topMargin);
            }
        }
        if (e(childCount)) {
            View childAt2 = getChildAt(childCount - 1);
            if (childAt2 == null) {
                bottom = (getHeight() - getPaddingBottom()) - this.f12951p;
            } else {
                bottom = childAt2.getBottom();
            }
            c(canvas, bottom);
        }
    }

    private void c(Canvas canvas, int i10) {
        this.f12949f.setBounds(getPaddingLeft() + this.f12953r, i10, (getWidth() - getPaddingRight()) - this.f12953r, this.f12951p + i10);
        this.f12949f.draw(canvas);
    }

    private void d(Canvas canvas, int i10) {
        this.f12949f.setBounds(i10, getPaddingTop() + this.f12953r, this.f12950m + i10, (getHeight() - getPaddingBottom()) - this.f12953r);
        this.f12949f.draw(canvas);
    }

    private boolean e(int i10) {
        if (i10 == 0 || i10 == getChildCount() || (this.f12952q & 2) == 0) {
            return false;
        }
        for (int i11 = i10 - 1; i11 >= 0; i11--) {
            if (getChildAt(i11).getVisibility() != 8) {
                return true;
            }
        }
        return false;
    }

    @Override // android.view.ViewGroup
    protected void measureChildWithMargins(View view, int i10, int i11, int i12, int i13) {
        int indexOfChild = indexOfChild(view);
        int orientation = getOrientation();
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) view.getLayoutParams();
        if (e(indexOfChild)) {
            if (orientation == 1) {
                layoutParams.topMargin = this.f12951p;
            } else {
                layoutParams.leftMargin = this.f12950m;
            }
        }
        int childCount = getChildCount();
        if (indexOfChild == childCount - 1 && e(childCount)) {
            if (orientation == 1) {
                layoutParams.bottomMargin = this.f12951p;
            } else {
                layoutParams.rightMargin = this.f12950m;
            }
        }
        super.measureChildWithMargins(view, i10, i11, i12, i13);
    }

    @Override // android.widget.LinearLayout, android.view.View
    protected void onDraw(Canvas canvas) {
        if (this.f12949f != null) {
            if (getOrientation() == 1) {
                b(canvas);
            } else {
                a(canvas);
            }
        }
        super.onDraw(canvas);
    }

    @Override // android.widget.LinearLayout
    public void setDividerDrawable(Drawable drawable) {
        if (drawable == this.f12949f) {
            return;
        }
        this.f12949f = drawable;
        boolean z10 = false;
        if (drawable != null) {
            this.f12950m = drawable.getIntrinsicWidth();
            this.f12951p = drawable.getIntrinsicHeight();
        } else {
            this.f12950m = 0;
            this.f12951p = 0;
        }
        if (drawable == null) {
            z10 = true;
        }
        setWillNotDraw(z10);
        requestLayout();
    }
}
