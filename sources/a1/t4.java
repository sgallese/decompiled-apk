package a1;

/* compiled from: StrokeJoin.kt */
/* loaded from: classes.dex */
public final class t4 {

    /* renamed from: b  reason: collision with root package name */
    public static final a f193b = new a(null);

    /* renamed from: c  reason: collision with root package name */
    private static final int f194c = e(0);

    /* renamed from: d  reason: collision with root package name */
    private static final int f195d = e(1);

    /* renamed from: e  reason: collision with root package name */
    private static final int f196e = e(2);

    /* renamed from: a  reason: collision with root package name */
    private final int f197a;

    /* compiled from: StrokeJoin.kt */
    /* loaded from: classes.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(qc.h hVar) {
            this();
        }

        public final int a() {
            return t4.f196e;
        }

        public final int b() {
            return t4.f194c;
        }

        public final int c() {
            return t4.f195d;
        }
    }

    private /* synthetic */ t4(int i10) {
        this.f197a = i10;
    }

    public static final /* synthetic */ t4 d(int i10) {
        return new t4(i10);
    }

    public static boolean f(int i10, Object obj) {
        if (!(obj instanceof t4) || i10 != ((t4) obj).j()) {
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
        if (g(i10, f194c)) {
            return "Miter";
        }
        if (g(i10, f195d)) {
            return "Round";
        }
        if (g(i10, f196e)) {
            return "Bevel";
        }
        return "Unknown";
    }

    public boolean equals(Object obj) {
        return f(this.f197a, obj);
    }

    public int hashCode() {
        return h(this.f197a);
    }

    public final /* synthetic */ int j() {
        return this.f197a;
    }

    public String toString() {
        return i(this.f197a);
    }

    public static int e(int i10) {
        return i10;
    }

    public static int h(int i10) {
        return i10;
    }
}
