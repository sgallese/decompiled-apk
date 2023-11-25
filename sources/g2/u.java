package g2;

/* compiled from: TextOverflow.kt */
/* loaded from: classes.dex */
public final class u {

    /* renamed from: a  reason: collision with root package name */
    public static final a f16099a = new a(null);

    /* renamed from: b  reason: collision with root package name */
    private static final int f16100b = d(1);

    /* renamed from: c  reason: collision with root package name */
    private static final int f16101c = d(2);

    /* renamed from: d  reason: collision with root package name */
    private static final int f16102d = d(3);

    /* compiled from: TextOverflow.kt */
    /* loaded from: classes.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(qc.h hVar) {
            this();
        }

        public final int a() {
            return u.f16100b;
        }

        public final int b() {
            return u.f16101c;
        }

        public final int c() {
            return u.f16102d;
        }
    }

    public static final boolean e(int i10, int i11) {
        if (i10 == i11) {
            return true;
        }
        return false;
    }

    public static String g(int i10) {
        if (e(i10, f16100b)) {
            return "Clip";
        }
        if (e(i10, f16101c)) {
            return "Ellipsis";
        }
        if (e(i10, f16102d)) {
            return "Visible";
        }
        return "Invalid";
    }

    public static int d(int i10) {
        return i10;
    }

    public static int f(int i10) {
        return i10;
    }
}
