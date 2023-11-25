package w;

import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: RowColumnImpl.kt */
/* loaded from: classes.dex */
public final class o {

    /* renamed from: a  reason: collision with root package name */
    public static final o f25186a = new o();

    /* renamed from: b  reason: collision with root package name */
    private static final pc.q<List<? extends n1.m>, Integer, Integer, Integer> f25187b = d.f25204f;

    /* renamed from: c  reason: collision with root package name */
    private static final pc.q<List<? extends n1.m>, Integer, Integer, Integer> f25188c = h.f25216f;

    /* renamed from: d  reason: collision with root package name */
    private static final pc.q<List<? extends n1.m>, Integer, Integer, Integer> f25189d = c.f25201f;

    /* renamed from: e  reason: collision with root package name */
    private static final pc.q<List<? extends n1.m>, Integer, Integer, Integer> f25190e = g.f25213f;

    /* renamed from: f  reason: collision with root package name */
    private static final pc.q<List<? extends n1.m>, Integer, Integer, Integer> f25191f = b.f25198f;

    /* renamed from: g  reason: collision with root package name */
    private static final pc.q<List<? extends n1.m>, Integer, Integer, Integer> f25192g = f.f25210f;

    /* renamed from: h  reason: collision with root package name */
    private static final pc.q<List<? extends n1.m>, Integer, Integer, Integer> f25193h = a.f25195f;

    /* renamed from: i  reason: collision with root package name */
    private static final pc.q<List<? extends n1.m>, Integer, Integer, Integer> f25194i = e.f25207f;

    /* compiled from: RowColumnImpl.kt */
    /* loaded from: classes.dex */
    static final class a extends qc.r implements pc.q<List<? extends n1.m>, Integer, Integer, Integer> {

        /* renamed from: f  reason: collision with root package name */
        public static final a f25195f = new a();

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: RowColumnImpl.kt */
        /* renamed from: w.o$a$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static final class C0578a extends qc.r implements pc.p<n1.m, Integer, Integer> {

            /* renamed from: f  reason: collision with root package name */
            public static final C0578a f25196f = new C0578a();

            C0578a() {
                super(2);
            }

            public final Integer a(n1.m mVar, int i10) {
                qc.q.i(mVar, "$this$intrinsicSize");
                return Integer.valueOf(mVar.g(i10));
            }

            @Override // pc.p
            public /* bridge */ /* synthetic */ Integer invoke(n1.m mVar, Integer num) {
                return a(mVar, num.intValue());
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: RowColumnImpl.kt */
        /* loaded from: classes.dex */
        public static final class b extends qc.r implements pc.p<n1.m, Integer, Integer> {

            /* renamed from: f  reason: collision with root package name */
            public static final b f25197f = new b();

            b() {
                super(2);
            }

            public final Integer a(n1.m mVar, int i10) {
                qc.q.i(mVar, "$this$intrinsicSize");
                return Integer.valueOf(mVar.t(i10));
            }

            @Override // pc.p
            public /* bridge */ /* synthetic */ Integer invoke(n1.m mVar, Integer num) {
                return a(mVar, num.intValue());
            }
        }

        a() {
            super(3);
        }

        public final Integer a(List<? extends n1.m> list, int i10, int i11) {
            int p10;
            qc.q.i(list, "measurables");
            p10 = u.p(list, C0578a.f25196f, b.f25197f, i10, i11, p.Horizontal, p.Vertical);
            return Integer.valueOf(p10);
        }

        @Override // pc.q
        public /* bridge */ /* synthetic */ Integer invoke(List<? extends n1.m> list, Integer num, Integer num2) {
            return a(list, num.intValue(), num2.intValue());
        }
    }

    /* compiled from: RowColumnImpl.kt */
    /* loaded from: classes.dex */
    static final class b extends qc.r implements pc.q<List<? extends n1.m>, Integer, Integer, Integer> {

