package a1;

/* compiled from: FilterQuality.kt */
/* loaded from: classes.dex */
public final class q3 {

    /* renamed from: a  reason: collision with root package name */
    public static final a f165a = new a(null);

    /* renamed from: b  reason: collision with root package name */
    private static final int f166b = c(0);

    /* renamed from: c  reason: collision with root package name */
    private static final int f167c = c(1);

    /* renamed from: d  reason: collision with root package name */
    private static final int f168d = c(2);

    /* renamed from: e  reason: collision with root package name */
    private static final int f169e = c(3);

    /* compiled from: FilterQuality.kt */
    /* loaded from: classes.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(qc.h hVar) {
            this();
        }

        public final int a() {
            return q3.f167c;
        }

        public final int b() {
            return q3.f166b;
        }
    }

    public static final boolean d(int i10, int i11) {
        if (i10 == i11) {
            return true;
        }
        return false;
    }

    public static String f(int i10) {
        if (d(i10, f166b)) {
            return "None";
        }
        if (d(i10, f167c)) {
            return "Low";
        }
        if (d(i10, f168d)) {
            return "Medium";
        }
        if (d(i10, f169e)) {
            return "High";
        }
        return "Unknown";
    }

    public static int c(int i10) {
        return i10;
    }

    public static int e(int i10) {
        return i10;
    }
}
