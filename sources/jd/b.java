package jd;

import ad.b3;
import ad.g0;
import ad.m;
import ad.n;
import ad.o0;
import ad.p;
import dc.w;
import fd.d0;
import id.j;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.h;
import pc.l;
import pc.q;
import qc.r;

/* compiled from: Mutex.kt */
/* loaded from: classes4.dex */
public class b extends e implements jd.a {

    /* renamed from: i  reason: collision with root package name */
    private static final AtomicReferenceFieldUpdater f19088i = AtomicReferenceFieldUpdater.newUpdater(b.class, Object.class, "owner");

    /* renamed from: h  reason: collision with root package name */
    private final q<j<?>, Object, Object, l<Throwable, w>> f19089h;
    private volatile Object owner;

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: Mutex.kt */
    /* loaded from: classes4.dex */
    public final class a implements m<w>, b3 {

        /* renamed from: f  reason: collision with root package name */
        public final n<w> f19090f;

        /* renamed from: m  reason: collision with root package name */
        public final Object f19091m;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: Mutex.kt */
        /* renamed from: jd.b$a$a  reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        public static final class C0428a extends r implements l<Throwable, w> {

            /* renamed from: f  reason: collision with root package name */
            final /* synthetic */ b f19093f;

            /* renamed from: m  reason: collision with root package name */
            final /* synthetic */ a f19094m;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0428a(b bVar, a aVar) {
                super(1);
                this.f19093f = bVar;
                this.f19094m = aVar;
            }

