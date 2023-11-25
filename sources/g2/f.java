package g2;

/* compiled from: LineBreak.android.kt */
/* loaded from: classes.dex */
public final class f {

    /* renamed from: b  reason: collision with root package name */
    public static final a f16023b = new a(null);

    /* renamed from: c  reason: collision with root package name */
    private static final int f16024c;

    /* renamed from: d  reason: collision with root package name */
    private static final int f16025d;

    /* renamed from: e  reason: collision with root package name */
    private static final int f16026e;

    /* renamed from: a  reason: collision with root package name */
    private final int f16027a;

    /* compiled from: LineBreak.android.kt */
    /* loaded from: classes.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(qc.h hVar) {
            this();
        }

        public final int a() {
            return f.f16024c;
        }
    }

    static {
        b.a aVar = b.f16028b;
        int c10 = aVar.c();
        c.a aVar2 = c.f16033b;
        int c11 = aVar2.c();
        d.a aVar3 = d.f16039b;
        f16024c = d(c10, c11, aVar3.a());
        f16025d = d(aVar.a(), aVar2.b(), aVar3.b());
        f16026e = d(aVar.b(), aVar2.d(), aVar3.a());
    }

    private /* synthetic */ f(int i10) {
        this.f16027a = i10;
    }

    public static final /* synthetic */ f b(int i10) {
        return new f(i10);
    }

    public static int d(int i10, int i11, int i12) {
        int e10;
        e10 = g.e(i10, i11, i12);
        return c(e10);
    }

    public static boolean e(int i10, Object obj) {
        if (!(obj instanceof f) || i10 != ((f) obj).k()) {
            return false;
        }
        return true;
    }

    public static final int f(int i10) {
        int f10;
        f10 = g.f(i10);
        return b.e(f10);
    }

    public static final int g(int i10) {
        int g10;
        g10 = g.g(i10);
        return c.f(g10);
    }

    public static final int h(int i10) {
        int h10;
        h10 = g.h(i10);
        return d.d(h10);
    }

    public static String j(int i10) {
        return "LineBreak(strategy=" + ((Object) b.i(f(i10))) + ", strictness=" + ((Object) c.j(g(i10))) + ", wordBreak=" + ((Object) d.h(h(i10))) + ')';
    }

    public boolean equals(Object obj) {
        return e(this.f16027a, obj);
    }

    public int hashCode() {
        return i(this.f16027a);
    }

    public final /* synthetic */ int k() {
        return this.f16027a;
    }

    public String toString() {
        return j(this.f16027a);
    }

    /* compiled from: LineBreak.android.kt */
    /* loaded from: classes.dex */
    public static final class b {

        /* renamed from: b  reason: collision with root package name */
        public static final a f16028b = new a(null);

        /* renamed from: c  reason: collision with root package name */
        private static final int f16029c = e(1);

        /* renamed from: d  reason: collision with root package name */
        private static final int f16030d = e(2);

        /* renamed from: e  reason: collision with root package name */
        private static final int f16031e = e(3);

        /* renamed from: a  reason: collision with root package name */
        private final int f16032a;

        /* compiled from: LineBreak.android.kt */
        /* loaded from: classes.dex */
        public static final class a {
            private a() {
            }

            public /* synthetic */ a(qc.h hVar) {
                this();
            }

            public final int a() {
                return b.f16031e;
            }

            public final int b() {
                return b.f16030d;
            }

            public final int c() {
                return b.f16029c;
            }
        }

        private /* synthetic */ b(int i10) {
            this.f16032a = i10;
        }

        public static final /* synthetic */ b d(int i10) {
            return new b(i10);
        }

        public static boolean f(int i10, Object obj) {
            if (!(obj instanceof b) || i10 != ((b) obj).j()) {
                return false;
            }
            return true;
        }

        public static final boolean g(int i10, int i11) {
            if (i10 == i11) {
                return true;
            }
            return false;
        }

        public static String i(int i10) {
            if (g(i10, f16029c)) {
                return "Strategy.Simple";
            }
            if (g(i10, f16030d)) {
                return "Strategy.HighQuality";
            }
            if (g(i10, f16031e)) {
                return "Strategy.Balanced";
            }
            return "Invalid";
        }

        public boolean equals(Object obj) {
            return f(this.f16032a, obj);
        }

        public int hashCode() {
            return h(this.f16032a);
        }

        public final /* synthetic */ int j() {
            return this.f16032a;
        }

