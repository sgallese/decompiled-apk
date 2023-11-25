package a1;

/* compiled from: BlendMode.kt */
/* loaded from: classes.dex */
public final class a1 {

    /* renamed from: a  reason: collision with root package name */
    private final int f87a;

    /* renamed from: b  reason: collision with root package name */
    public static final a f62b = new a(null);

    /* renamed from: c  reason: collision with root package name */
    private static final int f63c = E(0);

    /* renamed from: d  reason: collision with root package name */
    private static final int f64d = E(1);

    /* renamed from: e  reason: collision with root package name */
    private static final int f65e = E(2);

    /* renamed from: f  reason: collision with root package name */
    private static final int f66f = E(3);

    /* renamed from: g  reason: collision with root package name */
    private static final int f67g = E(4);

    /* renamed from: h  reason: collision with root package name */
    private static final int f68h = E(5);

    /* renamed from: i  reason: collision with root package name */
    private static final int f69i = E(6);

    /* renamed from: j  reason: collision with root package name */
    private static final int f70j = E(7);

    /* renamed from: k  reason: collision with root package name */
    private static final int f71k = E(8);

    /* renamed from: l  reason: collision with root package name */
    private static final int f72l = E(9);

    /* renamed from: m  reason: collision with root package name */
    private static final int f73m = E(10);

    /* renamed from: n  reason: collision with root package name */
    private static final int f74n = E(11);

    /* renamed from: o  reason: collision with root package name */
    private static final int f75o = E(12);

    /* renamed from: p  reason: collision with root package name */
    private static final int f76p = E(13);

    /* renamed from: q  reason: collision with root package name */
    private static final int f77q = E(14);

    /* renamed from: r  reason: collision with root package name */
    private static final int f78r = E(15);

    /* renamed from: s  reason: collision with root package name */
    private static final int f79s = E(16);

    /* renamed from: t  reason: collision with root package name */
    private static final int f80t = E(17);

    /* renamed from: u  reason: collision with root package name */
    private static final int f81u = E(18);

    /* renamed from: v  reason: collision with root package name */
    private static final int f82v = E(19);

    /* renamed from: w  reason: collision with root package name */
    private static final int f83w = E(20);

    /* renamed from: x  reason: collision with root package name */
    private static final int f84x = E(21);

    /* renamed from: y  reason: collision with root package name */
    private static final int f85y = E(22);

    /* renamed from: z  reason: collision with root package name */
    private static final int f86z = E(23);
    private static final int A = E(24);
    private static final int B = E(25);
    private static final int C = E(26);
    private static final int D = E(27);
    private static final int E = E(28);

    /* compiled from: BlendMode.kt */
    /* loaded from: classes.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(qc.h hVar) {
            this();
        }

        public final int A() {
            return a1.f70j;
        }

        public final int B() {
            return a1.f66f;
        }

        public final int C() {
            return a1.f74n;
        }

        public final int a() {
            return a1.f63c;
        }

        public final int b() {
            return a1.D;
        }

        public final int c() {
            return a1.f82v;
        }

        public final int d() {
            return a1.f81u;
        }

        public final int e() {
            return a1.f79s;
        }

        public final int f() {
            return a1.f85y;
        }

        public final int g() {
            return a1.f65e;
        }

        public final int h() {
            return a1.f73m;
        }

        public final int i() {
            return a1.f69i;
        }

        public final int j() {
            return a1.f71k;
        }

        public final int k() {
            return a1.f67g;
        }

        public final int l() {
            return a1.f86z;
        }

        public final int m() {
            return a1.f83w;
        }

        public final int n() {
            return a1.B;
        }

        public final int o() {
            return a1.f80t;
        }

        public final int p() {
            return a1.E;
        }

        public final int q() {
            return a1.f76p;
        }

        public final int r() {
            return a1.A;
        }

        public final int s() {
            return a1.f78r;
        }

        public final int t() {
            return a1.f75o;
        }

        public final int u() {
            return a1.C;
        }

        public final int v() {
            return a1.f77q;
        }

        public final int w() {
            return a1.f84x;
        }

        public final int x() {
            return a1.f64d;
        }

        public final int y() {
            return a1.f72l;
        }

        public final int z() {
            return a1.f68h;
        }
    }

    private /* synthetic */ a1(int i10) {
        this.f87a = i10;
    }

    public static final /* synthetic */ a1 D(int i10) {
        return new a1(i10);
    }

    public static boolean F(int i10, Object obj) {
        if (!(obj instanceof a1) || i10 != ((a1) obj).J()) {
            return false;
        }
        return true;
    }

    public static final boolean G(int i10, int i11) {
        if (i10 == i11) {
            return true;
        }
        return false;
    }

    public static String I(int i10) {
        if (G(i10, f63c)) {
            return "Clear";
        }
        if (G(i10, f64d)) {
            return "Src";
        }
        if (G(i10, f65e)) {
            return "Dst";
        }
        if (G(i10, f66f)) {
            return "SrcOver";
        }
        if (G(i10, f67g)) {
            return "DstOver";
        }
        if (G(i10, f68h)) {
            return "SrcIn";
        }
        if (G(i10, f69i)) {
            return "DstIn";
        }
        if (G(i10, f70j)) {
            return "SrcOut";
        }
        if (G(i10, f71k)) {
            return "DstOut";
        }
        if (G(i10, f72l)) {
            return "SrcAtop";
        }
        if (G(i10, f73m)) {
            return "DstAtop";
        }
        if (G(i10, f74n)) {
            return "Xor";
        }
        if (G(i10, f75o)) {
            return "Plus";
        }
        if (G(i10, f76p)) {
            return "Modulate";
        }
        if (G(i10, f77q)) {
            return "Screen";
        }
        if (G(i10, f78r)) {
            return "Overlay";
        }
        if (G(i10, f79s)) {
            return "Darken";
        }
        if (G(i10, f80t)) {
            return "Lighten";
        }
        if (G(i10, f81u)) {
            return "ColorDodge";
        }
        if (G(i10, f82v)) {
            return "ColorBurn";
        }
        if (G(i10, f83w)) {
            return "HardLight";
        }
        if (G(i10, f84x)) {
            return "Softlight";
        }
        if (G(i10, f85y)) {
            return "Difference";
        }
        if (G(i10, f86z)) {
            return "Exclusion";
        }
        if (G(i10, A)) {
            return "Multiply";
        }
        if (G(i10, B)) {
            return "Hue";
        }
        if (G(i10, C)) {
            return "Saturation";
        }
        if (G(i10, D)) {
            return "Color";
        }
        if (G(i10, E)) {
            return "Luminosity";
        }
        return "Unknown";
    }

    public final /* synthetic */ int J() {
        return this.f87a;
    }

    public boolean equals(Object obj) {
        return F(this.f87a, obj);
    }

    public int hashCode() {
        return H(this.f87a);
    }

    public String toString() {
        return I(this.f87a);
    }

    public static int E(int i10) {
        return i10;
    }

    public static int H(int i10) {
        return i10;
    }
}
