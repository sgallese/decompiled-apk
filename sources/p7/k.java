package p7;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;

/* compiled from: ShapeAppearanceModel.java */
/* loaded from: classes3.dex */
public class k {

    /* renamed from: m  reason: collision with root package name */
    public static final p7.c f21213m = new i(0.5f);

    /* renamed from: a  reason: collision with root package name */
    d f21214a;

    /* renamed from: b  reason: collision with root package name */
    d f21215b;

    /* renamed from: c  reason: collision with root package name */
    d f21216c;

    /* renamed from: d  reason: collision with root package name */
    d f21217d;

    /* renamed from: e  reason: collision with root package name */
    p7.c f21218e;

    /* renamed from: f  reason: collision with root package name */
    p7.c f21219f;

    /* renamed from: g  reason: collision with root package name */
    p7.c f21220g;

    /* renamed from: h  reason: collision with root package name */
    p7.c f21221h;

    /* renamed from: i  reason: collision with root package name */
    f f21222i;

    /* renamed from: j  reason: collision with root package name */
    f f21223j;

    /* renamed from: k  reason: collision with root package name */
    f f21224k;

    /* renamed from: l  reason: collision with root package name */
    f f21225l;

    /* compiled from: ShapeAppearanceModel.java */
    /* loaded from: classes3.dex */
    public interface c {
        p7.c a(p7.c cVar);
    }

    public static b a() {
        return new b();
    }

    public static b b(Context context, int i10, int i11) {
        return c(context, i10, i11, 0);
    }

    private static b c(Context context, int i10, int i11, int i12) {
        return d(context, i10, i11, new p7.a(i12));
    }

    private static b d(Context context, int i10, int i11, p7.c cVar) {
        ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(context, i10);
        if (i11 != 0) {
            contextThemeWrapper = new ContextThemeWrapper(contextThemeWrapper, i11);
        }
        TypedArray obtainStyledAttributes = contextThemeWrapper.obtainStyledAttributes(v6.l.I5);
        try {
            int i12 = obtainStyledAttributes.getInt(v6.l.J5, 0);
            int i13 = obtainStyledAttributes.getInt(v6.l.M5, i12);
            int i14 = obtainStyledAttributes.getInt(v6.l.N5, i12);
            int i15 = obtainStyledAttributes.getInt(v6.l.L5, i12);
            int i16 = obtainStyledAttributes.getInt(v6.l.K5, i12);
            p7.c m10 = m(obtainStyledAttributes, v6.l.O5, cVar);
            p7.c m11 = m(obtainStyledAttributes, v6.l.R5, m10);
            p7.c m12 = m(obtainStyledAttributes, v6.l.S5, m10);
            p7.c m13 = m(obtainStyledAttributes, v6.l.Q5, m10);
            return new b().y(i13, m11).C(i14, m12).u(i15, m13).q(i16, m(obtainStyledAttributes, v6.l.P5, m10));
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    public static b e(Context context, AttributeSet attributeSet, int i10, int i11) {
        return f(context, attributeSet, i10, i11, 0);
    }

    public static b f(Context context, AttributeSet attributeSet, int i10, int i11, int i12) {
        return g(context, attributeSet, i10, i11, new p7.a(i12));
    }

    public static b g(Context context, AttributeSet attributeSet, int i10, int i11, p7.c cVar) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, v6.l.N4, i10, i11);
        int resourceId = obtainStyledAttributes.getResourceId(v6.l.O4, 0);
        int resourceId2 = obtainStyledAttributes.getResourceId(v6.l.P4, 0);
        obtainStyledAttributes.recycle();
        return d(context, resourceId, resourceId2, cVar);
    }

    private static p7.c m(TypedArray typedArray, int i10, p7.c cVar) {
        TypedValue peekValue = typedArray.peekValue(i10);
        if (peekValue == null) {
            return cVar;
        }
        int i11 = peekValue.type;
        if (i11 == 5) {
            return new p7.a(TypedValue.complexToDimensionPixelSize(peekValue.data, typedArray.getResources().getDisplayMetrics()));
        }
        if (i11 == 6) {
            return new i(peekValue.getFraction(1.0f, 1.0f));
        }
        return cVar;
    }

