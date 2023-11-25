package g2;

/* compiled from: LineHeightStyle.kt */
/* loaded from: classes.dex */
public final class h {

    /* renamed from: c  reason: collision with root package name */
    public static final b f16043c;

    /* renamed from: d  reason: collision with root package name */
    private static final h f16044d;

    /* renamed from: a  reason: collision with root package name */
    private final float f16045a;

    /* renamed from: b  reason: collision with root package name */
    private final int f16046b;

    /* compiled from: LineHeightStyle.kt */
    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public static final C0380a f16047a = new C0380a(null);

        /* renamed from: b  reason: collision with root package name */
        private static final float f16048b = b(0.0f);

        /* renamed from: c  reason: collision with root package name */
        private static final float f16049c = b(0.5f);

        /* renamed from: d  reason: collision with root package name */
        private static final float f16050d = b(-1.0f);

        /* renamed from: e  reason: collision with root package name */
        private static final float f16051e = b(1.0f);

        /* compiled from: LineHeightStyle.kt */
        /* renamed from: g2.h$a$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static final class C0380a {
            private C0380a() {
            }

            public /* synthetic */ C0380a(qc.h hVar) {
                this();
            }

            public final float a() {
                return a.f16050d;
            }
        }

        public static float b(float f10) {
            boolean z10;
            boolean z11;
            boolean z12 = true;
            if (0.0f <= f10 && f10 <= 1.0f) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (!z10) {
                if (f10 == -1.0f) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (!z11) {
                    z12 = false;
                }
            }
            if (z12) {
                return f10;
            }
            throw new IllegalStateException("topRatio should be in [0..1] range or -1".toString());
        }

        public static final boolean c(float f10, float f11) {
            if (Float.compare(f10, f11) == 0) {
                return true;
            }
            return false;
        }

        public static int d(float f10) {
            return Float.floatToIntBits(f10);
        }

        public static String e(float f10) {
            boolean z10;
            boolean z11;
            boolean z12;
            boolean z13 = true;
            if (f10 == f16048b) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                return "LineHeightStyle.Alignment.Top";
            }
            if (f10 == f16049c) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (z11) {
                return "LineHeightStyle.Alignment.Center";
            }
            if (f10 == f16050d) {
                z12 = true;
            } else {
                z12 = false;
            }
            if (z12) {
                return "LineHeightStyle.Alignment.Proportional";
            }
            if (f10 != f16051e) {
                z13 = false;
            }
            if (z13) {
                return "LineHeightStyle.Alignment.Bottom";
            }
            return "LineHeightStyle.Alignment(topPercentage = " + f10 + ')';
        }
    }

    /* compiled from: LineHeightStyle.kt */
    /* loaded from: classes.dex */
    public static final class b {
        private b() {
        }

        public /* synthetic */ b(qc.h hVar) {
            this();
        }

        public final h a() {
            return h.f16044d;
        }
    }

    static {
        qc.h hVar = null;
        f16043c = new b(hVar);
        f16044d = new h(a.f16047a.a(), c.f16052a.a(), hVar);
    }

    public /* synthetic */ h(float f10, int i10, qc.h hVar) {
        this(f10, i10);
    }

    public final float b() {
        return this.f16045a;
    }

    public final int c() {
        return this.f16046b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        if (a.c(this.f16045a, hVar.f16045a) && c.c(this.f16046b, hVar.f16046b)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return (a.d(this.f16045a) * 31) + c.d(this.f16046b);
    }

    public String toString() {
        return "LineHeightStyle(alignment=" + ((Object) a.e(this.f16045a)) + ", trim=" + ((Object) c.g(this.f16046b)) + ')';
    }

    private h(float f10, int i10) {
        this.f16045a = f10;
        this.f16046b = i10;
    }

    /* compiled from: LineHeightStyle.kt */
    /* loaded from: classes.dex */
    public static final class c {

        /* renamed from: a  reason: collision with root package name */
        public static final a f16052a = new a(null);

        /* renamed from: b  reason: collision with root package name */
        private static final int f16053b = b(1);

        /* renamed from: c  reason: collision with root package name */
        private static final int f16054c = b(16);

        /* renamed from: d  reason: collision with root package name */
        private static final int f16055d = b(17);

        /* renamed from: e  reason: collision with root package name */
        private static final int f16056e = b(0);

        /* compiled from: LineHeightStyle.kt */
        /* loaded from: classes.dex */
        public static final class a {
            private a() {
            }

            public /* synthetic */ a(qc.h hVar) {
                this();
            }

            public final int a() {
                return c.f16055d;
            }
        }

        public static final boolean c(int i10, int i11) {
            if (i10 == i11) {
                return true;
            }
            return false;
        }

        public static final boolean e(int i10) {
            if ((i10 & 1) > 0) {
                return true;
            }
            return false;
        }

        public static final boolean f(int i10) {
            if ((i10 & 16) > 0) {
                return true;
            }
            return false;
        }

        public static String g(int i10) {
            if (i10 == f16053b) {
                return "LineHeightStyle.Trim.FirstLineTop";
            }
            if (i10 == f16054c) {
                return "LineHeightStyle.Trim.LastLineBottom";
            }
            if (i10 == f16055d) {
                return "LineHeightStyle.Trim.Both";
            }
            if (i10 == f16056e) {
                return "LineHeightStyle.Trim.None";
            }
            return "Invalid";
        }

        private static int b(int i10) {
            return i10;
        }

        public static int d(int i10) {
            return i10;
        }
    }
}
