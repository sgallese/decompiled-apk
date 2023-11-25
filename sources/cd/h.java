package cd;

/* compiled from: Channel.kt */
/* loaded from: classes4.dex */
public final class h<T> {

    /* renamed from: b  reason: collision with root package name */
    public static final b f9007b = new b(null);

    /* renamed from: c  reason: collision with root package name */
    private static final c f9008c = new c();

    /* renamed from: a  reason: collision with root package name */
    private final Object f9009a;

    /* compiled from: Channel.kt */
    /* loaded from: classes4.dex */
    public static final class a extends c {

        /* renamed from: a  reason: collision with root package name */
        public final Throwable f9010a;

        public a(Throwable th) {
            this.f9010a = th;
        }

        public boolean equals(Object obj) {
            if ((obj instanceof a) && qc.q.d(this.f9010a, ((a) obj).f9010a)) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            Throwable th = this.f9010a;
            if (th != null) {
                return th.hashCode();
            }
            return 0;
        }

        @Override // cd.h.c
        public String toString() {
            return "Closed(" + this.f9010a + ')';
        }
    }

    /* compiled from: Channel.kt */
    /* loaded from: classes4.dex */
    public static final class b {
        private b() {
        }

        public /* synthetic */ b(qc.h hVar) {
            this();
        }

        public final <E> Object a(Throwable th) {
            return h.c(new a(th));
        }

        public final <E> Object b() {
            return h.c(h.f9008c);
        }

        public final <E> Object c(E e10) {
            return h.c(e10);
        }
    }

    /* compiled from: Channel.kt */
    /* loaded from: classes4.dex */
    public static class c {
        public String toString() {
            return "Failed";
        }
    }

    private /* synthetic */ h(Object obj) {
        this.f9009a = obj;
    }

    public static final /* synthetic */ h b(Object obj) {
        return new h(obj);
    }

    public static boolean d(Object obj, Object obj2) {
        if (!(obj2 instanceof h) || !qc.q.d(obj, ((h) obj2).k())) {
            return false;
        }
        return true;
    }

    public static final Throwable e(Object obj) {
        a aVar;
        if (obj instanceof a) {
            aVar = (a) obj;
        } else {
            aVar = null;
        }
        if (aVar == null) {
            return null;
        }
        return aVar.f9010a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final T f(Object obj) {
        if (obj instanceof c) {
            return null;
        }
        return obj;
    }

    public static int g(Object obj) {
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    public static final boolean h(Object obj) {
        return obj instanceof a;
    }

    public static final boolean i(Object obj) {
        return !(obj instanceof c);
    }

    public static String j(Object obj) {
        if (obj instanceof a) {
            return ((a) obj).toString();
        }
        return "Value(" + obj + ')';
    }

    public boolean equals(Object obj) {
        return d(this.f9009a, obj);
    }

    public int hashCode() {
        return g(this.f9009a);
    }

    public final /* synthetic */ Object k() {
        return this.f9009a;
    }

    public String toString() {
        return j(this.f9009a);
    }

    public static <T> Object c(Object obj) {
        return obj;
    }
}
