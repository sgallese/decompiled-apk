package t;

import ad.x1;
import com.habitrpg.android.habitica.ui.fragments.setup.TaskSetupFragment;
import hc.f;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.coroutines.Continuation;
import s.t0;

/* compiled from: MutatorMutex.kt */
/* loaded from: classes.dex */
public final class d0 {

    /* renamed from: a  reason: collision with root package name */
    private final AtomicReference<a> f23127a = new AtomicReference<>(null);

    /* renamed from: b  reason: collision with root package name */
    private final jd.a f23128b = jd.c.b(false, 1, null);

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: MutatorMutex.kt */
    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        private final b0 f23129a;

        /* renamed from: b  reason: collision with root package name */
        private final x1 f23130b;

        public a(b0 b0Var, x1 x1Var) {
            qc.q.i(b0Var, "priority");
            qc.q.i(x1Var, "job");
            this.f23129a = b0Var;
            this.f23130b = x1Var;
        }

        public final boolean a(a aVar) {
            qc.q.i(aVar, TaskSetupFragment.TYPE_OTHER);
            if (this.f23129a.compareTo(aVar.f23129a) >= 0) {
                return true;
            }
            return false;
        }

        public final void b() {
            this.f23130b.c(new c0());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX INFO: Add missing generic type declarations: [R] */
    /* compiled from: MutatorMutex.kt */
    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.MutatorMutex$mutate$2", f = "MutatorMutex.kt", l = {186, 132}, m = "invokeSuspend")
    /* loaded from: classes.dex */
    public static final class b<R> extends kotlin.coroutines.jvm.internal.l implements pc.p<ad.k0, Continuation<? super R>, Object> {

        /* renamed from: f  reason: collision with root package name */
        Object f23131f;

        /* renamed from: m  reason: collision with root package name */
        Object f23132m;

        /* renamed from: p  reason: collision with root package name */
        Object f23133p;

        /* renamed from: q  reason: collision with root package name */
        int f23134q;

        /* renamed from: r  reason: collision with root package name */
        private /* synthetic */ Object f23135r;

        /* renamed from: s  reason: collision with root package name */
        final /* synthetic */ b0 f23136s;

        /* renamed from: t  reason: collision with root package name */
        final /* synthetic */ d0 f23137t;

        /* renamed from: u  reason: collision with root package name */
        final /* synthetic */ pc.l<Continuation<? super R>, Object> f23138u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        b(b0 b0Var, d0 d0Var, pc.l<? super Continuation<? super R>, ? extends Object> lVar, Continuation<? super b> continuation) {
            super(2, continuation);
            this.f23136s = b0Var;
            this.f23137t = d0Var;
            this.f23138u = lVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Continuation<dc.w> create(Object obj, Continuation<?> continuation) {
            b bVar = new b(this.f23136s, this.f23137t, this.f23138u, continuation);
            bVar.f23135r = obj;
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
            d0 d0Var;
            a aVar3;
            Throwable th;
            d0 d0Var2;
            jd.a aVar4;
            d10 = ic.d.d();
            ?? r12 = this.f23134q;
            try {
                try {
                    if (r12 != 0) {
                        if (r12 != 1) {
                            if (r12 == 2) {
                                d0Var2 = (d0) this.f23132m;
                                aVar4 = (jd.a) this.f23131f;
                                aVar3 = (a) this.f23135r;
                                try {
                                    dc.n.b(obj);
                                    t0.a(d0Var2.f23127a, aVar3, null);
                                    aVar4.d(null);
                                    return obj;
                                } catch (Throwable th2) {
                                    th = th2;
                                    t0.a(d0Var2.f23127a, aVar3, null);
                                    throw th;
                                }
                            }
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        d0Var = (d0) this.f23133p;
                        lVar = (pc.l) this.f23132m;
                        jd.a aVar5 = (jd.a) this.f23131f;
                        aVar2 = (a) this.f23135r;
                        dc.n.b(obj);
                        aVar = aVar5;
                    } else {
                        dc.n.b(obj);
                        ad.k0 k0Var = (ad.k0) this.f23135r;
                        b0 b0Var = this.f23136s;
                        f.b bVar = k0Var.getCoroutineContext().get(x1.f574b);
                        qc.q.f(bVar);
                        a aVar6 = new a(b0Var, (x1) bVar);
                        this.f23137t.g(aVar6);
                        aVar = this.f23137t.f23128b;
                        pc.l<Continuation<? super R>, Object> lVar2 = this.f23138u;
                        d0 d0Var3 = this.f23137t;
                        this.f23135r = aVar6;
                        this.f23131f = aVar;
                        this.f23132m = lVar2;
                        this.f23133p = d0Var3;
                        this.f23134q = 1;
                        if (aVar.c(null, this) == d10) {
                            return d10;
                        }
                        lVar = lVar2;
                        aVar2 = aVar6;
                        d0Var = d0Var3;
                    }
                    this.f23135r = aVar2;
                    this.f23131f = aVar;
                    this.f23132m = d0Var;
                    this.f23133p = null;
                    this.f23134q = 2;
                    Object invoke = lVar.invoke(this);
                    if (invoke == d10) {
                        return d10;
                    }
                    d0Var2 = d0Var;
                    aVar4 = aVar;
                    obj = invoke;
                    aVar3 = aVar2;
                    t0.a(d0Var2.f23127a, aVar3, null);
                    aVar4.d(null);
                    return obj;
                } catch (Throwable th3) {
                    aVar3 = aVar2;
                    th = th3;
                    d0Var2 = d0Var;
                    t0.a(d0Var2.f23127a, aVar3, null);
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

    /* JADX INFO: Add missing generic type declarations: [R] */
    /* compiled from: MutatorMutex.kt */
    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.MutatorMutex$mutateWith$2", f = "MutatorMutex.kt", l = {186, 173}, m = "invokeSuspend")
    /* loaded from: classes.dex */
    static final class c<R> extends kotlin.coroutines.jvm.internal.l implements pc.p<ad.k0, Continuation<? super R>, Object> {

        /* renamed from: f  reason: collision with root package name */
        Object f23139f;

        /* renamed from: m  reason: collision with root package name */
        Object f23140m;

        /* renamed from: p  reason: collision with root package name */
        Object f23141p;

        /* renamed from: q  reason: collision with root package name */
        Object f23142q;

        /* renamed from: r  reason: collision with root package name */
        int f23143r;

        /* renamed from: s  reason: collision with root package name */
        private /* synthetic */ Object f23144s;

        /* renamed from: t  reason: collision with root package name */
        final /* synthetic */ b0 f23145t;

        /* renamed from: u  reason: collision with root package name */
        final /* synthetic */ d0 f23146u;

        /* renamed from: v  reason: collision with root package name */
        final /* synthetic */ pc.p<T, Continuation<? super R>, Object> f23147v;

        /* renamed from: w  reason: collision with root package name */
        final /* synthetic */ T f23148w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        c(b0 b0Var, d0 d0Var, pc.p<? super T, ? super Continuation<? super R>, ? extends Object> pVar, T t10, Continuation<? super c> continuation) {
            super(2, continuation);
            this.f23145t = b0Var;
            this.f23146u = d0Var;
            this.f23147v = pVar;
            this.f23148w = t10;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Continuation<dc.w> create(Object obj, Continuation<?> continuation) {
            c cVar = new c(this.f23145t, this.f23146u, this.f23147v, this.f23148w, continuation);
            cVar.f23144s = obj;
            return cVar;
        }

        public final Object invoke(ad.k0 k0Var, Continuation<? super R> continuation) {
            return ((c) create(k0Var, continuation)).invokeSuspend(dc.w.f13270a);
        }

        /* JADX WARN: Type inference failed for: r1v0, types: [jd.a, int] */
        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object d10;
            jd.a aVar;
            pc.p pVar;
            Object obj2;
            a aVar2;
            d0 d0Var;
            a aVar3;
            Throwable th;
            d0 d0Var2;
            jd.a aVar4;
            d10 = ic.d.d();
            ?? r12 = this.f23143r;
            try {
                try {
                    if (r12 != 0) {
                        if (r12 != 1) {
                            if (r12 == 2) {
                                d0Var2 = (d0) this.f23140m;
                                aVar4 = (jd.a) this.f23139f;
                                aVar3 = (a) this.f23144s;
                                try {
                                    dc.n.b(obj);
                                    t0.a(d0Var2.f23127a, aVar3, null);
                                    aVar4.d(null);
                                    return obj;
                                } catch (Throwable th2) {
                                    th = th2;
                                    t0.a(d0Var2.f23127a, aVar3, null);
                                    throw th;
                                }
                            }
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        d0Var = (d0) this.f23142q;
                        obj2 = this.f23141p;
                        pVar = (pc.p) this.f23140m;
                        jd.a aVar5 = (jd.a) this.f23139f;
                        aVar2 = (a) this.f23144s;
                        dc.n.b(obj);
                        aVar = aVar5;
                    } else {
                        dc.n.b(obj);
                        ad.k0 k0Var = (ad.k0) this.f23144s;
                        b0 b0Var = this.f23145t;
                        f.b bVar = k0Var.getCoroutineContext().get(x1.f574b);
                        qc.q.f(bVar);
                        a aVar6 = new a(b0Var, (x1) bVar);
                        this.f23146u.g(aVar6);
                        aVar = this.f23146u.f23128b;
                        pVar = this.f23147v;
                        Object obj3 = this.f23148w;
                        d0 d0Var3 = this.f23146u;
                        this.f23144s = aVar6;
                        this.f23139f = aVar;
                        this.f23140m = pVar;
                        this.f23141p = obj3;
                        this.f23142q = d0Var3;
                        this.f23143r = 1;
                        if (aVar.c(null, this) == d10) {
                            return d10;
                        }
                        obj2 = obj3;
                        aVar2 = aVar6;
                        d0Var = d0Var3;
                    }
                    this.f23144s = aVar2;
                    this.f23139f = aVar;
                    this.f23140m = d0Var;
                    this.f23141p = null;
                    this.f23142q = null;
                    this.f23143r = 2;
                    Object invoke = pVar.invoke(obj2, this);
                    if (invoke == d10) {
                        return d10;
                    }
                    d0Var2 = d0Var;
                    aVar4 = aVar;
                    obj = invoke;
                    aVar3 = aVar2;
                    t0.a(d0Var2.f23127a, aVar3, null);
                    aVar4.d(null);
                    return obj;
                } catch (Throwable th3) {
                    aVar3 = aVar2;
                    th = th3;
                    d0Var2 = d0Var;
                    t0.a(d0Var2.f23127a, aVar3, null);
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

    public static /* synthetic */ Object e(d0 d0Var, b0 b0Var, pc.l lVar, Continuation continuation, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            b0Var = b0.Default;
        }
        return d0Var.d(b0Var, lVar, continuation);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void g(a aVar) {
        a aVar2;
        do {
            aVar2 = this.f23127a.get();
            if (aVar2 != null && !aVar.a(aVar2)) {
                throw new CancellationException("Current mutation had a higher priority");
            }
        } while (!t0.a(this.f23127a, aVar2, aVar));
        if (aVar2 != null) {
            aVar2.b();
        }
    }

    public final <R> Object d(b0 b0Var, pc.l<? super Continuation<? super R>, ? extends Object> lVar, Continuation<? super R> continuation) {
        return ad.l0.e(new b(b0Var, this, lVar, null), continuation);
    }

    public final <T, R> Object f(T t10, b0 b0Var, pc.p<? super T, ? super Continuation<? super R>, ? extends Object> pVar, Continuation<? super R> continuation) {
        return ad.l0.e(new c(b0Var, this, pVar, t10, null), continuation);
    }
}
