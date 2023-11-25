package com.google.android.material.internal;

import android.animation.TimeInterpolator;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.os.Build;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import androidx.core.view.p0;
import com.google.android.material.internal.l;
import m7.a;

/* compiled from: CollapsingTextHelper.java */
/* loaded from: classes3.dex */
public final class a {

    /* renamed from: t0  reason: collision with root package name */
    private static final boolean f10089t0 = false;

    /* renamed from: u0  reason: collision with root package name */
    private static final Paint f10090u0 = null;
    private Typeface A;
    private Typeface B;
    private Typeface C;
    private m7.a D;
    private m7.a E;
    private CharSequence G;
    private CharSequence H;
    private boolean I;
    private boolean K;
    private Bitmap L;
    private Paint M;
    private float N;
    private float O;
    private float P;
    private float Q;
    private float R;
    private int S;
    private int[] T;
    private boolean U;
    private final TextPaint V;
    private final TextPaint W;
    private TimeInterpolator X;
    private TimeInterpolator Y;
    private float Z;

    /* renamed from: a  reason: collision with root package name */
    private final View f10091a;

    /* renamed from: a0  reason: collision with root package name */
    private float f10092a0;

    /* renamed from: b  reason: collision with root package name */
    private float f10093b;

    /* renamed from: b0  reason: collision with root package name */
    private float f10094b0;

    /* renamed from: c  reason: collision with root package name */
    private boolean f10095c;

    /* renamed from: c0  reason: collision with root package name */
    private ColorStateList f10096c0;

    /* renamed from: d  reason: collision with root package name */
    private float f10097d;

    /* renamed from: d0  reason: collision with root package name */
    private float f10098d0;

    /* renamed from: e  reason: collision with root package name */
    private float f10099e;

    /* renamed from: e0  reason: collision with root package name */
    private float f10100e0;

    /* renamed from: f  reason: collision with root package name */
    private int f10101f;

    /* renamed from: f0  reason: collision with root package name */
    private float f10102f0;

    /* renamed from: g  reason: collision with root package name */
    private final Rect f10103g;

    /* renamed from: g0  reason: collision with root package name */
    private ColorStateList f10104g0;

    /* renamed from: h  reason: collision with root package name */
    private final Rect f10105h;

    /* renamed from: h0  reason: collision with root package name */
    private float f10106h0;

    /* renamed from: i  reason: collision with root package name */
    private final RectF f10107i;

    /* renamed from: i0  reason: collision with root package name */
    private float f10108i0;

    /* renamed from: j0  reason: collision with root package name */
    private float f10110j0;

    /* renamed from: k0  reason: collision with root package name */
    private StaticLayout f10112k0;

    /* renamed from: l0  reason: collision with root package name */
    private float f10114l0;

    /* renamed from: m0  reason: collision with root package name */
    private float f10116m0;

    /* renamed from: n  reason: collision with root package name */
    private ColorStateList f10117n;

    /* renamed from: n0  reason: collision with root package name */
    private float f10118n0;

    /* renamed from: o  reason: collision with root package name */
    private ColorStateList f10119o;

    /* renamed from: o0  reason: collision with root package name */
    private CharSequence f10120o0;

    /* renamed from: p  reason: collision with root package name */
    private int f10121p;

    /* renamed from: q  reason: collision with root package name */
    private float f10123q;

    /* renamed from: r  reason: collision with root package name */
    private float f10125r;

    /* renamed from: s  reason: collision with root package name */
    private float f10127s;

    /* renamed from: t  reason: collision with root package name */
    private float f10129t;

    /* renamed from: u  reason: collision with root package name */
    private float f10130u;

    /* renamed from: v  reason: collision with root package name */
    private float f10131v;

    /* renamed from: w  reason: collision with root package name */
    private Typeface f10132w;

    /* renamed from: x  reason: collision with root package name */
    private Typeface f10133x;

    /* renamed from: y  reason: collision with root package name */
    private Typeface f10134y;

    /* renamed from: z  reason: collision with root package name */
    private Typeface f10135z;

    /* renamed from: j  reason: collision with root package name */
    private int f10109j = 16;

