package h1;

import qc.h;

/* compiled from: InputModeManager.kt */
/* loaded from: classes.dex */
public final class a {

    /* renamed from: b  reason: collision with root package name */
    public static final C0387a f16438b = new C0387a(null);

    /* renamed from: c  reason: collision with root package name */
    private static final int f16439c = d(1);

    /* renamed from: d  reason: collision with root package name */
    private static final int f16440d = d(2);

    /* renamed from: a  reason: collision with root package name */
    private final int f16441a;

    /* compiled from: InputModeManager.kt */
    /* renamed from: h1.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static final class C0387a {
        private C0387a() {
        }

        public /* synthetic */ C0387a(h hVar) {
            this();
        }

        public final int a() {
            return a.f16440d;
        }

        public final int b() {
            return a.f16439c;
        }
    }

    private /* synthetic */ a(int i10) {
        this.f16441a = i10;
    }

    public static final /* synthetic */ a c(int i10) {
        return new a(i10);
    }

    public static boolean e(int i10, Object obj) {
        if (!(obj instanceof a) || i10 != ((a) obj).i()) {
            return false;
        }
        return true;
    }

    public static final boolean f(int i10, int i11) {
        if (i10 == i11) {
            return true;
        }
        return false;
    }

    public static String h(int i10) {
        if (f(i10, f16439c)) {
            return "Touch";
        }
        if (f(i10, f16440d)) {
            return "Keyboard";
        }
        return "Error";
    }

    public boolean equals(Object obj) {
        return e(this.f16441a, obj);
    }

    public int hashCode() {
        return g(this.f16441a);
    }

    public final /* synthetic */ int i() {
        return this.f16441a;
    }

    public String toString() {
        return h(this.f16441a);
    }

    public static int d(int i10) {
        return i10;
    }

    public static int g(int i10) {
        return i10;
    }
}
