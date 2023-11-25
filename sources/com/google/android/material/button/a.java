package com.google.android.material.button;

import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import androidx.core.view.p0;
import com.google.android.material.internal.r;
import m7.c;
import p7.g;
import p7.k;
import p7.n;
import v6.b;
import v6.l;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: MaterialButtonHelper.java */
/* loaded from: classes3.dex */
public class a {

    /* renamed from: u  reason: collision with root package name */
    private static final boolean f9727u;

    /* renamed from: v  reason: collision with root package name */
    private static final boolean f9728v;

    /* renamed from: a  reason: collision with root package name */
    private final MaterialButton f9729a;

    /* renamed from: b  reason: collision with root package name */
    private k f9730b;

    /* renamed from: c  reason: collision with root package name */
    private int f9731c;

    /* renamed from: d  reason: collision with root package name */
    private int f9732d;

    /* renamed from: e  reason: collision with root package name */
    private int f9733e;

    /* renamed from: f  reason: collision with root package name */
    private int f9734f;

    /* renamed from: g  reason: collision with root package name */
    private int f9735g;

    /* renamed from: h  reason: collision with root package name */
    private int f9736h;

    /* renamed from: i  reason: collision with root package name */
    private PorterDuff.Mode f9737i;

    /* renamed from: j  reason: collision with root package name */
    private ColorStateList f9738j;

    /* renamed from: k  reason: collision with root package name */
    private ColorStateList f9739k;

    /* renamed from: l  reason: collision with root package name */
    private ColorStateList f9740l;

    /* renamed from: m  reason: collision with root package name */
    private Drawable f9741m;

    /* renamed from: q  reason: collision with root package name */
    private boolean f9745q;

    /* renamed from: s  reason: collision with root package name */
    private LayerDrawable f9747s;

    /* renamed from: t  reason: collision with root package name */
    private int f9748t;

    /* renamed from: n  reason: collision with root package name */
    private boolean f9742n = false;

    /* renamed from: o  reason: collision with root package name */
    private boolean f9743o = false;

    /* renamed from: p  reason: collision with root package name */
    private boolean f9744p = false;

    /* renamed from: r  reason: collision with root package name */
    private boolean f9746r = true;

