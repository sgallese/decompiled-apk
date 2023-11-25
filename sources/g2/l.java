package g2;

/* compiled from: TextDirection.kt */
/* loaded from: classes.dex */
public final class l {

    /* renamed from: b  reason: collision with root package name */
    public static final a f16070b = new a(null);

    /* renamed from: c  reason: collision with root package name */
    private static final int f16071c = g(1);

    /* renamed from: d  reason: collision with root package name */
    private static final int f16072d = g(2);

    /* renamed from: e  reason: collision with root package name */
    private static final int f16073e = g(3);

    /* renamed from: f  reason: collision with root package name */
    private static final int f16074f = g(4);

    /* renamed from: g  reason: collision with root package name */
    private static final int f16075g = g(5);

    /* renamed from: a  reason: collision with root package name */
    private final int f16076a;

    /* compiled from: TextDirection.kt */
    /* loaded from: classes.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(qc.h hVar) {
            this();
        }

        public final int a() {
            return l.f16073e;
        }

        public final int b() {
            return l.f16074f;
        }

        public final int c() {
            return l.f16075g;
        }

        public final int d() {
            return l.f16071c;
        }

        public final int e() {
            return l.f16072d;
        }
    }

    private /* synthetic */ l(int i10) {
        this.f16076a = i10;
    }

    public static final /* synthetic */ l f(int i10) {
        return new l(i10);
    }

    public static boolean h(int i10, Object obj) {
        if (!(obj instanceof l) || i10 != ((l) obj).l()) {
            return false;
        }
        return true;
    }

    public static final boolean i(int i10, int i11) {
        if (i10 == i11) {
            return true;
        }
        return false;
    }

    public static String k(int i10) {
        if (i(i10, f16071c)) {
            return "Ltr";
        }
        if (i(i10, f16072d)) {
            return "Rtl";
        }
        if (i(i10, f16073e)) {
            return "Content";
        }
        if (i(i10, f16074f)) {
            return "ContentOrLtr";
        }
        if (i(i10, f16075g)) {
            return "ContentOrRtl";
        }
        return "Invalid";
    }

    public boolean equals(Object obj) {
        return h(this.f16076a, obj);
    }

    public int hashCode() {
        return j(this.f16076a);
    }

    public final /* synthetic */ int l() {
        return this.f16076a;
    }

    public String toString() {
        return k(this.f16076a);
    }

    public static int g(int i10) {
        return i10;
    }

    public static int j(int i10) {
        return i10;
    }
}
