package n1;

/* compiled from: ContentScale.kt */
/* loaded from: classes.dex */
public interface f {

    /* renamed from: a  reason: collision with root package name */
    public static final a f19964a = a.f19965a;

    /* compiled from: ContentScale.kt */
    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ a f19965a = new a();

        /* renamed from: b  reason: collision with root package name */
        private static final f f19966b = new C0451a();

        /* renamed from: c  reason: collision with root package name */
        private static final f f19967c = new e();

        /* renamed from: d  reason: collision with root package name */
        private static final f f19968d = new c();

        /* renamed from: e  reason: collision with root package name */
        private static final f f19969e = new d();

        /* renamed from: f  reason: collision with root package name */
        private static final f f19970f = new C0452f();

        /* renamed from: g  reason: collision with root package name */
        private static final i f19971g = new i(1.0f);

        /* renamed from: h  reason: collision with root package name */
        private static final f f19972h = new b();

        /* compiled from: ContentScale.kt */
        /* renamed from: n1.f$a$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static final class C0451a implements f {
            C0451a() {
            }

            @Override // n1.f
            public long a(long j10, long j11) {
                float f10;
                f10 = g.f(j10, j11);
                return e1.a(f10, f10);
            }
        }

        /* compiled from: ContentScale.kt */
        /* loaded from: classes.dex */
        public static final class b implements f {
            b() {
            }

            @Override // n1.f
            public long a(long j10, long j11) {
                float h10;
                float e10;
                h10 = g.h(j10, j11);
                e10 = g.e(j10, j11);
                return e1.a(h10, e10);
            }
        }

        /* compiled from: ContentScale.kt */
        /* loaded from: classes.dex */
        public static final class c implements f {
            c() {
            }

            @Override // n1.f
            public long a(long j10, long j11) {
                float e10;
                e10 = g.e(j10, j11);
                return e1.a(e10, e10);
            }
        }

        /* compiled from: ContentScale.kt */
        /* loaded from: classes.dex */
        public static final class d implements f {
            d() {
            }

            @Override // n1.f
            public long a(long j10, long j11) {
                float h10;
                h10 = g.h(j10, j11);
                return e1.a(h10, h10);
            }
        }

        /* compiled from: ContentScale.kt */
        /* loaded from: classes.dex */
        public static final class e implements f {
            e() {
            }

            @Override // n1.f
            public long a(long j10, long j11) {
                float g10;
                g10 = g.g(j10, j11);
                return e1.a(g10, g10);
            }
        }

        /* compiled from: ContentScale.kt */
        /* renamed from: n1.f$a$f  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static final class C0452f implements f {
            C0452f() {
            }

            @Override // n1.f
            public long a(long j10, long j11) {
                float g10;
                if (z0.l.i(j10) > z0.l.i(j11) || z0.l.g(j10) > z0.l.g(j11)) {
                    g10 = g.g(j10, j11);
                    return e1.a(g10, g10);
                }
                return e1.a(1.0f, 1.0f);
            }
        }

        private a() {
        }

        public final f a() {
            return f19967c;
        }

        public final f b() {
            return f19970f;
        }

        public final i c() {
            return f19971g;
        }
    }

    long a(long j10, long j11);
}