        /* renamed from: f  reason: collision with root package name */
        public static final b f25198f = new b();

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: RowColumnImpl.kt */
        /* loaded from: classes.dex */
        public static final class a extends qc.r implements pc.p<n1.m, Integer, Integer> {

            /* renamed from: f  reason: collision with root package name */
            public static final a f25199f = new a();

            a() {
                super(2);
            }

            public final Integer a(n1.m mVar, int i10) {
                qc.q.i(mVar, "$this$intrinsicSize");
                return Integer.valueOf(mVar.t(i10));
            }

            @Override // pc.p
            public /* bridge */ /* synthetic */ Integer invoke(n1.m mVar, Integer num) {
                return a(mVar, num.intValue());
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: RowColumnImpl.kt */
        /* renamed from: w.o$b$b  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static final class C0579b extends qc.r implements pc.p<n1.m, Integer, Integer> {

            /* renamed from: f  reason: collision with root package name */
            public static final C0579b f25200f = new C0579b();

            C0579b() {
                super(2);
            }

            public final Integer a(n1.m mVar, int i10) {
                qc.q.i(mVar, "$this$intrinsicSize");
                return Integer.valueOf(mVar.g(i10));
            }

            @Override // pc.p
            public /* bridge */ /* synthetic */ Integer invoke(n1.m mVar, Integer num) {
                return a(mVar, num.intValue());
            }
        }

        b() {
            super(3);
        }

        public final Integer a(List<? extends n1.m> list, int i10, int i11) {
            int p10;
            qc.q.i(list, "measurables");
            a aVar = a.f25199f;
            C0579b c0579b = C0579b.f25200f;
            p pVar = p.Horizontal;
            p10 = u.p(list, aVar, c0579b, i10, i11, pVar, pVar);
            return Integer.valueOf(p10);
        }

        @Override // pc.q
        public /* bridge */ /* synthetic */ Integer invoke(List<? extends n1.m> list, Integer num, Integer num2) {
            return a(list, num.intValue(), num2.intValue());
        }
    }

    /* compiled from: RowColumnImpl.kt */
    /* loaded from: classes.dex */
    static final class c extends qc.r implements pc.q<List<? extends n1.m>, Integer, Integer, Integer> {

        /* renamed from: f  reason: collision with root package name */
        public static final c f25201f = new c();

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: RowColumnImpl.kt */
        /* loaded from: classes.dex */
        public static final class a extends qc.r implements pc.p<n1.m, Integer, Integer> {

            /* renamed from: f  reason: collision with root package name */
            public static final a f25202f = new a();

            a() {
                super(2);
            }

            public final Integer a(n1.m mVar, int i10) {
                qc.q.i(mVar, "$this$intrinsicSize");
                return Integer.valueOf(mVar.a0(i10));
            }

            @Override // pc.p
            public /* bridge */ /* synthetic */ Integer invoke(n1.m mVar, Integer num) {
                return a(mVar, num.intValue());
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: RowColumnImpl.kt */
        /* loaded from: classes.dex */
        public static final class b extends qc.r implements pc.p<n1.m, Integer, Integer> {

            /* renamed from: f  reason: collision with root package name */
            public static final b f25203f = new b();

            b() {
                super(2);
            }

            public final Integer a(n1.m mVar, int i10) {
                qc.q.i(mVar, "$this$intrinsicSize");
                return Integer.valueOf(mVar.t(i10));
            }

            @Override // pc.p
            public /* bridge */ /* synthetic */ Integer invoke(n1.m mVar, Integer num) {
                return a(mVar, num.intValue());
            }
        }

        c() {
            super(3);
        }

        public final Integer a(List<? extends n1.m> list, int i10, int i11) {
            int p10;
            qc.q.i(list, "measurables");
            p10 = u.p(list, a.f25202f, b.f25203f, i10, i11, p.Horizontal, p.Vertical);
            return Integer.valueOf(p10);
        }

        @Override // pc.q
        public /* bridge */ /* synthetic */ Integer invoke(List<? extends n1.m> list, Integer num, Integer num2) {
            return a(list, num.intValue(), num2.intValue());
        }
    }

