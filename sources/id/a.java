package id;

import ad.u0;
import dc.w;
import pc.q;
import qc.k0;
import qc.n;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: OnTimeout.kt */
/* loaded from: classes4.dex */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    private final long f17138a;

    /* compiled from: Runnable.kt */
    /* renamed from: id.a$a  reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    public static final class RunnableC0406a implements Runnable {

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ j f17139f;

        /* renamed from: m  reason: collision with root package name */
        final /* synthetic */ a f17140m;

        public RunnableC0406a(j jVar, a aVar) {
            this.f17139f = jVar;
            this.f17140m = aVar;
        }

        @Override // java.lang.Runnable
        public final void run() {
            this.f17139f.c(this.f17140m, w.f13270a);
        }
    }

    /* compiled from: OnTimeout.kt */
    /* loaded from: classes4.dex */
    /* synthetic */ class b extends n implements q<a, j<?>, Object, w> {

        /* renamed from: w  reason: collision with root package name */
        public static final b f17141w = new b();

        b() {
            super(3, a.class, "register", "register(Lkotlinx/coroutines/selects/SelectInstance;Ljava/lang/Object;)V", 0);
        }

        public final void h(a aVar, j<?> jVar, Object obj) {
            aVar.c(jVar, obj);
        }

        @Override // pc.q
        public /* bridge */ /* synthetic */ w invoke(a aVar, j<?> jVar, Object obj) {
            h(aVar, jVar, obj);
            return w.f13270a;
        }
    }

    public a(long j10) {
        this.f17138a = j10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void c(j<?> jVar, Object obj) {
        if (this.f17138a <= 0) {
            jVar.f(w.f13270a);
            return;
        }
        RunnableC0406a runnableC0406a = new RunnableC0406a(jVar, this);
        qc.q.g(jVar, "null cannot be cast to non-null type kotlinx.coroutines.selects.SelectImplementation<*>");
        i iVar = (i) jVar;
        hc.f context = jVar.getContext();
        jVar.d(u0.c(context).p0(this.f17138a, runnableC0406a, context));
    }

    public final d b() {
        b bVar = b.f17141w;
        qc.q.g(bVar, "null cannot be cast to non-null type kotlin.Function3<@[ParameterName(name = 'clauseObject')] kotlin.Any, @[ParameterName(name = 'select')] kotlinx.coroutines.selects.SelectInstance<*>, @[ParameterName(name = 'param')] kotlin.Any?, kotlin.Unit>{ kotlinx.coroutines.selects.SelectKt.RegistrationFunction }");
        return new e(this, (q) k0.e(bVar, 3), null, 4, null);
    }
}
