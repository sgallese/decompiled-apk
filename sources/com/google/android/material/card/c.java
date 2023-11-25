package com.google.android.material.card;

import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Build;
import android.util.AttributeSet;
import androidx.core.view.p0;
import p7.d;
import p7.e;
import p7.g;
import p7.j;
import p7.k;
import v6.f;
import v6.l;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: MaterialCardViewHelper.java */
/* loaded from: classes3.dex */
public class c {
    private static final Drawable A;

    /* renamed from: z  reason: collision with root package name */
    private static final double f9754z = Math.cos(Math.toRadians(45.0d));

    /* renamed from: a  reason: collision with root package name */
    private final MaterialCardView f9755a;

    /* renamed from: c  reason: collision with root package name */
    private final g f9757c;

    /* renamed from: d  reason: collision with root package name */
    private final g f9758d;

    /* renamed from: e  reason: collision with root package name */
    private int f9759e;

    /* renamed from: f  reason: collision with root package name */
    private int f9760f;

    /* renamed from: g  reason: collision with root package name */
    private int f9761g;

    /* renamed from: h  reason: collision with root package name */
    private int f9762h;

    /* renamed from: i  reason: collision with root package name */
    private Drawable f9763i;

    /* renamed from: j  reason: collision with root package name */
    private Drawable f9764j;

    /* renamed from: k  reason: collision with root package name */
    private ColorStateList f9765k;

    /* renamed from: l  reason: collision with root package name */
    private ColorStateList f9766l;

    /* renamed from: m  reason: collision with root package name */
    private k f9767m;

    /* renamed from: n  reason: collision with root package name */
    private ColorStateList f9768n;

    /* renamed from: o  reason: collision with root package name */
    private Drawable f9769o;

    /* renamed from: p  reason: collision with root package name */
    private LayerDrawable f9770p;

    /* renamed from: q  reason: collision with root package name */
    private g f9771q;

    /* renamed from: r  reason: collision with root package name */
    private g f9772r;

    /* renamed from: t  reason: collision with root package name */
    private boolean f9774t;

    /* renamed from: u  reason: collision with root package name */
    private ValueAnimator f9775u;

    /* renamed from: v  reason: collision with root package name */
    private final TimeInterpolator f9776v;

    /* renamed from: w  reason: collision with root package name */
    private final int f9777w;

    /* renamed from: x  reason: collision with root package name */
    private final int f9778x;

    /* renamed from: b  reason: collision with root package name */
    private final Rect f9756b = new Rect();

    /* renamed from: s  reason: collision with root package name */
    private boolean f9773s = false;

    /* renamed from: y  reason: collision with root package name */
    private float f9779y = 0.0f;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: MaterialCardViewHelper.java */
    /* loaded from: classes3.dex */
    public class a extends InsetDrawable {
        a(Drawable drawable, int i10, int i11, int i12, int i13) {
            super(drawable, i10, i11, i12, i13);
        }

        @Override // android.graphics.drawable.Drawable
        public int getMinimumHeight() {
            return -1;
        }

        @Override // android.graphics.drawable.Drawable
        public int getMinimumWidth() {
            return -1;
        }

        @Override // android.graphics.drawable.InsetDrawable, android.graphics.drawable.DrawableWrapper, android.graphics.drawable.Drawable
        public boolean getPadding(Rect rect) {
            return false;
        }
    }

    static {
        ColorDrawable colorDrawable;
        if (Build.VERSION.SDK_INT <= 28) {
            colorDrawable = new ColorDrawable();
        } else {
            colorDrawable = null;
        }
        A = colorDrawable;
    }

    public c(MaterialCardView materialCardView, AttributeSet attributeSet, int i10, int i11) {
        this.f9755a = materialCardView;
        g gVar = new g(materialCardView.getContext(), attributeSet, i10, i11);
        this.f9757c = gVar;
        gVar.Q(materialCardView.getContext());
        gVar.g0(-12303292);
        k.b v10 = gVar.E().v();
        TypedArray obtainStyledAttributes = materialCardView.getContext().obtainStyledAttributes(attributeSet, l.N0, i10, v6.k.f24791a);
        int i12 = l.O0;
        if (obtainStyledAttributes.hasValue(i12)) {
            v10.o(obtainStyledAttributes.getDimension(i12, 0.0f));
        }
        this.f9758d = new g();
        Z(v10.m());
        this.f9776v = j7.a.g(materialCardView.getContext(), v6.b.P, w6.a.f25410a);
        this.f9777w = j7.a.f(materialCardView.getContext(), v6.b.J, 300);
        this.f9778x = j7.a.f(materialCardView.getContext(), v6.b.I, 300);
        obtainStyledAttributes.recycle();
    }

