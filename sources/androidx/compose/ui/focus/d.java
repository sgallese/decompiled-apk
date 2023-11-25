package androidx.compose.ui.focus;

/* compiled from: FocusDirection.kt */
/* loaded from: classes.dex */
public final class d {

    /* renamed from: b  reason: collision with root package name */
    public static final a f2368b = new a(null);

    /* renamed from: c  reason: collision with root package name */
    private static final int f2369c = j(1);

    /* renamed from: d  reason: collision with root package name */
    private static final int f2370d = j(2);

    /* renamed from: e  reason: collision with root package name */
    private static final int f2371e = j(3);

    /* renamed from: f  reason: collision with root package name */
    private static final int f2372f = j(4);

    /* renamed from: g  reason: collision with root package name */
    private static final int f2373g = j(5);

    /* renamed from: h  reason: collision with root package name */
    private static final int f2374h = j(6);

    /* renamed from: i  reason: collision with root package name */
    private static final int f2375i;

    /* renamed from: j  reason: collision with root package name */
    private static final int f2376j;

    /* renamed from: k  reason: collision with root package name */
    private static final int f2377k;

    /* renamed from: l  reason: collision with root package name */
    private static final int f2378l;

    /* renamed from: a  reason: collision with root package name */
    private final int f2379a;

    /* compiled from: FocusDirection.kt */
    /* loaded from: classes.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(qc.h hVar) {
            this();
        }

        public final int a() {
            return d.f2374h;
        }

        public final int b() {
            return d.f2375i;
        }

        public final int c() {
            return d.f2376j;
        }

        public final int d() {
            return d.f2371e;
        }

        public final int e() {
            return d.f2369c;
        }

        public final int f() {
            return d.f2370d;
        }

        public final int g() {
            return d.f2372f;
        }

        public final int h() {
            return d.f2373g;
        }
    }

    static {
        int j10 = j(7);
        f2375i = j10;
        int j11 = j(8);
        f2376j = j11;
        f2377k = j10;
        f2378l = j11;
    }

    private /* synthetic */ d(int i10) {
        this.f2379a = i10;
    }

    public static final /* synthetic */ d i(int i10) {
        return new d(i10);
    }

    public static boolean k(int i10, Object obj) {
        if (!(obj instanceof d) || i10 != ((d) obj).o()) {
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
        if (l(i10, f2369c)) {
            return "Next";
        }
        if (l(i10, f2370d)) {
            return "Previous";
        }
        if (l(i10, f2371e)) {
            return "Left";
        }
        if (l(i10, f2372f)) {
            return "Right";
        }
        if (l(i10, f2373g)) {
            return "Up";
        }
        if (l(i10, f2374h)) {
            return "Down";
        }
        if (l(i10, f2375i)) {
            return "Enter";
        }
        if (l(i10, f2376j)) {
            return "Exit";
        }
        return "Invalid FocusDirection";
    }

    public boolean equals(Object obj) {
        return k(this.f2379a, obj);
    }

    public int hashCode() {
        return m(this.f2379a);
    }

    public final /* synthetic */ int o() {
        return this.f2379a;
    }

    public String toString() {
        return n(this.f2379a);
    }

    public static int j(int i10) {
        return i10;
    }

    public static int m(int i10) {
        return i10;
    }
}
