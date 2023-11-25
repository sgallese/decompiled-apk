package fd;

import ad.t2;
import hc.f;

/* compiled from: ThreadContext.kt */
/* loaded from: classes4.dex */
public final class k0 {

    /* renamed from: a  reason: collision with root package name */
    public static final g0 f15643a = new g0("NO_THREAD_ELEMENTS");

    /* renamed from: b  reason: collision with root package name */
    private static final pc.p<Object, f.b, Object> f15644b = a.f15647f;

    /* renamed from: c  reason: collision with root package name */
    private static final pc.p<t2<?>, f.b, t2<?>> f15645c = b.f15648f;

    /* renamed from: d  reason: collision with root package name */
    private static final pc.p<o0, f.b, o0> f15646d = c.f15649f;

    /* compiled from: ThreadContext.kt */
    /* loaded from: classes4.dex */
    static final class a extends qc.r implements pc.p<Object, f.b, Object> {

        /* renamed from: f  reason: collision with root package name */
        public static final a f15647f = new a();

        a() {
            super(2);
        }

        @Override // pc.p
        /* renamed from: a  reason: merged with bridge method [inline-methods] */
        public final Object invoke(Object obj, f.b bVar) {
            Integer num;
            int i10;
            if (bVar instanceof t2) {
                if (obj instanceof Integer) {
                    num = (Integer) obj;
                } else {
                    num = null;
                }
                if (num != null) {
                    i10 = num.intValue();
                } else {
                    i10 = 1;
                }
                if (i10 != 0) {
                    return Integer.valueOf(i10 + 1);
                }
                return bVar;
            }
            return obj;
        }
    }

    /* compiled from: ThreadContext.kt */
    /* loaded from: classes4.dex */
    static final class b extends qc.r implements pc.p<t2<?>, f.b, t2<?>> {

        /* renamed from: f  reason: collision with root package name */
        public static final b f15648f = new b();

        b() {
            super(2);
        }

        @Override // pc.p
        /* renamed from: a  reason: merged with bridge method [inline-methods] */
        public final t2<?> invoke(t2<?> t2Var, f.b bVar) {
            if (t2Var != null) {
                return t2Var;
            }
            if (bVar instanceof t2) {
                return (t2) bVar;
            }
            return null;
        }
    }

    /* compiled from: ThreadContext.kt */
    /* loaded from: classes4.dex */
    static final class c extends qc.r implements pc.p<o0, f.b, o0> {

        /* renamed from: f  reason: collision with root package name */
        public static final c f15649f = new c();

        c() {
            super(2);
        }

        @Override // pc.p
        /* renamed from: a  reason: merged with bridge method [inline-methods] */
        public final o0 invoke(o0 o0Var, f.b bVar) {
            if (bVar instanceof t2) {
                t2<?> t2Var = (t2) bVar;
                o0Var.a(t2Var, t2Var.T(o0Var.f15661a));
            }
            return o0Var;
        }
    }

    public static final void a(hc.f fVar, Object obj) {
        if (obj == f15643a) {
            return;
        }
        if (obj instanceof o0) {
            ((o0) obj).b(fVar);
            return;
        }
        Object fold = fVar.fold(null, f15645c);
        qc.q.g(fold, "null cannot be cast to non-null type kotlinx.coroutines.ThreadContextElement<kotlin.Any?>");
        ((t2) fold).V(fVar, obj);
    }

    public static final Object b(hc.f fVar) {
        Object fold = fVar.fold(0, f15644b);
        qc.q.f(fold);
        return fold;
    }

    public static final Object c(hc.f fVar, Object obj) {
        if (obj == null) {
            obj = b(fVar);
        }
        if (obj == 0) {
            return f15643a;
        }
        if (obj instanceof Integer) {
            return fVar.fold(new o0(fVar, ((Number) obj).intValue()), f15646d);
        }
        qc.q.g(obj, "null cannot be cast to non-null type kotlinx.coroutines.ThreadContextElement<kotlin.Any?>");
        return ((t2) obj).T(fVar);
    }
}
