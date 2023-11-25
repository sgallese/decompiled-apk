package v1;

/* compiled from: Placeholder.kt */
/* loaded from: classes.dex */
public final class v {

    /* renamed from: a  reason: collision with root package name */
    public static final a f24507a = new a(null);

    /* renamed from: b  reason: collision with root package name */
    private static final int f24508b = h(1);

    /* renamed from: c  reason: collision with root package name */
    private static final int f24509c = h(2);

    /* renamed from: d  reason: collision with root package name */
    private static final int f24510d = h(3);

    /* renamed from: e  reason: collision with root package name */
    private static final int f24511e = h(4);

    /* renamed from: f  reason: collision with root package name */
    private static final int f24512f = h(5);

    /* renamed from: g  reason: collision with root package name */
    private static final int f24513g = h(6);

    /* renamed from: h  reason: collision with root package name */
    private static final int f24514h = h(7);

    /* compiled from: Placeholder.kt */
    /* loaded from: classes.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(qc.h hVar) {
            this();
        }

        public final int a() {
            return v.f24508b;
        }

        public final int b() {
            return v.f24510d;
        }

        public final int c() {
            return v.f24511e;
        }

        public final int d() {
            return v.f24513g;
        }

        public final int e() {
            return v.f24514h;
        }

        public final int f() {
            return v.f24512f;
        }

        public final int g() {
            return v.f24509c;
        }
    }

    public static final boolean i(int i10, int i11) {
        if (i10 == i11) {
            return true;
        }
        return false;
    }

    public static String k(int i10) {
        if (i(i10, f24508b)) {
            return "AboveBaseline";
        }
        if (i(i10, f24509c)) {
            return "Top";
        }
        if (i(i10, f24510d)) {
            return "Bottom";
        }
        if (i(i10, f24511e)) {
            return "Center";
        }
        if (i(i10, f24512f)) {
            return "TextTop";
        }
        if (i(i10, f24513g)) {
            return "TextBottom";
        }
        if (i(i10, f24514h)) {
            return "TextCenter";
        }
        return "Invalid";
    }

    public static int h(int i10) {
        return i10;
    }

    public static int j(int i10) {
        return i10;
    }
}
