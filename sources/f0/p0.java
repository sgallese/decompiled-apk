package f0;

import ad.x1;
import com.habitrpg.android.habitica.ui.fragments.setup.TaskSetupFragment;
import hc.f;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReference;
import jd.a;
import kotlin.coroutines.Continuation;

/* compiled from: InternalMutatorMutex.kt */
/* loaded from: classes.dex */
public final class p0 {

    /* renamed from: a  reason: collision with root package name */
    private final AtomicReference<a> f14983a = new AtomicReference<>(null);

    /* renamed from: b  reason: collision with root package name */
    private final jd.a f14984b = jd.c.b(false, 1, null);

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: InternalMutatorMutex.kt */
    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        private final t.b0 f14985a;

        /* renamed from: b  reason: collision with root package name */
        private final ad.x1 f14986b;

        public a(t.b0 b0Var, ad.x1 x1Var) {
            qc.q.i(b0Var, "priority");
            qc.q.i(x1Var, "job");
            this.f14985a = b0Var;
            this.f14986b = x1Var;
        }

        public final boolean a(a aVar) {
            qc.q.i(aVar, TaskSetupFragment.TYPE_OTHER);
            if (this.f14985a.compareTo(aVar.f14985a) >= 0) {
                return true;
            }
            return false;
        }

        public final void b() {
            x1.a.a(this.f14986b, null, 1, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX INFO: Add missing generic type declarations: [R] */
    /* compiled from: InternalMutatorMutex.kt */
    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.material.InternalMutatorMutex$mutate$2", f = "InternalMutatorMutex.kt", l = {177, 99}, m = "invokeSuspend")
    /* loaded from: classes.dex */
    public static final class b<R> extends kotlin.coroutines.jvm.internal.l implements pc.p<ad.k0, Continuation<? super R>, Object> {

        /* renamed from: f  reason: collision with root package name */
        Object f14987f;

        /* renamed from: m  reason: collision with root package name */
        Object f14988m;

        /* renamed from: p  reason: collision with root package name */
        Object f14989p;

        /* renamed from: q  reason: collision with root package name */
        int f14990q;

        /* renamed from: r  reason: collision with root package name */
        private /* synthetic */ Object f14991r;

        /* renamed from: s  reason: collision with root package name */
        final /* synthetic */ t.b0 f14992s;

        /* renamed from: t  reason: collision with root package name */
        final /* synthetic */ p0 f14993t;

        /* renamed from: u  reason: collision with root package name */
        final /* synthetic */ pc.l<Continuation<? super R>, Object> f14994u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        b(t.b0 b0Var, p0 p0Var, pc.l<? super Continuation<? super R>, ? extends Object> lVar, Continuation<? super b> continuation) {
            super(2, continuation);
            this.f14992s = b0Var;
            this.f14993t = p0Var;
            this.f14994u = lVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Continuation<dc.w> create(Object obj, Continuation<?> continuation) {
            b bVar = new b(this.f14992s, this.f14993t, this.f14994u, continuation);
            bVar.f14991r = obj;
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
            p0 p0Var;
            a aVar3;
            Throwable th;
            p0 p0Var2;
            jd.a aVar4;
            d10 = ic.d.d();
            ?? r12 = this.f14990q;
            try {
                try {
                    if (r12 != 0) {
                        if (r12 != 1) {
                            if (r12 == 2) {
                                p0Var2 = (p0) this.f14988m;
                                aVar4 = (jd.a) this.f14987f;
                                aVar3 = (a) this.f14991r;
                                try {
                                    dc.n.b(obj);
                                    s.t0.a(p0Var2.f14983a, aVar3, null);
                                    aVar4.d(null);
                                    return obj;
                                } catch (Throwable th2) {
                                    th = th2;
                                    s.t0.a(p0Var2.f14983a, aVar3, null);
                                    throw th;
                                }
                            }
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        p0Var = (p0) this.f14989p;
                        lVar = (pc.l) this.f14988m;
                        jd.a aVar5 = (jd.a) this.f14987f;
                        aVar2 = (a) this.f14991r;
                        dc.n.b(obj);
                        aVar = aVar5;
                    } else {
                        dc.n.b(obj);
                        ad.k0 k0Var = (ad.k0) this.f14991r;
                        t.b0 b0Var = this.f14992s;
                        f.b bVar = k0Var.getCoroutineContext().get(ad.x1.f574b);
                        qc.q.f(bVar);
                        a aVar6 = new a(b0Var, (ad.x1) bVar);
                        this.f14993t.f(aVar6);
                        aVar = this.f14993t.f14984b;
                        pc.l<Continuation<? super R>, Object> lVar2 = this.f14994u;
                        p0 p0Var3 = this.f14993t;
                        this.f14991r = aVar6;
                        this.f14987f = aVar;
                        this.f14988m = lVar2;
                        this.f14989p = p0Var3;
                        this.f14990q = 1;
                        if (aVar.c(null, this) == d10) {
                            return d10;
                        }
                        lVar = lVar2;
                        aVar2 = aVar6;
                        p0Var = p0Var3;
                    }
                    this.f14991r = aVar2;
                    this.f14987f = aVar;
                    this.f14988m = p0Var;
                    this.f14989p = null;
                    this.f14990q = 2;
                    Object invoke = lVar.invoke(this);
                    if (invoke == d10) {
                        return d10;
                    }
                    p0Var2 = p0Var;
                    aVar4 = aVar;
                    obj = invoke;
                    aVar3 = aVar2;
                    s.t0.a(p0Var2.f14983a, aVar3, null);
                    aVar4.d(null);
                    return obj;
                } catch (Throwable th3) {
                    aVar3 = aVar2;
                    th = th3;
                    p0Var2 = p0Var;
                    s.t0.a(p0Var2.f14983a, aVar3, null);
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

    /* JADX INFO: Access modifiers changed from: private */
    public final void f(a aVar) {
        a aVar2;
        do {
            aVar2 = this.f14983a.get();
            if (aVar2 != null && !aVar.a(aVar2)) {
                throw new CancellationException("Current mutation had a higher priority");
            }
        } while (!s.t0.a(this.f14983a, aVar2, aVar));
        if (aVar2 != null) {
            aVar2.b();
        }
    }

    public final <R> Object d(t.b0 b0Var, pc.l<? super Continuation<? super R>, ? extends Object> lVar, Continuation<? super R> continuation) {
        return ad.l0.e(new b(b0Var, this, lVar, null), continuation);
    }

    public final boolean e(pc.a<dc.w> aVar) {
        qc.q.i(aVar, "block");
        boolean b10 = a.C0427a.b(this.f14984b, null, 1, null);
        if (b10) {
            try {
                aVar.invoke();
            } finally {
                a.C0427a.c(this.f14984b, null, 1, null);
            }
        }
        return b10;
    }
}
