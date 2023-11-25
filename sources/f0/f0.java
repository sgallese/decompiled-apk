package f0;

/* compiled from: ElevationOverlay.kt */
/* loaded from: classes.dex */
public final class f0 {

    /* renamed from: a  reason: collision with root package name */
    private static final j0.v1<e0> f14681a = j0.u.d(b.f14684f);

    /* renamed from: b  reason: collision with root package name */
    private static final j0.v1<j2.h> f14682b = j0.u.c(null, a.f14683f, 1, null);

    /* compiled from: ElevationOverlay.kt */
    /* loaded from: classes.dex */
    static final class a extends qc.r implements pc.a<j2.h> {

        /* renamed from: f  reason: collision with root package name */
        public static final a f14683f = new a();

        a() {
            super(0);
        }

        public final float a() {
            return j2.h.j(0);
        }

        @Override // pc.a
        public /* bridge */ /* synthetic */ j2.h invoke() {
            return j2.h.f(a());
        }
    }

    /* compiled from: ElevationOverlay.kt */
    /* loaded from: classes.dex */
    static final class b extends qc.r implements pc.a<e0> {

        /* renamed from: f  reason: collision with root package name */
        public static final b f14684f = new b();

        b() {
            super(0);
        }

        @Override // pc.a
        /* renamed from: a  reason: merged with bridge method [inline-methods] */
        public final e0 invoke() {
            return s.f15067a;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long b(long j10, float f10, j0.l lVar, int i10) {
        if (j0.n.K()) {
            j0.n.V(1613340891, i10, -1, "androidx.compose.material.calculateForegroundColor (ElevationOverlay.kt:86)");
        }
        long o10 = a1.p1.o(k.b(j10, lVar, i10 & 14), ((((float) Math.log(f10 + 1)) * 4.5f) + 2.0f) / 100.0f, 0.0f, 0.0f, 0.0f, 14, null);
        if (j0.n.K()) {
            j0.n.U();
        }
        return o10;
    }

    public static final j0.v1<j2.h> c() {
        return f14682b;
    }

    public static final j0.v1<e0> d() {
        return f14681a;
    }
}
