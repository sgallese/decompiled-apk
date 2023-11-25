package b2;

/* compiled from: KeyboardCapitalization.kt */
/* loaded from: classes.dex */
public final class u {

    /* renamed from: a  reason: collision with root package name */
    public static final a f7848a = new a(null);

    /* renamed from: b  reason: collision with root package name */
    private static final int f7849b = e(0);

    /* renamed from: c  reason: collision with root package name */
    private static final int f7850c = e(1);

    /* renamed from: d  reason: collision with root package name */
    private static final int f7851d = e(2);

    /* renamed from: e  reason: collision with root package name */
    private static final int f7852e = e(3);

    /* compiled from: KeyboardCapitalization.kt */
    /* loaded from: classes.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(qc.h hVar) {
            this();
        }

        public final int a() {
            return u.f7850c;
        }

        public final int b() {
            return u.f7849b;
        }

        public final int c() {
            return u.f7852e;
        }

        public final int d() {
            return u.f7851d;
        }
    }

    public static final boolean f(int i10, int i11) {
        if (i10 == i11) {
            return true;
        }
        return false;
    }

    public static String h(int i10) {
        if (f(i10, f7849b)) {
            return "None";
        }
        if (f(i10, f7850c)) {
            return "Characters";
        }
        if (f(i10, f7851d)) {
            return "Words";
        }
        if (f(i10, f7852e)) {
            return "Sentences";
        }
        return "Invalid";
    }

    public static int e(int i10) {
        return i10;
    }

    public static int g(int i10) {
        return i10;
    }
}
