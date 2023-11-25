package com.google.android.material.checkbox;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.AnimatedStateListDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.autofill.AutofillManager;
import android.widget.CompoundButton;
import androidx.appcompat.widget.f;
import androidx.appcompat.widget.g1;
import androidx.vectordrawable.graphics.drawable.e;
import com.google.android.material.internal.r;
import f7.d;
import java.util.Iterator;
import java.util.LinkedHashSet;
import v6.j;
import v6.k;
import v6.l;

/* loaded from: classes3.dex */
public class MaterialCheckBox extends f {
    private static final int L = k.f24816z;
    private static final int[] M = {v6.b.Y};
    private static final int[] N;
    private static final int[][] O;
    @SuppressLint({"DiscouragedApi"})
    private static final int P;
    private boolean A;
    ColorStateList B;
    ColorStateList C;
    private PorterDuff.Mode D;
    private int E;
    private int[] F;
    private boolean G;
    private CharSequence H;
    private CompoundButton.OnCheckedChangeListener I;
    private final e J;
    private final androidx.vectordrawable.graphics.drawable.b K;

    /* renamed from: r  reason: collision with root package name */
    private final LinkedHashSet<c> f9823r;

    /* renamed from: s  reason: collision with root package name */
    private final LinkedHashSet<b> f9824s;

    /* renamed from: t  reason: collision with root package name */
    private ColorStateList f9825t;

    /* renamed from: u  reason: collision with root package name */
    private boolean f9826u;

    /* renamed from: v  reason: collision with root package name */
    private boolean f9827v;

    /* renamed from: w  reason: collision with root package name */
    private boolean f9828w;

    /* renamed from: x  reason: collision with root package name */
    private CharSequence f9829x;

    /* renamed from: y  reason: collision with root package name */
    private Drawable f9830y;

    /* renamed from: z  reason: collision with root package name */
    private Drawable f9831z;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public static class SavedState extends View.BaseSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new a();

        /* renamed from: f  reason: collision with root package name */
        int f9832f;