    /* compiled from: RowColumnImpl.kt */
    /* loaded from: classes.dex */
    static final class d extends qc.r implements pc.q<List<? extends n1.m>, Integer, Integer, Integer> {

        /* renamed from: f  reason: collision with root package name */
        public static final d f25204f = new d();

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: RowColumnImpl.kt */
        /* loaded from: classes.dex */
        public static final class a extends qc.r implements pc.p<n1.m, Integer, Integer> {

            /* renamed from: f  reason: collision with root package name */
            public static final a f25205f = new a();

            a() {
                super(2);
            }

            public final Integer a(n1.m mVar, int i10) {
                qc.q.i(mVar, "$this$intrinsicSize");
                return Integer.valueOf(mVar.s(i10));
            }

            @Override // pc.p
            public /* bridge */ /* synthetic */ Integer invoke(n1.m mVar, Integer num) {
                return a(mVar, num.intValue());
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: RowColumnImpl.kt */
        /* loaded from: classes.dex */
        public static final class b extends qc.r implements pc.p<n1.m, Integer, Integer> {

            /* renamed from: f  reason: collision with root package name */
            public static final b f25206f = new b();

            b() {
                super(2);
            }

            public final Integer a(n1.m mVar, int i10) {
                qc.q.i(mVar, "$this$intrinsicSize");
                return Integer.valueOf(mVar.g(i10));
            }

            @Override // pc.p
            public /* bridge */ /* synthetic */ Integer invoke(n1.m mVar, Integer num) {
                return a(mVar, num.intValue());
            }
        }

        d() {
            super(3);
        }

        public final Integer a(List<? extends n1.m> list, int i10, int i11) {
            int p10;
            qc.q.i(list, "measurables");
            a aVar = a.f25205f;
            b bVar = b.f25206f;
            p pVar = p.Horizontal;
            p10 = u.p(list, aVar, bVar, i10, i11, pVar, pVar);
            return Integer.valueOf(p10);
        }

        @Override // pc.q
        public /* bridge */ /* synthetic */ Integer invoke(List<? extends n1.m> list, Integer num, Integer num2) {
            return a(list, num.intValue(), num2.intValue());
        }
    }

    /* compiled from: RowColumnImpl.kt */
    /* loaded from: classes.dex */
    static final class e extends qc.r implements pc.q<List<? extends n1.m>, Integer, Integer, Integer> {

        /* renamed from: f  reason: collision with root package name */
        public static final e f25207f = new e();

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: RowColumnImpl.kt */
        /* loaded from: classes.dex */
        public static final class a extends qc.r implements pc.p<n1.m, Integer, Integer> {

            /* renamed from: f  reason: collision with root package name */
            public static final a f25208f = new a();

            a() {
                super(2);
            }

            public final Integer a(n1.m mVar, int i10) {
                qc.q.i(mVar, "$this$intrinsicSize");
                return Integer.valueOf(mVar.g(i10));
            }

            @Override // pc.p
            public /* bridge */ /* synthetic */ Integer invoke(n1.m mVar, Integer num) {
                return a(mVar, num.intValue());
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: RowColumnImpl.kt */
        /* loaded from: classes.dex */
        public static final class b extends qc.r implements pc.p<n1.m, Integer, Integer> {

            /* renamed from: f  reason: collision with root package name */
            public static final b f25209f = new b();

            b() {
                super(2);
            }

            public final Integer a(n1.m mVar, int i10) {
                qc.q.i(mVar, "$this$intrinsicSize");
                return Integer.valueOf(mVar.t(i10));
            }

            @Override // pc.p
            public /* bridge */ /* synthetic */ Integer invoke(n1.m mVar, Integer num) {
                return a(mVar, num.intValue());
            }
        }

        e() {
            super(3);
        }

        public final Integer a(List<? extends n1.m> list, int i10, int i11) {
            int p10;
            qc.q.i(list, "measurables");
            a aVar = a.f25208f;
            b bVar = b.f25209f;
            p pVar = p.Vertical;
            p10 = u.p(list, aVar, bVar, i10, i11, pVar, pVar);
            return Integer.valueOf(p10);
        }

        @Override // pc.q
        public /* bridge */ /* synthetic */ Integer invoke(List<? extends n1.m> list, Integer num, Integer num2) {
            return a(list, num.intValue(), num2.intValue());
        }
    }

