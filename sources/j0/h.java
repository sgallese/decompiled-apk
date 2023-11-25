package j0;

import dc.m;
import hc.f;
import j0.y0;
import java.util.ArrayList;
import java.util.List;
import kotlin.coroutines.Continuation;

/* compiled from: BroadcastFrameClock.kt */
/* loaded from: classes.dex */
public final class h implements y0 {

    /* renamed from: f  reason: collision with root package name */
    private final pc.a<dc.w> f18638f;

    /* renamed from: p  reason: collision with root package name */
    private Throwable f18640p;

    /* renamed from: m  reason: collision with root package name */
    private final Object f18639m = new Object();

    /* renamed from: q  reason: collision with root package name */
    private List<a<?>> f18641q = new ArrayList();

    /* renamed from: r  reason: collision with root package name */
    private List<a<?>> f18642r = new ArrayList();

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: BroadcastFrameClock.kt */
    /* loaded from: classes.dex */
    public static final class a<R> {

        /* renamed from: a  reason: collision with root package name */
        private final pc.l<Long, R> f18643a;

        /* renamed from: b  reason: collision with root package name */
        private final Continuation<R> f18644b;

        /* JADX WARN: Multi-variable type inference failed */
        public a(pc.l<? super Long, ? extends R> lVar, Continuation<? super R> continuation) {
            qc.q.i(lVar, "onFrame");
            qc.q.i(continuation, "continuation");
            this.f18643a = lVar;
            this.f18644b = continuation;
        }

        public final Continuation<R> a() {
            return this.f18644b;
        }

        public final void b(long j10) {
            Object a10;
            Continuation<R> continuation = this.f18644b;
            try {
                m.a aVar = dc.m.f13253f;
                a10 = dc.m.a(this.f18643a.invoke(Long.valueOf(j10)));
            } catch (Throwable th) {
                m.a aVar2 = dc.m.f13253f;
                a10 = dc.m.a(dc.n.a(th));
            }
            continuation.resumeWith(a10);
        }
    }

    /* compiled from: BroadcastFrameClock.kt */
    /* loaded from: classes.dex */
    static final class b extends qc.r implements pc.l<Throwable, dc.w> {

        /* renamed from: m  reason: collision with root package name */
        final /* synthetic */ qc.f0<a<R>> f18646m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(qc.f0<a<R>> f0Var) {
            super(1);
            this.f18646m = f0Var;
        }

        @Override // pc.l
        public /* bridge */ /* synthetic */ dc.w invoke(Throwable th) {
            invoke2(th);
            return dc.w.f13270a;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Throwable th) {
            a aVar;
            Object obj = h.this.f18639m;
            h hVar = h.this;
            qc.f0<a<R>> f0Var = this.f18646m;
            synchronized (obj) {
                List list = hVar.f18641q;
                Object obj2 = f0Var.f21676f;
                if (obj2 == null) {
                    qc.q.z("awaiter");
                    aVar = null;
                } else {
                    aVar = (a) obj2;
                }
                list.remove(aVar);
                dc.w wVar = dc.w.f13270a;
            }
        }
    }

    public h(pc.a<dc.w> aVar) {
        this.f18638f = aVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void i(Throwable th) {
        synchronized (this.f18639m) {
            if (this.f18640p != null) {
                return;
            }
            this.f18640p = th;
            List<a<?>> list = this.f18641q;
            int size = list.size();
            for (int i10 = 0; i10 < size; i10++) {
                Continuation<?> a10 = list.get(i10).a();
                m.a aVar = dc.m.f13253f;
                a10.resumeWith(dc.m.a(dc.n.a(th)));
            }
            this.f18641q.clear();
            dc.w wVar = dc.w.f13270a;
        }
    }

    /* JADX WARN: Type inference failed for: r4v1, types: [j0.h$a, T] */
    @Override // j0.y0
    public <R> Object R(pc.l<? super Long, ? extends R> lVar, Continuation<? super R> continuation) {
        Continuation c10;
        boolean z10;
        a aVar;
        Object d10;
        c10 = ic.c.c(continuation);
        ad.n nVar = new ad.n(c10, 1);
        nVar.A();
        qc.f0 f0Var = new qc.f0();
        synchronized (this.f18639m) {
            Throwable th = this.f18640p;
            if (th != null) {
                m.a aVar2 = dc.m.f13253f;
                nVar.resumeWith(dc.m.a(dc.n.a(th)));
            } else {
                f0Var.f21676f = new a(lVar, nVar);
                if (!this.f18641q.isEmpty()) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                List list = this.f18641q;
                T t10 = f0Var.f21676f;
                if (t10 == 0) {
                    qc.q.z("awaiter");
                    aVar = null;
                } else {
                    aVar = (a) t10;
                }
                list.add(aVar);
                boolean z11 = !z10;
                nVar.n(new b(f0Var));
                if (z11 && this.f18638f != null) {
                    try {
                        this.f18638f.invoke();
                    } catch (Throwable th2) {
                        i(th2);
                    }
                }
            }
        }
        Object x10 = nVar.x();
        d10 = ic.d.d();
        if (x10 == d10) {
            kotlin.coroutines.jvm.internal.h.c(continuation);
        }
        return x10;
    }

    @Override // hc.f
    public <R> R fold(R r10, pc.p<? super R, ? super f.b, ? extends R> pVar) {
        return (R) y0.a.a(this, r10, pVar);
    }

    @Override // hc.f.b, hc.f
    public <E extends f.b> E get(f.c<E> cVar) {
        return (E) y0.a.b(this, cVar);
    }

    @Override // hc.f.b
    public /* synthetic */ f.c getKey() {
        return x0.a(this);
    }

    public final boolean j() {
        boolean z10;
        synchronized (this.f18639m) {
            z10 = !this.f18641q.isEmpty();
        }
        return z10;
    }

    public final void k(long j10) {
        synchronized (this.f18639m) {
            List<a<?>> list = this.f18641q;
            this.f18641q = this.f18642r;
            this.f18642r = list;
            int size = list.size();
            for (int i10 = 0; i10 < size; i10++) {
                list.get(i10).b(j10);
            }
            list.clear();
            dc.w wVar = dc.w.f13270a;
        }
    }

    @Override // hc.f
    public hc.f minusKey(f.c<?> cVar) {
        return y0.a.c(this, cVar);
    }

    @Override // hc.f
    public hc.f plus(hc.f fVar) {
        return y0.a.d(this, fVar);
    }
}