    /* renamed from: k  reason: collision with root package name */
    private int f10111k = 16;

    /* renamed from: l  reason: collision with root package name */
    private float f10113l = 15.0f;

    /* renamed from: m  reason: collision with root package name */
    private float f10115m = 15.0f;
    private TextUtils.TruncateAt F = TextUtils.TruncateAt.END;
    private boolean J = true;

    /* renamed from: p0  reason: collision with root package name */
    private int f10122p0 = 1;

    /* renamed from: q0  reason: collision with root package name */
    private float f10124q0 = 0.0f;

    /* renamed from: r0  reason: collision with root package name */
    private float f10126r0 = 1.0f;

    /* renamed from: s0  reason: collision with root package name */
    private int f10128s0 = l.f10155n;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: CollapsingTextHelper.java */
    /* renamed from: com.google.android.material.internal.a$a  reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    public class C0238a implements a.InterfaceC0445a {
        C0238a() {
        }

        @Override // m7.a.InterfaceC0445a
        public void a(Typeface typeface) {
            a.this.l0(typeface);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: CollapsingTextHelper.java */
    /* loaded from: classes3.dex */
    public class b implements a.InterfaceC0445a {
        b() {
        }

        @Override // m7.a.InterfaceC0445a
        public void a(Typeface typeface) {
            a.this.w0(typeface);
        }
    }

    public a(View view) {
        this.f10091a = view;
        TextPaint textPaint = new TextPaint(129);
        this.V = textPaint;
        this.W = new TextPaint(textPaint);
        this.f10105h = new Rect();
        this.f10103g = new Rect();
        this.f10107i = new RectF();
        this.f10099e = e();
        Y(view.getContext().getResources().getConfiguration());
    }

    private void C0(float f10) {
        boolean z10;
        h(f10);
        if (f10089t0 && this.N != 1.0f) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.K = z10;
        if (z10) {
            n();
        }
        p0.l0(this.f10091a);
    }

    private Layout.Alignment M() {
        int b10 = androidx.core.view.p.b(this.f10109j, this.I ? 1 : 0) & 7;
        if (b10 != 1) {
            if (b10 != 5) {
                if (this.I) {
                    return Layout.Alignment.ALIGN_OPPOSITE;
                }
                return Layout.Alignment.ALIGN_NORMAL;
            } else if (this.I) {
                return Layout.Alignment.ALIGN_NORMAL;
            } else {
                return Layout.Alignment.ALIGN_OPPOSITE;
            }
        }
        return Layout.Alignment.ALIGN_CENTER;
    }

    private boolean O0() {
        if (this.f10122p0 > 1 && ((!this.I || this.f10095c) && !this.K)) {
            return true;
        }
        return false;
    }

    private void P(TextPaint textPaint) {
        textPaint.setTextSize(this.f10115m);
        textPaint.setTypeface(this.f10132w);
        textPaint.setLetterSpacing(this.f10106h0);
    }

    private void Q(TextPaint textPaint) {
        textPaint.setTextSize(this.f10113l);
        textPaint.setTypeface(this.f10135z);
        textPaint.setLetterSpacing(this.f10108i0);
    }

    private void S(float f10) {
        Rect rect;
        if (this.f10095c) {
            RectF rectF = this.f10107i;
            if (f10 < this.f10099e) {
                rect = this.f10103g;
            } else {
                rect = this.f10105h;
            }
            rectF.set(rect);
            return;
        }
        this.f10107i.left = X(this.f10103g.left, this.f10105h.left, f10, this.X);
        this.f10107i.top = X(this.f10123q, this.f10125r, f10, this.X);
        this.f10107i.right = X(this.f10103g.right, this.f10105h.right, f10, this.X);
        this.f10107i.bottom = X(this.f10103g.bottom, this.f10105h.bottom, f10, this.X);
    }

    private static boolean T(float f10, float f11) {
        if (Math.abs(f10 - f11) < 1.0E-5f) {
            return true;
        }
        return false;
    }

    private boolean U() {
        if (p0.E(this.f10091a) == 1) {
            return true;
        }
        return false;
    }

