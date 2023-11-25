package dd;

/* compiled from: SharingStarted.kt */
/* loaded from: classes4.dex */
public interface h0 {

    /* renamed from: a  reason: collision with root package name */
    public static final a f13324a = a.f13325a;

    /* compiled from: SharingStarted.kt */
    /* loaded from: classes4.dex */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ a f13325a = new a();

        /* renamed from: b  reason: collision with root package name */
        private static final h0 f13326b = new i0();

        /* renamed from: c  reason: collision with root package name */
        private static final h0 f13327c = new j0();

        private a() {
        }

        public static /* synthetic */ h0 b(a aVar, long j10, long j11, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                j10 = 0;
            }
            if ((i10 & 2) != 0) {
                j11 = Long.MAX_VALUE;
            }
            return aVar.a(j10, j11);
        }

        public final h0 a(long j10, long j11) {
            return new k0(j10, j11);
        }

        public final h0 c() {
            return f13326b;
        }

        public final h0 d() {
            return f13327c;
        }
    }

    g<f0> a(l0<Integer> l0Var);
}
