package androidx.compose.foundation.layout;

import androidx.compose.foundation.layout.FillElement;
import androidx.compose.foundation.layout.WrapContentElement;
import androidx.compose.ui.platform.k1;
import androidx.compose.ui.platform.m1;
import dc.w;
import qc.q;
import qc.r;
import v0.b;

/* compiled from: Size.kt */
/* loaded from: classes.dex */
public final class m {

    /* renamed from: a */
    private static final FillElement f2109a;

    /* renamed from: b */
    private static final FillElement f2110b;

    /* renamed from: c */
    private static final FillElement f2111c;

    /* renamed from: d */
    private static final WrapContentElement f2112d;

    /* renamed from: e */
    private static final WrapContentElement f2113e;

    /* renamed from: f */
    private static final WrapContentElement f2114f;

    /* renamed from: g */
    private static final WrapContentElement f2115g;

    /* renamed from: h */
    private static final WrapContentElement f2116h;

    /* renamed from: i */
    private static final WrapContentElement f2117i;

    /* compiled from: InspectableValue.kt */
    /* loaded from: classes.dex */
    public static final class a extends r implements pc.l<m1, w> {

        /* renamed from: f */
        final /* synthetic */ float f2118f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(float f10) {
            super(1);
            this.f2118f = f10;
        }

        public final void a(m1 m1Var) {
            q.i(m1Var, "$this$null");
            m1Var.b("height");
            m1Var.c(j2.h.f(this.f2118f));
        }

        @Override // pc.l
        public /* bridge */ /* synthetic */ w invoke(m1 m1Var) {
            a(m1Var);
            return w.f13270a;
        }
    }

    /* compiled from: InspectableValue.kt */
    /* loaded from: classes.dex */
    public static final class b extends r implements pc.l<m1, w> {

        /* renamed from: f */
        final /* synthetic */ float f2119f;

        /* renamed from: m */
        final /* synthetic */ float f2120m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(float f10, float f11) {
            super(1);
            this.f2119f = f10;
            this.f2120m = f11;
        }

        public final void a(m1 m1Var) {
            q.i(m1Var, "$this$null");
            m1Var.b("heightIn");
            m1Var.a().c("min", j2.h.f(this.f2119f));
            m1Var.a().c("max", j2.h.f(this.f2120m));
        }

        @Override // pc.l
        public /* bridge */ /* synthetic */ w invoke(m1 m1Var) {
            a(m1Var);
            return w.f13270a;
        }
    }

    /* compiled from: InspectableValue.kt */
    /* loaded from: classes.dex */
    public static final class c extends r implements pc.l<m1, w> {

        /* renamed from: f */
        final /* synthetic */ float f2121f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(float f10) {
            super(1);
            this.f2121f = f10;
        }

        public final void a(m1 m1Var) {
            q.i(m1Var, "$this$null");
            m1Var.b("requiredHeight");
            m1Var.c(j2.h.f(this.f2121f));
        }

        @Override // pc.l
        public /* bridge */ /* synthetic */ w invoke(m1 m1Var) {
            a(m1Var);
            return w.f13270a;
        }
    }

    /* compiled from: InspectableValue.kt */
    /* loaded from: classes.dex */
    public static final class d extends r implements pc.l<m1, w> {

        /* renamed from: f */
        final /* synthetic */ float f2122f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(float f10) {
            super(1);
            this.f2122f = f10;
        }

        public final void a(m1 m1Var) {
            q.i(m1Var, "$this$null");
            m1Var.b("requiredSize");
            m1Var.c(j2.h.f(this.f2122f));
        }

        @Override // pc.l
        public /* bridge */ /* synthetic */ w invoke(m1 m1Var) {
            a(m1Var);
            return w.f13270a;
        }
    }

    /* compiled from: InspectableValue.kt */
    /* loaded from: classes.dex */
    public static final class e extends r implements pc.l<m1, w> {

        /* renamed from: f */
        final /* synthetic */ float f2123f;

        /* renamed from: m */
        final /* synthetic */ float f2124m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(float f10, float f11) {
            super(1);
            this.f2123f = f10;
            this.f2124m = f11;
        }

        public final void a(m1 m1Var) {
            q.i(m1Var, "$this$null");
            m1Var.b("requiredSize");
            m1Var.a().c("width", j2.h.f(this.f2123f));
            m1Var.a().c("height", j2.h.f(this.f2124m));
        }

