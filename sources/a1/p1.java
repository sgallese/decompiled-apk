package a1;

import okhttp3.internal.ws.WebSocketProtocol;

/* compiled from: Color.kt */
/* loaded from: classes.dex */
public final class p1 {

    /* renamed from: b */
    public static final a f146b = new a(null);

    /* renamed from: c */
    private static final long f147c = r1.d(4278190080L);

    /* renamed from: d */
    private static final long f148d = r1.d(4282664004L);

    /* renamed from: e */
    private static final long f149e = r1.d(4287137928L);

    /* renamed from: f */
    private static final long f150f = r1.d(4291611852L);

    /* renamed from: g */
    private static final long f151g = r1.d(4294967295L);

    /* renamed from: h */
    private static final long f152h = r1.d(4294901760L);

    /* renamed from: i */
    private static final long f153i = r1.d(4278255360L);

    /* renamed from: j */
    private static final long f154j = r1.d(4278190335L);

    /* renamed from: k */
    private static final long f155k = r1.d(4294967040L);

    /* renamed from: l */
    private static final long f156l = r1.d(4278255615L);

    /* renamed from: m */
    private static final long f157m = r1.d(4294902015L);

    /* renamed from: n */
    private static final long f158n = r1.b(0);

    /* renamed from: o */
    private static final long f159o = r1.a(0.0f, 0.0f, 0.0f, 0.0f, b1.g.f7641a.y());

    /* renamed from: a */
    private final long f160a;

    /* compiled from: Color.kt */
    /* loaded from: classes.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(qc.h hVar) {
            this();
        }

        public final long a() {
            return p1.f147c;
        }

        public final long b() {
            return p1.f154j;
        }

        public final long c() {
            return p1.f152h;
        }

        public final long d() {
            return p1.f158n;
        }

        public final long e() {
            return p1.f159o;
        }

        public final long f() {
            return p1.f151g;
        }
    }

    private /* synthetic */ p1(long j10) {
        this.f160a = j10;
    }

    public static final /* synthetic */ p1 g(long j10) {
        return new p1(j10);
    }

    public static final float h(long j10) {
        return v(j10);
    }

    public static final float i(long j10) {
        return u(j10);
    }

    public static final float j(long j10) {
        return s(j10);
    }

    public static final float k(long j10) {
        return r(j10);
    }

    public static final long m(long j10, b1.c cVar) {
        qc.q.i(cVar, "colorSpace");
        b1.c t10 = t(j10);
        if (qc.q.d(cVar, t10)) {
            return j10;
        }
        return b1.d.i(t10, cVar, 0, 2, null).e(v(j10), u(j10), s(j10), r(j10));
    }

    public static final long n(long j10, float f10, float f11, float f12, float f13) {
        return r1.a(f11, f12, f13, f10, t(j10));
    }

    public static /* synthetic */ long o(long j10, float f10, float f11, float f12, float f13, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            f10 = r(j10);
        }
        float f14 = f10;
        if ((i10 & 2) != 0) {
            f11 = v(j10);
        }
        float f15 = f11;
        if ((i10 & 4) != 0) {
            f12 = u(j10);
        }
        float f16 = f12;
        if ((i10 & 8) != 0) {
            f13 = s(j10);
        }
        return n(j10, f14, f15, f16, f13);
    }

    public static boolean p(long j10, Object obj) {
        if (!(obj instanceof p1) || j10 != ((p1) obj).y()) {
            return false;
        }
        return true;
    }

    public static final boolean q(long j10, long j11) {
        return dc.t.g(j10, j11);
    }

    public static final float r(long j10) {
        float b10;
        float f10;
        if (dc.t.d(63 & j10) == 0) {
            b10 = (float) dc.y.b(dc.t.d(dc.t.d(j10 >>> 56) & 255));
            f10 = 255.0f;
        } else {
            b10 = (float) dc.y.b(dc.t.d(dc.t.d(j10 >>> 6) & 1023));
            f10 = 1023.0f;
        }
        return b10 / f10;
    }

    public static final float s(long j10) {
        if (dc.t.d(63 & j10) == 0) {
            return ((float) dc.y.b(dc.t.d(dc.t.d(j10 >>> 32) & 255))) / 255.0f;
        }
        return r3.f(r3.d((short) dc.t.d(dc.t.d(j10 >>> 16) & WebSocketProtocol.PAYLOAD_SHORT_MAX)));
    }

    public static final b1.c t(long j10) {
        b1.g gVar = b1.g.f7641a;
        return gVar.l()[(int) dc.t.d(j10 & 63)];
    }

    public static final float u(long j10) {
        if (dc.t.d(63 & j10) == 0) {
            return ((float) dc.y.b(dc.t.d(dc.t.d(j10 >>> 40) & 255))) / 255.0f;
        }
        return r3.f(r3.d((short) dc.t.d(dc.t.d(j10 >>> 32) & WebSocketProtocol.PAYLOAD_SHORT_MAX)));
    }

    public static final float v(long j10) {
        if (dc.t.d(63 & j10) == 0) {
            return ((float) dc.y.b(dc.t.d(dc.t.d(j10 >>> 48) & 255))) / 255.0f;
        }
        return r3.f(r3.d((short) dc.t.d(dc.t.d(j10 >>> 48) & WebSocketProtocol.PAYLOAD_SHORT_MAX)));
    }

    public static int w(long j10) {
        return dc.t.i(j10);
    }

    public static String x(long j10) {
        return "Color(" + v(j10) + ", " + u(j10) + ", " + s(j10) + ", " + r(j10) + ", " + t(j10).h() + ')';
    }

    public boolean equals(Object obj) {
        return p(this.f160a, obj);
    }

    public int hashCode() {
        return w(this.f160a);
    }

    public String toString() {
        return x(this.f160a);
    }

    public final /* synthetic */ long y() {
        return this.f160a;
    }

    public static long l(long j10) {
        return j10;
    }
}