    /* compiled from: RowColumnImpl.kt */
    /* loaded from: classes.dex */
    static final class f extends qc.r implements pc.q<List<? extends n1.m>, Integer, Integer, Integer> {

        /* renamed from: f  reason: collision with root package name */
        public static final f f25210f = new f();

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: RowColumnImpl.kt */
        /* loaded from: classes.dex */
        public static final class a extends qc.r implements pc.p<n1.m, Integer, Integer> {

            /* renamed from: f  reason: collision with root package name */
            public static final a f25211f = new a();

            a() {
                super(2);
            }

            public final Integer a(n1.m mVar, int i10) {
                qc.q.i(mVar, "$this$intrinsicSize");
                return Integer.valueOf(mVar.t(i10));
            }

            @Override // pc.p
            public /* bridge */ /* synthetic */ Integer invoke(n1.m mVar, Integer num) {
                return a(mVar, num.intValue());
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: RowColumnImpl.kt */
        /* loaded from: classes.dex */
        public static final class b extends qc.r implements pc.p<n1.m, Integer, Integer> {

            /* renamed from: f  reason: collision with root package name */
            public static final b f25212f = new b();

            b() {
                super(2);
            }

            public final Integer a(n1.m mVar, int i10) {
                qc.q.i(mVar, "$this$intrinsicSize");
                return Integer.valueOf(mVar.g(i10));
            }

            @Override // pc.p
            public /* bridge */ /* synthetic */ Integer invoke(n1.m mVar, Integer num) {
                return a(mVar, num.intValue());
            }
        }

        f() {
            super(3);
        }

        public final Integer a(List<? extends n1.m> list, int i10, int i11) {
            int p10;
            qc.q.i(list, "measurables");
            p10 = u.p(list, a.f25211f, b.f25212f, i10, i11, p.Vertical, p.Horizontal);
            return Integer.valueOf(p10);
        }

        @Override // pc.q
        public /* bridge */ /* synthetic */ Integer invoke(List<? extends n1.m> list, Integer num, Integer num2) {
            return a(list, num.intValue(), num2.intValue());
        }
    }

    /* compiled from: RowColumnImpl.kt */
    /* loaded from: classes.dex */
    static final class g extends qc.r implements pc.q<List<? extends n1.m>, Integer, Integer, Integer> {

        /* renamed from: f  reason: collision with root package name */
        public static final g f25213f = new g();

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: RowColumnImpl.kt */
        /* loaded from: classes.dex */
        public static final class a extends qc.r implements pc.p<n1.m, Integer, Integer> {

            /* renamed from: f  reason: collision with root package name */
            public static final a f25214f = new a();

            a() {
                super(2);
            }

            public final Integer a(n1.m mVar, int i10) {
                qc.q.i(mVar, "$this$intrinsicSize");
                return Integer.valueOf(mVar.a0(i10));
            }

