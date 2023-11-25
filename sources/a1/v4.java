package a1;

/* compiled from: TileMode.kt */
/* loaded from: classes.dex */
public final class v4 {

    /* renamed from: a  reason: collision with root package name */
    public static final a f208a = new a(null);

    /* renamed from: b  reason: collision with root package name */
    private static final int f209b = e(0);

    /* renamed from: c  reason: collision with root package name */
    private static final int f210c = e(1);

    /* renamed from: d  reason: collision with root package name */
    private static final int f211d = e(2);

    /* renamed from: e  reason: collision with root package name */
    private static final int f212e = e(3);

    /* compiled from: TileMode.kt */
    /* loaded from: classes.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(qc.h hVar) {
            this();
        }

        public final int a() {
            return v4.f209b;
        }

        public final int b() {
            return v4.f212e;
        }

        public final int c() {
            return v4.f211d;
        }

        public final int d() {
            return v4.f210c;
        }
    }

    public static final boolean f(int i10, int i11) {
        if (i10 == i11) {
            return true;
        }
        return false;
    }

    public static String h(int i10) {
        if (f(i10, f209b)) {
            return "Clamp";
        }
        if (f(i10, f210c)) {
            return "Repeated";
        }
        if (f(i10, f211d)) {
            return "Mirror";
        }
        if (f(i10, f212e)) {
            return "Decal";
        }
        return "Unknown";
    }

    public static int e(int i10) {
        return i10;
    }

    public static int g(int i10) {
        return i10;
    }
}
