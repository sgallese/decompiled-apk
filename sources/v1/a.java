package v1;

import a1.e1;
import a1.e4;
import a1.h1;
import a1.o4;
import a1.u0;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.text.Spanned;
import android.text.TextUtils;
import g2.f;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import kotlin.NoWhenBranchMatchedException;
import w1.n1;

/* compiled from: AndroidParagraph.android.kt */
/* loaded from: classes.dex */
public final class a implements m {

    /* renamed from: a  reason: collision with root package name */
    private final d2.d f24324a;

    /* renamed from: b  reason: collision with root package name */
    private final int f24325b;

    /* renamed from: c  reason: collision with root package name */
    private final boolean f24326c;

    /* renamed from: d  reason: collision with root package name */
    private final long f24327d;

    /* renamed from: e  reason: collision with root package name */
    private final n1 f24328e;

    /* renamed from: f  reason: collision with root package name */
    private final CharSequence f24329f;

    /* renamed from: g  reason: collision with root package name */
    private final List<z0.h> f24330g;

    /* renamed from: h  reason: collision with root package name */
    private final dc.f f24331h;

    /* compiled from: AndroidParagraph.android.kt */
    /* renamed from: v1.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public /* synthetic */ class C0572a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f24332a;

        static {
            int[] iArr = new int[g2.i.values().length];
            try {
                iArr[g2.i.Ltr.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[g2.i.Rtl.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f24332a = iArr;
        }
    }

    /* compiled from: AndroidParagraph.android.kt */
    /* loaded from: classes.dex */
    static final class b extends qc.r implements pc.a<x1.a> {
        b() {
            super(0);
        }

        @Override // pc.a
        /* renamed from: a  reason: merged with bridge method [inline-methods] */
        public final x1.a invoke() {
            return new x1.a(a.this.C(), a.this.f24328e.D());
        }
    }

    public /* synthetic */ a(d2.d dVar, int i10, boolean z10, long j10, qc.h hVar) {
        this(dVar, i10, z10, j10);
    }

    private final f2.b[] B(n1 n1Var) {
        boolean z10;
        if (!(n1Var.D() instanceof Spanned)) {
            return new f2.b[0];
        }
        CharSequence D = n1Var.D();
        qc.q.g(D, "null cannot be cast to non-null type android.text.Spanned");
        f2.b[] bVarArr = (f2.b[]) ((Spanned) D).getSpans(0, n1Var.D().length(), f2.b.class);
        qc.q.h(bVarArr, "brushSpans");
        if (bVarArr.length == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            return new f2.b[0];
        }
        return bVarArr;
    }

    private final x1.a E() {
        return (x1.a) this.f24331h.getValue();
    }

    private final void F(h1 h1Var) {
        Canvas c10 = a1.f0.c(h1Var);
        if (t()) {
            c10.save();
            c10.clipRect(0.0f, 0.0f, getWidth(), getHeight());
        }
        this.f24328e.G(c10);
        if (t()) {
            c10.restore();
        }
    }

    private final n1 z(int i10, int i11, TextUtils.TruncateAt truncateAt, int i12, int i13, int i14, int i15, int i16) {
        return new n1(this.f24329f, getWidth(), D(), i10, truncateAt, this.f24324a.j(), 1.0f, 0.0f, d2.c.b(this.f24324a.i()), true, i12, i14, i15, i16, i13, i11, null, null, this.f24324a.h(), 196736, null);
    }

    public final float A(int i10) {
        return this.f24328e.i(i10);
    }

    public final Locale C() {
        Locale textLocale = this.f24324a.k().getTextLocale();
        qc.q.h(textLocale, "paragraphIntrinsics.textPaint.textLocale");
        return textLocale;
    }

    public final d2.i D() {
        return this.f24324a.k();
    }

    @Override // v1.m
    public float a() {
        return this.f24324a.a();
    }

    @Override // v1.m
    public void b(h1 h1Var, e1 e1Var, float f10, o4 o4Var, g2.k kVar, c1.g gVar, int i10) {
        qc.q.i(h1Var, "canvas");
        qc.q.i(e1Var, "brush");
        int a10 = D().a();
        d2.i D = D();
        D.c(e1Var, z0.m.a(getWidth(), getHeight()), f10);
        D.f(o4Var);
        D.g(kVar);
        D.e(gVar);
        D.b(i10);
        F(h1Var);
        D().b(a10);
    }

    @Override // v1.m
    public g2.i c(int i10) {
        if (this.f24328e.x(this.f24328e.o(i10)) == 1) {
            return g2.i.Ltr;
        }
        return g2.i.Rtl;
    }

    @Override // v1.m
    public float d(int i10) {
        return this.f24328e.u(i10);
    }

    @Override // v1.m
    public float e() {
        return A(q() - 1);
    }

    @Override // v1.m
    public z0.h f(int i10) {
        boolean z10;
        if (i10 >= 0 && i10 <= this.f24329f.length()) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            float z11 = n1.z(this.f24328e, i10, false, 2, null);
            int o10 = this.f24328e.o(i10);
            return new z0.h(z11, this.f24328e.u(o10), z11, this.f24328e.j(o10));
        }
        throw new AssertionError("offset(" + i10 + ") is out of bounds (0," + this.f24329f.length());
    }

    @Override // v1.m
    public long g(int i10) {
        return j0.b(E().b(i10), E().a(i10));
    }

    @Override // v1.m
    public float getHeight() {
        return this.f24328e.d();
    }

    @Override // v1.m
    public float getWidth() {
        return j2.b.n(this.f24327d);
    }

    @Override // v1.m
    public int h(int i10) {
        return this.f24328e.o(i10);
    }

    @Override // v1.m
    public float i() {
        return A(0);
    }

    @Override // v1.m
    public g2.i j(int i10) {
        if (this.f24328e.F(i10)) {
            return g2.i.Rtl;
        }
        return g2.i.Ltr;
    }

    @Override // v1.m
    public float k(int i10) {
        return this.f24328e.j(i10);
    }

    @Override // v1.m
    public int l(long j10) {
        return this.f24328e.w(this.f24328e.p((int) z0.f.p(j10)), z0.f.o(j10));
    }

    @Override // v1.m
    public z0.h m(int i10) {
        RectF a10 = this.f24328e.a(i10);
        return new z0.h(a10.left, a10.top, a10.right, a10.bottom);
    }

    @Override // v1.m
    public List<z0.h> n() {
        return this.f24330g;
    }

    @Override // v1.m
    public int o(int i10) {
        return this.f24328e.t(i10);
    }

    @Override // v1.m
    public int p(int i10, boolean z10) {
        if (z10) {
            return this.f24328e.v(i10);
        }
        return this.f24328e.n(i10);
    }

    @Override // v1.m
    public int q() {
        return this.f24328e.k();
    }

    @Override // v1.m
    public float r(int i10) {
        return this.f24328e.s(i10);
    }

    @Override // v1.m
    public void s(h1 h1Var, long j10, o4 o4Var, g2.k kVar, c1.g gVar, int i10) {
        qc.q.i(h1Var, "canvas");
        int a10 = D().a();
        d2.i D = D();
        D.d(j10);
        D.f(o4Var);
        D.g(kVar);
        D.e(gVar);
        D.b(i10);
        F(h1Var);
        D().b(a10);
    }

    @Override // v1.m
    public boolean t() {
        return this.f24328e.b();
    }

    @Override // v1.m
    public int u(float f10) {
        return this.f24328e.p((int) f10);
    }

    @Override // v1.m
    public e4 v(int i10, int i11) {
        boolean z10 = false;
        if (i10 >= 0 && i10 <= i11) {
            z10 = true;
        }
        if (z10 && i11 <= this.f24329f.length()) {
            Path path = new Path();
            this.f24328e.C(i10, i11, path);
            return u0.b(path);
        }
        throw new AssertionError("Start(" + i10 + ") or End(" + i11 + ") is out of Range(0.." + this.f24329f.length() + "), or start > end!");
    }

    @Override // v1.m
    public float w(int i10, boolean z10) {
        if (z10) {
            return n1.z(this.f24328e, i10, false, 2, null);
        }
        return n1.B(this.f24328e, i10, false, 2, null);
    }

    @Override // v1.m
    public float x(int i10) {
        return this.f24328e.r(i10);
    }

    private a(d2.d dVar, int i10, boolean z10, long j10) {
        CharSequence f10;
        List<z0.h> list;
        z0.h hVar;
        float w10;
        float i11;
        int b10;
        float u10;
        float f11;
        float i12;
        dc.f a10;
        int d10;
        qc.q.i(dVar, "paragraphIntrinsics");
        this.f24324a = dVar;
        this.f24325b = i10;
        this.f24326c = z10;
        this.f24327d = j10;
        if (!(j2.b.o(j10) == 0 && j2.b.p(j10) == 0)) {
            throw new IllegalArgumentException("Setting Constraints.minWidth and Constraints.minHeight is not supported, these should be the default zero values instead.".toString());
        }
        if (i10 >= 1) {
            k0 i13 = dVar.i();
            if (v1.b.c(i13, z10)) {
                f10 = v1.b.a(dVar.f());
            } else {
                f10 = dVar.f();
            }
            this.f24329f = f10;
            int d11 = v1.b.d(i13.z());
            g2.j z11 = i13.z();
            int i14 = z11 == null ? 0 : g2.j.j(z11.m(), g2.j.f16057b.c()) ? 1 : 0;
            int f12 = v1.b.f(i13.v().c());
            g2.f r10 = i13.r();
            int e10 = v1.b.e(r10 != null ? f.b.d(g2.f.f(r10.k())) : null);
            g2.f r11 = i13.r();
            int g10 = v1.b.g(r11 != null ? f.c.e(g2.f.g(r11.k())) : null);
            g2.f r12 = i13.r();
            int h10 = v1.b.h(r12 != null ? f.d.c(g2.f.h(r12.k())) : null);
            TextUtils.TruncateAt truncateAt = z10 ? TextUtils.TruncateAt.END : null;
            n1 z12 = z(d11, i14, truncateAt, i10, f12, e10, g10, h10);
            if (z10 && z12.d() > j2.b.m(j10) && i10 > 1) {
                int b11 = v1.b.b(z12, j2.b.m(j10));
                if (b11 >= 0 && b11 != i10) {
                    d10 = vc.l.d(b11, 1);
                    z12 = z(d11, i14, truncateAt, d10, f12, e10, g10, h10);
                }
                this.f24328e = z12;
            } else {
                this.f24328e = z12;
            }
            D().c(i13.g(), z0.m.a(getWidth(), getHeight()), i13.d());
            for (f2.b bVar : B(this.f24328e)) {
                bVar.a(z0.m.a(getWidth(), getHeight()));
            }
            CharSequence charSequence = this.f24329f;
            if (!(charSequence instanceof Spanned)) {
                list = ec.t.i();
            } else {
                Object[] spans = ((Spanned) charSequence).getSpans(0, charSequence.length(), y1.j.class);
                qc.q.h(spans, "getSpans(0, length, PlaceholderSpan::class.java)");
                ArrayList arrayList = new ArrayList(spans.length);
                for (Object obj : spans) {
                    y1.j jVar = (y1.j) obj;
                    Spanned spanned = (Spanned) charSequence;
                    int spanStart = spanned.getSpanStart(jVar);
                    int spanEnd = spanned.getSpanEnd(jVar);
                    int o10 = this.f24328e.o(spanStart);
                    boolean z13 = o10 >= this.f24325b;
                    boolean z14 = this.f24328e.l(o10) > 0 && spanEnd > this.f24328e.m(o10);
                    boolean z15 = spanEnd > this.f24328e.n(o10);
                    if (z14 || z15 || z13) {
                        hVar = null;
                    } else {
                        int i15 = C0572a.f24332a[j(spanStart).ordinal()];
                        if (i15 == 1) {
                            w10 = w(spanStart, true);
                        } else if (i15 != 2) {
                            throw new NoWhenBranchMatchedException();
                        } else {
                            w10 = w(spanStart, true) - jVar.d();
                        }
                        float d12 = jVar.d() + w10;
                        n1 n1Var = this.f24328e;
                        switch (jVar.c()) {
                            case 0:
                                i11 = n1Var.i(o10);
                                b10 = jVar.b();
                                u10 = i11 - b10;
                                break;
                            case 1:
                                u10 = n1Var.u(o10);
                                break;
                            case 2:
                                i11 = n1Var.j(o10);
                                b10 = jVar.b();
                                u10 = i11 - b10;
                                break;
                            case 3:
                                u10 = ((n1Var.u(o10) + n1Var.j(o10)) - jVar.b()) / 2;
                                break;
                            case 4:
                                f11 = jVar.a().ascent;
                                i12 = n1Var.i(o10);
                                u10 = f11 + i12;
                                break;
                            case 5:
                                u10 = (jVar.a().descent + n1Var.i(o10)) - jVar.b();
                                break;
                            case 6:
                                Paint.FontMetricsInt a11 = jVar.a();
                                f11 = ((a11.ascent + a11.descent) - jVar.b()) / 2;
                                i12 = n1Var.i(o10);
                                u10 = f11 + i12;
                                break;
                            default:
                                throw new IllegalStateException("unexpected verticalAlignment");
                        }
                        hVar = new z0.h(w10, u10, d12, jVar.b() + u10);
                    }
                    arrayList.add(hVar);
                }
                list = arrayList;
            }
            this.f24330g = list;
            a10 = dc.h.a(dc.j.NONE, new b());
            this.f24331h = a10;
            return;
        }
        throw new IllegalArgumentException("maxLines should be greater than 0".toString());
    }
}
