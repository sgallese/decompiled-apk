package com.google.android.material.chip;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.os.Build;
import android.text.TextUtils;
import android.util.AttributeSet;
import com.google.android.material.internal.n;
import com.google.android.material.internal.p;
import com.google.android.material.internal.r;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import m7.c;
import m7.d;
import p7.g;
import v6.l;
import w6.h;

/* compiled from: ChipDrawable.java */
/* loaded from: classes3.dex */
public class a extends g implements Drawable.Callback, n.b {
    private static final int[] W0 = {16842910};
    private static final ShapeDrawable X0 = new ShapeDrawable(new OvalShape());
    private final n A0;
    private int B0;
    private int C0;
    private int D0;
    private int E0;
    private int F0;
    private int G0;
    private boolean H0;
    private int I0;
    private int J0;
    private ColorFilter K0;
    private PorterDuffColorFilter L0;
    private ColorStateList M;
    private ColorStateList M0;
    private ColorStateList N;
    private PorterDuff.Mode N0;
    private float O;
    private int[] O0;
    private float P;
    private boolean P0;
    private ColorStateList Q;
    private ColorStateList Q0;
    private float R;
    private WeakReference<InterfaceC0234a> R0;
    private ColorStateList S;
    private TextUtils.TruncateAt S0;
    private CharSequence T;
    private boolean T0;
    private boolean U;
    private int U0;
    private Drawable V;
    private boolean V0;
    private ColorStateList W;
    private float X;
    private boolean Y;
    private boolean Z;

    /* renamed from: a0  reason: collision with root package name */
    private Drawable f9846a0;

    /* renamed from: b0  reason: collision with root package name */
    private Drawable f9847b0;

    /* renamed from: c0  reason: collision with root package name */
    private ColorStateList f9848c0;

    /* renamed from: d0  reason: collision with root package name */
    private float f9849d0;

    /* renamed from: e0  reason: collision with root package name */
    private CharSequence f9850e0;

    /* renamed from: f0  reason: collision with root package name */
    private boolean f9851f0;

    /* renamed from: g0  reason: collision with root package name */
    private boolean f9852g0;

    /* renamed from: h0  reason: collision with root package name */
    private Drawable f9853h0;

    /* renamed from: i0  reason: collision with root package name */
    private ColorStateList f9854i0;

    /* renamed from: j0  reason: collision with root package name */
    private h f9855j0;

    /* renamed from: k0  reason: collision with root package name */
    private h f9856k0;

    /* renamed from: l0  reason: collision with root package name */
    private float f9857l0;

    /* renamed from: m0  reason: collision with root package name */
    private float f9858m0;

    /* renamed from: n0  reason: collision with root package name */
    private float f9859n0;

    /* renamed from: o0  reason: collision with root package name */
    private float f9860o0;

    /* renamed from: p0  reason: collision with root package name */
    private float f9861p0;

    /* renamed from: q0  reason: collision with root package name */
    private float f9862q0;

    /* renamed from: r0  reason: collision with root package name */
    private float f9863r0;

    /* renamed from: s0  reason: collision with root package name */
    private float f9864s0;

    /* renamed from: t0  reason: collision with root package name */
    private final Context f9865t0;

    /* renamed from: u0  reason: collision with root package name */
    private final Paint f9866u0;

    /* renamed from: v0  reason: collision with root package name */
    private final Paint f9867v0;

    /* renamed from: w0  reason: collision with root package name */
    private final Paint.FontMetrics f9868w0;

    /* renamed from: x0  reason: collision with root package name */
    private final RectF f9869x0;

    /* renamed from: y0  reason: collision with root package name */
    private final PointF f9870y0;

    /* renamed from: z0  reason: collision with root package name */
    private final Path f9871z0;

