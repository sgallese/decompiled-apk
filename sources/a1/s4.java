package a1;

/* compiled from: StrokeCap.kt */
/* loaded from: classes.dex */
public final class s4 {

    /* renamed from: b  reason: collision with root package name */
    public static final a f186b = new a(null);

    /* renamed from: c  reason: collision with root package name */
    private static final int f187c = e(0);

    /* renamed from: d  reason: collision with root package name */
    private static final int f188d = e(1);

    /* renamed from: e  reason: collision with root package name */
    private static final int f189e = e(2);

    /* renamed from: a  reason: collision with root package name */
    private final int f190a;

    /* compiled from: StrokeCap.kt */
    /* loaded from: classes.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(qc.h hVar) {
            this();
        }

        public final int a() {
            return s4.f187c;
        }

        public final int b() {
            return s4.f188d;
        }

        public final int c() {
            return s4.f189e;
        }
    }

    private /* synthetic */ s4(int i10) {
        this.f190a = i10;
    }

    public static final /* synthetic */ s4 d(int i10) {
        return new s4(i10);
    }

    public static boolean f(int i10, Object obj) {
        if (!(obj instanceof s4) || i10 != ((s4) obj).j()) {
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
        if (g(i10, f187c)) {
            return "Butt";
        }
        if (g(i10, f188d)) {
            return "Round";
        }
        if (g(i10, f189e)) {
            return "Square";
        }
        return "Unknown";
    }

    public boolean equals(Object obj) {
        return f(this.f190a, obj);
    }

    public int hashCode() {
        return h(this.f190a);
    }

    public final /* synthetic */ int j() {
        return this.f190a;
    }

    public String toString() {
        return i(this.f190a);
    }

    public static int e(int i10) {
        return i10;
    }

    public static int h(int i10) {
        return i10;
    }
}