    private boolean W(CharSequence charSequence, boolean z10) {
        androidx.core.text.u uVar;
        if (z10) {
            uVar = androidx.core.text.v.f4038d;
        } else {
            uVar = androidx.core.text.v.f4037c;
        }
        return uVar.a(charSequence, 0, charSequence.length());
    }

    private static float X(float f10, float f11, float f12, TimeInterpolator timeInterpolator) {
        if (timeInterpolator != null) {
            f12 = timeInterpolator.getInterpolation(f12);
        }
        return w6.a.a(f10, f11, f12);
    }

    private float Z(TextPaint textPaint, CharSequence charSequence) {
        return textPaint.measureText(charSequence, 0, charSequence.length());
    }

    private static int a(int i10, int i11, float f10) {
        float f11 = 1.0f - f10;
        return Color.argb(Math.round((Color.alpha(i10) * f11) + (Color.alpha(i11) * f10)), Math.round((Color.red(i10) * f11) + (Color.red(i11) * f10)), Math.round((Color.green(i10) * f11) + (Color.green(i11) * f10)), Math.round((Color.blue(i10) * f11) + (Color.blue(i11) * f10)));
    }

    private void b(boolean z10) {
        float f10;
        int i10;
        StaticLayout staticLayout;
        i(1.0f, z10);
        CharSequence charSequence = this.H;
        if (charSequence != null && (staticLayout = this.f10112k0) != null) {
            this.f10120o0 = TextUtils.ellipsize(charSequence, this.V, staticLayout.getWidth(), this.F);
        }
        CharSequence charSequence2 = this.f10120o0;
        float f11 = 0.0f;
        if (charSequence2 != null) {
            this.f10114l0 = Z(this.V, charSequence2);
        } else {
            this.f10114l0 = 0.0f;
        }
        int b10 = androidx.core.view.p.b(this.f10111k, this.I ? 1 : 0);
        int i11 = b10 & 112;
        if (i11 != 48) {
            if (i11 != 80) {
                this.f10125r = this.f10105h.centerY() - ((this.V.descent() - this.V.ascent()) / 2.0f);
            } else {
                this.f10125r = this.f10105h.bottom + this.V.ascent();
            }
        } else {
            this.f10125r = this.f10105h.top;
        }
        int i12 = b10 & 8388615;
        if (i12 != 1) {
            if (i12 != 5) {
                this.f10129t = this.f10105h.left;
            } else {
                this.f10129t = this.f10105h.right - this.f10114l0;
            }
        } else {
            this.f10129t = this.f10105h.centerX() - (this.f10114l0 / 2.0f);
        }
        i(0.0f, z10);
        StaticLayout staticLayout2 = this.f10112k0;
        if (staticLayout2 != null) {
            f10 = staticLayout2.getHeight();
        } else {
            f10 = 0.0f;
        }
        StaticLayout staticLayout3 = this.f10112k0;
        if (staticLayout3 != null && this.f10122p0 > 1) {
            f11 = staticLayout3.getWidth();
        } else {
            CharSequence charSequence3 = this.H;
            if (charSequence3 != null) {
                f11 = Z(this.V, charSequence3);
            }
        }
        StaticLayout staticLayout4 = this.f10112k0;
        if (staticLayout4 != null) {
            i10 = staticLayout4.getLineCount();
        } else {
            i10 = 0;
        }
        this.f10121p = i10;
        int b11 = androidx.core.view.p.b(this.f10109j, this.I ? 1 : 0);
        int i13 = b11 & 112;
        if (i13 != 48) {
            if (i13 != 80) {
                this.f10123q = this.f10103g.centerY() - (f10 / 2.0f);
            } else {
                this.f10123q = (this.f10103g.bottom - f10) + this.V.descent();
            }
        } else {
            this.f10123q = this.f10103g.top;
        }
        int i14 = b11 & 8388615;
        if (i14 != 1) {
            if (i14 != 5) {
                this.f10127s = this.f10103g.left;
            } else {
                this.f10127s = this.f10103g.right - f11;
            }
        } else {
            this.f10127s = this.f10103g.centerX() - (f11 / 2.0f);
        }
        j();
        C0(this.f10093b);
    }