        public String toString() {
            return i(this.f16032a);
        }

        public static int e(int i10) {
            return i10;
        }

        public static int h(int i10) {
            return i10;
        }
    }

    /* compiled from: LineBreak.android.kt */
    /* loaded from: classes.dex */
    public static final class c {

        /* renamed from: b  reason: collision with root package name */
        public static final a f16033b = new a(null);

        /* renamed from: c  reason: collision with root package name */
        private static final int f16034c = f(1);

        /* renamed from: d  reason: collision with root package name */
        private static final int f16035d = f(2);

        /* renamed from: e  reason: collision with root package name */
        private static final int f16036e = f(3);

        /* renamed from: f  reason: collision with root package name */
        private static final int f16037f = f(4);

        /* renamed from: a  reason: collision with root package name */
        private final int f16038a;

        /* compiled from: LineBreak.android.kt */
        /* loaded from: classes.dex */
        public static final class a {
            private a() {
            }

            public /* synthetic */ a(qc.h hVar) {
                this();
            }

            public final int a() {
                return c.f16034c;
            }

            public final int b() {
                return c.f16035d;
            }

            public final int c() {
                return c.f16036e;
            }

            public final int d() {
                return c.f16037f;
            }
        }

        private /* synthetic */ c(int i10) {
            this.f16038a = i10;
        }

        public static final /* synthetic */ c e(int i10) {
            return new c(i10);
        }

        public static boolean g(int i10, Object obj) {
            if (!(obj instanceof c) || i10 != ((c) obj).k()) {
                return false;
            }
            return true;
        }

        public static final boolean h(int i10, int i11) {
            if (i10 == i11) {
                return true;
            }
            return false;
        }

        public static String j(int i10) {
            if (h(i10, f16034c)) {
                return "Strictness.None";
            }
            if (h(i10, f16035d)) {
                return "Strictness.Loose";
            }
            if (h(i10, f16036e)) {
                return "Strictness.Normal";
            }
            if (h(i10, f16037f)) {
                return "Strictness.Strict";
            }
            return "Invalid";
        }

        public boolean equals(Object obj) {
            return g(this.f16038a, obj);
        }

        public int hashCode() {
            return i(this.f16038a);
        }

        public final /* synthetic */ int k() {
            return this.f16038a;
        }

        public String toString() {
            return j(this.f16038a);
        }

        public static int f(int i10) {
            return i10;
        }

        public static int i(int i10) {
            return i10;
        }
    }

    /* compiled from: LineBreak.android.kt */
    /* loaded from: classes.dex */
    public static final class d {

        /* renamed from: b  reason: collision with root package name */
        public static final a f16039b = new a(null);

        /* renamed from: c  reason: collision with root package name */
        private static final int f16040c = d(1);

        /* renamed from: d  reason: collision with root package name */
        private static final int f16041d = d(2);

        /* renamed from: a  reason: collision with root package name */
        private final int f16042a;

        /* compiled from: LineBreak.android.kt */
        /* loaded from: classes.dex */
        public static final class a {
            private a() {
            }

            public /* synthetic */ a(qc.h hVar) {
                this();
            }

            public final int a() {
                return d.f16040c;
            }

            public final int b() {
                return d.f16041d;
            }
        }

        private /* synthetic */ d(int i10) {
            this.f16042a = i10;
        }

        public static final /* synthetic */ d c(int i10) {
            return new d(i10);
        }

        public static boolean e(int i10, Object obj) {
            if (!(obj instanceof d) || i10 != ((d) obj).i()) {
                return false;
            }
            return true;
        }

        public static final boolean f(int i10, int i11) {
            if (i10 == i11) {
                return true;
            }
            return false;
        }

        public static String h(int i10) {
            if (f(i10, f16040c)) {
                return "WordBreak.None";
            }
            if (f(i10, f16041d)) {
                return "WordBreak.Phrase";
            }
            return "Invalid";
        }

        public boolean equals(Object obj) {
            return e(this.f16042a, obj);
        }

        public int hashCode() {
            return g(this.f16042a);
        }

        public final /* synthetic */ int i() {
            return this.f16042a;
        }

        public String toString() {
            return h(this.f16042a);
        }

        public static int d(int i10) {
            return i10;
        }

        public static int g(int i10) {
            return i10;
        }
    }

    private static int c(int i10) {
        return i10;
    }

    public static int i(int i10) {
        return i10;
    }
}
