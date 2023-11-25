package t1;

/* compiled from: SemanticsProperties.kt */
/* loaded from: classes.dex */
public final class i {

    /* renamed from: b  reason: collision with root package name */
    public static final a f23425b = new a(null);

    /* renamed from: c  reason: collision with root package name */
    private static final int f23426c = i(0);

    /* renamed from: d  reason: collision with root package name */
    private static final int f23427d = i(1);

    /* renamed from: e  reason: collision with root package name */
    private static final int f23428e = i(2);

    /* renamed from: f  reason: collision with root package name */
    private static final int f23429f = i(3);

    /* renamed from: g  reason: collision with root package name */
    private static final int f23430g = i(4);

    /* renamed from: h  reason: collision with root package name */
    private static final int f23431h = i(5);

    /* renamed from: i  reason: collision with root package name */
    private static final int f23432i = i(6);

    /* renamed from: a  reason: collision with root package name */
    private final int f23433a;

    /* compiled from: SemanticsProperties.kt */
    /* loaded from: classes.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(qc.h hVar) {
            this();
        }

        public final int a() {
            return i.f23426c;
        }

        public final int b() {
            return i.f23427d;
        }

        public final int c() {
            return i.f23432i;
        }

        public final int d() {
            return i.f23431h;
        }

        public final int e() {
            return i.f23429f;
        }

        public final int f() {
            return i.f23428e;
        }

        public final int g() {
            return i.f23430g;
        }
    }

    private /* synthetic */ i(int i10) {
        this.f23433a = i10;
    }

    public static final /* synthetic */ i h(int i10) {
        return new i(i10);
    }

    public static boolean j(int i10, Object obj) {
        if (!(obj instanceof i) || i10 != ((i) obj).n()) {
            return false;
        }
        return true;
    }

    public static final boolean k(int i10, int i11) {
        if (i10 == i11) {
            return true;
        }
        return false;
    }

    public static String m(int i10) {
        if (k(i10, f23426c)) {
            return "Button";
        }
        if (k(i10, f23427d)) {
            return "Checkbox";
        }
        if (k(i10, f23428e)) {
            return "Switch";
        }
        if (k(i10, f23429f)) {
            return "RadioButton";
        }
        if (k(i10, f23430g)) {
            return "Tab";
        }
        if (k(i10, f23431h)) {
            return "Image";
        }
        if (k(i10, f23432i)) {
            return "DropdownList";
        }
        return "Unknown";
    }

    public boolean equals(Object obj) {
        return j(this.f23433a, obj);
    }

    public int hashCode() {
        return l(this.f23433a);
    }

    public final /* synthetic */ int n() {
        return this.f23433a;
    }

    public String toString() {
        return m(this.f23433a);
    }

    private static int i(int i10) {
        return i10;
    }

    public static int l(int i10) {
        return i10;
    }
}
