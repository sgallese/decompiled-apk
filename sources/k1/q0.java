package k1;

/* compiled from: PointerEvent.kt */
/* loaded from: classes.dex */
public final class q0 {

    /* renamed from: a  reason: collision with root package name */
    public static final a f19226a = new a(null);

    /* renamed from: b  reason: collision with root package name */
    private static final int f19227b = f(0);

    /* renamed from: c  reason: collision with root package name */
    private static final int f19228c = f(1);

    /* renamed from: d  reason: collision with root package name */
    private static final int f19229d = f(2);

    /* renamed from: e  reason: collision with root package name */
    private static final int f19230e = f(3);

    /* renamed from: f  reason: collision with root package name */
    private static final int f19231f = f(4);

    /* compiled from: PointerEvent.kt */
    /* loaded from: classes.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(qc.h hVar) {
            this();
        }

        public final int a() {
            return q0.f19231f;
        }

        public final int b() {
            return q0.f19229d;
        }

        public final int c() {
            return q0.f19230e;
        }

        public final int d() {
            return q0.f19228c;
        }

        public final int e() {
            return q0.f19227b;
        }
    }

    public static final boolean g(int i10, int i11) {
        if (i10 == i11) {
            return true;
        }
        return false;
    }

    public static String i(int i10) {
        if (i10 != 1) {
            if (i10 != 2) {
                if (i10 != 3) {
                    if (i10 != 4) {
                        return "Unknown";
                    }
                    return "Eraser";
                }
                return "Stylus";
            }
            return "Mouse";
        }
        return "Touch";
    }

    private static int f(int i10) {
        return i10;
    }

    public static int h(int i10) {
        return i10;
    }
}
