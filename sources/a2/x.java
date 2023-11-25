package a2;

/* compiled from: FontStyle.kt */
/* loaded from: classes.dex */
public final class x {

    /* renamed from: b  reason: collision with root package name */
    public static final a f339b = new a(null);

    /* renamed from: c  reason: collision with root package name */
    private static final int f340c = d(0);

    /* renamed from: d  reason: collision with root package name */
    private static final int f341d = d(1);

    /* renamed from: a  reason: collision with root package name */
    private final int f342a;

    /* compiled from: FontStyle.kt */
    /* loaded from: classes.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(qc.h hVar) {
            this();
        }

        public final int a() {
            return x.f341d;
        }

        public final int b() {
            return x.f340c;
        }
    }

    private /* synthetic */ x(int i10) {
        this.f342a = i10;
    }

    public static final /* synthetic */ x c(int i10) {
        return new x(i10);
    }

    public static boolean e(int i10, Object obj) {
        if (!(obj instanceof x) || i10 != ((x) obj).i()) {
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
        if (f(i10, f340c)) {
            return "Normal";
        }
        if (f(i10, f341d)) {
            return "Italic";
        }
        return "Invalid";
    }

    public boolean equals(Object obj) {
        return e(this.f342a, obj);
    }

    public int hashCode() {
        return g(this.f342a);
    }

    public final /* synthetic */ int i() {
        return this.f342a;
    }

    public String toString() {
        return h(this.f342a);
    }

    public static int d(int i10) {
        return i10;
    }

    public static int g(int i10) {
        return i10;
    }
}