    private void c() {
        g(this.f10093b);
    }

    private static boolean c0(Rect rect, int i10, int i11, int i12, int i13) {
        if (rect.left == i10 && rect.top == i11 && rect.right == i12 && rect.bottom == i13) {
            return true;
        }
        return false;
    }

    private float d(float f10) {
        float f11 = this.f10099e;
        if (f10 <= f11) {
            return w6.a.b(1.0f, 0.0f, this.f10097d, f11, f10);
        }
        return w6.a.b(0.0f, 1.0f, f11, 1.0f, f10);
    }

    private float e() {
        float f10 = this.f10097d;
        return f10 + ((1.0f - f10) * 0.5f);
    }

    private boolean f(CharSequence charSequence) {
        boolean U = U();
        if (this.J) {
            return W(charSequence, U);
        }
        return U;
    }

    private void g(float f10) {
        float f11;
        S(f10);
        if (this.f10095c) {
            if (f10 < this.f10099e) {
                this.f10130u = this.f10127s;
                this.f10131v = this.f10123q;
                C0(0.0f);
                f11 = 0.0f;
            } else {
                this.f10130u = this.f10129t;
                this.f10131v = this.f10125r - Math.max(0, this.f10101f);
                C0(1.0f);
                f11 = 1.0f;
            }
        } else {
            this.f10130u = X(this.f10127s, this.f10129t, f10, this.X);
            this.f10131v = X(this.f10123q, this.f10125r, f10, this.X);
            C0(f10);
            f11 = f10;
        }
        TimeInterpolator timeInterpolator = w6.a.f25411b;
        h0(1.0f - X(0.0f, 1.0f, 1.0f - f10, timeInterpolator));
        s0(X(1.0f, 0.0f, f10, timeInterpolator));
        if (this.f10119o != this.f10117n) {
            this.V.setColor(a(y(), w(), f11));
        } else {
            this.V.setColor(w());
        }
        float f12 = this.f10106h0;
        float f13 = this.f10108i0;
        if (f12 != f13) {
            this.V.setLetterSpacing(X(f13, f12, f10, timeInterpolator));
        } else {
            this.V.setLetterSpacing(f12);
        }
        this.P = X(this.f10098d0, this.Z, f10, null);
        this.Q = X(this.f10100e0, this.f10092a0, f10, null);
        this.R = X(this.f10102f0, this.f10094b0, f10, null);
        int a10 = a(x(this.f10104g0), x(this.f10096c0), f10);
        this.S = a10;
        this.V.setShadowLayer(this.P, this.Q, this.R, a10);
        if (this.f10095c) {
            this.V.setAlpha((int) (d(f10) * this.V.getAlpha()));
        }
        p0.l0(this.f10091a);
    }

    private void h(float f10) {
        i(f10, false);
    }

    private void h0(float f10) {
        this.f10116m0 = f10;
        p0.l0(this.f10091a);
    }

    private void i(float f10, boolean z10) {
        float f11;
        float f12;
        Typeface typeface;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        boolean z15;
        if (this.G == null) {
            return;
        }
        float width = this.f10105h.width();
        float width2 = this.f10103g.width();
        if (T(f10, 1.0f)) {
            f11 = this.f10115m;
            f12 = this.f10106h0;
            this.N = 1.0f;
            typeface = this.f10132w;
        } else {
            float f13 = this.f10113l;
            float f14 = this.f10108i0;
            Typeface typeface2 = this.f10135z;
            if (T(f10, 0.0f)) {
                this.N = 1.0f;
            } else {
                this.N = X(this.f10113l, this.f10115m, f10, this.Y) / this.f10113l;
            }
            float f15 = this.f10115m / this.f10113l;
            float f16 = width2 * f15;
            if (z10 || f16 <= width) {
                width = width2;
            } else {
                width = Math.min(width / f15, width2);
            }
            f11 = f13;
            f12 = f14;
            typeface = typeface2;
        }
        int i10 = 1;
        boolean z16 = false;
        if (width > 0.0f) {
            if (this.O != f11) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (this.f10110j0 != f12) {
                z12 = true;
            } else {
                z12 = false;
            }
            if (this.C != typeface) {
                z13 = true;
            } else {
                z13 = false;
            }
            if (this.f10112k0 != null && width != r8.getWidth()) {
                z14 = true;
            } else {
                z14 = false;
            }
            if (!z11 && !z12 && !z14 && !z13 && !this.U) {
                z15 = false;
            } else {
                z15 = true;
            }
            this.O = f11;
            this.f10110j0 = f12;
            this.C = typeface;
            this.U = false;
            TextPaint textPaint = this.V;
            if (this.N != 1.0f) {
                z16 = true;
            }
            textPaint.setLinearText(z16);
            z16 = z15;
        }
        if (this.H == null || z16) {
            this.V.setTextSize(this.O);
            this.V.setTypeface(this.C);
            this.V.setLetterSpacing(this.f10110j0);
            this.I = f(this.G);
            if (O0()) {
                i10 = this.f10122p0;
            }
            StaticLayout k10 = k(i10, width, this.I);
            this.f10112k0 = k10;
            this.H = k10.getText();
        }
    }

