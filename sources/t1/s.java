package t1;

import java.util.List;
import v1.i0;

/* compiled from: SemanticsProperties.kt */
/* loaded from: classes.dex */
public final class s {
    private static final w<u1.a> A;
    private static final w<dc.w> B;
    private static final w<String> C;
    private static final w<pc.l<Object, Integer>> D;

    /* renamed from: c  reason: collision with root package name */
    private static final w<String> f23480c;

    /* renamed from: d  reason: collision with root package name */
    private static final w<t1.h> f23481d;

    /* renamed from: f  reason: collision with root package name */
    private static final w<dc.w> f23483f;

    /* renamed from: g  reason: collision with root package name */
    private static final w<t1.b> f23484g;

    /* renamed from: h  reason: collision with root package name */
    private static final w<t1.c> f23485h;

    /* renamed from: i  reason: collision with root package name */
    private static final w<dc.w> f23486i;

    /* renamed from: j  reason: collision with root package name */
    private static final w<dc.w> f23487j;

    /* renamed from: k  reason: collision with root package name */
    private static final w<t1.g> f23488k;

    /* renamed from: l  reason: collision with root package name */
    private static final w<Boolean> f23489l;

    /* renamed from: m  reason: collision with root package name */
    private static final w<Boolean> f23490m;

    /* renamed from: p  reason: collision with root package name */
    private static final w<j> f23493p;

    /* renamed from: q  reason: collision with root package name */
    private static final w<j> f23494q;

    /* renamed from: w  reason: collision with root package name */
    private static final w<v1.d> f23500w;

    /* renamed from: x  reason: collision with root package name */
    private static final w<i0> f23501x;

    /* renamed from: y  reason: collision with root package name */
    private static final w<b2.o> f23502y;

    /* renamed from: z  reason: collision with root package name */
    private static final w<Boolean> f23503z;

    /* renamed from: a  reason: collision with root package name */
    public static final s f23478a = new s();

    /* renamed from: b  reason: collision with root package name */
    private static final w<List<String>> f23479b = new w<>("ContentDescription", a.f23504f);

    /* renamed from: e  reason: collision with root package name */
    private static final w<String> f23482e = new w<>("PaneTitle", e.f23508f);

    /* renamed from: n  reason: collision with root package name */
    private static final w<dc.w> f23491n = new w<>("InvisibleToUser", b.f23505f);

    /* renamed from: o  reason: collision with root package name */
    private static final w<Float> f23492o = new w<>("TraversalIndex", i.f23512f);

    /* renamed from: r  reason: collision with root package name */
    private static final w<dc.w> f23495r = new w<>("IsPopup", d.f23507f);

    /* renamed from: s  reason: collision with root package name */
    private static final w<dc.w> f23496s = new w<>("IsDialog", c.f23506f);

    /* renamed from: t  reason: collision with root package name */
    private static final w<t1.i> f23497t = new w<>("Role", f.f23509f);

    /* renamed from: u  reason: collision with root package name */
    private static final w<String> f23498u = new w<>("TestTag", g.f23510f);

    /* renamed from: v  reason: collision with root package name */
    private static final w<List<v1.d>> f23499v = new w<>("Text", h.f23511f);

    /* compiled from: SemanticsProperties.kt */
    /* loaded from: classes.dex */
    static final class a extends qc.r implements pc.p<List<? extends String>, List<? extends String>, List<? extends String>> {

        /* renamed from: f  reason: collision with root package name */
        public static final a f23504f = new a();

        a() {
            super(2);
        }

