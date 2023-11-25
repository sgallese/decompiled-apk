package androidx.paging;

/* compiled from: LoadState.kt */
/* loaded from: classes.dex */
public abstract class q0 {

    /* renamed from: a  reason: collision with root package name */
    private final boolean f5998a;

    /* compiled from: LoadState.kt */
    /* loaded from: classes.dex */
    public static final class a extends q0 {

        /* renamed from: b  reason: collision with root package name */
        private final Throwable f5999b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Throwable th) {
            super(false, null);
            qc.q.i(th, "error");
            this.f5999b = th;
        }

        public boolean equals(Object obj) {
            if (obj instanceof a) {
                a aVar = (a) obj;
                if (a() == aVar.a() && qc.q.d(this.f5999b, aVar.f5999b)) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            return t.k.a(a()) + this.f5999b.hashCode();
        }

        public String toString() {
            return "Error(endOfPaginationReached=" + a() + ", error=" + this.f5999b + ')';
        }
    }

    /* compiled from: LoadState.kt */
    /* loaded from: classes.dex */
    public static final class b extends q0 {

        /* renamed from: b  reason: collision with root package name */
        public static final b f6000b = new b();

        private b() {
            super(false, null);
        }

        public boolean equals(Object obj) {
            if ((obj instanceof b) && a() == ((b) obj).a()) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            return t.k.a(a());
        }

        public String toString() {
            return "Loading(endOfPaginationReached=" + a() + ')';
        }
    }

    /* compiled from: LoadState.kt */
    /* loaded from: classes.dex */
    public static final class c extends q0 {

        /* renamed from: b  reason: collision with root package name */
        public static final a f6001b = new a(null);

        /* renamed from: c  reason: collision with root package name */
        private static final c f6002c = new c(true);

        /* renamed from: d  reason: collision with root package name */
        private static final c f6003d = new c(false);

        /* compiled from: LoadState.kt */
        /* loaded from: classes.dex */
        public static final class a {
            private a() {
            }

            public /* synthetic */ a(qc.h hVar) {
                this();
            }

            public final c a() {
                return c.f6002c;
            }

            public final c b() {
                return c.f6003d;
            }
        }

        public c(boolean z10) {
            super(z10, null);
        }

        public boolean equals(Object obj) {
            if ((obj instanceof c) && a() == ((c) obj).a()) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            return t.k.a(a());
        }

        public String toString() {
            return "NotLoading(endOfPaginationReached=" + a() + ')';
        }
    }

    public /* synthetic */ q0(boolean z10, qc.h hVar) {
        this(z10);
    }

    public final boolean a() {
        return this.f5998a;
    }

    private q0(boolean z10) {
        this.f5998a = z10;
    }
}