    static {
        int i10 = Build.VERSION.SDK_INT;
        boolean z10 = true;
        f9727u = true;
        if (i10 > 22) {
            z10 = false;
        }
        f9728v = z10;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public a(MaterialButton materialButton, k kVar) {
        this.f9729a = materialButton;
        this.f9730b = kVar;
    }

    private void G(int i10, int i11) {
        int J = p0.J(this.f9729a);
        int paddingTop = this.f9729a.getPaddingTop();
        int I = p0.I(this.f9729a);
        int paddingBottom = this.f9729a.getPaddingBottom();
        int i12 = this.f9733e;
        int i13 = this.f9734f;
        this.f9734f = i11;
        this.f9733e = i10;
        if (!this.f9743o) {
            H();
        }
        p0.K0(this.f9729a, J, (paddingTop + i10) - i12, I, (paddingBottom + i11) - i13);
    }

    private void H() {
        this.f9729a.setInternalBackground(a());
        g f10 = f();
        if (f10 != null) {
            f10.a0(this.f9748t);
            f10.setState(this.f9729a.getDrawableState());
        }
    }

    private void I(k kVar) {
        if (f9728v && !this.f9743o) {
            int J = p0.J(this.f9729a);
            int paddingTop = this.f9729a.getPaddingTop();
            int I = p0.I(this.f9729a);
            int paddingBottom = this.f9729a.getPaddingBottom();
            H();
            p0.K0(this.f9729a, J, paddingTop, I, paddingBottom);
            return;
        }
        if (f() != null) {
            f().setShapeAppearanceModel(kVar);
        }
        if (n() != null) {
            n().setShapeAppearanceModel(kVar);
        }
        if (e() != null) {
            e().setShapeAppearanceModel(kVar);
        }
    }

    private void K() {
        int i10;
        g f10 = f();
        g n10 = n();
        if (f10 != null) {
            f10.i0(this.f9736h, this.f9739k);
            if (n10 != null) {
                float f11 = this.f9736h;
                if (this.f9742n) {
                    i10 = d7.a.d(this.f9729a, b.f24647q);
                } else {
                    i10 = 0;
                }
                n10.h0(f11, i10);
            }
        }
    }

    private InsetDrawable L(Drawable drawable) {
        return new InsetDrawable(drawable, this.f9731c, this.f9733e, this.f9732d, this.f9734f);
    }

    private Drawable a() {
        int i10;
        g gVar = new g(this.f9730b);
        gVar.Q(this.f9729a.getContext());
        androidx.core.graphics.drawable.a.o(gVar, this.f9738j);
        PorterDuff.Mode mode = this.f9737i;
        if (mode != null) {
            androidx.core.graphics.drawable.a.p(gVar, mode);
        }
        gVar.i0(this.f9736h, this.f9739k);
        g gVar2 = new g(this.f9730b);
        gVar2.setTint(0);
        float f10 = this.f9736h;
        if (this.f9742n) {
            i10 = d7.a.d(this.f9729a, b.f24647q);
        } else {
            i10 = 0;
        }
        gVar2.h0(f10, i10);
        if (f9727u) {
            g gVar3 = new g(this.f9730b);
            this.f9741m = gVar3;
            androidx.core.graphics.drawable.a.n(gVar3, -1);
            RippleDrawable rippleDrawable = new RippleDrawable(n7.b.e(this.f9740l), L(new LayerDrawable(new Drawable[]{gVar2, gVar})), this.f9741m);
            this.f9747s = rippleDrawable;
            return rippleDrawable;
        }
        n7.a aVar = new n7.a(this.f9730b);
        this.f9741m = aVar;
        androidx.core.graphics.drawable.a.o(aVar, n7.b.e(this.f9740l));
        LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{gVar2, gVar, this.f9741m});
        this.f9747s = layerDrawable;
        return L(layerDrawable);
    }

    private g g(boolean z10) {
        LayerDrawable layerDrawable = this.f9747s;
        if (layerDrawable != null && layerDrawable.getNumberOfLayers() > 0) {
            if (f9727u) {
                return (g) ((LayerDrawable) ((InsetDrawable) this.f9747s.getDrawable(0)).getDrawable()).getDrawable(!z10 ? 1 : 0);
            }
            return (g) this.f9747s.getDrawable(!z10 ? 1 : 0);
        }
        return null;
    }