    /* compiled from: ChipDrawable.java */
    /* renamed from: com.google.android.material.chip.a$a  reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    public interface InterfaceC0234a {
        void a();
    }

    private a(Context context, AttributeSet attributeSet, int i10, int i11) {
        super(context, attributeSet, i10, i11);
        this.P = -1.0f;
        this.f9866u0 = new Paint(1);
        this.f9868w0 = new Paint.FontMetrics();
        this.f9869x0 = new RectF();
        this.f9870y0 = new PointF();
        this.f9871z0 = new Path();
        this.J0 = 255;
        this.N0 = PorterDuff.Mode.SRC_IN;
        this.R0 = new WeakReference<>(null);
        Q(context);
        this.f9865t0 = context;
        n nVar = new n(this);
        this.A0 = nVar;
        this.T = "";
        nVar.e().density = context.getResources().getDisplayMetrics().density;
        this.f9867v0 = null;
        int[] iArr = W0;
        setState(iArr);
        p2(iArr);
        this.T0 = true;
        if (n7.b.f20271a) {
            X0.setTint(-1);
        }
    }

    private void A0(Canvas canvas, Rect rect) {
        if (R2()) {
            p0(rect, this.f9869x0);
            RectF rectF = this.f9869x0;
            float f10 = rectF.left;
            float f11 = rectF.top;
            canvas.translate(f10, f11);
            this.f9853h0.setBounds(0, 0, (int) this.f9869x0.width(), (int) this.f9869x0.height());
            this.f9853h0.draw(canvas);
            canvas.translate(-f10, -f11);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:71:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0151  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0156  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private boolean A1(int[] r7, int[] r8) {
        /*
            Method dump skipped, instructions count: 346
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.chip.a.A1(int[], int[]):boolean");
    }

    private void B0(Canvas canvas, Rect rect) {
        if (!this.V0) {
            this.f9866u0.setColor(this.C0);
            this.f9866u0.setStyle(Paint.Style.FILL);
            this.f9866u0.setColorFilter(p1());
            this.f9869x0.set(rect);
            canvas.drawRoundRect(this.f9869x0, M0(), M0(), this.f9866u0);
        }
    }

    private void C0(Canvas canvas, Rect rect) {
        if (S2()) {
            p0(rect, this.f9869x0);
            RectF rectF = this.f9869x0;
            float f10 = rectF.left;
            float f11 = rectF.top;
            canvas.translate(f10, f11);
            this.V.setBounds(0, 0, (int) this.f9869x0.width(), (int) this.f9869x0.height());
            this.V.draw(canvas);
            canvas.translate(-f10, -f11);
        }
    }

    private void D0(Canvas canvas, Rect rect) {
        if (this.R > 0.0f && !this.V0) {
            this.f9866u0.setColor(this.E0);
            this.f9866u0.setStyle(Paint.Style.STROKE);
            if (!this.V0) {
                this.f9866u0.setColorFilter(p1());
            }
            RectF rectF = this.f9869x0;
            float f10 = rect.left;
            float f11 = this.R;
            rectF.set(f10 + (f11 / 2.0f), rect.top + (f11 / 2.0f), rect.right - (f11 / 2.0f), rect.bottom - (f11 / 2.0f));
            float f12 = this.P - (this.R / 2.0f);
            canvas.drawRoundRect(this.f9869x0, f12, f12, this.f9866u0);
        }
    }

    private void E0(Canvas canvas, Rect rect) {
        if (!this.V0) {
            this.f9866u0.setColor(this.B0);
            this.f9866u0.setStyle(Paint.Style.FILL);
            this.f9869x0.set(rect);
            canvas.drawRoundRect(this.f9869x0, M0(), M0(), this.f9866u0);
        }
    }

    private void F0(Canvas canvas, Rect rect) {
        if (T2()) {
            s0(rect, this.f9869x0);
            RectF rectF = this.f9869x0;
            float f10 = rectF.left;
            float f11 = rectF.top;
            canvas.translate(f10, f11);
            this.f9846a0.setBounds(0, 0, (int) this.f9869x0.width(), (int) this.f9869x0.height());
            if (n7.b.f20271a) {
                this.f9847b0.setBounds(this.f9846a0.getBounds());
                this.f9847b0.jumpToCurrentState();
                this.f9847b0.draw(canvas);
            } else {
                this.f9846a0.draw(canvas);
            }
            canvas.translate(-f10, -f11);
        }
    }

    private void G0(Canvas canvas, Rect rect) {
        this.f9866u0.setColor(this.F0);
        this.f9866u0.setStyle(Paint.Style.FILL);
        this.f9869x0.set(rect);
        if (!this.V0) {
            canvas.drawRoundRect(this.f9869x0, M0(), M0(), this.f9866u0);
            return;
        }
        h(new RectF(rect), this.f9871z0);
        super.p(canvas, this.f9866u0, this.f9871z0, u());
    }

    private void H0(Canvas canvas, Rect rect) {
        Paint paint = this.f9867v0;
        if (paint != null) {
            paint.setColor(androidx.core.graphics.a.k(-16777216, 127));
            canvas.drawRect(rect, this.f9867v0);
            if (S2() || R2()) {
                p0(rect, this.f9869x0);
                canvas.drawRect(this.f9869x0, this.f9867v0);
            }
            if (this.T != null) {
                canvas.drawLine(rect.left, rect.exactCenterY(), rect.right, rect.exactCenterY(), this.f9867v0);
            }
            if (T2()) {
                s0(rect, this.f9869x0);
                canvas.drawRect(this.f9869x0, this.f9867v0);
            }
            this.f9867v0.setColor(androidx.core.graphics.a.k(-65536, 127));
            r0(rect, this.f9869x0);
            canvas.drawRect(this.f9869x0, this.f9867v0);
            this.f9867v0.setColor(androidx.core.graphics.a.k(-16711936, 127));
            t0(rect, this.f9869x0);
            canvas.drawRect(this.f9869x0, this.f9867v0);
        }
    }

    private void I0(Canvas canvas, Rect rect) {
        boolean z10;
        if (this.T != null) {
            Paint.Align x02 = x0(rect, this.f9870y0);
            v0(rect, this.f9869x0);
            if (this.A0.d() != null) {
                this.A0.e().drawableState = getState();
                this.A0.j(this.f9865t0);
            }
            this.A0.e().setTextAlign(x02);
            int i10 = 0;
            if (Math.round(this.A0.f(l1().toString())) > Math.round(this.f9869x0.width())) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                i10 = canvas.save();
                canvas.clipRect(this.f9869x0);
            }
            CharSequence charSequence = this.T;
            if (z10 && this.S0 != null) {
                charSequence = TextUtils.ellipsize(charSequence, this.A0.e(), this.f9869x0.width(), this.S0);
            }
            CharSequence charSequence2 = charSequence;
            int length = charSequence2.length();
            PointF pointF = this.f9870y0;
            canvas.drawText(charSequence2, 0, length, pointF.x, pointF.y, this.A0.e());
            if (z10) {
                canvas.restoreToCount(i10);
            }
        }
    }

    private boolean R2() {
        if (this.f9852g0 && this.f9853h0 != null && this.H0) {
            return true;
        }
        return false;
    }

    private boolean S2() {
        if (this.U && this.V != null) {
            return true;
        }
        return false;
    }

    private boolean T2() {
        if (this.Z && this.f9846a0 != null) {
            return true;
        }
        return false;
    }

    private void U2(Drawable drawable) {
        if (drawable != null) {
            drawable.setCallback(null);
        }
    }

    private void V2() {
        ColorStateList colorStateList;
        if (this.P0) {
            colorStateList = n7.b.e(this.S);
        } else {
            colorStateList = null;
        }
        this.Q0 = colorStateList;
    }

    @TargetApi(21)
    private void W2() {
        this.f9847b0 = new RippleDrawable(n7.b.e(j1()), this.f9846a0, X0);
    }

    private float d1() {
        Drawable drawable;
        if (this.H0) {
            drawable = this.f9853h0;
        } else {
            drawable = this.V;
        }
        float f10 = this.X;
        if (f10 <= 0.0f && drawable != null) {
            f10 = (float) Math.ceil(r.c(this.f9865t0, 24));
            if (drawable.getIntrinsicHeight() <= f10) {
                return drawable.getIntrinsicHeight();
            }
        }
        return f10;
    }

    private float e1() {
        Drawable drawable;
        if (this.H0) {
            drawable = this.f9853h0;
        } else {
            drawable = this.V;
        }
        float f10 = this.X;
        if (f10 <= 0.0f && drawable != null) {
            return drawable.getIntrinsicWidth();
        }
        return f10;
    }

    private void f2(ColorStateList colorStateList) {
        if (this.M != colorStateList) {
            this.M = colorStateList;
            onStateChange(getState());
        }
    }

    private void o0(Drawable drawable) {
        if (drawable == null) {
            return;
        }
        drawable.setCallback(this);
        androidx.core.graphics.drawable.a.m(drawable, androidx.core.graphics.drawable.a.f(this));
        drawable.setLevel(getLevel());
        drawable.setVisible(isVisible(), false);
        if (drawable == this.f9846a0) {
            if (drawable.isStateful()) {
                drawable.setState(a1());
            }
            androidx.core.graphics.drawable.a.o(drawable, this.f9848c0);
            return;
        }
        Drawable drawable2 = this.V;
        if (drawable == drawable2 && this.Y) {
            androidx.core.graphics.drawable.a.o(drawable2, this.W);
        }
        if (drawable.isStateful()) {
            drawable.setState(getState());
        }
    }

    private void p0(Rect rect, RectF rectF) {
        rectF.setEmpty();
        if (S2() || R2()) {
            float f10 = this.f9857l0 + this.f9858m0;
            float e12 = e1();
            if (androidx.core.graphics.drawable.a.f(this) == 0) {
                float f11 = rect.left + f10;
                rectF.left = f11;
                rectF.right = f11 + e12;
            } else {
                float f12 = rect.right - f10;
                rectF.right = f12;
                rectF.left = f12 - e12;
            }
            float d12 = d1();
            float exactCenterY = rect.exactCenterY() - (d12 / 2.0f);
            rectF.top = exactCenterY;
            rectF.bottom = exactCenterY + d12;
        }
    }

    private ColorFilter p1() {
        ColorFilter colorFilter = this.K0;
        if (colorFilter == null) {
            return this.L0;
        }
        return colorFilter;
    }

    private void r0(Rect rect, RectF rectF) {
        rectF.set(rect);
        if (T2()) {
            float f10 = this.f9864s0 + this.f9863r0 + this.f9849d0 + this.f9862q0 + this.f9861p0;
            if (androidx.core.graphics.drawable.a.f(this) == 0) {
                rectF.right = rect.right - f10;
            } else {
                rectF.left = rect.left + f10;
            }
        }
    }

    private static boolean r1(int[] iArr, int i10) {
        if (iArr == null) {
            return false;
        }
        for (int i11 : iArr) {
            if (i11 == i10) {
                return true;
            }
        }
        return false;
    }

    private void s0(Rect rect, RectF rectF) {
        rectF.setEmpty();
        if (T2()) {
            float f10 = this.f9864s0 + this.f9863r0;
            if (androidx.core.graphics.drawable.a.f(this) == 0) {
                float f11 = rect.right - f10;
                rectF.right = f11;
                rectF.left = f11 - this.f9849d0;
            } else {
                float f12 = rect.left + f10;
                rectF.left = f12;
                rectF.right = f12 + this.f9849d0;
            }
            float exactCenterY = rect.exactCenterY();
            float f13 = this.f9849d0;
            float f14 = exactCenterY - (f13 / 2.0f);
            rectF.top = f14;
            rectF.bottom = f14 + f13;
        }
    }

    private void t0(Rect rect, RectF rectF) {
        rectF.setEmpty();
        if (T2()) {
            float f10 = this.f9864s0 + this.f9863r0 + this.f9849d0 + this.f9862q0 + this.f9861p0;
            if (androidx.core.graphics.drawable.a.f(this) == 0) {
                float f11 = rect.right;
                rectF.right = f11;
                rectF.left = f11 - f10;
            } else {
                int i10 = rect.left;
                rectF.left = i10;
                rectF.right = i10 + f10;
            }
            rectF.top = rect.top;
            rectF.bottom = rect.bottom;
        }
    }

    private void v0(Rect rect, RectF rectF) {
        rectF.setEmpty();
        if (this.T != null) {
            float q02 = this.f9857l0 + q0() + this.f9860o0;
            float u02 = this.f9864s0 + u0() + this.f9861p0;
            if (androidx.core.graphics.drawable.a.f(this) == 0) {
                rectF.left = rect.left + q02;
                rectF.right = rect.right - u02;
            } else {
                rectF.left = rect.left + u02;
                rectF.right = rect.right - q02;
            }
            rectF.top = rect.top;
            rectF.bottom = rect.bottom;
        }
    }

    private static boolean v1(ColorStateList colorStateList) {
        if (colorStateList != null && colorStateList.isStateful()) {
            return true;
        }
        return false;
    }

    private float w0() {
        this.A0.e().getFontMetrics(this.f9868w0);
        Paint.FontMetrics fontMetrics = this.f9868w0;
        return (fontMetrics.descent + fontMetrics.ascent) / 2.0f;
    }

    private static boolean w1(Drawable drawable) {
        if (drawable != null && drawable.isStateful()) {
            return true;
        }
        return false;
    }

    private static boolean x1(d dVar) {
        if (dVar != null && dVar.i() != null && dVar.i().isStateful()) {
            return true;
        }
        return false;
    }

    private boolean y0() {
        if (this.f9852g0 && this.f9853h0 != null && this.f9851f0) {
            return true;
        }
        return false;
    }

    private void y1(AttributeSet attributeSet, int i10, int i11) {
        TypedArray i12 = p.i(this.f9865t0, attributeSet, l.Q0, i10, i11, new int[0]);
        this.V0 = i12.hasValue(l.C1);
        f2(c.a(this.f9865t0, i12, l.f24969p1));
        J1(c.a(this.f9865t0, i12, l.f24839c1));
        X1(i12.getDimension(l.f24919k1, 0.0f));
        int i13 = l.f24849d1;
        if (i12.hasValue(i13)) {
            L1(i12.getDimension(i13, 0.0f));
        }
        b2(c.a(this.f9865t0, i12, l.f24949n1));
        d2(i12.getDimension(l.f24959o1, 0.0f));
        C2(c.a(this.f9865t0, i12, l.B1));
        H2(i12.getText(l.W0));
        d f10 = c.f(this.f9865t0, i12, l.R0);
        f10.l(i12.getDimension(l.S0, f10.j()));
        if (Build.VERSION.SDK_INT < 23) {
            f10.k(c.a(this.f9865t0, i12, l.T0));
        }
        I2(f10);
        int i14 = i12.getInt(l.U0, 0);
        if (i14 != 1) {
            if (i14 != 2) {
                if (i14 == 3) {
                    u2(TextUtils.TruncateAt.END);
                }
            } else {
                u2(TextUtils.TruncateAt.MIDDLE);
            }
        } else {
            u2(TextUtils.TruncateAt.START);
        }
        W1(i12.getBoolean(l.f24909j1, false));
        if (attributeSet != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "chipIconEnabled") != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "chipIconVisible") == null) {
            W1(i12.getBoolean(l.f24879g1, false));
        }
        P1(c.d(this.f9865t0, i12, l.f24869f1));
        int i15 = l.f24899i1;
        if (i12.hasValue(i15)) {
            T1(c.a(this.f9865t0, i12, i15));
        }
        R1(i12.getDimension(l.f24889h1, -1.0f));
        s2(i12.getBoolean(l.f25039w1, false));
        if (attributeSet != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "closeIconEnabled") != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "closeIconVisible") == null) {
            s2(i12.getBoolean(l.f24989r1, false));
        }
        g2(c.d(this.f9865t0, i12, l.f24979q1));
        q2(c.a(this.f9865t0, i12, l.f25029v1));
        l2(i12.getDimension(l.f25009t1, 0.0f));
        B1(i12.getBoolean(l.X0, false));
        I1(i12.getBoolean(l.f24829b1, false));
        if (attributeSet != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "checkedIconEnabled") != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "checkedIconVisible") == null) {
            I1(i12.getBoolean(l.Z0, false));
        }
        D1(c.d(this.f9865t0, i12, l.Y0));
        int i16 = l.f24819a1;
        if (i12.hasValue(i16)) {
            F1(c.a(this.f9865t0, i12, i16));
        }
        F2(h.b(this.f9865t0, i12, l.D1));
        v2(h.b(this.f9865t0, i12, l.f25059y1));
        Z1(i12.getDimension(l.f24939m1, 0.0f));
        z2(i12.getDimension(l.A1, 0.0f));
        x2(i12.getDimension(l.f25069z1, 0.0f));
        N2(i12.getDimension(l.F1, 0.0f));
        K2(i12.getDimension(l.E1, 0.0f));
        n2(i12.getDimension(l.f25019u1, 0.0f));
        i2(i12.getDimension(l.f24999s1, 0.0f));
        N1(i12.getDimension(l.f24859e1, 0.0f));
        B2(i12.getDimensionPixelSize(l.V0, Integer.MAX_VALUE));
        i12.recycle();
    }

    public static a z0(Context context, AttributeSet attributeSet, int i10, int i11) {
        a aVar = new a(context, attributeSet, i10, i11);
        aVar.y1(attributeSet, i10, i11);
        return aVar;
    }

    public void A2(int i10) {
        z2(this.f9865t0.getResources().getDimension(i10));
    }

    public void B1(boolean z10) {
        if (this.f9851f0 != z10) {
            this.f9851f0 = z10;
            float q02 = q0();
            if (!z10 && this.H0) {
                this.H0 = false;
            }
            float q03 = q0();
            invalidateSelf();
            if (q02 != q03) {
                z1();
            }
        }
    }

    public void B2(int i10) {
        this.U0 = i10;
    }

    public void C1(int i10) {
        B1(this.f9865t0.getResources().getBoolean(i10));
    }

    public void C2(ColorStateList colorStateList) {
        if (this.S != colorStateList) {
            this.S = colorStateList;
            V2();
            onStateChange(getState());
        }
    }

    public void D1(Drawable drawable) {
        if (this.f9853h0 != drawable) {
            float q02 = q0();
            this.f9853h0 = drawable;
            float q03 = q0();
            U2(this.f9853h0);
            o0(this.f9853h0);
            invalidateSelf();
            if (q02 != q03) {
                z1();
            }
        }
    }

    public void D2(int i10) {
        C2(h.a.a(this.f9865t0, i10));
    }

    public void E1(int i10) {
        D1(h.a.b(this.f9865t0, i10));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void E2(boolean z10) {
        this.T0 = z10;
    }

    public void F1(ColorStateList colorStateList) {
        if (this.f9854i0 != colorStateList) {
            this.f9854i0 = colorStateList;
            if (y0()) {
                androidx.core.graphics.drawable.a.o(this.f9853h0, colorStateList);
            }
            onStateChange(getState());
        }
    }

    public void F2(h hVar) {
        this.f9855j0 = hVar;
    }

    public void G1(int i10) {
        F1(h.a.a(this.f9865t0, i10));
    }

    public void G2(int i10) {
        F2(h.c(this.f9865t0, i10));
    }

    public void H1(int i10) {
        I1(this.f9865t0.getResources().getBoolean(i10));
    }

    public void H2(CharSequence charSequence) {
        if (charSequence == null) {
            charSequence = "";
        }
        if (!TextUtils.equals(this.T, charSequence)) {
            this.T = charSequence;
            this.A0.i(true);
            invalidateSelf();
            z1();
        }
    }

    public void I1(boolean z10) {
        boolean z11;
        if (this.f9852g0 != z10) {
            boolean R2 = R2();
            this.f9852g0 = z10;
            boolean R22 = R2();
            if (R2 != R22) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (z11) {
                if (R22) {
                    o0(this.f9853h0);
                } else {
                    U2(this.f9853h0);
                }
                invalidateSelf();
                z1();
            }
        }
    }

    public void I2(d dVar) {
        this.A0.h(dVar, this.f9865t0);
    }

    public Drawable J0() {
        return this.f9853h0;
    }

    public void J1(ColorStateList colorStateList) {
        if (this.N != colorStateList) {
            this.N = colorStateList;
            onStateChange(getState());
        }
    }

    public void J2(int i10) {
        I2(new d(this.f9865t0, i10));
    }

    public ColorStateList K0() {
        return this.f9854i0;
    }

    public void K1(int i10) {
        J1(h.a.a(this.f9865t0, i10));
    }

    public void K2(float f10) {
        if (this.f9861p0 != f10) {
            this.f9861p0 = f10;
            invalidateSelf();
            z1();
        }
    }

    public ColorStateList L0() {
        return this.N;
    }

    @Deprecated
    public void L1(float f10) {
        if (this.P != f10) {
            this.P = f10;
            setShapeAppearanceModel(E().w(f10));
        }
    }

    public void L2(int i10) {
        K2(this.f9865t0.getResources().getDimension(i10));
    }

    public float M0() {
        if (this.V0) {
            return J();
        }
        return this.P;
    }

    @Deprecated
    public void M1(int i10) {
        L1(this.f9865t0.getResources().getDimension(i10));
    }

    public void M2(float f10) {
        d m12 = m1();
        if (m12 != null) {
            m12.l(f10);
            this.A0.e().setTextSize(f10);
            a();
        }
    }

    public float N0() {
        return this.f9864s0;
    }

    public void N1(float f10) {
        if (this.f9864s0 != f10) {
            this.f9864s0 = f10;
            invalidateSelf();
            z1();
        }
    }

    public void N2(float f10) {
        if (this.f9860o0 != f10) {
            this.f9860o0 = f10;
            invalidateSelf();
            z1();
        }
    }

    public Drawable O0() {
        Drawable drawable = this.V;
        if (drawable != null) {
            return androidx.core.graphics.drawable.a.q(drawable);
        }
        return null;
    }

    public void O1(int i10) {
        N1(this.f9865t0.getResources().getDimension(i10));
    }

    public void O2(int i10) {
        N2(this.f9865t0.getResources().getDimension(i10));
    }

    public float P0() {
        return this.X;
    }

    public void P1(Drawable drawable) {
        Drawable drawable2;
        Drawable O0 = O0();
        if (O0 != drawable) {
            float q02 = q0();
            if (drawable != null) {
                drawable2 = androidx.core.graphics.drawable.a.r(drawable).mutate();
            } else {
                drawable2 = null;
            }
            this.V = drawable2;
            float q03 = q0();
            U2(O0);
            if (S2()) {
                o0(this.V);
            }
            invalidateSelf();
            if (q02 != q03) {
                z1();
            }
        }
    }

    public void P2(boolean z10) {
        if (this.P0 != z10) {
            this.P0 = z10;
            V2();
            onStateChange(getState());
        }
    }

    public ColorStateList Q0() {
        return this.W;
    }

    public void Q1(int i10) {
        P1(h.a.b(this.f9865t0, i10));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean Q2() {
        return this.T0;
    }

    public float R0() {
        return this.O;
    }

    public void R1(float f10) {
        if (this.X != f10) {
            float q02 = q0();
            this.X = f10;
            float q03 = q0();
            invalidateSelf();
            if (q02 != q03) {
                z1();
            }
        }
    }

    public float S0() {
        return this.f9857l0;
    }

    public void S1(int i10) {
        R1(this.f9865t0.getResources().getDimension(i10));
    }

    public ColorStateList T0() {
        return this.Q;
    }

    public void T1(ColorStateList colorStateList) {
        this.Y = true;
        if (this.W != colorStateList) {
            this.W = colorStateList;
            if (S2()) {
                androidx.core.graphics.drawable.a.o(this.V, colorStateList);
            }
            onStateChange(getState());
        }
    }

    public float U0() {
        return this.R;
    }

    public void U1(int i10) {
        T1(h.a.a(this.f9865t0, i10));
    }

    public Drawable V0() {
        Drawable drawable = this.f9846a0;
        if (drawable != null) {
            return androidx.core.graphics.drawable.a.q(drawable);
        }
        return null;
    }

    public void V1(int i10) {
        W1(this.f9865t0.getResources().getBoolean(i10));
    }

    public CharSequence W0() {
        return this.f9850e0;
    }

    public void W1(boolean z10) {
        boolean z11;
        if (this.U != z10) {
            boolean S2 = S2();
            this.U = z10;
            boolean S22 = S2();
            if (S2 != S22) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (z11) {
                if (S22) {
                    o0(this.V);
                } else {
                    U2(this.V);
                }
                invalidateSelf();
                z1();
            }
        }
    }

    public float X0() {
        return this.f9863r0;
    }

    public void X1(float f10) {
        if (this.O != f10) {
            this.O = f10;
            invalidateSelf();
            z1();
        }
    }

    public float Y0() {
        return this.f9849d0;
    }

    public void Y1(int i10) {
        X1(this.f9865t0.getResources().getDimension(i10));
    }

    public float Z0() {
        return this.f9862q0;
    }

    public void Z1(float f10) {
        if (this.f9857l0 != f10) {
            this.f9857l0 = f10;
            invalidateSelf();
            z1();
        }
    }

    @Override // com.google.android.material.internal.n.b
    public void a() {
        z1();
        invalidateSelf();
    }

    public int[] a1() {
        return this.O0;
    }

    public void a2(int i10) {
        Z1(this.f9865t0.getResources().getDimension(i10));
    }

    public ColorStateList b1() {
        return this.f9848c0;
    }

    public void b2(ColorStateList colorStateList) {
        if (this.Q != colorStateList) {
            this.Q = colorStateList;
            if (this.V0) {
                j0(colorStateList);
            }
            onStateChange(getState());
        }
    }

    public void c1(RectF rectF) {
        t0(getBounds(), rectF);
    }

    public void c2(int i10) {
        b2(h.a.a(this.f9865t0, i10));
    }

    public void d2(float f10) {
        if (this.R != f10) {
            this.R = f10;
            this.f9866u0.setStrokeWidth(f10);
            if (this.V0) {
                super.k0(f10);
            }
            invalidateSelf();
        }
    }

    @Override // p7.g, android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        int i10;
        Rect bounds = getBounds();
        if (!bounds.isEmpty() && getAlpha() != 0) {
            int i11 = this.J0;
            if (i11 < 255) {
                i10 = y6.a.a(canvas, bounds.left, bounds.top, bounds.right, bounds.bottom, i11);
            } else {
                i10 = 0;
            }
            E0(canvas, bounds);
            B0(canvas, bounds);
            if (this.V0) {
                super.draw(canvas);
            }
            D0(canvas, bounds);
            G0(canvas, bounds);
            C0(canvas, bounds);
            A0(canvas, bounds);
            if (this.T0) {
                I0(canvas, bounds);
            }
            F0(canvas, bounds);
            H0(canvas, bounds);
            if (this.J0 < 255) {
                canvas.restoreToCount(i10);
            }
        }
    }

    public void e2(int i10) {
        d2(this.f9865t0.getResources().getDimension(i10));
    }

    public TextUtils.TruncateAt f1() {
        return this.S0;
    }

    public h g1() {
        return this.f9856k0;
    }

    public void g2(Drawable drawable) {
        Drawable drawable2;
        Drawable V0 = V0();
        if (V0 != drawable) {
            float u02 = u0();
            if (drawable != null) {
                drawable2 = androidx.core.graphics.drawable.a.r(drawable).mutate();
            } else {
                drawable2 = null;
            }
            this.f9846a0 = drawable2;
            if (n7.b.f20271a) {
                W2();
            }
            float u03 = u0();
            U2(V0);
            if (T2()) {
                o0(this.f9846a0);
            }
            invalidateSelf();
            if (u02 != u03) {
                z1();
            }
        }
    }

    @Override // p7.g, android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.J0;
    }

    @Override // android.graphics.drawable.Drawable
    public ColorFilter getColorFilter() {
        return this.K0;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return (int) this.O;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return Math.min(Math.round(this.f9857l0 + q0() + this.f9860o0 + this.A0.f(l1().toString()) + this.f9861p0 + u0() + this.f9864s0), this.U0);
    }

    @Override // p7.g, android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    @Override // p7.g, android.graphics.drawable.Drawable
    @TargetApi(21)
    public void getOutline(Outline outline) {
        if (this.V0) {
            super.getOutline(outline);
            return;
        }
        Rect bounds = getBounds();
        if (!bounds.isEmpty()) {
            outline.setRoundRect(bounds, this.P);
        } else {
            outline.setRoundRect(0, 0, getIntrinsicWidth(), getIntrinsicHeight(), this.P);
        }
        outline.setAlpha(getAlpha() / 255.0f);
    }

    public float h1() {
        return this.f9859n0;
    }

    public void h2(CharSequence charSequence) {
        if (this.f9850e0 != charSequence) {
            this.f9850e0 = androidx.core.text.a.c().h(charSequence);
            invalidateSelf();
        }
    }

    public float i1() {
        return this.f9858m0;
    }

    public void i2(float f10) {
        if (this.f9863r0 != f10) {
            this.f9863r0 = f10;
            invalidateSelf();
            if (T2()) {
                z1();
            }
        }
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void invalidateDrawable(Drawable drawable) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.invalidateDrawable(this);
        }
    }

    @Override // p7.g, android.graphics.drawable.Drawable
    public boolean isStateful() {
        if (!v1(this.M) && !v1(this.N) && !v1(this.Q) && ((!this.P0 || !v1(this.Q0)) && !x1(this.A0.d()) && !y0() && !w1(this.V) && !w1(this.f9853h0) && !v1(this.M0))) {
            return false;
        }
        return true;
    }

    public ColorStateList j1() {
        return this.S;
    }

    public void j2(int i10) {
        i2(this.f9865t0.getResources().getDimension(i10));
    }

    public h k1() {
        return this.f9855j0;
    }

    public void k2(int i10) {
        g2(h.a.b(this.f9865t0, i10));
    }

    public CharSequence l1() {
        return this.T;
    }

    public void l2(float f10) {
        if (this.f9849d0 != f10) {
            this.f9849d0 = f10;
            invalidateSelf();
            if (T2()) {
                z1();
            }
        }
    }

    public d m1() {
        return this.A0.d();
    }

    public void m2(int i10) {
        l2(this.f9865t0.getResources().getDimension(i10));
    }

    public float n1() {
        return this.f9861p0;
    }

    public void n2(float f10) {
        if (this.f9862q0 != f10) {
            this.f9862q0 = f10;
            invalidateSelf();
            if (T2()) {
                z1();
            }
        }
    }

    public float o1() {
        return this.f9860o0;
    }

    public void o2(int i10) {
        n2(this.f9865t0.getResources().getDimension(i10));
    }

    @Override // android.graphics.drawable.Drawable
    public boolean onLayoutDirectionChanged(int i10) {
        boolean onLayoutDirectionChanged = super.onLayoutDirectionChanged(i10);
        if (S2()) {
            onLayoutDirectionChanged |= androidx.core.graphics.drawable.a.m(this.V, i10);
        }
        if (R2()) {
            onLayoutDirectionChanged |= androidx.core.graphics.drawable.a.m(this.f9853h0, i10);
        }
        if (T2()) {
            onLayoutDirectionChanged |= androidx.core.graphics.drawable.a.m(this.f9846a0, i10);
        }
        if (onLayoutDirectionChanged) {
            invalidateSelf();
            return true;
        }
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    protected boolean onLevelChange(int i10) {
        boolean onLevelChange = super.onLevelChange(i10);
        if (S2()) {
            onLevelChange |= this.V.setLevel(i10);
        }
        if (R2()) {
            onLevelChange |= this.f9853h0.setLevel(i10);
        }
        if (T2()) {
            onLevelChange |= this.f9846a0.setLevel(i10);
        }
        if (onLevelChange) {
            invalidateSelf();
        }
        return onLevelChange;
    }

    @Override // p7.g, android.graphics.drawable.Drawable, com.google.android.material.internal.n.b
    public boolean onStateChange(int[] iArr) {
        if (this.V0) {
            super.onStateChange(iArr);
        }
        return A1(iArr, a1());
    }

    public boolean p2(int[] iArr) {
        if (!Arrays.equals(this.O0, iArr)) {
            this.O0 = iArr;
            if (T2()) {
                return A1(getState(), iArr);
            }
            return false;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public float q0() {
        if (!S2() && !R2()) {
            return 0.0f;
        }
        return this.f9858m0 + e1() + this.f9859n0;
    }

    public boolean q1() {
        return this.P0;
    }

    public void q2(ColorStateList colorStateList) {
        if (this.f9848c0 != colorStateList) {
            this.f9848c0 = colorStateList;
            if (T2()) {
                androidx.core.graphics.drawable.a.o(this.f9846a0, colorStateList);
            }
            onStateChange(getState());
        }
    }

    public void r2(int i10) {
        q2(h.a.a(this.f9865t0, i10));
    }

    public boolean s1() {
        return this.f9851f0;
    }

    public void s2(boolean z10) {
        boolean z11;
        if (this.Z != z10) {
            boolean T2 = T2();
            this.Z = z10;
            boolean T22 = T2();
            if (T2 != T22) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (z11) {
                if (T22) {
                    o0(this.f9846a0);
                } else {
                    U2(this.f9846a0);
                }
                invalidateSelf();
                z1();
            }
        }
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void scheduleDrawable(Drawable drawable, Runnable runnable, long j10) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.scheduleDrawable(this, runnable, j10);
        }
    }

    @Override // p7.g, android.graphics.drawable.Drawable
    public void setAlpha(int i10) {
        if (this.J0 != i10) {
            this.J0 = i10;
            invalidateSelf();
        }
    }

    @Override // p7.g, android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        if (this.K0 != colorFilter) {
            this.K0 = colorFilter;
            invalidateSelf();
        }
    }

    @Override // p7.g, android.graphics.drawable.Drawable
    public void setTintList(ColorStateList colorStateList) {
        if (this.M0 != colorStateList) {
            this.M0 = colorStateList;
            onStateChange(getState());
        }
    }

    @Override // p7.g, android.graphics.drawable.Drawable
    public void setTintMode(PorterDuff.Mode mode) {
        if (this.N0 != mode) {
            this.N0 = mode;
            this.L0 = f7.d.h(this, this.M0, mode);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setVisible(boolean z10, boolean z11) {
        boolean visible = super.setVisible(z10, z11);
        if (S2()) {
            visible |= this.V.setVisible(z10, z11);
        }
        if (R2()) {
            visible |= this.f9853h0.setVisible(z10, z11);
        }
        if (T2()) {
            visible |= this.f9846a0.setVisible(z10, z11);
        }
        if (visible) {
            invalidateSelf();
        }
        return visible;
    }

    public boolean t1() {
        return w1(this.f9846a0);
    }

    public void t2(InterfaceC0234a interfaceC0234a) {
        this.R0 = new WeakReference<>(interfaceC0234a);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public float u0() {
        if (T2()) {
            return this.f9862q0 + this.f9849d0 + this.f9863r0;
        }
        return 0.0f;
    }

    public boolean u1() {
        return this.Z;
    }

    public void u2(TextUtils.TruncateAt truncateAt) {
        this.S0 = truncateAt;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.unscheduleDrawable(this, runnable);
        }
    }

    public void v2(h hVar) {
        this.f9856k0 = hVar;
    }

    public void w2(int i10) {
        v2(h.c(this.f9865t0, i10));
    }

    Paint.Align x0(Rect rect, PointF pointF) {
        pointF.set(0.0f, 0.0f);
        Paint.Align align = Paint.Align.LEFT;
        if (this.T != null) {
            float q02 = this.f9857l0 + q0() + this.f9860o0;
            if (androidx.core.graphics.drawable.a.f(this) == 0) {
                pointF.x = rect.left + q02;
                align = Paint.Align.LEFT;
            } else {
                pointF.x = rect.right - q02;
                align = Paint.Align.RIGHT;
            }
            pointF.y = rect.centerY() - w0();
        }
        return align;
    }

    public void x2(float f10) {
        if (this.f9859n0 != f10) {
            float q02 = q0();
            this.f9859n0 = f10;
            float q03 = q0();
            invalidateSelf();
            if (q02 != q03) {
                z1();
            }
        }
    }

    public void y2(int i10) {
        x2(this.f9865t0.getResources().getDimension(i10));
    }

    protected void z1() {
        InterfaceC0234a interfaceC0234a = this.R0.get();
        if (interfaceC0234a != null) {
            interfaceC0234a.a();
        }
    }

    public void z2(float f10) {
        if (this.f9858m0 != f10) {
            float q02 = q0();
            this.f9858m0 = f10;
            float q03 = q0();
            invalidateSelf();
            if (q02 != q03) {
                z1();
            }
        }
    }
}
