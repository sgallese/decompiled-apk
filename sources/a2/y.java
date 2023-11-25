package a2;

/* compiled from: FontSynthesis.kt */
/* loaded from: classes.dex */
public final class y {

    /* renamed from: b  reason: collision with root package name */
    public static final a f348b = new a(null);

    /* renamed from: c  reason: collision with root package name */
    private static final int f349c = f(0);

    /* renamed from: d  reason: collision with root package name */
    private static final int f350d = f(1);

    /* renamed from: e  reason: collision with root package name */
    private static final int f351e = f(2);

    /* renamed from: f  reason: collision with root package name */
    private static final int f352f = f(3);

    /* renamed from: a  reason: collision with root package name */
    private final int f353a;

    /* compiled from: FontSynthesis.kt */
    /* loaded from: classes.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(qc.h hVar) {
            this();
        }

        public final int a() {
            return y.f350d;
        }

        public final int b() {
            return y.f349c;
        }

        public final int c() {
            return y.f352f;
        }

        public final int d() {
            return y.f351e;
        }
    }

    private /* synthetic */ y(int i10) {
        this.f353a = i10;
    }

    public static final /* synthetic */ y e(int i10) {
        return new y(i10);
    }

    public static boolean g(int i10, Object obj) {
        if (!(obj instanceof y) || i10 != ((y) obj).m()) {
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

    public static final boolean j(int i10) {
        if (!h(i10, f350d) && !h(i10, f352f)) {
            return false;
        }
        return true;
    }

    public static final boolean k(int i10) {
        if (!h(i10, f350d) && !h(i10, f351e)) {
            return false;
        }
        return true;
    }

    public static String l(int i10) {
        if (h(i10, f349c)) {
            return "None";
        }
        if (h(i10, f350d)) {
            return "All";
        }
        if (h(i10, f351e)) {
            return "Weight";
        }
        if (h(i10, f352f)) {
            return "Style";
        }
        return "Invalid";
    }

    public boolean equals(Object obj) {
        return g(this.f353a, obj);
    }

    public int hashCode() {
        return i(this.f353a);
    }

    public final /* synthetic */ int m() {
        return this.f353a;
    }

    public String toString() {
        return l(this.f353a);
    }

    public static int f(int i10) {
        return i10;
    }

    public static int i(int i10) {
        return i10;
    }
}
