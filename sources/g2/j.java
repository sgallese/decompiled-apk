package g2;

/* compiled from: TextAlign.kt */
/* loaded from: classes.dex */
public final class j {

    /* renamed from: b  reason: collision with root package name */
    public static final a f16057b = new a(null);

    /* renamed from: c  reason: collision with root package name */
    private static final int f16058c = h(1);

    /* renamed from: d  reason: collision with root package name */
    private static final int f16059d = h(2);

    /* renamed from: e  reason: collision with root package name */
    private static final int f16060e = h(3);

    /* renamed from: f  reason: collision with root package name */
    private static final int f16061f = h(4);

    /* renamed from: g  reason: collision with root package name */
    private static final int f16062g = h(5);

    /* renamed from: h  reason: collision with root package name */
    private static final int f16063h = h(6);

    /* renamed from: a  reason: collision with root package name */
    private final int f16064a;

    /* compiled from: TextAlign.kt */
    /* loaded from: classes.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(qc.h hVar) {
            this();
        }

        public final int a() {
            return j.f16060e;
        }

        public final int b() {
            return j.f16063h;
        }

        public final int c() {
            return j.f16061f;
        }

        public final int d() {
            return j.f16058c;
        }

        public final int e() {
            return j.f16059d;
        }

        public final int f() {
            return j.f16062g;
        }
    }

    private /* synthetic */ j(int i10) {
        this.f16064a = i10;
    }

    public static final /* synthetic */ j g(int i10) {
        return new j(i10);
    }

    public static boolean i(int i10, Object obj) {
        if (!(obj instanceof j) || i10 != ((j) obj).m()) {
            return false;
        }
        return true;
    }

    public static final boolean j(int i10, int i11) {
        if (i10 == i11) {
            return true;
        }
        return false;
    }

    public static String l(int i10) {
        if (j(i10, f16058c)) {
            return "Left";
        }
        if (j(i10, f16059d)) {
            return "Right";
        }
        if (j(i10, f16060e)) {
            return "Center";
        }
        if (j(i10, f16061f)) {
            return "Justify";
        }
        if (j(i10, f16062g)) {
            return "Start";
        }
        if (j(i10, f16063h)) {
            return "End";
        }
        return "Invalid";
    }

    public boolean equals(Object obj) {
        return i(this.f16064a, obj);
    }

    public int hashCode() {
        return k(this.f16064a);
    }

    public final /* synthetic */ int m() {
        return this.f16064a;
    }

    public String toString() {
        return l(this.f16064a);
    }

    public static int h(int i10) {
        return i10;
    }

    public static int k(int i10) {
        return i10;
    }
}