        /* loaded from: classes3.dex */
        class a implements Parcelable.Creator<SavedState> {
            a() {
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: a  reason: merged with bridge method [inline-methods] */
            public SavedState createFromParcel(Parcel parcel) {
                return new SavedState(parcel, null);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b  reason: merged with bridge method [inline-methods] */
            public SavedState[] newArray(int i10) {
                return new SavedState[i10];
            }
        }

        /* synthetic */ SavedState(Parcel parcel, a aVar) {
            this(parcel);
        }

        private String a() {
            int i10 = this.f9832f;
            if (i10 != 1) {
                if (i10 != 2) {
                    return "unchecked";
                }
                return "indeterminate";
            }
            return "checked";
        }

        public String toString() {
            return "MaterialCheckBox.SavedState{" + Integer.toHexString(System.identityHashCode(this)) + " CheckedState=" + a() + "}";
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i10) {
            super.writeToParcel(parcel, i10);
            parcel.writeValue(Integer.valueOf(this.f9832f));
        }

        SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        private SavedState(Parcel parcel) {
            super(parcel);
            this.f9832f = ((Integer) parcel.readValue(getClass().getClassLoader())).intValue();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public class a extends androidx.vectordrawable.graphics.drawable.b {
        a() {
        }

        @Override // androidx.vectordrawable.graphics.drawable.b
        public void b(Drawable drawable) {
            super.b(drawable);
            ColorStateList colorStateList = MaterialCheckBox.this.B;
            if (colorStateList != null) {
                androidx.core.graphics.drawable.a.o(drawable, colorStateList);
            }
        }

        @Override // androidx.vectordrawable.graphics.drawable.b
        public void c(Drawable drawable) {
            super.c(drawable);
            MaterialCheckBox materialCheckBox = MaterialCheckBox.this;
            ColorStateList colorStateList = materialCheckBox.B;
            if (colorStateList != null) {
                androidx.core.graphics.drawable.a.n(drawable, colorStateList.getColorForState(materialCheckBox.F, MaterialCheckBox.this.B.getDefaultColor()));
            }
        }
    }

    /* loaded from: classes3.dex */
    public interface b {
        void a(MaterialCheckBox materialCheckBox, int i10);
    }

    /* loaded from: classes3.dex */
    public interface c {
        void a(MaterialCheckBox materialCheckBox, boolean z10);
    }

    static {
        int i10 = v6.b.X;
        N = new int[]{i10};
        O = new int[][]{new int[]{16842910, i10}, new int[]{16842910, 16842912}, new int[]{16842910, -16842912}, new int[]{-16842910, 16842912}, new int[]{-16842910, -16842912}};
        P = Resources.getSystem().getIdentifier("btn_check_material_anim", "drawable", "android");
    }

    public MaterialCheckBox(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, v6.b.f24632f);
    }

    private boolean c(g1 g1Var) {
        int n10 = g1Var.n(l.f25062y4, 0);
        int n11 = g1Var.n(l.f25072z4, 0);
        if (n10 != P || n11 != 0) {
            return false;
        }
        return true;
    }

    private void e() {
        this.f9830y = d.b(this.f9830y, this.B, androidx.core.widget.c.c(this));
        this.f9831z = d.b(this.f9831z, this.C, this.D);
        g();
        h();
        super.setButtonDrawable(d.a(this.f9830y, this.f9831z));
        refreshDrawableState();
    }

    private void f() {
        if (Build.VERSION.SDK_INT >= 30 && this.H == null) {
            super.setStateDescription(getButtonStateDescription());
        }
    }

    private void g() {
        e eVar;
        if (!this.A) {
            return;
        }
        e eVar2 = this.J;
        if (eVar2 != null) {
            eVar2.g(this.K);
            this.J.c(this.K);
        }
        if (Build.VERSION.SDK_INT >= 24) {
            Drawable drawable = this.f9830y;
            if ((drawable instanceof AnimatedStateListDrawable) && (eVar = this.J) != null) {
                int i10 = v6.f.f24713b;
                int i11 = v6.f.X;
                ((AnimatedStateListDrawable) drawable).addTransition(i10, i11, eVar, false);
                ((AnimatedStateListDrawable) this.f9830y).addTransition(v6.f.f24721j, i11, this.J, false);
            }
        }
    }

    private String getButtonStateDescription() {
        int i10 = this.E;
        if (i10 == 1) {
            return getResources().getString(j.f24774j);
        }
        if (i10 == 0) {
            return getResources().getString(j.f24776l);
        }
        return getResources().getString(j.f24775k);
    }

    private ColorStateList getMaterialThemeColorsTintList() {
        if (this.f9825t == null) {
            int[][] iArr = O;
            int[] iArr2 = new int[iArr.length];
            int d10 = d7.a.d(this, v6.b.f24640j);
            int d11 = d7.a.d(this, v6.b.f24642l);
            int d12 = d7.a.d(this, v6.b.f24647q);
            int d13 = d7.a.d(this, v6.b.f24643m);
            iArr2[0] = d7.a.j(d12, d11, 1.0f);
            iArr2[1] = d7.a.j(d12, d10, 1.0f);
            iArr2[2] = d7.a.j(d12, d13, 0.54f);
            iArr2[3] = d7.a.j(d12, d13, 0.38f);
            iArr2[4] = d7.a.j(d12, d13, 0.38f);
            this.f9825t = new ColorStateList(iArr, iArr2);
        }
        return this.f9825t;
    }

    private ColorStateList getSuperButtonTintList() {
        ColorStateList colorStateList = this.B;
        if (colorStateList != null) {
            return colorStateList;
        }
        if (super.getButtonTintList() != null) {
            return super.getButtonTintList();
        }
        return getSupportButtonTintList();
    }

    private void h() {
        ColorStateList colorStateList;
        ColorStateList colorStateList2;
        Drawable drawable = this.f9830y;
        if (drawable != null && (colorStateList2 = this.B) != null) {
            androidx.core.graphics.drawable.a.o(drawable, colorStateList2);
        }
        Drawable drawable2 = this.f9831z;
        if (drawable2 != null && (colorStateList = this.C) != null) {
            androidx.core.graphics.drawable.a.o(drawable2, colorStateList);
        }
    }

    public boolean d() {
        return this.f9828w;
    }

    @Override // android.widget.CompoundButton
    public Drawable getButtonDrawable() {
        return this.f9830y;
    }

    public Drawable getButtonIconDrawable() {
        return this.f9831z;
    }

    public ColorStateList getButtonIconTintList() {
        return this.C;
    }

    public PorterDuff.Mode getButtonIconTintMode() {
        return this.D;
    }

    @Override // android.widget.CompoundButton
    public ColorStateList getButtonTintList() {
        return this.B;
    }

    public int getCheckedState() {
        return this.E;
    }

    public CharSequence getErrorAccessibilityLabel() {
        return this.f9829x;
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public boolean isChecked() {
        if (this.E == 1) {
            return true;
        }
        return false;
    }

    @Override // android.widget.TextView, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f9826u && this.B == null && this.C == null) {
            setUseMaterialThemeColors(true);
        }
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    protected int[] onCreateDrawableState(int i10) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i10 + 2);
        if (getCheckedState() == 2) {
            View.mergeDrawableStates(onCreateDrawableState, M);
        }
        if (d()) {
            View.mergeDrawableStates(onCreateDrawableState, N);
        }
        this.F = d.d(onCreateDrawableState);
        i();
        return onCreateDrawableState;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    protected void onDraw(Canvas canvas) {
        Drawable a10;
        int i10;
        if (this.f9827v && TextUtils.isEmpty(getText()) && (a10 = androidx.core.widget.c.a(this)) != null) {
            if (r.f(this)) {
                i10 = -1;
            } else {
                i10 = 1;
            }
            int width = ((getWidth() - a10.getIntrinsicWidth()) / 2) * i10;
            int save = canvas.save();
            canvas.translate(width, 0.0f);
            super.onDraw(canvas);
            canvas.restoreToCount(save);
            if (getBackground() != null) {
                Rect bounds = a10.getBounds();
                androidx.core.graphics.drawable.a.l(getBackground(), bounds.left + width, bounds.top, bounds.right + width, bounds.bottom);
                return;
            }
            return;
        }
        super.onDraw(canvas);
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        if (accessibilityNodeInfo != null && d()) {
            accessibilityNodeInfo.setText(((Object) accessibilityNodeInfo.getText()) + ", " + ((Object) this.f9829x));
        }
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        setCheckedState(savedState.f9832f);
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.f9832f = getCheckedState();
        return savedState;
    }

