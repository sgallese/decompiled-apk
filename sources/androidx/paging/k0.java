package androidx.paging;

import androidx.paging.n1;
import androidx.paging.q0;
import androidx.paging.u1;
import com.habitrpg.android.habitica.ui.activities.TaskFormActivity;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.coroutines.Continuation;

/* compiled from: LegacyPageFetcher.kt */
/* loaded from: classes.dex */
public final class k0<K, V> {

    /* renamed from: a  reason: collision with root package name */
    private final ad.k0 f5815a;

    /* renamed from: b  reason: collision with root package name */
    private final n1.d f5816b;

    /* renamed from: c  reason: collision with root package name */
    private final u1<K, V> f5817c;

    /* renamed from: d  reason: collision with root package name */
    private final ad.g0 f5818d;

    /* renamed from: e  reason: collision with root package name */
    private final ad.g0 f5819e;

    /* renamed from: f  reason: collision with root package name */
    private final b<V> f5820f;

    /* renamed from: g  reason: collision with root package name */
    private final a<K> f5821g;

    /* renamed from: h  reason: collision with root package name */
    private final AtomicBoolean f5822h;

    /* renamed from: i  reason: collision with root package name */
    private n1.e f5823i;

    /* compiled from: LegacyPageFetcher.kt */
    /* loaded from: classes.dex */
    public interface a<K> {
        K a();

        K e();
    }

    /* compiled from: LegacyPageFetcher.kt */
    /* loaded from: classes.dex */
    public interface b<V> {
        boolean e(t0 t0Var, u1.b.C0145b<?, V> c0145b);

        void i(t0 t0Var, q0 q0Var);
    }

