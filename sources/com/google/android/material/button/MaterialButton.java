package com.google.android.material.button;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.Layout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Button;
import android.widget.Checkable;
import android.widget.CompoundButton;
import androidx.appcompat.widget.AppCompatButton;
import androidx.core.view.p0;
import androidx.core.widget.j;
import androidx.customview.view.AbsSavedState;
import java.util.Iterator;
import java.util.LinkedHashSet;
import p7.h;
import p7.n;
import v6.k;

/* loaded from: classes3.dex */
public class MaterialButton extends AppCompatButton implements Checkable, n {
    private static final int[] E = {16842911};
    private static final int[] F = {16842912};
    private static final int G = k.f24811u;
    private int A;
    private boolean B;
    private boolean C;
    private int D;

    /* renamed from: q  reason: collision with root package name */
    private final com.google.android.material.button.a f9697q;

    /* renamed from: r  reason: collision with root package name */
    private final LinkedHashSet<a> f9698r;

    /* renamed from: s  reason: collision with root package name */
    private b f9699s;

    /* renamed from: t  reason: collision with root package name */
    private PorterDuff.Mode f9700t;

    /* renamed from: u  reason: collision with root package name */
    private ColorStateList f9701u;

    /* renamed from: v  reason: collision with root package name */
    private Drawable f9702v;

    /* renamed from: w  reason: collision with root package name */
    private String f9703w;

    /* renamed from: x  reason: collision with root package name */
    private int f9704x;

    /* renamed from: y  reason: collision with root package name */
    private int f9705y;

    /* renamed from: z  reason: collision with root package name */
    private int f9706z;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new a();

        /* renamed from: p  reason: collision with root package name */
        boolean f9707p;