        @Override // pc.l
        public /* bridge */ /* synthetic */ w invoke(m1 m1Var) {
            a(m1Var);
            return w.f13270a;
        }
    }

    /* compiled from: InspectableValue.kt */
    /* loaded from: classes.dex */
    public static final class f extends r implements pc.l<m1, w> {

        /* renamed from: f */
        final /* synthetic */ float f2125f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(float f10) {
            super(1);
            this.f2125f = f10;
        }

        public final void a(m1 m1Var) {
            q.i(m1Var, "$this$null");
            m1Var.b("size");
            m1Var.c(j2.h.f(this.f2125f));
        }

        @Override // pc.l
        public /* bridge */ /* synthetic */ w invoke(m1 m1Var) {
            a(m1Var);
            return w.f13270a;
        }
    }

    /* compiled from: InspectableValue.kt */
    /* loaded from: classes.dex */
    public static final class g extends r implements pc.l<m1, w> {

        /* renamed from: f */
        final /* synthetic */ float f2126f;

        /* renamed from: m */
        final /* synthetic */ float f2127m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(float f10, float f11) {
            super(1);
            this.f2126f = f10;
            this.f2127m = f11;
        }

        public final void a(m1 m1Var) {
            q.i(m1Var, "$this$null");
            m1Var.b("size");
            m1Var.a().c("width", j2.h.f(this.f2126f));
            m1Var.a().c("height", j2.h.f(this.f2127m));
        }

        @Override // pc.l
        public /* bridge */ /* synthetic */ w invoke(m1 m1Var) {
            a(m1Var);
            return w.f13270a;
        }
    }

    /* compiled from: InspectableValue.kt */
    /* loaded from: classes.dex */
    public static final class h extends r implements pc.l<m1, w> {

        /* renamed from: f */
        final /* synthetic */ float f2128f;

        /* renamed from: m */
        final /* synthetic */ float f2129m;

        /* renamed from: p */
        final /* synthetic */ float f2130p;

        /* renamed from: q */
        final /* synthetic */ float f2131q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(float f10, float f11, float f12, float f13) {
            super(1);
            this.f2128f = f10;
            this.f2129m = f11;
            this.f2130p = f12;
            this.f2131q = f13;
        }

        public final void a(m1 m1Var) {
            q.i(m1Var, "$this$null");
            m1Var.b("sizeIn");
            m1Var.a().c("minWidth", j2.h.f(this.f2128f));
            m1Var.a().c("minHeight", j2.h.f(this.f2129m));
            m1Var.a().c("maxWidth", j2.h.f(this.f2130p));
            m1Var.a().c("maxHeight", j2.h.f(this.f2131q));
        }

        @Override // pc.l
        public /* bridge */ /* synthetic */ w invoke(m1 m1Var) {
            a(m1Var);
            return w.f13270a;
        }
    }

    /* compiled from: InspectableValue.kt */
    /* loaded from: classes.dex */
    public static final class i extends r implements pc.l<m1, w> {

        /* renamed from: f */
        final /* synthetic */ float f2132f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(float f10) {
            super(1);
            this.f2132f = f10;
        }

        public final void a(m1 m1Var) {
            q.i(m1Var, "$this$null");
            m1Var.b("width");
            m1Var.c(j2.h.f(this.f2132f));
        }

        @Override // pc.l
        public /* bridge */ /* synthetic */ w invoke(m1 m1Var) {
            a(m1Var);
            return w.f13270a;
        }
    }

    /* compiled from: InspectableValue.kt */
    /* loaded from: classes.dex */
    public static final class j extends r implements pc.l<m1, w> {

        /* renamed from: f */
        final /* synthetic */ float f2133f;

        /* renamed from: m */
        final /* synthetic */ float f2134m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(float f10, float f11) {
            super(1);
            this.f2133f = f10;
            this.f2134m = f11;
        }

        public final void a(m1 m1Var) {
            q.i(m1Var, "$this$null");
            m1Var.b("widthIn");
            m1Var.a().c("min", j2.h.f(this.f2133f));
            m1Var.a().c("max", j2.h.f(this.f2134m));
        }

        @Override // pc.l
        public /* bridge */ /* synthetic */ w invoke(m1 m1Var) {
            a(m1Var);
            return w.f13270a;
        }
    }

