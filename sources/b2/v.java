package b2;

/* compiled from: KeyboardType.kt */
/* loaded from: classes.dex */
public final class v {

    /* renamed from: a  reason: collision with root package name */
    public static final a f7853a = new a(null);

    /* renamed from: b  reason: collision with root package name */
    private static final int f7854b = j(1);

    /* renamed from: c  reason: collision with root package name */
    private static final int f7855c = j(2);

    /* renamed from: d  reason: collision with root package name */
    private static final int f7856d = j(3);

    /* renamed from: e  reason: collision with root package name */
    private static final int f7857e = j(4);

    /* renamed from: f  reason: collision with root package name */
    private static final int f7858f = j(5);

    /* renamed from: g  reason: collision with root package name */
    private static final int f7859g = j(6);

    /* renamed from: h  reason: collision with root package name */
    private static final int f7860h = j(7);

    /* renamed from: i  reason: collision with root package name */
    private static final int f7861i = j(8);

    /* renamed from: j  reason: collision with root package name */
    private static final int f7862j = j(9);

    /* compiled from: KeyboardType.kt */
    /* loaded from: classes.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(qc.h hVar) {
            this();
        }

        public final int a() {
            return v.f7855c;
        }

        public final int b() {
            return v.f7862j;
        }

        public final int c() {
            return v.f7859g;
        }

        public final int d() {
            return v.f7856d;
        }

        public final int e() {
            return v.f7861i;
        }

        public final int f() {
            return v.f7860h;
        }

        public final int g() {
            return v.f7857e;
        }

        public final int h() {
            return v.f7854b;
        }

        public final int i() {
            return v.f7858f;
        }
    }

    public static final boolean k(int i10, int i11) {
        if (i10 == i11) {
            return true;
        }
        return false;
    }

    public static String m(int i10) {
        if (k(i10, f7854b)) {
            return "Text";
        }
        if (k(i10, f7855c)) {
            return "Ascii";
        }
        if (k(i10, f7856d)) {
            return "Number";
        }
        if (k(i10, f7857e)) {
            return "Phone";
        }
        if (k(i10, f7858f)) {
            return "Uri";
        }
        if (k(i10, f7859g)) {
            return "Email";
        }
        if (k(i10, f7860h)) {
            return "Password";
        }
        if (k(i10, f7861i)) {
            return "NumberPassword";
        }
        if (k(i10, f7862j)) {
            return "Decimal";
        }
        return "Invalid";
    }

    public static int j(int i10) {
        return i10;
    }

    public static int l(int i10) {
        return i10;
    }
}