    private void j() {
        Bitmap bitmap = this.L;
        if (bitmap != null) {
            bitmap.recycle();
            this.L = null;
        }
    }

    private StaticLayout k(int i10, float f10, boolean z10) {
        Layout.Alignment M;
        StaticLayout staticLayout = null;
        try {
            if (i10 == 1) {
                M = Layout.Alignment.ALIGN_NORMAL;
            } else {
                M = M();
            }
            staticLayout = l.c(this.G, this.V, (int) f10).e(this.F).h(z10).d(M).g(false).j(i10).i(this.f10124q0, this.f10126r0).f(this.f10128s0).k(null).a();
        } catch (l.a e10) {
            Log.e("CollapsingTextHelper", e10.getCause().getMessage(), e10);
        }
        return (StaticLayout) androidx.core.util.i.g(staticLayout);
    }

    private void m(Canvas canvas, float f10, float f11) {
        int alpha = this.V.getAlpha();
        canvas.translate(f10, f11);
        if (!this.f10095c) {
            this.V.setAlpha((int) (this.f10118n0 * alpha));
            if (Build.VERSION.SDK_INT >= 31) {
                TextPaint textPaint = this.V;
                textPaint.setShadowLayer(this.P, this.Q, this.R, d7.a.a(this.S, textPaint.getAlpha()));
            }
            this.f10112k0.draw(canvas);
        }
        if (!this.f10095c) {
            this.V.setAlpha((int) (this.f10116m0 * alpha));
        }
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 31) {
            TextPaint textPaint2 = this.V;
            textPaint2.setShadowLayer(this.P, this.Q, this.R, d7.a.a(this.S, textPaint2.getAlpha()));
        }
        int lineBaseline = this.f10112k0.getLineBaseline(0);
        CharSequence charSequence = this.f10120o0;
        float f12 = lineBaseline;
        canvas.drawText(charSequence, 0, charSequence.length(), 0.0f, f12, this.V);
        if (i10 >= 31) {
            this.V.setShadowLayer(this.P, this.Q, this.R, this.S);
        }
        if (!this.f10095c) {
            String trim = this.f10120o0.toString().trim();
            if (trim.endsWith("…")) {
                trim = trim.substring(0, trim.length() - 1);
            }
            String str = trim;
            this.V.setAlpha(alpha);
            canvas.drawText(str, 0, Math.min(this.f10112k0.getLineEnd(0), str.length()), 0.0f, f12, (Paint) this.V);
        }
    }

    private boolean m0(Typeface typeface) {
        m7.a aVar = this.E;
        if (aVar != null) {
            aVar.c();
        }
        if (this.f10134y != typeface) {
            this.f10134y = typeface;
            Typeface b10 = m7.h.b(this.f10091a.getContext().getResources().getConfiguration(), typeface);
            this.f10133x = b10;
            if (b10 == null) {
                b10 = this.f10134y;
            }
            this.f10132w = b10;
            return true;
        }
        return false;
    }

    private void n() {
        if (this.L == null && !this.f10103g.isEmpty() && !TextUtils.isEmpty(this.H)) {
            g(0.0f);
            int width = this.f10112k0.getWidth();
            int height = this.f10112k0.getHeight();
            if (width > 0 && height > 0) {
                this.L = Bitmap.createBitmap(width, height, Bitmap.Config.ARGB_8888);
                this.f10112k0.draw(new Canvas(this.L));
                if (this.M == null) {
                    this.M = new Paint(3);
                }
            }
        }
    }

    private float s(int i10, int i11) {
        if (i11 != 17 && (i11 & 7) != 1) {
            if ((i11 & 8388613) != 8388613 && (i11 & 5) != 5) {
                if (this.I) {
                    return this.f10105h.right - this.f10114l0;
                }
                return this.f10105h.left;
            } else if (this.I) {
                return this.f10105h.left;
            } else {
                return this.f10105h.right - this.f10114l0;
            }
        }
        return (i10 / 2.0f) - (this.f10114l0 / 2.0f);
    }

    private void s0(float f10) {
        this.f10118n0 = f10;
        p0.l0(this.f10091a);
    }

    private float t(RectF rectF, int i10, int i11) {
        if (i11 != 17 && (i11 & 7) != 1) {
            if ((i11 & 8388613) != 8388613 && (i11 & 5) != 5) {
                if (this.I) {
                    return this.f10105h.right;
                }
                return rectF.left + this.f10114l0;
            } else if (this.I) {
                return rectF.left + this.f10114l0;
            } else {
                return this.f10105h.right;
            }
        }
        return (i10 / 2.0f) + (this.f10114l0 / 2.0f);
    }

    private int x(ColorStateList colorStateList) {
        if (colorStateList == null) {
            return 0;
        }
        int[] iArr = this.T;
        if (iArr != null) {
            return colorStateList.getColorForState(iArr, 0);
        }
        return colorStateList.getDefaultColor();
    }

    private boolean x0(Typeface typeface) {
        m7.a aVar = this.D;
        if (aVar != null) {
            aVar.c();
        }
        if (this.B != typeface) {
            this.B = typeface;
            Typeface b10 = m7.h.b(this.f10091a.getContext().getResources().getConfiguration(), typeface);
            this.A = b10;
            if (b10 == null) {
                b10 = this.B;
            }
            this.f10135z = b10;
            return true;
        }
        return false;
    }

    private int y() {
        return x(this.f10117n);
    }

    public float A() {
        Q(this.W);
        return (-this.W.ascent()) + this.W.descent();
    }

    public void A0(float f10) {
        this.f10097d = f10;
        this.f10099e = e();
    }

    public int B() {
        return this.f10109j;
    }

    public void B0(int i10) {
        this.f10128s0 = i10;
    }

    public float C() {
        Q(this.W);
        return -this.W.ascent();
    }

    public float D() {
        return this.f10113l;
    }

    public void D0(float f10) {
        this.f10124q0 = f10;
    }

    public Typeface E() {
        Typeface typeface = this.f10135z;
        if (typeface == null) {
            return Typeface.DEFAULT;
        }
        return typeface;
    }

    public void E0(float f10) {
        this.f10126r0 = f10;
    }

    public float F() {
        return this.f10093b;
    }

    public void F0(int i10) {
        if (i10 != this.f10122p0) {
            this.f10122p0 = i10;
            j();
            a0();
        }
    }

    public float G() {
        return this.f10099e;
    }

    public void G0(TimeInterpolator timeInterpolator) {
        this.X = timeInterpolator;
        a0();
    }

    public int H() {
        return this.f10128s0;
    }

    public void H0(boolean z10) {
        this.J = z10;
    }

    public int I() {
        StaticLayout staticLayout = this.f10112k0;
        if (staticLayout != null) {
            return staticLayout.getLineCount();
        }
        return 0;
    }

    public final boolean I0(int[] iArr) {
        this.T = iArr;
        if (V()) {
            a0();
            return true;
        }
        return false;
    }

    public float J() {
        return this.f10112k0.getSpacingAdd();
    }

    public void J0(m mVar) {
        if (mVar != null) {
            b0(true);
        }
    }

    public float K() {
        return this.f10112k0.getSpacingMultiplier();
    }

    public void K0(CharSequence charSequence) {
        if (charSequence == null || !TextUtils.equals(this.G, charSequence)) {
            this.G = charSequence;
            this.H = null;
            j();
            a0();
        }
    }

    public int L() {
        return this.f10122p0;
    }

    public void L0(TimeInterpolator timeInterpolator) {
        this.Y = timeInterpolator;
        a0();
    }

    public void M0(TextUtils.TruncateAt truncateAt) {
        this.F = truncateAt;
        a0();
    }

    public TimeInterpolator N() {
        return this.X;
    }

    public void N0(Typeface typeface) {
        boolean m02 = m0(typeface);
        boolean x02 = x0(typeface);
        if (m02 || x02) {
            a0();
        }
    }

    public CharSequence O() {
        return this.G;
    }

    public TextUtils.TruncateAt R() {
        return this.F;
    }

    public final boolean V() {
        ColorStateList colorStateList;
        ColorStateList colorStateList2 = this.f10119o;
        if ((colorStateList2 != null && colorStateList2.isStateful()) || ((colorStateList = this.f10117n) != null && colorStateList.isStateful())) {
            return true;
        }
        return false;
    }

    public void Y(Configuration configuration) {
        if (Build.VERSION.SDK_INT >= 31) {
            Typeface typeface = this.f10134y;
            if (typeface != null) {
                this.f10133x = m7.h.b(configuration, typeface);
            }
            Typeface typeface2 = this.B;
            if (typeface2 != null) {
                this.A = m7.h.b(configuration, typeface2);
            }
            Typeface typeface3 = this.f10133x;
            if (typeface3 == null) {
                typeface3 = this.f10134y;
            }
            this.f10132w = typeface3;
            Typeface typeface4 = this.A;
            if (typeface4 == null) {
                typeface4 = this.B;
            }
            this.f10135z = typeface4;
            b0(true);
        }
    }

    public void a0() {
        b0(false);
    }

    public void b0(boolean z10) {
        if ((this.f10091a.getHeight() > 0 && this.f10091a.getWidth() > 0) || z10) {
            b(z10);
            c();
        }
    }

    public void d0(ColorStateList colorStateList) {
        if (this.f10119o != colorStateList || this.f10117n != colorStateList) {
            this.f10119o = colorStateList;
            this.f10117n = colorStateList;
            a0();
        }
    }

    public void e0(int i10, int i11, int i12, int i13) {
        if (!c0(this.f10105h, i10, i11, i12, i13)) {
            this.f10105h.set(i10, i11, i12, i13);
            this.U = true;
        }
    }

    public void f0(Rect rect) {
        e0(rect.left, rect.top, rect.right, rect.bottom);
    }

    public void g0(int i10) {
        m7.d dVar = new m7.d(this.f10091a.getContext(), i10);
        if (dVar.i() != null) {
            this.f10119o = dVar.i();
        }
        if (dVar.j() != 0.0f) {
            this.f10115m = dVar.j();
        }
        ColorStateList colorStateList = dVar.f19751c;
        if (colorStateList != null) {
            this.f10096c0 = colorStateList;
        }
        this.f10092a0 = dVar.f19756h;
        this.f10094b0 = dVar.f19757i;
        this.Z = dVar.f19758j;
        this.f10106h0 = dVar.f19760l;
        m7.a aVar = this.E;
        if (aVar != null) {
            aVar.c();
        }
        this.E = new m7.a(new C0238a(), dVar.e());
        dVar.h(this.f10091a.getContext(), this.E);
        a0();
    }

    public void i0(ColorStateList colorStateList) {
        if (this.f10119o != colorStateList) {
            this.f10119o = colorStateList;
            a0();
        }
    }

    public void j0(int i10) {
        if (this.f10111k != i10) {
            this.f10111k = i10;
            a0();
        }
    }

    public void k0(float f10) {
        if (this.f10115m != f10) {
            this.f10115m = f10;
            a0();
        }
    }

    public void l(Canvas canvas) {
        boolean z10;
        int save = canvas.save();
        if (this.H != null && this.f10107i.width() > 0.0f && this.f10107i.height() > 0.0f) {
            this.V.setTextSize(this.O);
            float f10 = this.f10130u;
            float f11 = this.f10131v;
            if (this.K && this.L != null) {
                z10 = true;
            } else {
                z10 = false;
            }
            float f12 = this.N;
            if (f12 != 1.0f && !this.f10095c) {
                canvas.scale(f12, f12, f10, f11);
            }
            if (z10) {
                canvas.drawBitmap(this.L, f10, f11, this.M);
                canvas.restoreToCount(save);
                return;
            }
            if (O0() && (!this.f10095c || this.f10093b > this.f10099e)) {
                m(canvas, this.f10130u - this.f10112k0.getLineStart(0), f11);
            } else {
                canvas.translate(f10, f11);
                this.f10112k0.draw(canvas);
            }
            canvas.restoreToCount(save);
        }
    }

    public void l0(Typeface typeface) {
        if (m0(typeface)) {
            a0();
        }
    }

    public void n0(int i10) {
        this.f10101f = i10;
    }

    public void o(RectF rectF, int i10, int i11) {
        this.I = f(this.G);
        rectF.left = Math.max(s(i10, i11), this.f10105h.left);
        rectF.top = this.f10105h.top;
        rectF.right = Math.min(t(rectF, i10, i11), this.f10105h.right);
        rectF.bottom = this.f10105h.top + r();
    }

    public void o0(int i10, int i11, int i12, int i13) {
        if (!c0(this.f10103g, i10, i11, i12, i13)) {
            this.f10103g.set(i10, i11, i12, i13);
            this.U = true;
        }
    }

    public ColorStateList p() {
        return this.f10119o;
    }

    public void p0(Rect rect) {
        o0(rect.left, rect.top, rect.right, rect.bottom);
    }

    public int q() {
        return this.f10111k;
    }

    public void q0(float f10) {
        if (this.f10108i0 != f10) {
            this.f10108i0 = f10;
            a0();
        }
    }

    public float r() {
        P(this.W);
        return -this.W.ascent();
    }

    public void r0(int i10) {
        m7.d dVar = new m7.d(this.f10091a.getContext(), i10);
        if (dVar.i() != null) {
            this.f10117n = dVar.i();
        }
        if (dVar.j() != 0.0f) {
            this.f10113l = dVar.j();
        }
        ColorStateList colorStateList = dVar.f19751c;
        if (colorStateList != null) {
            this.f10104g0 = colorStateList;
        }
        this.f10100e0 = dVar.f19756h;
        this.f10102f0 = dVar.f19757i;
        this.f10098d0 = dVar.f19758j;
        this.f10108i0 = dVar.f19760l;
        m7.a aVar = this.D;
        if (aVar != null) {
            aVar.c();
        }
        this.D = new m7.a(new b(), dVar.e());
        dVar.h(this.f10091a.getContext(), this.D);
        a0();
    }

    public void t0(ColorStateList colorStateList) {
        if (this.f10117n != colorStateList) {
            this.f10117n = colorStateList;
            a0();
        }
    }

    public float u() {
        return this.f10115m;
    }

    public void u0(int i10) {
        if (this.f10109j != i10) {
            this.f10109j = i10;
            a0();
        }
    }

    public Typeface v() {
        Typeface typeface = this.f10132w;
        if (typeface == null) {
            return Typeface.DEFAULT;
        }
        return typeface;
    }

    public void v0(float f10) {
        if (this.f10113l != f10) {
            this.f10113l = f10;
            a0();
        }
    }

    public int w() {
        return x(this.f10119o);
    }

    public void w0(Typeface typeface) {
        if (x0(typeface)) {
            a0();
        }
    }

    public void y0(float f10) {
        float a10 = t2.a.a(f10, 0.0f, 1.0f);
        if (a10 != this.f10093b) {
            this.f10093b = a10;
            c();
        }
    }

    public int z() {
        return this.f10121p;
    }

    public void z0(boolean z10) {
        this.f10095c = z10;
    }
}
