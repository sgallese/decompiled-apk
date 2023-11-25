package s;

import com.habitrpg.android.habitica.ui.fragments.setup.TaskSetupFragment;
import hc.f;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.coroutines.Continuation;

/* compiled from: InternalMutatorMutex.kt */
/* loaded from: classes.dex */
public final class u0 {

    /* renamed from: a */
    private final AtomicReference<a> f22831a = new AtomicReference<>(null);

    /* renamed from: b */
    private final jd.a f22832b = jd.c.b(false, 1, null);

    /* compiled from: InternalMutatorMutex.kt */
    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a */
        private final r0 f22833a;

        /* renamed from: b */
        private final ad.x1 f22834b;

        public a(r0 r0Var, ad.x1 x1Var) {
            qc.q.i(r0Var, "priority");
            qc.q.i(x1Var, "job");
            this.f22833a = r0Var;
            this.f22834b = x1Var;
        }

        public final boolean a(a aVar) {
            qc.q.i(aVar, TaskSetupFragment.TYPE_OTHER);
            if (this.f22833a.compareTo(aVar.f22833a) >= 0) {
                return true;
            }
            return false;
        }

        public final void b() {
            this.f22834b.c(new s0());
        }
    }

    /* compiled from: InternalMutatorMutex.kt */
    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.animation.core.MutatorMutex$mutate$2", f = "InternalMutatorMutex.kt", l = {184, 132}, m = "invokeSuspend")
    /* loaded from: classes.dex */
    public static final class b<R> extends kotlin.coroutines.jvm.internal.l implements pc.p<ad.k0, Continuation<? super R>, Object> {

        /* renamed from: f */
        Object f22835f;

        /* renamed from: m */
        Object f22836m;

        /* renamed from: p */
        Object f22837p;

        /* renamed from: q */
        int f22838q;

        /* renamed from: r */
        private /* synthetic */ Object f22839r;

        /* renamed from: s */
        final /* synthetic */ r0 f22840s;

        /* renamed from: t */
        final /* synthetic */ u0 f22841t;

        /* renamed from: u */
        final /* synthetic */ pc.l<Continuation<? super R>, Object> f22842u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        b(r0 r0Var, u0 u0Var, pc.l<? super Continuation<? super R>, ? extends Object> lVar, Continuation<? super b> continuation) {
            super(2, continuation);
            this.f22840s = r0Var;
            this.f22841t = u0Var;
            this.f22842u = lVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Continuation<dc.w> create(Object obj, Continuation<?> continuation) {
            b bVar = new b(this.f22840s, this.f22841t, this.f22842u, continuation);
            bVar.f22839r = obj;
            return bVar;
        }

        public final Object invoke(ad.k0 k0Var, Continuation<? super R> continuation) {
            return ((b) create(k0Var, continuation)).invokeSuspend(dc.w.f13270a);
        }

        /* JADX WARN: Type inference failed for: r1v0, types: [jd.a, int] */
        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object d10;
            jd.a aVar;
            pc.l<Continuation<? super R>, Object> lVar;
            a aVar2;
            u0 u0Var;
            a aVar3;
            Throwable th;
            u0 u0Var2;
            jd.a aVar4;
            d10 = ic.d.d();
            ?? r12 = this.f22838q;
            try {
                try {
                    if (r12 != 0) {
                        if (r12 != 1) {
                            if (r12 == 2) {
                                u0Var2 = (u0) this.f22836m;
                                aVar4 = (jd.a) this.f22835f;
                                aVar3 = (a) this.f22839r;
                                try {
                                    dc.n.b(obj);
                                    t0.a(u0Var2.f22831a, aVar3, null);
                                    aVar4.d(null);
                                    return obj;
                                } catch (Throwable th2) {
                                    th = th2;
                                    t0.a(u0Var2.f22831a, aVar3, null);
                                    throw th;
                                }
                            }
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        u0Var = (u0) this.f22837p;
                        lVar = (pc.l) this.f22836m;
                        jd.a aVar5 = (jd.a) this.f22835f;
                        aVar2 = (a) this.f22839r;
                        dc.n.b(obj);
                        aVar = aVar5;
                    } else {
                        dc.n.b(obj);
                        ad.k0 k0Var = (ad.k0) this.f22839r;
                        r0 r0Var = this.f22840s;
                        f.b bVar = k0Var.getCoroutineContext().get(ad.x1.f574b);
                        qc.q.f(bVar);
                        a aVar6 = new a(r0Var, (ad.x1) bVar);
                        this.f22841t.f(aVar6);
                        aVar = this.f22841t.f22832b;
                        pc.l<Continuation<? super R>, Object> lVar2 = this.f22842u;
                        u0 u0Var3 = this.f22841t;
                        this.f22839r = aVar6;
                        this.f22835f = aVar;
                        this.f22836m = lVar2;
                        this.f22837p = u0Var3;
                        this.f22838q = 1;
                        if (aVar.c(null, this) == d10) {
                            return d10;
                        }
                        lVar = lVar2;
                        aVar2 = aVar6;
                        u0Var = u0Var3;
                    }
                    this.f22839r = aVar2;
                    this.f22835f = aVar;
                    this.f22836m = u0Var;
                    this.f22837p = null;
                    this.f22838q = 2;
                    Object invoke = lVar.invoke(this);
                    if (invoke == d10) {
                        return d10;
                    }
                    u0Var2 = u0Var;
                    aVar4 = aVar;
                    obj = invoke;
                    aVar3 = aVar2;
                    t0.a(u0Var2.f22831a, aVar3, null);
                    aVar4.d(null);
                    return obj;
                } catch (Throwable th3) {
                    aVar3 = aVar2;
                    th = th3;
                    u0Var2 = u0Var;
                    t0.a(u0Var2.f22831a, aVar3, null);
                    throw th;
                }
            } catch (Throwable th4) {
                r12.d(null);
                throw th4;
            }
        }

        @Override // pc.p
        public /* bridge */ /* synthetic */ Object invoke(ad.k0 k0Var, Object obj) {
            return invoke(k0Var, (Continuation) ((Continuation) obj));
        }
    }

    public static /* synthetic */ Object e(u0 u0Var, r0 r0Var, pc.l lVar, Continuation continuation, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            r0Var = r0.Default;
        }
        return u0Var.d(r0Var, lVar, continuation);
    }

    public final void f(a aVar) {
        a aVar2;
        do {
            aVar2 = this.f22831a.get();
            if (aVar2 != null && !aVar.a(aVar2)) {
                throw new CancellationException("Current mutation had a higher priority");
            }
        } while (!t0.a(this.f22831a, aVar2, aVar));
        if (aVar2 != null) {
            aVar2.b();
        }
    }

    public final <R> Object d(r0 r0Var, pc.l<? super Continuation<? super R>, ? extends Object> lVar, Continuation<? super R> continuation) {
        return ad.l0.e(new b(r0Var, this, lVar, null), continuation);
    }
}
