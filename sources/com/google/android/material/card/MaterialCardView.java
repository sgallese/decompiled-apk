package com.google.android.material.card;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Checkable;
import p7.h;
import p7.n;
import v6.k;

/* loaded from: classes3.dex */
public class MaterialCardView extends q.a implements Checkable, n {
    private static final int[] A = {16842911};
    private static final int[] B = {16842912};
    private static final int[] C = {v6.b.W};
    private static final int D = k.f24812v;

    /* renamed from: w  reason: collision with root package name */
    private final c f9749w;

    /* renamed from: x  reason: collision with root package name */
    private boolean f9750x;

    /* renamed from: y  reason: collision with root package name */
    private boolean f9751y;

    /* renamed from: z  reason: collision with root package name */
    private boolean f9752z;

    /* loaded from: classes3.dex */
    public interface a {
    }

    public MaterialCardView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, v6.b.B);
    }

    private void f() {
        if (Build.VERSION.SDK_INT > 26) {
            this.f9749w.k();
        }
    }

    private RectF getBoundsAsRectF() {
        RectF rectF = new RectF();
        rectF.set(this.f9749w.l().getBounds());
        return rectF;
    }

    public boolean g() {
        c cVar = this.f9749w;
        if (cVar != null && cVar.F()) {
            return true;
        }
        return false;
    }

    @Override // q.a
    public ColorStateList getCardBackgroundColor() {
        return this.f9749w.m();
    }

    public ColorStateList getCardForegroundColor() {
        return this.f9749w.n();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public float getCardViewRadius() {
        return super.getRadius();
    }

    public Drawable getCheckedIcon() {
        return this.f9749w.o();
    }

    public int getCheckedIconGravity() {
        return this.f9749w.p();
    }

    public int getCheckedIconMargin() {
        return this.f9749w.q();
    }

    public int getCheckedIconSize() {
        return this.f9749w.r();
    }

    public ColorStateList getCheckedIconTint() {
        return this.f9749w.s();
    }

    @Override // q.a
    public int getContentPaddingBottom() {
        return this.f9749w.C().bottom;
    }

    @Override // q.a
    public int getContentPaddingLeft() {
        return this.f9749w.C().left;
    }

    @Override // q.a
    public int getContentPaddingRight() {
        return this.f9749w.C().right;
    }

    @Override // q.a
    public int getContentPaddingTop() {
        return this.f9749w.C().top;
    }

    public float getProgress() {
        return this.f9749w.w();
    }

    @Override // q.a
    public float getRadius() {
        return this.f9749w.u();
    }

    public ColorStateList getRippleColor() {
        return this.f9749w.x();
    }

    public p7.k getShapeAppearanceModel() {
        return this.f9749w.y();
    }

    @Deprecated
    public int getStrokeColor() {
        return this.f9749w.z();
    }

    public ColorStateList getStrokeColorStateList() {
        return this.f9749w.A();
    }

    public int getStrokeWidth() {
        return this.f9749w.B();
    }

    public boolean h() {
        return this.f9752z;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void i(int i10, int i11, int i12, int i13) {
        super.d(i10, i11, i12, i13);
    }

    @Override // android.widget.Checkable
    public boolean isChecked() {
        return this.f9751y;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        h.f(this, this.f9749w.l());
    }

    @Override // android.view.ViewGroup, android.view.View
    protected int[] onCreateDrawableState(int i10) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i10 + 3);
        if (g()) {
            View.mergeDrawableStates(onCreateDrawableState, A);
        }
        if (isChecked()) {
            View.mergeDrawableStates(onCreateDrawableState, B);
        }
        if (h()) {
            View.mergeDrawableStates(onCreateDrawableState, C);
        }
        return onCreateDrawableState;
    }

    @Override // android.view.View
    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName("androidx.cardview.widget.CardView");
        accessibilityEvent.setChecked(isChecked());
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("androidx.cardview.widget.CardView");
        accessibilityNodeInfo.setCheckable(g());
        accessibilityNodeInfo.setClickable(isClickable());
        accessibilityNodeInfo.setChecked(isChecked());
    }

    @Override // q.a, android.widget.FrameLayout, android.view.View
    protected void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        this.f9749w.K(getMeasuredWidth(), getMeasuredHeight());
    }

    @Override // android.view.View
    public void setBackground(Drawable drawable) {
        setBackgroundDrawable(drawable);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        if (this.f9750x) {
            if (!this.f9749w.E()) {
                Log.i("MaterialCardView", "Setting a custom background is not supported.");
                this.f9749w.L(true);
            }
            super.setBackgroundDrawable(drawable);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void setBackgroundInternal(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
    }

    @Override // q.a
    public void setCardBackgroundColor(int i10) {
        this.f9749w.M(ColorStateList.valueOf(i10));
    }

    @Override // q.a
    public void setCardElevation(float f10) {
        super.setCardElevation(f10);
        this.f9749w.h0();
    }

    public void setCardForegroundColor(ColorStateList colorStateList) {
        this.f9749w.N(colorStateList);
    }

    public void setCheckable(boolean z10) {
        this.f9749w.O(z10);
    }

    @Override // android.widget.Checkable
    public void setChecked(boolean z10) {
        if (this.f9751y != z10) {
            toggle();
        }
    }

    public void setCheckedIcon(Drawable drawable) {
        this.f9749w.R(drawable);
    }

    public void setCheckedIconGravity(int i10) {
        if (this.f9749w.p() != i10) {
            this.f9749w.S(i10);
        }
    }

    public void setCheckedIconMargin(int i10) {
        this.f9749w.T(i10);
    }

    public void setCheckedIconMarginResource(int i10) {
        if (i10 != -1) {
            this.f9749w.T(getResources().getDimensionPixelSize(i10));
        }
    }

    public void setCheckedIconResource(int i10) {
        this.f9749w.R(h.a.b(getContext(), i10));
    }

    public void setCheckedIconSize(int i10) {
        this.f9749w.U(i10);
    }

    public void setCheckedIconSizeResource(int i10) {
        if (i10 != 0) {
            this.f9749w.U(getResources().getDimensionPixelSize(i10));
        }
    }

    public void setCheckedIconTint(ColorStateList colorStateList) {
        this.f9749w.V(colorStateList);
    }

    @Override // android.view.View
    public void setClickable(boolean z10) {
        super.setClickable(z10);
        c cVar = this.f9749w;
        if (cVar != null) {
            cVar.f0();
        }
    }

    public void setDragged(boolean z10) {
        if (this.f9752z != z10) {
            this.f9752z = z10;
            refreshDrawableState();
            f();
            invalidate();
        }
    }

    @Override // q.a
    public void setMaxCardElevation(float f10) {
        super.setMaxCardElevation(f10);
        this.f9749w.j0();
    }

    @Override // q.a
    public void setPreventCornerOverlap(boolean z10) {
        super.setPreventCornerOverlap(z10);
        this.f9749w.j0();
        this.f9749w.g0();
    }

    public void setProgress(float f10) {
        this.f9749w.X(f10);
    }

    @Override // q.a
    public void setRadius(float f10) {
        super.setRadius(f10);
        this.f9749w.W(f10);
    }

    public void setRippleColor(ColorStateList colorStateList) {
        this.f9749w.Y(colorStateList);
    }

    public void setRippleColorResource(int i10) {
        this.f9749w.Y(h.a.a(getContext(), i10));
    }

    @Override // p7.n
    public void setShapeAppearanceModel(p7.k kVar) {
        setClipToOutline(kVar.u(getBoundsAsRectF()));
        this.f9749w.Z(kVar);
    }

    public void setStrokeColor(int i10) {
        setStrokeColor(ColorStateList.valueOf(i10));
    }

    public void setStrokeWidth(int i10) {
        this.f9749w.b0(i10);
        invalidate();
    }

    @Override // q.a
    public void setUseCompatPadding(boolean z10) {
        super.setUseCompatPadding(z10);
        this.f9749w.j0();
        this.f9749w.g0();
    }

    @Override // android.widget.Checkable
    public void toggle() {
        if (g() && isEnabled()) {
            this.f9751y = !this.f9751y;
            refreshDrawableState();
            f();
            this.f9749w.Q(this.f9751y, true);
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public MaterialCardView(android.content.Context r8, android.util.AttributeSet r9, int r10) {
        /*
            r7 = this;
            int r6 = com.google.android.material.card.MaterialCardView.D
            android.content.Context r8 = s7.a.c(r8, r9, r10, r6)
            r7.<init>(r8, r9, r10)
            r8 = 0
            r7.f9751y = r8
            r7.f9752z = r8
            r0 = 1
            r7.f9750x = r0
            android.content.Context r0 = r7.getContext()
            int[] r2 = v6.l.f24942m4
            int[] r5 = new int[r8]
            r1 = r9
            r3 = r10
            r4 = r6
            android.content.res.TypedArray r8 = com.google.android.material.internal.p.i(r0, r1, r2, r3, r4, r5)
            com.google.android.material.card.c r0 = new com.google.android.material.card.c
            r0.<init>(r7, r9, r10, r6)
            r7.f9749w = r0
            android.content.res.ColorStateList r9 = super.getCardBackgroundColor()
            r0.M(r9)
            int r9 = super.getContentPaddingLeft()
            int r10 = super.getContentPaddingTop()
            int r1 = super.getContentPaddingRight()
            int r2 = super.getContentPaddingBottom()
            r0.c0(r9, r10, r1, r2)
            r0.J(r8)
            r8.recycle()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.card.MaterialCardView.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }

    @Override // q.a
    public void setCardBackgroundColor(ColorStateList colorStateList) {
        this.f9749w.M(colorStateList);
    }

    public void setStrokeColor(ColorStateList colorStateList) {
        this.f9749w.a0(colorStateList);
        invalidate();
    }

    public void setOnCheckedChangeListener(a aVar) {
    }
}