    private Drawable D(Drawable drawable) {
        int i10;
        int i11;
        if (this.f9755a.getUseCompatPadding()) {
            i11 = (int) Math.ceil(f());
            i10 = (int) Math.ceil(e());
        } else {
            i10 = 0;
            i11 = 0;
        }
        return new a(drawable, i10, i11, i10, i11);
    }

    private boolean G() {
        if ((this.f9761g & 80) == 80) {
            return true;
        }
        return false;
    }

    private boolean H() {
        if ((this.f9761g & 8388613) == 8388613) {
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void I(ValueAnimator valueAnimator) {
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        this.f9764j.setAlpha((int) (255.0f * floatValue));
        this.f9779y = floatValue;
    }

    private float c() {
        return Math.max(Math.max(d(this.f9767m.q(), this.f9757c.J()), d(this.f9767m.s(), this.f9757c.K())), Math.max(d(this.f9767m.k(), this.f9757c.t()), d(this.f9767m.i(), this.f9757c.s())));
    }

    private float d(d dVar, float f10) {
        if (dVar instanceof j) {
            return (float) ((1.0d - f9754z) * f10);
        }
        if (dVar instanceof e) {
            return f10 / 2.0f;
        }
        return 0.0f;
    }

    private boolean d0() {
        if (this.f9755a.getPreventCornerOverlap() && !g()) {
            return true;
        }
        return false;
    }

    private float e() {
        float f10;
        float maxCardElevation = this.f9755a.getMaxCardElevation();
        if (e0()) {
            f10 = c();
        } else {
            f10 = 0.0f;
        }
        return maxCardElevation + f10;
    }

    private boolean e0() {
        if (this.f9755a.getPreventCornerOverlap() && g() && this.f9755a.getUseCompatPadding()) {
            return true;
        }
        return false;
    }

    private float f() {
        float f10;
        float maxCardElevation = this.f9755a.getMaxCardElevation() * 1.5f;
        if (e0()) {
            f10 = c();
        } else {
            f10 = 0.0f;
        }
        return maxCardElevation + f10;
    }

    private boolean g() {
        if (this.f9757c.T()) {
            return true;
        }
        return false;
    }

    private Drawable h() {
        StateListDrawable stateListDrawable = new StateListDrawable();
        g j10 = j();
        this.f9771q = j10;
        j10.b0(this.f9765k);
        stateListDrawable.addState(new int[]{16842919}, this.f9771q);
        return stateListDrawable;
    }

    private Drawable i() {
        if (n7.b.f20271a) {
            this.f9772r = j();
            return new RippleDrawable(this.f9765k, null, this.f9772r);
        }
        return h();
    }

    private void i0(Drawable drawable) {
        if (Build.VERSION.SDK_INT >= 23 && (this.f9755a.getForeground() instanceof InsetDrawable)) {
            ((InsetDrawable) this.f9755a.getForeground()).setDrawable(drawable);
        } else {
            this.f9755a.setForeground(D(drawable));
        }
    }

    private g j() {
        return new g(this.f9767m);
    }

    private void k0() {
        Drawable drawable;
        if (n7.b.f20271a && (drawable = this.f9769o) != null) {
            ((RippleDrawable) drawable).setColor(this.f9765k);
            return;
        }
        g gVar = this.f9771q;
        if (gVar != null) {
            gVar.b0(this.f9765k);
        }
    }

    private Drawable t() {
        if (this.f9769o == null) {
            this.f9769o = i();
        }
        if (this.f9770p == null) {
            LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{this.f9769o, this.f9758d, this.f9764j});
            this.f9770p = layerDrawable;
            layerDrawable.setId(2, f.E);
        }
        return this.f9770p;
    }

    private float v() {
        if (this.f9755a.getPreventCornerOverlap() && this.f9755a.getUseCompatPadding()) {
            return (float) ((1.0d - f9754z) * this.f9755a.getCardViewRadius());
        }
        return 0.0f;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public ColorStateList A() {
        return this.f9768n;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int B() {
        return this.f9762h;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Rect C() {
        return this.f9756b;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean E() {
        return this.f9773s;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean F() {
        return this.f9774t;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void J(TypedArray typedArray) {
        Drawable drawable;
        ColorStateList a10 = m7.c.a(this.f9755a.getContext(), typedArray, l.f25032v4);
        this.f9768n = a10;
        if (a10 == null) {
            this.f9768n = ColorStateList.valueOf(-1);
        }
        this.f9762h = typedArray.getDimensionPixelSize(l.f25042w4, 0);
        boolean z10 = typedArray.getBoolean(l.f24952n4, false);
        this.f9774t = z10;
        this.f9755a.setLongClickable(z10);
        this.f9766l = m7.c.a(this.f9755a.getContext(), typedArray, l.f25012t4);
        R(m7.c.d(this.f9755a.getContext(), typedArray, l.f24972p4));
        U(typedArray.getDimensionPixelSize(l.f25002s4, 0));
        T(typedArray.getDimensionPixelSize(l.f24992r4, 0));
        this.f9761g = typedArray.getInteger(l.f24982q4, 8388661);
        ColorStateList a11 = m7.c.a(this.f9755a.getContext(), typedArray, l.f25022u4);
        this.f9765k = a11;
        if (a11 == null) {
            this.f9765k = ColorStateList.valueOf(d7.a.d(this.f9755a, v6.b.f24641k));
        }
        N(m7.c.a(this.f9755a.getContext(), typedArray, l.f24962o4));
        k0();
        h0();
        l0();
        this.f9755a.setBackgroundInternal(D(this.f9757c));
        if (this.f9755a.isClickable()) {
            drawable = t();
        } else {
            drawable = this.f9758d;
        }
        this.f9763i = drawable;
        this.f9755a.setForeground(D(drawable));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void K(int i10, int i11) {
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        if (this.f9770p != null) {
            if (this.f9755a.getUseCompatPadding()) {
                i12 = (int) Math.ceil(f() * 2.0f);
                i13 = (int) Math.ceil(e() * 2.0f);
            } else {
                i12 = 0;
                i13 = 0;
            }
            if (H()) {
                i14 = ((i10 - this.f9759e) - this.f9760f) - i13;
            } else {
                i14 = this.f9759e;
            }
            if (G()) {
                i15 = this.f9759e;
            } else {
                i15 = ((i11 - this.f9759e) - this.f9760f) - i12;
            }
            int i20 = i15;
            if (H()) {
                i16 = this.f9759e;
            } else {
                i16 = ((i10 - this.f9759e) - this.f9760f) - i13;
            }
            if (G()) {
                i17 = ((i11 - this.f9759e) - this.f9760f) - i12;
            } else {
                i17 = this.f9759e;
            }
            int i21 = i17;
            if (p0.E(this.f9755a) == 1) {
                i19 = i16;
                i18 = i14;
            } else {
                i18 = i16;
                i19 = i14;
            }
            this.f9770p.setLayerInset(2, i19, i21, i18, i20);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void L(boolean z10) {
        this.f9773s = z10;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void M(ColorStateList colorStateList) {
        this.f9757c.b0(colorStateList);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void N(ColorStateList colorStateList) {
        g gVar = this.f9758d;
        if (colorStateList == null) {
            colorStateList = ColorStateList.valueOf(0);
        }
        gVar.b0(colorStateList);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void O(boolean z10) {
        this.f9774t = z10;
    }

    public void P(boolean z10) {
        Q(z10, false);
    }

    public void Q(boolean z10, boolean z11) {
        int i10;
        float f10;
        Drawable drawable = this.f9764j;
        if (drawable != null) {
            if (z11) {
                b(z10);
                return;
            }
            if (z10) {
                i10 = 255;
            } else {
                i10 = 0;
            }
            drawable.setAlpha(i10);
            if (z10) {
                f10 = 1.0f;
            } else {
                f10 = 0.0f;
            }
            this.f9779y = f10;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void R(Drawable drawable) {
        if (drawable != null) {
            Drawable mutate = androidx.core.graphics.drawable.a.r(drawable).mutate();
            this.f9764j = mutate;
            androidx.core.graphics.drawable.a.o(mutate, this.f9766l);
            P(this.f9755a.isChecked());
        } else {
            this.f9764j = A;
        }
        LayerDrawable layerDrawable = this.f9770p;
        if (layerDrawable != null) {
            layerDrawable.setDrawableByLayerId(f.E, this.f9764j);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void S(int i10) {
        this.f9761g = i10;
        K(this.f9755a.getMeasuredWidth(), this.f9755a.getMeasuredHeight());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void T(int i10) {
        this.f9759e = i10;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void U(int i10) {
        this.f9760f = i10;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void V(ColorStateList colorStateList) {
        this.f9766l = colorStateList;
        Drawable drawable = this.f9764j;
        if (drawable != null) {
            androidx.core.graphics.drawable.a.o(drawable, colorStateList);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void W(float f10) {
        Z(this.f9767m.w(f10));
        this.f9763i.invalidateSelf();
        if (e0() || d0()) {
            g0();
        }
        if (e0()) {
            j0();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void X(float f10) {
        this.f9757c.c0(f10);
        g gVar = this.f9758d;
        if (gVar != null) {
            gVar.c0(f10);
        }
        g gVar2 = this.f9772r;
        if (gVar2 != null) {
            gVar2.c0(f10);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void Y(ColorStateList colorStateList) {
        this.f9765k = colorStateList;
        k0();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void Z(k kVar) {
        this.f9767m = kVar;
        this.f9757c.setShapeAppearanceModel(kVar);
        this.f9757c.f0(!r0.T());
        g gVar = this.f9758d;
        if (gVar != null) {
            gVar.setShapeAppearanceModel(kVar);
        }
        g gVar2 = this.f9772r;
        if (gVar2 != null) {
            gVar2.setShapeAppearanceModel(kVar);
        }
        g gVar3 = this.f9771q;
        if (gVar3 != null) {
            gVar3.setShapeAppearanceModel(kVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a0(ColorStateList colorStateList) {
        if (this.f9768n == colorStateList) {
            return;
        }
        this.f9768n = colorStateList;
        l0();
    }

    public void b(boolean z10) {
        float f10;
        float f11;
        int i10;
        if (z10) {
            f10 = 1.0f;
        } else {
            f10 = 0.0f;
        }
        if (z10) {
            f11 = 1.0f - this.f9779y;
        } else {
            f11 = this.f9779y;
        }
        ValueAnimator valueAnimator = this.f9775u;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.f9775u = null;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.f9779y, f10);
        this.f9775u = ofFloat;
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.google.android.material.card.b
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                c.this.I(valueAnimator2);
            }
        });
        this.f9775u.setInterpolator(this.f9776v);
        ValueAnimator valueAnimator2 = this.f9775u;
        if (z10) {
            i10 = this.f9777w;
        } else {
            i10 = this.f9778x;
        }
        valueAnimator2.setDuration(i10 * f11);
        this.f9775u.start();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void b0(int i10) {
        if (i10 == this.f9762h) {
            return;
        }
        this.f9762h = i10;
        l0();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void c0(int i10, int i11, int i12, int i13) {
        this.f9756b.set(i10, i11, i12, i13);
        g0();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void f0() {
        Drawable drawable;
        Drawable drawable2 = this.f9763i;
        if (this.f9755a.isClickable()) {
            drawable = t();
        } else {
            drawable = this.f9758d;
        }
        this.f9763i = drawable;
        if (drawable2 != drawable) {
            i0(drawable);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void g0() {
        boolean z10;
        float f10;
        if (!d0() && !e0()) {
            z10 = false;
        } else {
            z10 = true;
        }
        if (z10) {
            f10 = c();
        } else {
            f10 = 0.0f;
        }
        int v10 = (int) (f10 - v());
        MaterialCardView materialCardView = this.f9755a;
        Rect rect = this.f9756b;
        materialCardView.i(rect.left + v10, rect.top + v10, rect.right + v10, rect.bottom + v10);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void h0() {
        this.f9757c.a0(this.f9755a.getCardElevation());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void j0() {
        if (!E()) {
            this.f9755a.setBackgroundInternal(D(this.f9757c));
        }
        this.f9755a.setForeground(D(this.f9763i));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void k() {
        Drawable drawable = this.f9769o;
        if (drawable != null) {
            Rect bounds = drawable.getBounds();
            int i10 = bounds.bottom;
            this.f9769o.setBounds(bounds.left, bounds.top, bounds.right, i10 - 1);
            this.f9769o.setBounds(bounds.left, bounds.top, bounds.right, i10);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public g l() {
        return this.f9757c;
    }

    void l0() {
        this.f9758d.i0(this.f9762h, this.f9768n);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public ColorStateList m() {
        return this.f9757c.x();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public ColorStateList n() {
        return this.f9758d.x();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Drawable o() {
        return this.f9764j;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int p() {
        return this.f9761g;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int q() {
        return this.f9759e;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int r() {
        return this.f9760f;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public ColorStateList s() {
        return this.f9766l;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public float u() {
        return this.f9757c.J();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public float w() {
        return this.f9757c.y();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public ColorStateList x() {
        return this.f9765k;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public k y() {
        return this.f9767m;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int z() {
        ColorStateList colorStateList = this.f9768n;
        if (colorStateList == null) {
            return -1;
        }
        return colorStateList.getDefaultColor();
    }
}