    static {
        FillElement.a aVar = FillElement.f2012f;
        f2109a = aVar.c(1.0f);
        f2110b = aVar.a(1.0f);
        f2111c = aVar.b(1.0f);
        WrapContentElement.a aVar2 = WrapContentElement.f2043h;
        b.a aVar3 = v0.b.f24258a;
        f2112d = aVar2.c(aVar3.f(), false);
        f2113e = aVar2.c(aVar3.j(), false);
        f2114f = aVar2.a(aVar3.h(), false);
        f2115g = aVar2.a(aVar3.k(), false);
        f2116h = aVar2.b(aVar3.d(), false);
        f2117i = aVar2.b(aVar3.n(), false);
    }

    public static final androidx.compose.ui.e a(androidx.compose.ui.e eVar, float f10, float f11) {
        q.i(eVar, "$this$defaultMinSize");
        return eVar.a(new UnspecifiedConstraintsElement(f10, f11, null));
    }

    public static /* synthetic */ androidx.compose.ui.e b(androidx.compose.ui.e eVar, float f10, float f11, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            f10 = j2.h.f18979m.b();
        }
        if ((i10 & 2) != 0) {
            f11 = j2.h.f18979m.b();
        }
        return a(eVar, f10, f11);
    }

    public static final androidx.compose.ui.e c(androidx.compose.ui.e eVar, float f10) {
        boolean z10;
        FillElement a10;
        q.i(eVar, "<this>");
        if (f10 == 1.0f) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            a10 = f2110b;
        } else {
            a10 = FillElement.f2012f.a(f10);
        }
        return eVar.a(a10);
    }

    public static /* synthetic */ androidx.compose.ui.e d(androidx.compose.ui.e eVar, float f10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            f10 = 1.0f;
        }
        return c(eVar, f10);
    }

    public static final androidx.compose.ui.e e(androidx.compose.ui.e eVar, float f10) {
        boolean z10;
        FillElement b10;
        q.i(eVar, "<this>");
        if (f10 == 1.0f) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            b10 = f2111c;
        } else {
            b10 = FillElement.f2012f.b(f10);
        }
        return eVar.a(b10);
    }

    public static /* synthetic */ androidx.compose.ui.e f(androidx.compose.ui.e eVar, float f10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            f10 = 1.0f;
        }
        return e(eVar, f10);
    }

    public static final androidx.compose.ui.e g(androidx.compose.ui.e eVar, float f10) {
        boolean z10;
        FillElement c10;
        q.i(eVar, "<this>");
        if (f10 == 1.0f) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            c10 = f2109a;
        } else {
            c10 = FillElement.f2012f.c(f10);
        }
        return eVar.a(c10);
    }

    public static /* synthetic */ androidx.compose.ui.e h(androidx.compose.ui.e eVar, float f10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            f10 = 1.0f;
        }
        return g(eVar, f10);
    }

    public static final androidx.compose.ui.e i(androidx.compose.ui.e eVar, float f10) {
        pc.l a10;
        q.i(eVar, "$this$height");
        float f11 = 0.0f;
        float f12 = 0.0f;
        boolean z10 = true;
        if (k1.c()) {
            a10 = new a(f10);
        } else {
            a10 = k1.a();
        }
        return eVar.a(new SizeElement(f11, f10, f12, f10, z10, a10, 5, null));
    }

    public static final androidx.compose.ui.e j(androidx.compose.ui.e eVar, float f10, float f11) {
        pc.l a10;
        q.i(eVar, "$this$heightIn");
        float f12 = 0.0f;
        float f13 = 0.0f;
        boolean z10 = true;
        if (k1.c()) {
            a10 = new b(f10, f11);
        } else {
            a10 = k1.a();
        }
        return eVar.a(new SizeElement(f12, f10, f13, f11, z10, a10, 5, null));
    }

    public static /* synthetic */ androidx.compose.ui.e k(androidx.compose.ui.e eVar, float f10, float f11, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            f10 = j2.h.f18979m.b();
        }
        if ((i10 & 2) != 0) {
            f11 = j2.h.f18979m.b();
        }
        return j(eVar, f10, f11);
    }

    public static final androidx.compose.ui.e l(androidx.compose.ui.e eVar, float f10) {
        pc.l a10;
        q.i(eVar, "$this$requiredHeight");
        float f11 = 0.0f;
        float f12 = 0.0f;
        boolean z10 = false;
        if (k1.c()) {
            a10 = new c(f10);
        } else {
            a10 = k1.a();
        }
        return eVar.a(new SizeElement(f11, f10, f12, f10, z10, a10, 5, null));
    }

    public static final androidx.compose.ui.e m(androidx.compose.ui.e eVar, float f10) {
        pc.l a10;
        q.i(eVar, "$this$requiredSize");
        if (k1.c()) {
            a10 = new d(f10);
        } else {
            a10 = k1.a();
        }
        return eVar.a(new SizeElement(f10, f10, f10, f10, false, a10, null));
    }

    public static final androidx.compose.ui.e n(androidx.compose.ui.e eVar, float f10, float f11) {
        pc.l a10;
        q.i(eVar, "$this$requiredSize");
        if (k1.c()) {
            a10 = new e(f10, f11);
        } else {
            a10 = k1.a();
        }
        return eVar.a(new SizeElement(f10, f11, f10, f11, false, a10, null));
    }

    public static final androidx.compose.ui.e o(androidx.compose.ui.e eVar, float f10) {
        pc.l a10;
        q.i(eVar, "$this$size");
        if (k1.c()) {
            a10 = new f(f10);
        } else {
            a10 = k1.a();
        }
        return eVar.a(new SizeElement(f10, f10, f10, f10, true, a10, null));
    }

    public static final androidx.compose.ui.e p(androidx.compose.ui.e eVar, float f10, float f11) {
        pc.l a10;
        q.i(eVar, "$this$size");
        if (k1.c()) {
            a10 = new g(f10, f11);
        } else {
            a10 = k1.a();
        }
        return eVar.a(new SizeElement(f10, f11, f10, f11, true, a10, null));
    }

    public static final androidx.compose.ui.e q(androidx.compose.ui.e eVar, float f10, float f11, float f12, float f13) {
        pc.l a10;
        q.i(eVar, "$this$sizeIn");
        boolean z10 = true;
        if (k1.c()) {
            a10 = new h(f10, f11, f12, f13);
        } else {
            a10 = k1.a();
        }
        return eVar.a(new SizeElement(f10, f11, f12, f13, z10, a10, null));
    }

    public static /* synthetic */ androidx.compose.ui.e r(androidx.compose.ui.e eVar, float f10, float f11, float f12, float f13, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            f10 = j2.h.f18979m.b();
        }
        if ((i10 & 2) != 0) {
            f11 = j2.h.f18979m.b();
        }
        if ((i10 & 4) != 0) {
            f12 = j2.h.f18979m.b();
        }
        if ((i10 & 8) != 0) {
            f13 = j2.h.f18979m.b();
        }
        return q(eVar, f10, f11, f12, f13);
    }

    public static final androidx.compose.ui.e s(androidx.compose.ui.e eVar, float f10) {
        pc.l a10;
        q.i(eVar, "$this$width");
        float f11 = 0.0f;
        float f12 = 0.0f;
        boolean z10 = true;
        if (k1.c()) {
            a10 = new i(f10);
        } else {
            a10 = k1.a();
        }
        return eVar.a(new SizeElement(f10, f11, f10, f12, z10, a10, 10, null));
    }

    public static final androidx.compose.ui.e t(androidx.compose.ui.e eVar, float f10, float f11) {
        pc.l a10;
        q.i(eVar, "$this$widthIn");
        float f12 = 0.0f;
        float f13 = 0.0f;
        boolean z10 = true;
        if (k1.c()) {
            a10 = new j(f10, f11);
        } else {
            a10 = k1.a();
        }
        return eVar.a(new SizeElement(f10, f12, f11, f13, z10, a10, 10, null));
    }

    public static /* synthetic */ androidx.compose.ui.e u(androidx.compose.ui.e eVar, float f10, float f11, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            f10 = j2.h.f18979m.b();
        }
        if ((i10 & 2) != 0) {
            f11 = j2.h.f18979m.b();
        }
        return t(eVar, f10, f11);
    }

    public static final androidx.compose.ui.e v(androidx.compose.ui.e eVar, v0.b bVar, boolean z10) {
        WrapContentElement b10;
        q.i(eVar, "<this>");
        q.i(bVar, "align");
        b.a aVar = v0.b.f24258a;
        if (q.d(bVar, aVar.d()) && !z10) {
            b10 = f2116h;
        } else if (q.d(bVar, aVar.n()) && !z10) {
            b10 = f2117i;
        } else {
            b10 = WrapContentElement.f2043h.b(bVar, z10);
        }
        return eVar.a(b10);
    }

    public static /* synthetic */ androidx.compose.ui.e w(androidx.compose.ui.e eVar, v0.b bVar, boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            bVar = v0.b.f24258a.d();
        }
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        return v(eVar, bVar, z10);
    }
}