    public f h() {
        return this.f21224k;
    }

    public d i() {
        return this.f21217d;
    }

    public p7.c j() {
        return this.f21221h;
    }

    public d k() {
        return this.f21216c;
    }

    public p7.c l() {
        return this.f21220g;
    }

    public f n() {
        return this.f21225l;
    }

    public f o() {
        return this.f21223j;
    }

    public f p() {
        return this.f21222i;
    }

    public d q() {
        return this.f21214a;
    }

    public p7.c r() {
        return this.f21218e;
    }

    public d s() {
        return this.f21215b;
    }

    public p7.c t() {
        return this.f21219f;
    }

    public boolean u(RectF rectF) {
        boolean z10;
        boolean z11;
        boolean z12;
        if (this.f21225l.getClass().equals(f.class) && this.f21223j.getClass().equals(f.class) && this.f21222i.getClass().equals(f.class) && this.f21224k.getClass().equals(f.class)) {
            z10 = true;
        } else {
            z10 = false;
        }
        float a10 = this.f21218e.a(rectF);
        if (this.f21219f.a(rectF) == a10 && this.f21221h.a(rectF) == a10 && this.f21220g.a(rectF) == a10) {
            z11 = true;
        } else {
            z11 = false;
        }
        if ((this.f21215b instanceof j) && (this.f21214a instanceof j) && (this.f21216c instanceof j) && (this.f21217d instanceof j)) {
            z12 = true;
        } else {
            z12 = false;
        }
        if (z10 && z11 && z12) {
            return true;
        }
        return false;
    }

    public b v() {
        return new b(this);
    }

    public k w(float f10) {
        return v().o(f10).m();
    }

    public k x(p7.c cVar) {
        return v().p(cVar).m();
    }

    public k y(c cVar) {
        return v().B(cVar.a(r())).F(cVar.a(t())).t(cVar.a(j())).x(cVar.a(l())).m();
    }

    private k(b bVar) {
        this.f21214a = bVar.f21226a;
        this.f21215b = bVar.f21227b;
        this.f21216c = bVar.f21228c;
        this.f21217d = bVar.f21229d;
        this.f21218e = bVar.f21230e;
        this.f21219f = bVar.f21231f;
        this.f21220g = bVar.f21232g;
        this.f21221h = bVar.f21233h;
        this.f21222i = bVar.f21234i;
        this.f21223j = bVar.f21235j;
        this.f21224k = bVar.f21236k;
        this.f21225l = bVar.f21237l;
    }

    /* compiled from: ShapeAppearanceModel.java */
    /* loaded from: classes3.dex */
    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        private d f21226a;

        /* renamed from: b  reason: collision with root package name */
        private d f21227b;

        /* renamed from: c  reason: collision with root package name */
        private d f21228c;

        /* renamed from: d  reason: collision with root package name */
        private d f21229d;

        /* renamed from: e  reason: collision with root package name */
        private p7.c f21230e;

        /* renamed from: f  reason: collision with root package name */
        private p7.c f21231f;

        /* renamed from: g  reason: collision with root package name */
        private p7.c f21232g;

        /* renamed from: h  reason: collision with root package name */
        private p7.c f21233h;

        /* renamed from: i  reason: collision with root package name */
        private f f21234i;

        /* renamed from: j  reason: collision with root package name */
        private f f21235j;

        /* renamed from: k  reason: collision with root package name */
        private f f21236k;

        /* renamed from: l  reason: collision with root package name */
        private f f21237l;

        public b() {
            this.f21226a = h.b();
            this.f21227b = h.b();
            this.f21228c = h.b();
            this.f21229d = h.b();
            this.f21230e = new p7.a(0.0f);
            this.f21231f = new p7.a(0.0f);
            this.f21232g = new p7.a(0.0f);
            this.f21233h = new p7.a(0.0f);
            this.f21234i = h.c();
            this.f21235j = h.c();
            this.f21236k = h.c();
            this.f21237l = h.c();
        }

