package dd;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: Distinct.kt */
/* loaded from: classes4.dex */
public final /* synthetic */ class o {

    /* renamed from: a  reason: collision with root package name */
    private static final pc.l<Object, Object> f13396a = b.f13399f;

    /* renamed from: b  reason: collision with root package name */
    private static final pc.p<Object, Object, Boolean> f13397b = a.f13398f;

    /* compiled from: Distinct.kt */
    /* loaded from: classes4.dex */
    static final class a extends qc.r implements pc.p<Object, Object, Boolean> {

        /* renamed from: f  reason: collision with root package name */
        public static final a f13398f = new a();

        a() {
            super(2);
        }

        @Override // pc.p
        /* renamed from: a  reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(Object obj, Object obj2) {
            return Boolean.valueOf(qc.q.d(obj, obj2));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <T> g<T> a(g<? extends T> gVar) {
        if (!(gVar instanceof l0)) {
            return d(gVar, f13396a, f13397b);
        }
        return gVar;
    }

    public static final <T> g<T> b(g<? extends T> gVar, pc.p<? super T, ? super T, Boolean> pVar) {
        pc.l<Object, Object> lVar = f13396a;
        qc.q.g(pVar, "null cannot be cast to non-null type kotlin.Function2<kotlin.Any?, kotlin.Any?, kotlin.Boolean>");
        return d(gVar, lVar, (pc.p) qc.k0.e(pVar, 2));
    }

    public static final <T, K> g<T> c(g<? extends T> gVar, pc.l<? super T, ? extends K> lVar) {
        return d(gVar, lVar, f13397b);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final <T> g<T> d(g<? extends T> gVar, pc.l<? super T, ? extends Object> lVar, pc.p<Object, Object, Boolean> pVar) {
        if (gVar instanceof e) {
            e eVar = (e) gVar;
            if (eVar.f13309m == lVar && eVar.f13310p == pVar) {
                return gVar;
            }
        }
        return new e(gVar, lVar, pVar);
    }

    /* compiled from: Distinct.kt */
    /* loaded from: classes4.dex */
    static final class b extends qc.r implements pc.l<Object, Object> {

        /* renamed from: f  reason: collision with root package name */
        public static final b f13399f = new b();

        b() {
            super(1);
        }

        @Override // pc.l
        public final Object invoke(Object obj) {
            return obj;
        }
    }
}
