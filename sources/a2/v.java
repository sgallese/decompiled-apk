package a2;

/* compiled from: FontLoadingStrategy.kt */
/* loaded from: classes.dex */
public final class v {

    /* renamed from: a  reason: collision with root package name */
    public static final a f331a = new a(null);

    /* renamed from: b  reason: collision with root package name */
    private static final int f332b = d(0);

    /* renamed from: c  reason: collision with root package name */
    private static final int f333c = d(1);

    /* renamed from: d  reason: collision with root package name */
    private static final int f334d = d(2);

    /* compiled from: FontLoadingStrategy.kt */
    /* loaded from: classes.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(qc.h hVar) {
            this();
        }

        public final int a() {
            return v.f334d;
        }

        public final int b() {
            return v.f332b;
        }

        public final int c() {
            return v.f333c;
        }
    }

    public static final boolean e(int i10, int i11) {
        if (i10 == i11) {
            return true;
        }
        return false;
    }

    public static String g(int i10) {
        if (e(i10, f332b)) {
            return "Blocking";
        }
        if (e(i10, f333c)) {
            return "Optional";
        }
        if (e(i10, f334d)) {
            return "Async";
        }
        return "Invalid(value=" + i10 + ')';
    }

    private static int d(int i10) {
        return i10;
    }

    public static int f(int i10) {
        return i10;
    }
}
