package b2;

/* compiled from: ImeAction.kt */
/* loaded from: classes.dex */
public final class o {

    /* renamed from: b  reason: collision with root package name */
    public static final a f7817b = new a(null);

    /* renamed from: c  reason: collision with root package name */
    private static final int f7818c = j(1);

    /* renamed from: d  reason: collision with root package name */
    private static final int f7819d = j(0);

    /* renamed from: e  reason: collision with root package name */
    private static final int f7820e = j(2);

    /* renamed from: f  reason: collision with root package name */
    private static final int f7821f = j(3);

    /* renamed from: g  reason: collision with root package name */
    private static final int f7822g = j(4);

    /* renamed from: h  reason: collision with root package name */
    private static final int f7823h = j(5);

    /* renamed from: i  reason: collision with root package name */
    private static final int f7824i = j(6);

    /* renamed from: j  reason: collision with root package name */
    private static final int f7825j = j(7);

    /* renamed from: a  reason: collision with root package name */
    private final int f7826a;

    /* compiled from: ImeAction.kt */
    /* loaded from: classes.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(qc.h hVar) {
            this();
        }

        public final int a() {
            return o.f7818c;
        }

        public final int b() {
            return o.f7825j;
        }

        public final int c() {
            return o.f7820e;
        }

        public final int d() {
            return o.f7824i;
        }

        public final int e() {
            return o.f7819d;
        }

        public final int f() {
            return o.f7823h;
        }

        public final int g() {
            return o.f7821f;
        }

        public final int h() {
            return o.f7822g;
        }
    }

    private /* synthetic */ o(int i10) {
        this.f7826a = i10;
    }

    public static final /* synthetic */ o i(int i10) {
        return new o(i10);
    }

    public static boolean k(int i10, Object obj) {
        if (!(obj instanceof o) || i10 != ((o) obj).o()) {
            return false;
        }
        return true;
    }

    public static final boolean l(int i10, int i11) {
        if (i10 == i11) {
            return true;
        }
        return false;
    }

    public static String n(int i10) {
        if (l(i10, f7819d)) {
            return "None";
        }
        if (l(i10, f7818c)) {
            return "Default";
        }
        if (l(i10, f7820e)) {
            return "Go";
        }
        if (l(i10, f7821f)) {
            return "Search";
        }
        if (l(i10, f7822g)) {
            return "Send";
        }
        if (l(i10, f7823h)) {
            return "Previous";
        }
        if (l(i10, f7824i)) {
            return "Next";
        }
        if (l(i10, f7825j)) {
            return "Done";
        }
        return "Invalid";
    }

    public boolean equals(Object obj) {
        return k(this.f7826a, obj);
    }

    public int hashCode() {
        return m(this.f7826a);
    }

    public final /* synthetic */ int o() {
        return this.f7826a;
    }

    public String toString() {
        return n(this.f7826a);
    }

    public static int j(int i10) {
        return i10;
    }

    public static int m(int i10) {
        return i10;
    }
}
