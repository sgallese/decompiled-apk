package g2;

/* compiled from: Hyphens.kt */
/* loaded from: classes.dex */
public final class e {

    /* renamed from: b  reason: collision with root package name */
    public static final a f16019b = new a(null);

    /* renamed from: c  reason: collision with root package name */
    private static final int f16020c = d(1);

    /* renamed from: d  reason: collision with root package name */
    private static final int f16021d = d(2);

    /* renamed from: a  reason: collision with root package name */
    private final int f16022a;

    /* compiled from: Hyphens.kt */
    /* loaded from: classes.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(qc.h hVar) {
            this();
        }

        public final int a() {
            return e.f16021d;
        }

        public final int b() {
            return e.f16020c;
        }
    }

    private /* synthetic */ e(int i10) {
        this.f16022a = i10;
    }

    public static final /* synthetic */ e c(int i10) {
        return new e(i10);
    }

    public static boolean e(int i10, Object obj) {
        if (!(obj instanceof e) || i10 != ((e) obj).i()) {
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
        if (f(i10, f16020c)) {
            return "Hyphens.None";
        }
        if (f(i10, f16021d)) {
            return "Hyphens.Auto";
        }
        return "Invalid";
    }

    public boolean equals(Object obj) {
        return e(this.f16022a, obj);
    }

    public int hashCode() {
        return g(this.f16022a);
    }

    public final /* synthetic */ int i() {
        return this.f16022a;
    }

    public String toString() {
        return h(this.f16022a);
    }

    private static int d(int i10) {
        return i10;
    }

    public static int g(int i10) {
        return i10;
    }
}