        private static float n(d dVar) {
            if (dVar instanceof j) {
                return ((j) dVar).f21212a;
            }
            if (dVar instanceof e) {
                return ((e) dVar).f21172a;
            }
            return -1.0f;
        }

        public b A(float f10) {
            this.f21230e = new p7.a(f10);
            return this;
        }

        public b B(p7.c cVar) {
            this.f21230e = cVar;
            return this;
        }

        public b C(int i10, p7.c cVar) {
            return D(h.a(i10)).F(cVar);
        }

        public b D(d dVar) {
            this.f21227b = dVar;
            float n10 = n(dVar);
            if (n10 != -1.0f) {
                E(n10);
            }
            return this;
        }

        public b E(float f10) {
            this.f21231f = new p7.a(f10);
            return this;
        }

        public b F(p7.c cVar) {
            this.f21231f = cVar;
            return this;
        }

        public k m() {
            return new k(this);
        }

        public b o(float f10) {
            return A(f10).E(f10).w(f10).s(f10);
        }

        public b p(p7.c cVar) {
            return B(cVar).F(cVar).x(cVar).t(cVar);
        }

        public b q(int i10, p7.c cVar) {
            return r(h.a(i10)).t(cVar);
        }

        public b r(d dVar) {
            this.f21229d = dVar;
            float n10 = n(dVar);
            if (n10 != -1.0f) {
                s(n10);
            }
            return this;
        }

        public b s(float f10) {
            this.f21233h = new p7.a(f10);
            return this;
        }

        public b t(p7.c cVar) {
            this.f21233h = cVar;
            return this;
        }

        public b u(int i10, p7.c cVar) {
            return v(h.a(i10)).x(cVar);
        }

        public b v(d dVar) {
            this.f21228c = dVar;
            float n10 = n(dVar);
            if (n10 != -1.0f) {
                w(n10);
            }
            return this;
        }

        public b w(float f10) {
            this.f21232g = new p7.a(f10);
            return this;
        }

        public b x(p7.c cVar) {
            this.f21232g = cVar;
            return this;
        }

        public b y(int i10, p7.c cVar) {
            return z(h.a(i10)).B(cVar);
        }

        public b z(d dVar) {
            this.f21226a = dVar;
            float n10 = n(dVar);
            if (n10 != -1.0f) {
                A(n10);
            }
            return this;
        }

        public b(k kVar) {
            this.f21226a = h.b();
            this.f21227b = h.b();
            this.f21228c = h.b();
            this.f21229d = h.b();
            this.f21230e = new p7.a(0.0f);
            this.f21231f = new p7.a(0.0f);
            this.f21232g = new p7.a(0.0f);
            this.f21233h = new p7.a(0.0f);
            this.f21234i = h.c();
            this.f21235j = h.c();
            this.f21236k = h.c();
            this.f21237l = h.c();
            this.f21226a = kVar.f21214a;
            this.f21227b = kVar.f21215b;
            this.f21228c = kVar.f21216c;
            this.f21229d = kVar.f21217d;
            this.f21230e = kVar.f21218e;
            this.f21231f = kVar.f21219f;
            this.f21232g = kVar.f21220g;
            this.f21233h = kVar.f21221h;
            this.f21234i = kVar.f21222i;
            this.f21235j = kVar.f21223j;
            this.f21236k = kVar.f21224k;
            this.f21237l = kVar.f21225l;
        }
    }

    public k() {
        this.f21214a = h.b();
        this.f21215b = h.b();
        this.f21216c = h.b();
        this.f21217d = h.b();
        this.f21218e = new p7.a(0.0f);
        this.f21219f = new p7.a(0.0f);
        this.f21220g = new p7.a(0.0f);
        this.f21221h = new p7.a(0.0f);
        this.f21222i = h.c();
        this.f21223j = h.c();
        this.f21224k = h.c();
        this.f21225l = h.c();
    }
}