    private g n() {
        return g(true);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void A(boolean z10) {
        this.f9742n = z10;
        K();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void B(ColorStateList colorStateList) {
        if (this.f9739k != colorStateList) {
            this.f9739k = colorStateList;
            K();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void C(int i10) {
        if (this.f9736h != i10) {
            this.f9736h = i10;
            K();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void D(ColorStateList colorStateList) {
        if (this.f9738j != colorStateList) {
            this.f9738j = colorStateList;
            if (f() != null) {
                androidx.core.graphics.drawable.a.o(f(), this.f9738j);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void E(PorterDuff.Mode mode) {
        if (this.f9737i != mode) {
            this.f9737i = mode;
            if (f() != null && this.f9737i != null) {
                androidx.core.graphics.drawable.a.p(f(), this.f9737i);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void F(boolean z10) {
        this.f9746r = z10;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void J(int i10, int i11) {
        Drawable drawable = this.f9741m;
        if (drawable != null) {
            drawable.setBounds(this.f9731c, this.f9733e, i11 - this.f9732d, i10 - this.f9734f);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int b() {
        return this.f9735g;
    }

    public int c() {
        return this.f9734f;
    }

    public int d() {
        return this.f9733e;
    }

    public n e() {
        LayerDrawable layerDrawable = this.f9747s;
        if (layerDrawable != null && layerDrawable.getNumberOfLayers() > 1) {
            if (this.f9747s.getNumberOfLayers() > 2) {
                return (n) this.f9747s.getDrawable(2);
            }
            return (n) this.f9747s.getDrawable(1);
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public g f() {
        return g(false);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public ColorStateList h() {
        return this.f9740l;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public k i() {
        return this.f9730b;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public ColorStateList j() {
        return this.f9739k;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int k() {
        return this.f9736h;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public ColorStateList l() {
        return this.f9738j;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public PorterDuff.Mode m() {
        return this.f9737i;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean o() {
        return this.f9743o;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean p() {
        return this.f9745q;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean q() {
        return this.f9746r;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void r(TypedArray typedArray) {
        this.f9731c = typedArray.getDimensionPixelOffset(l.f25021u3, 0);
        this.f9732d = typedArray.getDimensionPixelOffset(l.f25031v3, 0);
        this.f9733e = typedArray.getDimensionPixelOffset(l.f25041w3, 0);
        this.f9734f = typedArray.getDimensionPixelOffset(l.f25051x3, 0);
        int i10 = l.B3;
        if (typedArray.hasValue(i10)) {
            int dimensionPixelSize = typedArray.getDimensionPixelSize(i10, -1);
            this.f9735g = dimensionPixelSize;
            z(this.f9730b.w(dimensionPixelSize));
            this.f9744p = true;
        }
        this.f9736h = typedArray.getDimensionPixelSize(l.L3, 0);
        this.f9737i = r.g(typedArray.getInt(l.A3, -1), PorterDuff.Mode.SRC_IN);
        this.f9738j = c.a(this.f9729a.getContext(), typedArray, l.f25071z3);
        this.f9739k = c.a(this.f9729a.getContext(), typedArray, l.K3);
        this.f9740l = c.a(this.f9729a.getContext(), typedArray, l.J3);
        this.f9745q = typedArray.getBoolean(l.f25061y3, false);
        this.f9748t = typedArray.getDimensionPixelSize(l.C3, 0);
        this.f9746r = typedArray.getBoolean(l.M3, true);
        int J = p0.J(this.f9729a);
        int paddingTop = this.f9729a.getPaddingTop();
        int I = p0.I(this.f9729a);
        int paddingBottom = this.f9729a.getPaddingBottom();
        if (typedArray.hasValue(l.f25011t3)) {
            t();
        } else {
            H();
        }
        p0.K0(this.f9729a, J + this.f9731c, paddingTop + this.f9733e, I + this.f9732d, paddingBottom + this.f9734f);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void s(int i10) {
        if (f() != null) {
            f().setTint(i10);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void t() {
        this.f9743o = true;
        this.f9729a.setSupportBackgroundTintList(this.f9738j);
        this.f9729a.setSupportBackgroundTintMode(this.f9737i);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void u(boolean z10) {
        this.f9745q = z10;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void v(int i10) {
        if (!this.f9744p || this.f9735g != i10) {
            this.f9735g = i10;
            this.f9744p = true;
            z(this.f9730b.w(i10));
        }
    }

    public void w(int i10) {
        G(this.f9733e, i10);
    }

    public void x(int i10) {
        G(i10, this.f9734f);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void y(ColorStateList colorStateList) {
        if (this.f9740l != colorStateList) {
            this.f9740l = colorStateList;
            boolean z10 = f9727u;
            if (z10 && (this.f9729a.getBackground() instanceof RippleDrawable)) {
                ((RippleDrawable) this.f9729a.getBackground()).setColor(n7.b.e(colorStateList));
            } else if (!z10 && (this.f9729a.getBackground() instanceof n7.a)) {
                ((n7.a) this.f9729a.getBackground()).setTintList(n7.b.e(colorStateList));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void z(k kVar) {
        this.f9730b = kVar;
        I(kVar);
    }
}