        /* JADX WARN: Code restructure failed: missing block: B:4:0x0007, code lost:
        
            r2 = ec.b0.F0(r2);
         */
        @Override // pc.p
        /* renamed from: a  reason: merged with bridge method [inline-methods] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.util.List<java.lang.String> invoke(java.util.List<java.lang.String> r2, java.util.List<java.lang.String> r3) {
            /*
                r1 = this;
                java.lang.String r0 = "childValue"
                qc.q.i(r3, r0)
                if (r2 == 0) goto L15
                java.util.Collection r2 = (java.util.Collection) r2
                java.util.List r2 = ec.r.F0(r2)
                if (r2 == 0) goto L15
                java.util.Collection r3 = (java.util.Collection) r3
                r2.addAll(r3)
                r3 = r2
            L15:
                return r3
            */
            throw new UnsupportedOperationException("Method not decompiled: t1.s.a.invoke(java.util.List, java.util.List):java.util.List");
        }
    }

    /* compiled from: SemanticsProperties.kt */
    /* loaded from: classes.dex */
    static final class b extends qc.r implements pc.p<dc.w, dc.w, dc.w> {

        /* renamed from: f  reason: collision with root package name */
        public static final b f23505f = new b();

        b() {
            super(2);
        }

        @Override // pc.p
        /* renamed from: a  reason: merged with bridge method [inline-methods] */
        public final dc.w invoke(dc.w wVar, dc.w wVar2) {
            qc.q.i(wVar2, "<anonymous parameter 1>");
            return wVar;
        }
    }

    /* compiled from: SemanticsProperties.kt */
    /* loaded from: classes.dex */
    static final class c extends qc.r implements pc.p<dc.w, dc.w, dc.w> {

        /* renamed from: f  reason: collision with root package name */
        public static final c f23506f = new c();

        c() {
            super(2);
        }

        @Override // pc.p
        /* renamed from: a  reason: merged with bridge method [inline-methods] */
        public final dc.w invoke(dc.w wVar, dc.w wVar2) {
            qc.q.i(wVar2, "<anonymous parameter 1>");
            throw new IllegalStateException("merge function called on unmergeable property IsDialog. A dialog should not be a child of a clickable/focusable node.");
        }
    }

    /* compiled from: SemanticsProperties.kt */
    /* loaded from: classes.dex */
    static final class d extends qc.r implements pc.p<dc.w, dc.w, dc.w> {

        /* renamed from: f  reason: collision with root package name */
        public static final d f23507f = new d();

        d() {
            super(2);
        }

        @Override // pc.p
        /* renamed from: a  reason: merged with bridge method [inline-methods] */
        public final dc.w invoke(dc.w wVar, dc.w wVar2) {
            qc.q.i(wVar2, "<anonymous parameter 1>");
            throw new IllegalStateException("merge function called on unmergeable property IsPopup. A popup should not be a child of a clickable/focusable node.");
        }
    }

    /* compiled from: SemanticsProperties.kt */
    /* loaded from: classes.dex */
    static final class e extends qc.r implements pc.p<String, String, String> {

        /* renamed from: f  reason: collision with root package name */
        public static final e f23508f = new e();

        e() {
            super(2);
        }

        @Override // pc.p
        /* renamed from: a  reason: merged with bridge method [inline-methods] */
        public final String invoke(String str, String str2) {
            qc.q.i(str2, "<anonymous parameter 1>");
            throw new IllegalStateException("merge function called on unmergeable property PaneTitle.");
        }
    }

    /* compiled from: SemanticsProperties.kt */
    /* loaded from: classes.dex */
    static final class g extends qc.r implements pc.p<String, String, String> {

        /* renamed from: f  reason: collision with root package name */
        public static final g f23510f = new g();

        g() {
            super(2);
        }

        @Override // pc.p
        /* renamed from: a  reason: merged with bridge method [inline-methods] */
        public final String invoke(String str, String str2) {
            qc.q.i(str2, "<anonymous parameter 1>");
            return str;
        }
    }

    /* compiled from: SemanticsProperties.kt */
    /* loaded from: classes.dex */
    static final class h extends qc.r implements pc.p<List<? extends v1.d>, List<? extends v1.d>, List<? extends v1.d>> {

        /* renamed from: f  reason: collision with root package name */
        public static final h f23511f = new h();

        h() {
            super(2);
        }

        /* JADX WARN: Code restructure failed: missing block: B:4:0x0007, code lost:
        
            r2 = ec.b0.F0(r2);
         */
        @Override // pc.p
        /* renamed from: a  reason: merged with bridge method [inline-methods] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.util.List<v1.d> invoke(java.util.List<v1.d> r2, java.util.List<v1.d> r3) {
            /*
                r1 = this;
                java.lang.String r0 = "childValue"
                qc.q.i(r3, r0)
                if (r2 == 0) goto L15
                java.util.Collection r2 = (java.util.Collection) r2
                java.util.List r2 = ec.r.F0(r2)
                if (r2 == 0) goto L15
                java.util.Collection r3 = (java.util.Collection) r3
                r2.addAll(r3)
                r3 = r2
            L15:
                return r3
            */
            throw new UnsupportedOperationException("Method not decompiled: t1.s.h.invoke(java.util.List, java.util.List):java.util.List");
        }
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [pc.p, qc.h] */
    static {
        ?? r22 = 0;
        int i10 = 2;
        f23480c = new w<>("StateDescription", r22, i10, r22);
        f23481d = new w<>("ProgressBarRangeInfo", r22, i10, r22);
        f23483f = new w<>("SelectableGroup", r22, i10, r22);
        f23484g = new w<>("CollectionInfo", r22, i10, r22);
        f23485h = new w<>("CollectionItemInfo", r22, i10, r22);
        f23486i = new w<>("Heading", r22, i10, r22);
        f23487j = new w<>("Disabled", r22, i10, r22);
        f23488k = new w<>("LiveRegion", r22, i10, r22);
        f23489l = new w<>("Focused", r22, i10, r22);
        f23490m = new w<>("IsTraversalGroup", r22, i10, r22);
        f23493p = new w<>("HorizontalScrollAxisRange", r22, i10, r22);
        f23494q = new w<>("VerticalScrollAxisRange", r22, i10, r22);
        f23500w = new w<>("EditableText", r22, i10, r22);
        f23501x = new w<>("TextSelectionRange", r22, i10, r22);
        f23502y = new w<>("ImeAction", r22, i10, r22);
        f23503z = new w<>("Selected", r22, i10, r22);
        A = new w<>("ToggleableState", r22, i10, r22);
        B = new w<>("Password", r22, i10, r22);
        C = new w<>("Error", r22, i10, r22);
        D = new w<>("IndexForKey", r22, i10, r22);
    }

    private s() {
    }

    public final w<Float> A() {
        return f23492o;
    }

    public final w<j> B() {
        return f23494q;
    }

    public final w<t1.b> a() {
        return f23484g;
    }

    public final w<t1.c> b() {
        return f23485h;
    }

    public final w<List<String>> c() {
        return f23479b;
    }

    public final w<dc.w> d() {
        return f23487j;
    }

    public final w<v1.d> e() {
        return f23500w;
    }

    public final w<String> f() {
        return C;
    }

    public final w<Boolean> g() {
        return f23489l;
    }

    public final w<dc.w> h() {
        return f23486i;
    }

    public final w<j> i() {
        return f23493p;
    }

    public final w<b2.o> j() {
        return f23502y;
    }

    public final w<pc.l<Object, Integer>> k() {
        return D;
    }

    public final w<dc.w> l() {
        return f23491n;
    }

    public final w<dc.w> m() {
        return f23495r;
    }

    public final w<Boolean> n() {
        return f23490m;
    }

    public final w<t1.g> o() {
        return f23488k;
    }

    public final w<String> p() {
        return f23482e;
    }

    public final w<dc.w> q() {
        return B;
    }

    public final w<t1.h> r() {
        return f23481d;
    }

    public final w<t1.i> s() {
        return f23497t;
    }

    public final w<dc.w> t() {
        return f23483f;
    }

    public final w<Boolean> u() {
        return f23503z;
    }

    public final w<String> v() {
        return f23480c;
    }

    public final w<String> w() {
        return f23498u;
    }

    public final w<List<v1.d>> x() {
        return f23499v;
    }

    public final w<i0> y() {
        return f23501x;
    }

    public final w<u1.a> z() {
        return A;
    }

    /* compiled from: SemanticsProperties.kt */
    /* loaded from: classes.dex */
    static final class f extends qc.r implements pc.p<t1.i, t1.i, t1.i> {

        /* renamed from: f  reason: collision with root package name */
        public static final f f23509f = new f();

        f() {
            super(2);
        }

        @Override // pc.p
        public /* bridge */ /* synthetic */ t1.i invoke(t1.i iVar, t1.i iVar2) {
            return a(iVar, iVar2.n());
        }

        public final t1.i a(t1.i iVar, int i10) {
            return iVar;
        }
    }

    /* compiled from: SemanticsProperties.kt */
    /* loaded from: classes.dex */
    static final class i extends qc.r implements pc.p<Float, Float, Float> {

        /* renamed from: f  reason: collision with root package name */
        public static final i f23512f = new i();

        i() {
            super(2);
        }

        @Override // pc.p
        public /* bridge */ /* synthetic */ Float invoke(Float f10, Float f11) {
            return a(f10, f11.floatValue());
        }

        public final Float a(Float f10, float f11) {
            return f10;
        }
    }
}