            @Override // pc.p
            public /* bridge */ /* synthetic */ Integer invoke(n1.m mVar, Integer num) {
                return a(mVar, num.intValue());
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: RowColumnImpl.kt */
        /* loaded from: classes.dex */
        public static final class b extends qc.r implements pc.p<n1.m, Integer, Integer> {

            /* renamed from: f  reason: collision with root package name */
            public static final b f25215f = new b();

            b() {
                super(2);
            }

            public final Integer a(n1.m mVar, int i10) {
                qc.q.i(mVar, "$this$intrinsicSize");
                return Integer.valueOf(mVar.t(i10));
            }

            @Override // pc.p
            public /* bridge */ /* synthetic */ Integer invoke(n1.m mVar, Integer num) {
                return a(mVar, num.intValue());
            }
        }

        g() {
            super(3);
        }

        public final Integer a(List<? extends n1.m> list, int i10, int i11) {
            int p10;
            qc.q.i(list, "measurables");
            a aVar = a.f25214f;
            b bVar = b.f25215f;
            p pVar = p.Vertical;
            p10 = u.p(list, aVar, bVar, i10, i11, pVar, pVar);
            return Integer.valueOf(p10);
        }

        @Override // pc.q
        public /* bridge */ /* synthetic */ Integer invoke(List<? extends n1.m> list, Integer num, Integer num2) {
            return a(list, num.intValue(), num2.intValue());
        }
    }

    /* compiled from: RowColumnImpl.kt */
    /* loaded from: classes.dex */
    static final class h extends qc.r implements pc.q<List<? extends n1.m>, Integer, Integer, Integer> {

        /* renamed from: f  reason: collision with root package name */
        public static final h f25216f = new h();

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: RowColumnImpl.kt */
        /* loaded from: classes.dex */
        public static final class a extends qc.r implements pc.p<n1.m, Integer, Integer> {

            /* renamed from: f  reason: collision with root package name */
            public static final a f25217f = new a();

            a() {
                super(2);
            }

            public final Integer a(n1.m mVar, int i10) {
                qc.q.i(mVar, "$this$intrinsicSize");
                return Integer.valueOf(mVar.s(i10));
            }

            @Override // pc.p
            public /* bridge */ /* synthetic */ Integer invoke(n1.m mVar, Integer num) {
                return a(mVar, num.intValue());
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: RowColumnImpl.kt */
        /* loaded from: classes.dex */
        public static final class b extends qc.r implements pc.p<n1.m, Integer, Integer> {

            /* renamed from: f  reason: collision with root package name */
            public static final b f25218f = new b();

            b() {
                super(2);
            }

            public final Integer a(n1.m mVar, int i10) {
                qc.q.i(mVar, "$this$intrinsicSize");
                return Integer.valueOf(mVar.g(i10));
            }

            @Override // pc.p
            public /* bridge */ /* synthetic */ Integer invoke(n1.m mVar, Integer num) {
                return a(mVar, num.intValue());
            }
        }

        h() {
            super(3);
        }

        public final Integer a(List<? extends n1.m> list, int i10, int i11) {
            int p10;
            qc.q.i(list, "measurables");
            p10 = u.p(list, a.f25217f, b.f25218f, i10, i11, p.Vertical, p.Horizontal);
            return Integer.valueOf(p10);
        }

        @Override // pc.q
        public /* bridge */ /* synthetic */ Integer invoke(List<? extends n1.m> list, Integer num, Integer num2) {
            return a(list, num.intValue(), num2.intValue());
        }
    }

    private o() {
    }

    public final pc.q<List<? extends n1.m>, Integer, Integer, Integer> a() {
        return f25193h;
    }

    public final pc.q<List<? extends n1.m>, Integer, Integer, Integer> b() {
        return f25191f;
    }

    public final pc.q<List<? extends n1.m>, Integer, Integer, Integer> c() {
        return f25189d;
    }

    public final pc.q<List<? extends n1.m>, Integer, Integer, Integer> d() {
        return f25187b;
    }

    public final pc.q<List<? extends n1.m>, Integer, Integer, Integer> e() {
        return f25194i;
    }

    public final pc.q<List<? extends n1.m>, Integer, Integer, Integer> f() {
        return f25192g;
    }

    public final pc.q<List<? extends n1.m>, Integer, Integer, Integer> g() {
        return f25190e;
    }

    public final pc.q<List<? extends n1.m>, Integer, Integer, Integer> h() {
        return f25188c;
    }
}