    @Override // androidx.appcompat.widget.f, android.widget.CompoundButton
    public void setButtonDrawable(int i10) {
        setButtonDrawable(h.a.b(getContext(), i10));
    }

    public void setButtonIconDrawable(Drawable drawable) {
        this.f9831z = drawable;
        e();
    }

    public void setButtonIconDrawableResource(int i10) {
        setButtonIconDrawable(h.a.b(getContext(), i10));
    }

    public void setButtonIconTintList(ColorStateList colorStateList) {
        if (this.C == colorStateList) {
            return;
        }
        this.C = colorStateList;
        e();
    }

    public void setButtonIconTintMode(PorterDuff.Mode mode) {
        if (this.D == mode) {
            return;
        }
        this.D = mode;
        e();
    }

    @Override // android.widget.CompoundButton
    public void setButtonTintList(ColorStateList colorStateList) {
        if (this.B == colorStateList) {
            return;
        }
        this.B = colorStateList;
        e();
    }

    @Override // android.widget.CompoundButton
    public void setButtonTintMode(PorterDuff.Mode mode) {
        setSupportButtonTintMode(mode);
        e();
    }

    public void setCenterIfNoTextEnabled(boolean z10) {
        this.f9827v = z10;
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public void setChecked(boolean z10) {
        setCheckedState(z10 ? 1 : 0);
    }

    public void setCheckedState(int i10) {
        boolean z10;
        Object systemService;
        CompoundButton.OnCheckedChangeListener onCheckedChangeListener;
        if (this.E != i10) {
            this.E = i10;
            if (i10 == 1) {
                z10 = true;
            } else {
                z10 = false;
            }
            super.setChecked(z10);
            refreshDrawableState();
            f();
            if (this.G) {
                return;
            }
            this.G = true;
            LinkedHashSet<b> linkedHashSet = this.f9824s;
            if (linkedHashSet != null) {
                Iterator<b> it = linkedHashSet.iterator();
                while (it.hasNext()) {
                    it.next().a(this, this.E);
                }
            }
            if (this.E != 2 && (onCheckedChangeListener = this.I) != null) {
                onCheckedChangeListener.onCheckedChanged(this, isChecked());
            }
            if (Build.VERSION.SDK_INT >= 26) {
                systemService = getContext().getSystemService(w0.a.a());
                AutofillManager a10 = w0.c.a(systemService);
                if (a10 != null) {
                    a10.notifyValueChanged(this);
                }
            }
            this.G = false;
        }
    }

    @Override // android.widget.TextView, android.view.View
    public void setEnabled(boolean z10) {
        super.setEnabled(z10);
        i();
    }

    public void setErrorAccessibilityLabel(CharSequence charSequence) {
        this.f9829x = charSequence;
    }

    public void setErrorAccessibilityLabelResource(int i10) {
        CharSequence charSequence;
        if (i10 != 0) {
            charSequence = getResources().getText(i10);
        } else {
            charSequence = null;
        }
        setErrorAccessibilityLabel(charSequence);
    }

    public void setErrorShown(boolean z10) {
        if (this.f9828w == z10) {
            return;
        }
        this.f9828w = z10;
        refreshDrawableState();
        Iterator<c> it = this.f9823r.iterator();
        while (it.hasNext()) {
            it.next().a(this, this.f9828w);
        }
    }

    @Override // android.widget.CompoundButton
    public void setOnCheckedChangeListener(CompoundButton.OnCheckedChangeListener onCheckedChangeListener) {
        this.I = onCheckedChangeListener;
    }

    @Override // android.widget.CompoundButton, android.view.View
    public void setStateDescription(CharSequence charSequence) {
        this.H = charSequence;
        if (charSequence == null) {
            f();
        } else {
            super.setStateDescription(charSequence);
        }
    }

    public void setUseMaterialThemeColors(boolean z10) {
        this.f9826u = z10;
        if (z10) {
            androidx.core.widget.c.d(this, getMaterialThemeColorsTintList());
        } else {
            androidx.core.widget.c.d(this, null);
        }
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public void toggle() {
        setChecked(!isChecked());
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public MaterialCheckBox(android.content.Context r9, android.util.AttributeSet r10, int r11) {
        /*
            r8 = this;
            int r4 = com.google.android.material.checkbox.MaterialCheckBox.L
            android.content.Context r9 = s7.a.c(r9, r10, r11, r4)
            r8.<init>(r9, r10, r11)
            java.util.LinkedHashSet r9 = new java.util.LinkedHashSet
            r9.<init>()
            r8.f9823r = r9
            java.util.LinkedHashSet r9 = new java.util.LinkedHashSet
            r9.<init>()
            r8.f9824s = r9
            android.content.Context r9 = r8.getContext()
            int r0 = v6.e.f24706e
            androidx.vectordrawable.graphics.drawable.e r9 = androidx.vectordrawable.graphics.drawable.e.a(r9, r0)
            r8.J = r9
            com.google.android.material.checkbox.MaterialCheckBox$a r9 = new com.google.android.material.checkbox.MaterialCheckBox$a
            r9.<init>()
            r8.K = r9
            android.content.Context r9 = r8.getContext()
            android.graphics.drawable.Drawable r0 = androidx.core.widget.c.a(r8)
            r8.f9830y = r0
            android.content.res.ColorStateList r0 = r8.getSuperButtonTintList()
            r8.B = r0
            r6 = 0
            r8.setSupportButtonTintList(r6)
            int[] r2 = v6.l.f25052x4
            r7 = 0
            int[] r5 = new int[r7]
            r0 = r9
            r1 = r10
            r3 = r11
            androidx.appcompat.widget.g1 r10 = com.google.android.material.internal.p.j(r0, r1, r2, r3, r4, r5)
            int r11 = v6.l.A4
            android.graphics.drawable.Drawable r11 = r10.g(r11)
            r8.f9831z = r11
            android.graphics.drawable.Drawable r11 = r8.f9830y
            r0 = 1
            if (r11 == 0) goto L7c
            boolean r11 = com.google.android.material.internal.p.g(r9)
            if (r11 == 0) goto L7c
            boolean r11 = r8.c(r10)
            if (r11 == 0) goto L7c
            super.setButtonDrawable(r6)
            int r11 = v6.e.f24705d
            android.graphics.drawable.Drawable r11 = h.a.b(r9, r11)
            r8.f9830y = r11
            r8.A = r0
            android.graphics.drawable.Drawable r11 = r8.f9831z
            if (r11 != 0) goto L7c
            int r11 = v6.e.f24707f
            android.graphics.drawable.Drawable r11 = h.a.b(r9, r11)
            r8.f9831z = r11
        L7c:
            int r11 = v6.l.B4
            android.content.res.ColorStateList r9 = m7.c.b(r9, r10, r11)
            r8.C = r9
            int r9 = v6.l.C4
            r11 = -1
            int r9 = r10.k(r9, r11)
            android.graphics.PorterDuff$Mode r11 = android.graphics.PorterDuff.Mode.SRC_IN
            android.graphics.PorterDuff$Mode r9 = com.google.android.material.internal.r.g(r9, r11)
            r8.D = r9
            int r9 = v6.l.H4
            boolean r9 = r10.a(r9, r7)
            r8.f9826u = r9
            int r9 = v6.l.D4
            boolean r9 = r10.a(r9, r0)
            r8.f9827v = r9
            int r9 = v6.l.G4
            boolean r9 = r10.a(r9, r7)
            r8.f9828w = r9
            int r9 = v6.l.F4
            java.lang.CharSequence r9 = r10.p(r9)
            r8.f9829x = r9
            int r9 = v6.l.E4
            boolean r11 = r10.s(r9)
            if (r11 == 0) goto Lc2
            int r9 = r10.k(r9, r7)
            r8.setCheckedState(r9)
        Lc2:
            r10.w()
            r8.e()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.checkbox.MaterialCheckBox.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }

    @Override // androidx.appcompat.widget.f, android.widget.CompoundButton
    public void setButtonDrawable(Drawable drawable) {
        this.f9830y = drawable;
        this.A = false;
        e();
    }

    private void i() {
    }
}