            @Override // pc.l
            public /* bridge */ /* synthetic */ w invoke(Throwable th) {
                invoke2(th);
                return w.f13270a;
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final void invoke2(Throwable th) {
                this.f19093f.d(this.f19094m.f19091m);
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: Mutex.kt */
        /* renamed from: jd.b$a$b  reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        public static final class C0429b extends r implements l<Throwable, w> {

            /* renamed from: f  reason: collision with root package name */
            final /* synthetic */ b f19095f;

            /* renamed from: m  reason: collision with root package name */
            final /* synthetic */ a f19096m;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0429b(b bVar, a aVar) {
                super(1);
                this.f19095f = bVar;
                this.f19096m = aVar;
            }

            @Override // pc.l
            public /* bridge */ /* synthetic */ w invoke(Throwable th) {
                invoke2(th);
                return w.f13270a;
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final void invoke2(Throwable th) {
                b.f19088i.set(this.f19095f, this.f19096m.f19091m);
                this.f19095f.d(this.f19096m.f19091m);
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public a(n<? super w> nVar, Object obj) {
            this.f19090f = nVar;
            this.f19091m = obj;
        }

        @Override // ad.m
        /* renamed from: a  reason: merged with bridge method [inline-methods] */
        public void d(w wVar, l<? super Throwable, w> lVar) {
            b.f19088i.set(b.this, this.f19091m);
            this.f19090f.d(wVar, new C0428a(b.this, this));
        }

        @Override // ad.b3
        public void b(d0<?> d0Var, int i10) {
            this.f19090f.b(d0Var, i10);
        }

        @Override // ad.m
        /* renamed from: c  reason: merged with bridge method [inline-methods] */
        public void f(g0 g0Var, w wVar) {
            this.f19090f.f(g0Var, wVar);
        }

        @Override // ad.m
        /* renamed from: e  reason: merged with bridge method [inline-methods] */
        public Object t(w wVar, Object obj, l<? super Throwable, w> lVar) {
            Object t10 = this.f19090f.t(wVar, obj, new C0429b(b.this, this));
            if (t10 != null) {
                b.f19088i.set(b.this, this.f19091m);
            }
            return t10;
        }

        @Override // kotlin.coroutines.Continuation
        public hc.f getContext() {
            return this.f19090f.getContext();
        }

        @Override // ad.m
        public void n(l<? super Throwable, w> lVar) {
            this.f19090f.n(lVar);
        }

        @Override // ad.m
        public boolean o(Throwable th) {
            return this.f19090f.o(th);
        }

        @Override // kotlin.coroutines.Continuation
        public void resumeWith(Object obj) {
            this.f19090f.resumeWith(obj);
        }

        @Override // ad.m
        public void w(Object obj) {
            this.f19090f.w(obj);
        }
    }

    /* compiled from: Mutex.kt */
    /* renamed from: jd.b$b  reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    static final class C0430b extends r implements q<j<?>, Object, Object, l<? super Throwable, ? extends w>> {

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: Mutex.kt */
        /* renamed from: jd.b$b$a */
        /* loaded from: classes4.dex */
        public static final class a extends r implements l<Throwable, w> {

            /* renamed from: f  reason: collision with root package name */
            final /* synthetic */ b f19098f;

            /* renamed from: m  reason: collision with root package name */
            final /* synthetic */ Object f19099m;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(b bVar, Object obj) {
                super(1);
                this.f19098f = bVar;
                this.f19099m = obj;
            }

            @Override // pc.l
            public /* bridge */ /* synthetic */ w invoke(Throwable th) {
                invoke2(th);
                return w.f13270a;
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final void invoke2(Throwable th) {
                this.f19098f.d(this.f19099m);
            }
        }

        C0430b() {
            super(3);
        }

        @Override // pc.q
        /* renamed from: a  reason: merged with bridge method [inline-methods] */
        public final l<Throwable, w> invoke(j<?> jVar, Object obj, Object obj2) {
            return new a(b.this, obj);
        }
    }

    public b(boolean z10) {
        super(1, z10 ? 1 : 0);
        fd.g0 g0Var;
        if (!z10) {
            g0Var = c.f19100a;
        } else {
            g0Var = null;
        }
        this.owner = g0Var;
        this.f19089h = new C0430b();
    }

    private final int q(Object obj) {
        fd.g0 g0Var;
        while (r()) {
            Object obj2 = f19088i.get(this);
            g0Var = c.f19100a;
            if (obj2 != g0Var) {
                if (obj2 == obj) {
                    return 1;
                }
                return 2;
            }
        }
        return 0;
    }

    static /* synthetic */ Object s(b bVar, Object obj, Continuation<? super w> continuation) {
        Object d10;
        if (bVar.a(obj)) {
            return w.f13270a;
        }
        Object t10 = bVar.t(obj, continuation);
        d10 = ic.d.d();
        if (t10 == d10) {
            return t10;
        }
        return w.f13270a;
    }

    private final Object t(Object obj, Continuation<? super w> continuation) {
        Continuation c10;
        Object d10;
        Object d11;
        c10 = ic.c.c(continuation);
        n b10 = p.b(c10);
        try {
            f(new a(b10, obj));
            Object x10 = b10.x();
            d10 = ic.d.d();
            if (x10 == d10) {
                h.c(continuation);
            }
            d11 = ic.d.d();
            if (x10 == d11) {
                return x10;
            }
            return w.f13270a;
        } catch (Throwable th) {
            b10.J();
            throw th;
        }
    }

    private final int u(Object obj) {
        while (!m()) {
            if (obj == null) {
                return 1;
            }
            int q10 = q(obj);
            if (q10 == 1) {
                return 2;
            }
            if (q10 == 2) {
                return 1;
            }
        }
        f19088i.set(this, obj);
        return 0;
    }

    @Override // jd.a
    public boolean a(Object obj) {
        int u10 = u(obj);
        if (u10 == 0) {
            return true;
        }
        if (u10 != 1) {
            if (u10 != 2) {
                throw new IllegalStateException("unexpected".toString());
            }
            throw new IllegalStateException(("This mutex is already locked by the specified owner: " + obj).toString());
        }
        return false;
    }

    @Override // jd.a
    public Object c(Object obj, Continuation<? super w> continuation) {
        return s(this, obj, continuation);
    }

    @Override // jd.a
    public void d(Object obj) {
        fd.g0 g0Var;
        boolean z10;
        fd.g0 g0Var2;
        while (r()) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f19088i;
            Object obj2 = atomicReferenceFieldUpdater.get(this);
            g0Var = c.f19100a;
            if (obj2 != g0Var) {
                if (obj2 != obj && obj != null) {
                    z10 = false;
                } else {
                    z10 = true;
                }
                if (z10) {
                    g0Var2 = c.f19100a;
                    if (androidx.concurrent.futures.b.a(atomicReferenceFieldUpdater, this, obj2, g0Var2)) {
                        release();
                        return;
                    }
                } else {
                    throw new IllegalStateException(("This mutex is locked by " + obj2 + ", but " + obj + " is expected").toString());
                }
            }
        }
        throw new IllegalStateException("This mutex is not locked".toString());
    }

    public boolean r() {
        if (l() == 0) {
            return true;
        }
        return false;
    }

    public String toString() {
        return "Mutex@" + o0.b(this) + "[isLocked=" + r() + ",owner=" + f19088i.get(this) + ']';
    }
}