    /* compiled from: LegacyPageFetcher.kt */
    /* loaded from: classes.dex */
    public /* synthetic */ class c {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f5824a;

        static {
            int[] iArr = new int[t0.values().length];
            try {
                iArr[t0.PREPEND.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[t0.APPEND.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f5824a = iArr;
        }
    }

    /* compiled from: LegacyPageFetcher.kt */
    /* loaded from: classes.dex */
    public static final class d extends n1.e {

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ k0<K, V> f5825d;

        d(k0<K, V> k0Var) {
            this.f5825d = k0Var;
        }

        @Override // androidx.paging.n1.e
        public void d(t0 t0Var, q0 q0Var) {
            qc.q.i(t0Var, TaskFormActivity.TASK_TYPE_KEY);
            qc.q.i(q0Var, "state");
            this.f5825d.f().i(t0Var, q0Var);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: LegacyPageFetcher.kt */
    @kotlin.coroutines.jvm.internal.f(c = "androidx.paging.LegacyPageFetcher$scheduleLoad$1", f = "LegacyPageFetcher.kt", l = {53}, m = "invokeSuspend")
    /* loaded from: classes.dex */
    public static final class e extends kotlin.coroutines.jvm.internal.l implements pc.p<ad.k0, Continuation<? super dc.w>, Object> {

        /* renamed from: f  reason: collision with root package name */
        int f5826f;

        /* renamed from: m  reason: collision with root package name */
        private /* synthetic */ Object f5827m;

        /* renamed from: p  reason: collision with root package name */
        final /* synthetic */ k0<K, V> f5828p;

        /* renamed from: q  reason: collision with root package name */
        final /* synthetic */ u1.a<K> f5829q;

        /* renamed from: r  reason: collision with root package name */
        final /* synthetic */ t0 f5830r;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: LegacyPageFetcher.kt */
        @kotlin.coroutines.jvm.internal.f(c = "androidx.paging.LegacyPageFetcher$scheduleLoad$1$1", f = "LegacyPageFetcher.kt", l = {}, m = "invokeSuspend")
        /* loaded from: classes.dex */
        public static final class a extends kotlin.coroutines.jvm.internal.l implements pc.p<ad.k0, Continuation<? super dc.w>, Object> {

            /* renamed from: f  reason: collision with root package name */
            int f5831f;

            /* renamed from: m  reason: collision with root package name */
            final /* synthetic */ u1.b<K, V> f5832m;

            /* renamed from: p  reason: collision with root package name */
            final /* synthetic */ k0<K, V> f5833p;

            /* renamed from: q  reason: collision with root package name */
            final /* synthetic */ t0 f5834q;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(u1.b<K, V> bVar, k0<K, V> k0Var, t0 t0Var, Continuation<? super a> continuation) {
                super(2, continuation);
                this.f5832m = bVar;
                this.f5833p = k0Var;
                this.f5834q = t0Var;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Continuation<dc.w> create(Object obj, Continuation<?> continuation) {
                return new a(this.f5832m, this.f5833p, this.f5834q, continuation);
            }

            @Override // pc.p
            public final Object invoke(ad.k0 k0Var, Continuation<? super dc.w> continuation) {
                return ((a) create(k0Var, continuation)).invokeSuspend(dc.w.f13270a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                ic.d.d();
                if (this.f5831f == 0) {
                    dc.n.b(obj);
                    u1.b<K, V> bVar = this.f5832m;
                    if (bVar instanceof u1.b.C0145b) {
                        this.f5833p.j(this.f5834q, (u1.b.C0145b) bVar);
                    } else if (bVar instanceof u1.b.a) {
                        this.f5833p.i(this.f5834q, ((u1.b.a) bVar).a());
                    }
                    return dc.w.f13270a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(k0<K, V> k0Var, u1.a<K> aVar, t0 t0Var, Continuation<? super e> continuation) {
            super(2, continuation);
            this.f5828p = k0Var;
            this.f5829q = aVar;
            this.f5830r = t0Var;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Continuation<dc.w> create(Object obj, Continuation<?> continuation) {
            e eVar = new e(this.f5828p, this.f5829q, this.f5830r, continuation);
            eVar.f5827m = obj;
            return eVar;
        }

        @Override // pc.p
        public final Object invoke(ad.k0 k0Var, Continuation<? super dc.w> continuation) {
            return ((e) create(k0Var, continuation)).invokeSuspend(dc.w.f13270a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object d10;
            ad.k0 k0Var;
            d10 = ic.d.d();
            int i10 = this.f5826f;
            if (i10 != 0) {
                if (i10 == 1) {
                    k0Var = (ad.k0) this.f5827m;
                    dc.n.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                dc.n.b(obj);
                ad.k0 k0Var2 = (ad.k0) this.f5827m;
                u1<K, V> g10 = this.f5828p.g();
                u1.a<K> aVar = this.f5829q;
                this.f5827m = k0Var2;
                this.f5826f = 1;
                Object load = g10.load(aVar, this);
                if (load == d10) {
                    return d10;
                }
                k0Var = k0Var2;
                obj = load;
            }
            u1.b bVar = (u1.b) obj;
            if (!this.f5828p.g().getInvalid()) {
                ad.i.d(k0Var, ((k0) this.f5828p).f5818d, null, new a(bVar, this.f5828p, this.f5830r, null), 2, null);
                return dc.w.f13270a;
            }
            this.f5828p.d();
            return dc.w.f13270a;
        }
    }

    public k0(ad.k0 k0Var, n1.d dVar, u1<K, V> u1Var, ad.g0 g0Var, ad.g0 g0Var2, b<V> bVar, a<K> aVar) {
        qc.q.i(k0Var, "pagedListScope");
        qc.q.i(dVar, "config");
        qc.q.i(u1Var, "source");
        qc.q.i(g0Var, "notifyDispatcher");
        qc.q.i(g0Var2, "fetchDispatcher");
        qc.q.i(bVar, "pageConsumer");
        qc.q.i(aVar, "keyProvider");
        this.f5815a = k0Var;
        this.f5816b = dVar;
        this.f5817c = u1Var;
        this.f5818d = g0Var;
        this.f5819e = g0Var2;
        this.f5820f = bVar;
        this.f5821g = aVar;
        this.f5822h = new AtomicBoolean(false);
        this.f5823i = new d(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void i(t0 t0Var, Throwable th) {
        if (h()) {
            return;
        }
        this.f5823i.e(t0Var, new q0.a(th));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void j(t0 t0Var, u1.b.C0145b<K, V> c0145b) {
        q0.c b10;
        if (h()) {
            return;
        }
        if (this.f5820f.e(t0Var, c0145b)) {
            int i10 = c.f5824a[t0Var.ordinal()];
            if (i10 != 1) {
                if (i10 == 2) {
                    k();
                    return;
                }
                throw new IllegalStateException("Can only fetch more during append/prepend");
            }
            m();
            return;
        }
        n1.e eVar = this.f5823i;
        if (c0145b.e().isEmpty()) {
            b10 = q0.c.f6001b.a();
        } else {
            b10 = q0.c.f6001b.b();
        }
        eVar.e(t0Var, b10);
    }

    private final void k() {
        K e10 = this.f5821g.e();
        if (e10 == null) {
            j(t0.APPEND, u1.b.C0145b.f6103s.a());
            return;
        }
        n1.e eVar = this.f5823i;
        t0 t0Var = t0.APPEND;
        eVar.e(t0Var, q0.b.f6000b);
        n1.d dVar = this.f5816b;
        l(t0Var, new u1.a.C0143a(e10, dVar.f5913a, dVar.f5915c));
    }

    private final void l(t0 t0Var, u1.a<K> aVar) {
        ad.i.d(this.f5815a, this.f5819e, null, new e(this, aVar, t0Var, null), 2, null);
    }

    private final void m() {
        K a10 = this.f5821g.a();
        if (a10 == null) {
            j(t0.PREPEND, u1.b.C0145b.f6103s.a());
            return;
        }
        n1.e eVar = this.f5823i;
        t0 t0Var = t0.PREPEND;
        eVar.e(t0Var, q0.b.f6000b);
        n1.d dVar = this.f5816b;
        l(t0Var, new u1.a.c(a10, dVar.f5913a, dVar.f5915c));
    }

    public final void d() {
        this.f5822h.set(true);
    }

    public final n1.e e() {
        return this.f5823i;
    }

    public final b<V> f() {
        return this.f5820f;
    }

    public final u1<K, V> g() {
        return this.f5817c;
    }

    public final boolean h() {
        return this.f5822h.get();
    }

    public final void n() {
        q0 b10 = this.f5823i.b();
        if ((b10 instanceof q0.c) && !b10.a()) {
            k();
        }
    }

    public final void o() {
        q0 c10 = this.f5823i.c();
        if ((c10 instanceof q0.c) && !c10.a()) {
            m();
        }
    }
}