        /* loaded from: classes3.dex */
        class a implements Parcelable.ClassLoaderCreator<SavedState> {
            a() {
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: a  reason: merged with bridge method [inline-methods] */
            public SavedState createFromParcel(Parcel parcel) {
                return new SavedState(parcel, null);
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            /* renamed from: b  reason: merged with bridge method [inline-methods] */
            public SavedState createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new SavedState(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: c  reason: merged with bridge method [inline-methods] */
            public SavedState[] newArray(int i10) {
                return new SavedState[i10];
            }
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        private void b(Parcel parcel) {
            boolean z10 = true;
            if (parcel.readInt() != 1) {
                z10 = false;
            }
            this.f9707p = z10;
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i10) {
            super.writeToParcel(parcel, i10);
            parcel.writeInt(this.f9707p ? 1 : 0);
        }

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            if (classLoader == null) {
                getClass().getClassLoader();
            }
            b(parcel);
        }
    }

    /* loaded from: classes3.dex */
    public interface a {
        void a(MaterialButton materialButton, boolean z10);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public interface b {
        void a(MaterialButton materialButton, boolean z10);
    }

    public MaterialButton(Context context) {
        this(context, null);
    }

    private boolean b() {
        int i10 = this.D;
        if (i10 != 3 && i10 != 4) {
            return false;
        }
        return true;
    }

    private boolean c() {
        int i10 = this.D;
        if (i10 == 1 || i10 == 2) {
            return true;
        }
        return false;
    }

    private boolean d() {
        int i10 = this.D;
        if (i10 != 16 && i10 != 32) {
            return false;
        }
        return true;
    }

    private boolean e() {
        if (p0.E(this) == 1) {
            return true;
        }
        return false;
    }

    private boolean f() {
        com.google.android.material.button.a aVar = this.f9697q;
        if (aVar != null && !aVar.o()) {
            return true;
        }
        return false;
    }

    private void g() {
        if (c()) {
            j.j(this, this.f9702v, null, null, null);
        } else if (b()) {
            j.j(this, null, null, this.f9702v, null);
        } else if (d()) {
            j.j(this, null, this.f9702v, null, null);
        }
    }

    private Layout.Alignment getActualTextAlignment() {
        int textAlignment = getTextAlignment();
        if (textAlignment != 1) {
            if (textAlignment != 6 && textAlignment != 3) {
                if (textAlignment != 4) {
                    return Layout.Alignment.ALIGN_NORMAL;
                }
                return Layout.Alignment.ALIGN_CENTER;
            }
            return Layout.Alignment.ALIGN_OPPOSITE;
        }
        return getGravityTextAlignment();
    }

    private Layout.Alignment getGravityTextAlignment() {
        int gravity = getGravity() & 8388615;
        if (gravity != 1) {
            if (gravity != 5 && gravity != 8388613) {
                return Layout.Alignment.ALIGN_NORMAL;
            }
            return Layout.Alignment.ALIGN_OPPOSITE;
        }
        return Layout.Alignment.ALIGN_CENTER;
    }

    private int getTextHeight() {
        if (getLineCount() > 1) {
            return getLayout().getHeight();
        }
        TextPaint paint = getPaint();
        String charSequence = getText().toString();
        if (getTransformationMethod() != null) {
            charSequence = getTransformationMethod().getTransformation(charSequence, this).toString();
        }
        Rect rect = new Rect();
        paint.getTextBounds(charSequence, 0, charSequence.length(), rect);
        return Math.min(rect.height(), getLayout().getHeight());
    }

    private int getTextLayoutWidth() {
        int lineCount = getLineCount();
        float f10 = 0.0f;
        for (int i10 = 0; i10 < lineCount; i10++) {
            f10 = Math.max(f10, getLayout().getLineWidth(i10));
        }
        return (int) Math.ceil(f10);
    }

    private void h(boolean z10) {
        Drawable drawable = this.f9702v;
        boolean z11 = true;
        if (drawable != null) {
            Drawable mutate = androidx.core.graphics.drawable.a.r(drawable).mutate();
            this.f9702v = mutate;
            androidx.core.graphics.drawable.a.o(mutate, this.f9701u);
            PorterDuff.Mode mode = this.f9700t;
            if (mode != null) {
                androidx.core.graphics.drawable.a.p(this.f9702v, mode);
            }
            int i10 = this.f9704x;
            if (i10 == 0) {
                i10 = this.f9702v.getIntrinsicWidth();
            }
            int i11 = this.f9704x;
            if (i11 == 0) {
                i11 = this.f9702v.getIntrinsicHeight();
            }
            Drawable drawable2 = this.f9702v;
            int i12 = this.f9705y;
            int i13 = this.f9706z;
            drawable2.setBounds(i12, i13, i10 + i12, i11 + i13);
            this.f9702v.setVisible(true, z10);
        }
        if (z10) {
            g();
            return;
        }
        Drawable[] a10 = j.a(this);
        Drawable drawable3 = a10[0];
        Drawable drawable4 = a10[1];
        Drawable drawable5 = a10[2];
        if ((!c() || drawable3 == this.f9702v) && ((!b() || drawable5 == this.f9702v) && (!d() || drawable4 == this.f9702v))) {
            z11 = false;
        }
        if (z11) {
            g();
        }
    }

    private void i(int i10, int i11) {
        if (this.f9702v != null && getLayout() != null) {
            if (!c() && !b()) {
                if (d()) {
                    this.f9705y = 0;
                    if (this.D == 16) {
                        this.f9706z = 0;
                        h(false);
                        return;
                    }
                    int i12 = this.f9704x;
                    if (i12 == 0) {
                        i12 = this.f9702v.getIntrinsicHeight();
                    }
                    int max = Math.max(0, (((((i11 - getTextHeight()) - getPaddingTop()) - i12) - this.A) - getPaddingBottom()) / 2);
                    if (this.f9706z != max) {
                        this.f9706z = max;
                        h(false);
                        return;
                    }
                    return;
                }
                return;
            }
            this.f9706z = 0;
            Layout.Alignment actualTextAlignment = getActualTextAlignment();
            int i13 = this.D;
            boolean z10 = true;
            if (i13 != 1 && i13 != 3 && ((i13 != 2 || actualTextAlignment != Layout.Alignment.ALIGN_NORMAL) && (i13 != 4 || actualTextAlignment != Layout.Alignment.ALIGN_OPPOSITE))) {
                int i14 = this.f9704x;
                if (i14 == 0) {
                    i14 = this.f9702v.getIntrinsicWidth();
                }
                int textLayoutWidth = ((((i10 - getTextLayoutWidth()) - p0.I(this)) - i14) - this.A) - p0.J(this);
                if (actualTextAlignment == Layout.Alignment.ALIGN_CENTER) {
                    textLayoutWidth /= 2;
                }
                boolean e10 = e();
                if (this.D != 4) {
                    z10 = false;
                }
                if (e10 != z10) {
                    textLayoutWidth = -textLayoutWidth;
                }
                if (this.f9705y != textLayoutWidth) {
                    this.f9705y = textLayoutWidth;
                    h(false);
                    return;
                }
                return;
            }
            this.f9705y = 0;
            h(false);
        }
    }

    public boolean a() {
        com.google.android.material.button.a aVar = this.f9697q;
        if (aVar != null && aVar.p()) {
            return true;
        }
        return false;
    }

    String getA11yClassName() {
        Class cls;
        if (!TextUtils.isEmpty(this.f9703w)) {
            return this.f9703w;
        }
        if (a()) {
            cls = CompoundButton.class;
        } else {
            cls = Button.class;
        }
        return cls.getName();
    }

    @Override // android.view.View
    public ColorStateList getBackgroundTintList() {
        return getSupportBackgroundTintList();
    }

    @Override // android.view.View
    public PorterDuff.Mode getBackgroundTintMode() {
        return getSupportBackgroundTintMode();
    }

    public int getCornerRadius() {
        if (f()) {
            return this.f9697q.b();
        }
        return 0;
    }

    public Drawable getIcon() {
        return this.f9702v;
    }

    public int getIconGravity() {
        return this.D;
    }

    public int getIconPadding() {
        return this.A;
    }

    public int getIconSize() {
        return this.f9704x;
    }

    public ColorStateList getIconTint() {
        return this.f9701u;
    }

    public PorterDuff.Mode getIconTintMode() {
        return this.f9700t;
    }

    public int getInsetBottom() {
        return this.f9697q.c();
    }

    public int getInsetTop() {
        return this.f9697q.d();
    }

    public ColorStateList getRippleColor() {
        if (f()) {
            return this.f9697q.h();
        }
        return null;
    }

    public p7.k getShapeAppearanceModel() {
        if (f()) {
            return this.f9697q.i();
        }
        throw new IllegalStateException("Attempted to get ShapeAppearanceModel from a MaterialButton which has an overwritten background.");
    }

    public ColorStateList getStrokeColor() {
        if (f()) {
            return this.f9697q.j();
        }
        return null;
    }

    public int getStrokeWidth() {
        if (f()) {
            return this.f9697q.k();
        }
        return 0;
    }

    @Override // androidx.appcompat.widget.AppCompatButton
    public ColorStateList getSupportBackgroundTintList() {
        if (f()) {
            return this.f9697q.l();
        }
        return super.getSupportBackgroundTintList();
    }

    @Override // androidx.appcompat.widget.AppCompatButton
    public PorterDuff.Mode getSupportBackgroundTintMode() {
        if (f()) {
            return this.f9697q.m();
        }
        return super.getSupportBackgroundTintMode();
    }

    @Override // android.widget.Checkable
    public boolean isChecked() {
        return this.B;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.widget.TextView, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (f()) {
            h.f(this, this.f9697q.f());
        }
    }

    @Override // android.widget.TextView, android.view.View
    protected int[] onCreateDrawableState(int i10) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i10 + 2);
        if (a()) {
            View.mergeDrawableStates(onCreateDrawableState, E);
        }
        if (isChecked()) {
            View.mergeDrawableStates(onCreateDrawableState, F);
        }
        return onCreateDrawableState;
    }

