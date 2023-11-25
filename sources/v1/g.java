package v1;

/* compiled from: EmojiSupportMatch.kt */
/* loaded from: classes.dex */
public final class g {

    /* renamed from: b  reason: collision with root package name */
    public static final a f24444b = new a(null);

    /* renamed from: c  reason: collision with root package name */
    private static final int f24445c = d(0);

    /* renamed from: d  reason: collision with root package name */
    private static final int f24446d = d(1);

    /* renamed from: a  reason: collision with root package name */
    private final int f24447a;

    /* compiled from: EmojiSupportMatch.kt */
    /* loaded from: classes.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(qc.h hVar) {
            this();
        }

        public final int a() {
            return g.f24445c;
        }

        public final int b() {
            return g.f24446d;
        }
    }

    private /* synthetic */ g(int i10) {
        this.f24447a = i10;
    }

    public static final /* synthetic */ g c(int i10) {
        return new g(i10);
    }

    public static boolean e(int i10, Object obj) {
        if (!(obj instanceof g) || i10 != ((g) obj).i()) {
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
        if (i10 == f24445c) {
            return "EmojiSupportMatch.Default";
        }
        if (i10 == f24446d) {
            return "EmojiSupportMatch.None";
        }
        return "Invalid(value=" + i10 + ')';
    }

    public boolean equals(Object obj) {
        return e(this.f24447a, obj);
    }

    public int hashCode() {
        return g(this.f24447a);
    }

    public final /* synthetic */ int i() {
        return this.f24447a;
    }

    public String toString() {
        return h(this.f24447a);
    }

    private static int d(int i10) {
        return i10;
    }

    public static int g(int i10) {
        return i10;
    }
}