    @Override // androidx.appcompat.widget.AppCompatButton, android.view.View
    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName(getA11yClassName());
        accessibilityEvent.setChecked(isChecked());
    }

    @Override // androidx.appcompat.widget.AppCompatButton, android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(getA11yClassName());
        accessibilityNodeInfo.setCheckable(a());
        accessibilityNodeInfo.setChecked(isChecked());
        accessibilityNodeInfo.setClickable(isClickable());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.appcompat.widget.AppCompatButton, android.widget.TextView, android.view.View
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        com.google.android.material.button.a aVar;
        super.onLayout(z10, i10, i11, i12, i13);
        if (Build.VERSION.SDK_INT == 21 && (aVar = this.f9697q) != null) {
            aVar.J(i13 - i11, i12 - i10);
        }
        i(getMeasuredWidth(), getMeasuredHeight());
    }

    @Override // android.widget.TextView, android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.a());
        setChecked(savedState.f9707p);
    }

    @Override // android.widget.TextView, android.view.View
    public Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.f9707p = this.B;
        return savedState;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.appcompat.widget.AppCompatButton, android.widget.TextView
    public void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        super.onTextChanged(charSequence, i10, i11, i12);
        i(getMeasuredWidth(), getMeasuredHeight());
    }

    @Override // android.view.View
    public boolean performClick() {
        if (this.f9697q.q()) {
            toggle();
        }
        return super.performClick();
    }

    @Override // android.view.View
    public void refreshDrawableState() {
        super.refreshDrawableState();
        if (this.f9702v != null) {
            if (this.f9702v.setState(getDrawableState())) {
                invalidate();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void setA11yClassName(String str) {
        this.f9703w = str;
    }

    @Override // android.view.View
    public void setBackground(Drawable drawable) {
        setBackgroundDrawable(drawable);
    }

    @Override // android.view.View
    public void setBackgroundColor(int i10) {
        if (f()) {
            this.f9697q.s(i10);
        } else {
            super.setBackgroundColor(i10);
        }
    }

    @Override // androidx.appcompat.widget.AppCompatButton, android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        if (f()) {
            if (drawable != getBackground()) {
                Log.w("MaterialButton", "MaterialButton manages its own background to control elevation, shape, color and states. Consider using backgroundTint, shapeAppearance and other attributes where available. A custom background will ignore these attributes and you should consider handling interaction states such as pressed, focused and disabled");
                this.f9697q.t();
                super.setBackgroundDrawable(drawable);
                return;
            }
            getBackground().setState(drawable.getState());
            return;
        }
        super.setBackgroundDrawable(drawable);
    }

    @Override // androidx.appcompat.widget.AppCompatButton, android.view.View
    public void setBackgroundResource(int i10) {
        Drawable drawable;
        if (i10 != 0) {
            drawable = h.a.b(getContext(), i10);
        } else {
            drawable = null;
        }
        setBackgroundDrawable(drawable);
    }

    @Override // android.view.View
    public void setBackgroundTintList(ColorStateList colorStateList) {
        setSupportBackgroundTintList(colorStateList);
    }

    @Override // android.view.View
    public void setBackgroundTintMode(PorterDuff.Mode mode) {
        setSupportBackgroundTintMode(mode);
    }

    public void setCheckable(boolean z10) {
        if (f()) {
            this.f9697q.u(z10);
        }
    }

    @Override // android.widget.Checkable
    public void setChecked(boolean z10) {
        if (a() && isEnabled() && this.B != z10) {
            this.B = z10;
            refreshDrawableState();
            if (getParent() instanceof MaterialButtonToggleGroup) {
                ((MaterialButtonToggleGroup) getParent()).m(this, this.B);
            }
            if (this.C) {
                return;
            }
            this.C = true;
            Iterator<a> it = this.f9698r.iterator();
            while (it.hasNext()) {
                it.next().a(this, this.B);
            }
            this.C = false;
        }
    }

    public void setCornerRadius(int i10) {
        if (f()) {
            this.f9697q.v(i10);
        }
    }

    public void setCornerRadiusResource(int i10) {
        if (f()) {
            setCornerRadius(getResources().getDimensionPixelSize(i10));
        }
    }

    @Override // android.view.View
    public void setElevation(float f10) {
        super.setElevation(f10);
        if (f()) {
            this.f9697q.f().a0(f10);
        }
    }

    public void setIcon(Drawable drawable) {
        if (this.f9702v != drawable) {
            this.f9702v = drawable;
            h(true);
            i(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    public void setIconGravity(int i10) {
        if (this.D != i10) {
            this.D = i10;
            i(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    public void setIconPadding(int i10) {
        if (this.A != i10) {
            this.A = i10;
            setCompoundDrawablePadding(i10);
        }
    }

    public void setIconResource(int i10) {
        Drawable drawable;
        if (i10 != 0) {
            drawable = h.a.b(getContext(), i10);
        } else {
            drawable = null;
        }
        setIcon(drawable);
    }

    public void setIconSize(int i10) {
        if (i10 >= 0) {
            if (this.f9704x != i10) {
                this.f9704x = i10;
                h(true);
                return;
            }
            return;
        }
        throw new IllegalArgumentException("iconSize cannot be less than 0");
    }

    public void setIconTint(ColorStateList colorStateList) {
        if (this.f9701u != colorStateList) {
            this.f9701u = colorStateList;
            h(false);
        }
    }

    public void setIconTintMode(PorterDuff.Mode mode) {
        if (this.f9700t != mode) {
            this.f9700t = mode;
            h(false);
        }
    }

    public void setIconTintResource(int i10) {
        setIconTint(h.a.a(getContext(), i10));
    }

    public void setInsetBottom(int i10) {
        this.f9697q.w(i10);
    }

    public void setInsetTop(int i10) {
        this.f9697q.x(i10);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void setInternalBackground(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void setOnPressedChangeListenerInternal(b bVar) {
        this.f9699s = bVar;
    }

    @Override // android.view.View
    public void setPressed(boolean z10) {
        b bVar = this.f9699s;
        if (bVar != null) {
            bVar.a(this, z10);
        }
        super.setPressed(z10);
    }

    public void setRippleColor(ColorStateList colorStateList) {
        if (f()) {
            this.f9697q.y(colorStateList);
        }
    }

    public void setRippleColorResource(int i10) {
        if (f()) {
            setRippleColor(h.a.a(getContext(), i10));
        }
    }

    @Override // p7.n
    public void setShapeAppearanceModel(p7.k kVar) {
        if (f()) {
            this.f9697q.z(kVar);
            return;
        }
        throw new IllegalStateException("Attempted to set ShapeAppearanceModel on a MaterialButton which has an overwritten background.");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void setShouldDrawSurfaceColorStroke(boolean z10) {
        if (f()) {
            this.f9697q.A(z10);
        }
    }

    public void setStrokeColor(ColorStateList colorStateList) {
        if (f()) {
            this.f9697q.B(colorStateList);
        }
    }

    public void setStrokeColorResource(int i10) {
        if (f()) {
            setStrokeColor(h.a.a(getContext(), i10));
        }
    }

    public void setStrokeWidth(int i10) {
        if (f()) {
            this.f9697q.C(i10);
        }
    }

    public void setStrokeWidthResource(int i10) {
        if (f()) {
            setStrokeWidth(getResources().getDimensionPixelSize(i10));
        }
    }

    @Override // androidx.appcompat.widget.AppCompatButton
    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        if (f()) {
            this.f9697q.D(colorStateList);
        } else {
            super.setSupportBackgroundTintList(colorStateList);
        }
    }

    @Override // androidx.appcompat.widget.AppCompatButton
    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        if (f()) {
            this.f9697q.E(mode);
        } else {
            super.setSupportBackgroundTintMode(mode);
        }
    }

    @Override // android.view.View
    public void setTextAlignment(int i10) {
        super.setTextAlignment(i10);
        i(getMeasuredWidth(), getMeasuredHeight());
    }

    public void setToggleCheckedStateOnClick(boolean z10) {
        this.f9697q.F(z10);
    }

    @Override // android.widget.Checkable
    public void toggle() {
        setChecked(!this.B);
    }

    public MaterialButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, v6.b.f24655y);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public MaterialButton(android.content.Context r9, android.util.AttributeSet r10, int r11) {
        /*
            r8 = this;
            int r6 = com.google.android.material.button.MaterialButton.G
            android.content.Context r9 = s7.a.c(r9, r10, r11, r6)
            r8.<init>(r9, r10, r11)
            java.util.LinkedHashSet r9 = new java.util.LinkedHashSet
            r9.<init>()
            r8.f9698r = r9
            r9 = 0
            r8.B = r9
            r8.C = r9
            android.content.Context r7 = r8.getContext()
            int[] r2 = v6.l.f25001s3
            int[] r5 = new int[r9]
            r0 = r7
            r1 = r10
            r3 = r11
            r4 = r6
            android.content.res.TypedArray r0 = com.google.android.material.internal.p.i(r0, r1, r2, r3, r4, r5)
            int r1 = v6.l.F3
            int r1 = r0.getDimensionPixelSize(r1, r9)
            r8.A = r1
            int r1 = v6.l.I3
            r2 = -1
            int r1 = r0.getInt(r1, r2)
            android.graphics.PorterDuff$Mode r2 = android.graphics.PorterDuff.Mode.SRC_IN
            android.graphics.PorterDuff$Mode r1 = com.google.android.material.internal.r.g(r1, r2)
            r8.f9700t = r1
            android.content.Context r1 = r8.getContext()
            int r2 = v6.l.H3
            android.content.res.ColorStateList r1 = m7.c.a(r1, r0, r2)
            r8.f9701u = r1
            android.content.Context r1 = r8.getContext()
            int r2 = v6.l.D3
            android.graphics.drawable.Drawable r1 = m7.c.d(r1, r0, r2)
            r8.f9702v = r1
            int r1 = v6.l.E3
            r2 = 1
            int r1 = r0.getInteger(r1, r2)
            r8.D = r1
            int r1 = v6.l.G3
            int r1 = r0.getDimensionPixelSize(r1, r9)
            r8.f9704x = r1
            p7.k$b r10 = p7.k.e(r7, r10, r11, r6)
            p7.k r10 = r10.m()
            com.google.android.material.button.a r11 = new com.google.android.material.button.a
            r11.<init>(r8, r10)
            r8.f9697q = r11
            r11.r(r0)
            r0.recycle()
            int r10 = r8.A
            r8.setCompoundDrawablePadding(r10)
            android.graphics.drawable.Drawable r10 = r8.f9702v
            if (r10 == 0) goto L84
            r9 = 1
        L84:
            r8.h(r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.button.MaterialButton.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }
}
