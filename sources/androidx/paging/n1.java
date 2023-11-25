package androidx.paging;

import androidx.paging.q0;
import androidx.paging.u1;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.habitrpg.android.habitica.ui.activities.TaskFormActivity;
import java.lang.ref.WeakReference;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;

/* compiled from: PagedList.kt */
/* loaded from: classes.dex */
public abstract class n1<T> extends AbstractList<T> {

    /* renamed from: w  reason: collision with root package name */
    public static final c f5899w = new c(null);

    /* renamed from: f  reason: collision with root package name */
    private final u1<?, T> f5900f;

    /* renamed from: m  reason: collision with root package name */
    private final ad.k0 f5901m;

    /* renamed from: p  reason: collision with root package name */
    private final ad.g0 f5902p;

    /* renamed from: q  reason: collision with root package name */
    private final p1<T> f5903q;

    /* renamed from: r  reason: collision with root package name */
    private final d f5904r;

    /* renamed from: s  reason: collision with root package name */
    private Runnable f5905s;

    /* renamed from: t  reason: collision with root package name */
    private final int f5906t;

    /* renamed from: u  reason: collision with root package name */
    private final List<WeakReference<b>> f5907u;

    /* renamed from: v  reason: collision with root package name */
    private final List<WeakReference<pc.p<t0, q0, dc.w>>> f5908v;

    /* compiled from: PagedList.kt */
    /* loaded from: classes.dex */
    public static abstract class a<T> {
    }

    /* compiled from: PagedList.kt */
    /* loaded from: classes.dex */
    public static abstract class b {
        public abstract void a(int i10, int i11);

        public abstract void b(int i10, int i11);

        public abstract void c(int i10, int i11);
    }

    /* compiled from: PagedList.kt */
    /* loaded from: classes.dex */
    public static final class c {

        /* JADX INFO: Add missing generic type declarations: [K] */
        /* compiled from: PagedList.kt */
        @kotlin.coroutines.jvm.internal.f(c = "androidx.paging.PagedList$Companion$create$resolvedInitialPage$1", f = "PagedList.kt", l = {184}, m = "invokeSuspend")
        /* loaded from: classes.dex */
        static final class a<K> extends kotlin.coroutines.jvm.internal.l implements pc.p<ad.k0, Continuation<? super u1.b.C0145b<K, T>>, Object> {

            /* renamed from: f  reason: collision with root package name */
            int f5909f;

            /* renamed from: m  reason: collision with root package name */
            final /* synthetic */ u1<K, T> f5910m;

            /* renamed from: p  reason: collision with root package name */
            final /* synthetic */ u1.a.d<K> f5911p;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(u1<K, T> u1Var, u1.a.d<K> dVar, Continuation<? super a> continuation) {
                super(2, continuation);
                this.f5910m = u1Var;
                this.f5911p = dVar;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Continuation<dc.w> create(Object obj, Continuation<?> continuation) {
                return new a(this.f5910m, this.f5911p, continuation);
            }

            public final Object invoke(ad.k0 k0Var, Continuation<? super u1.b.C0145b<K, T>> continuation) {
                return ((a) create(k0Var, continuation)).invokeSuspend(dc.w.f13270a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Object d10;
                d10 = ic.d.d();
                int i10 = this.f5909f;
                if (i10 != 0) {
                    if (i10 == 1) {
                        dc.n.b(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    dc.n.b(obj);
                    u1<K, T> u1Var = this.f5910m;
                    u1.a.d<K> dVar = this.f5911p;
                    this.f5909f = 1;
                    obj = u1Var.load(dVar, this);
                    if (obj == d10) {
                        return d10;
                    }
                }
                u1.b bVar = (u1.b) obj;
                if (bVar instanceof u1.b.C0145b) {
                    return (u1.b.C0145b) bVar;
                }
                if (!(bVar instanceof u1.b.a)) {
                    throw new NoWhenBranchMatchedException();
                }
                throw ((u1.b.a) bVar).a();
            }

            @Override // pc.p
            public /* bridge */ /* synthetic */ Object invoke(ad.k0 k0Var, Object obj) {
                return invoke(k0Var, (Continuation) ((Continuation) obj));
            }
        }

        private c() {
        }

        public /* synthetic */ c(qc.h hVar) {
            this();
        }

        public final <K, T> n1<T> a(u1<K, T> u1Var, u1.b.C0145b<K, T> c0145b, ad.k0 k0Var, ad.g0 g0Var, ad.g0 g0Var2, a<T> aVar, d dVar, K k10) {
            u1.b.C0145b<K, T> c0145b2;
            Object b10;
            qc.q.i(u1Var, "pagingSource");
            qc.q.i(k0Var, "coroutineScope");
            qc.q.i(g0Var, "notifyDispatcher");
            qc.q.i(g0Var2, "fetchDispatcher");
            qc.q.i(dVar, "config");
            if (c0145b == null) {
                b10 = ad.h.b(null, new a(u1Var, new u1.a.d(k10, dVar.f5916d, dVar.f5915c), null), 1, null);
                c0145b2 = (u1.b.C0145b) b10;
            } else {
                c0145b2 = c0145b;
            }
            return new l(u1Var, k0Var, g0Var, g0Var2, aVar, dVar, c0145b2, k10);
        }
    }

    /* compiled from: PagedList.kt */
    /* loaded from: classes.dex */
    public static final class d {

        /* renamed from: f  reason: collision with root package name */
        public static final b f5912f = new b(null);

        /* renamed from: a  reason: collision with root package name */
        public final int f5913a;

        /* renamed from: b  reason: collision with root package name */
        public final int f5914b;

        /* renamed from: c  reason: collision with root package name */
        public final boolean f5915c;

        /* renamed from: d  reason: collision with root package name */
        public final int f5916d;

        /* renamed from: e  reason: collision with root package name */
        public final int f5917e;

        /* compiled from: PagedList.kt */
        /* loaded from: classes.dex */
        public static final class a {

            /* renamed from: f  reason: collision with root package name */
            public static final C0140a f5918f = new C0140a(null);

            /* renamed from: a  reason: collision with root package name */
            private int f5919a = -1;

            /* renamed from: b  reason: collision with root package name */
            private int f5920b = -1;

            /* renamed from: c  reason: collision with root package name */
            private int f5921c = -1;

            /* renamed from: d  reason: collision with root package name */
            private boolean f5922d = true;

            /* renamed from: e  reason: collision with root package name */
            private int f5923e = Integer.MAX_VALUE;

            /* compiled from: PagedList.kt */
            /* renamed from: androidx.paging.n1$d$a$a  reason: collision with other inner class name */
            /* loaded from: classes.dex */
            public static final class C0140a {
                private C0140a() {
                }

                public /* synthetic */ C0140a(qc.h hVar) {
                    this();
                }
            }

            public final d a() {
                if (this.f5920b < 0) {
                    this.f5920b = this.f5919a;
                }
                if (this.f5921c < 0) {
                    this.f5921c = this.f5919a * 3;
                }
                if (!this.f5922d && this.f5920b == 0) {
                    throw new IllegalArgumentException("Placeholders and prefetch are the only ways to trigger loading of more data in the PagedList, so either placeholders must be enabled, or prefetch distance must be > 0.");
                }
                int i10 = this.f5923e;
                if (i10 != Integer.MAX_VALUE && i10 < this.f5919a + (this.f5920b * 2)) {
                    throw new IllegalArgumentException("Maximum size must be at least pageSize + 2*prefetchDist, pageSize=" + this.f5919a + ", prefetchDist=" + this.f5920b + ", maxSize=" + this.f5923e);
                }
                return new d(this.f5919a, this.f5920b, this.f5922d, this.f5921c, this.f5923e);
            }

            public final a b(boolean z10) {
                this.f5922d = z10;
                return this;
            }

            public final a c(int i10) {
                if (i10 >= 1) {
                    this.f5919a = i10;
                    return this;
                }
                throw new IllegalArgumentException("Page size must be a positive number");
            }
        }

        /* compiled from: PagedList.kt */
        /* loaded from: classes.dex */
        public static final class b {
            private b() {
            }

            public /* synthetic */ b(qc.h hVar) {
                this();
            }
        }

        public d(int i10, int i11, boolean z10, int i12, int i13) {
            this.f5913a = i10;
            this.f5914b = i11;
            this.f5915c = z10;
            this.f5916d = i12;
            this.f5917e = i13;
        }
    }

    /* compiled from: PagedList.kt */
    /* loaded from: classes.dex */
    public static abstract class e {

        /* renamed from: a  reason: collision with root package name */
        private q0 f5924a;

        /* renamed from: b  reason: collision with root package name */
        private q0 f5925b;

        /* renamed from: c  reason: collision with root package name */
        private q0 f5926c;

        /* compiled from: PagedList.kt */
        /* loaded from: classes.dex */
        public /* synthetic */ class a {

            /* renamed from: a  reason: collision with root package name */
            public static final /* synthetic */ int[] f5927a;

            static {
                int[] iArr = new int[t0.values().length];
                try {
                    iArr[t0.REFRESH.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[t0.PREPEND.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[t0.APPEND.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                f5927a = iArr;
            }
        }

        public e() {
            q0.c.a aVar = q0.c.f6001b;
            this.f5924a = aVar.b();
            this.f5925b = aVar.b();
            this.f5926c = aVar.b();
        }

        public final void a(pc.p<? super t0, ? super q0, dc.w> pVar) {
            qc.q.i(pVar, "callback");
            pVar.invoke(t0.REFRESH, this.f5924a);
            pVar.invoke(t0.PREPEND, this.f5925b);
            pVar.invoke(t0.APPEND, this.f5926c);
        }

        public final q0 b() {
            return this.f5926c;
        }

        public final q0 c() {
            return this.f5925b;
        }

        public abstract void d(t0 t0Var, q0 q0Var);

        public final void e(t0 t0Var, q0 q0Var) {
            qc.q.i(t0Var, TaskFormActivity.TASK_TYPE_KEY);
            qc.q.i(q0Var, "state");
            int i10 = a.f5927a[t0Var.ordinal()];
            if (i10 != 1) {
                if (i10 != 2) {
                    if (i10 == 3) {
                        if (qc.q.d(this.f5926c, q0Var)) {
                            return;
                        }
                        this.f5926c = q0Var;
                    }
                } else if (qc.q.d(this.f5925b, q0Var)) {
                    return;
                } else {
                    this.f5925b = q0Var;
                }
            } else if (qc.q.d(this.f5924a, q0Var)) {
                return;
            } else {
                this.f5924a = q0Var;
            }
            d(t0Var, q0Var);
        }
    }

    /* compiled from: PagedList.kt */
    /* loaded from: classes.dex */
    static final class f extends qc.r implements pc.l<WeakReference<b>, Boolean> {

        /* renamed from: f  reason: collision with root package name */
        public static final f f5928f = new f();

        f() {
            super(1);
        }

        @Override // pc.l
        /* renamed from: a  reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(WeakReference<b> weakReference) {
            boolean z10;
            qc.q.i(weakReference, "it");
            if (weakReference.get() == null) {
                z10 = true;
            } else {
                z10 = false;
            }
            return Boolean.valueOf(z10);
        }
    }

    /* compiled from: PagedList.kt */
    /* loaded from: classes.dex */
    static final class g extends qc.r implements pc.l<WeakReference<pc.p<? super t0, ? super q0, ? extends dc.w>>, Boolean> {

        /* renamed from: f  reason: collision with root package name */
        public static final g f5929f = new g();

        g() {
            super(1);
        }

        @Override // pc.l
        /* renamed from: a  reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(WeakReference<pc.p<t0, q0, dc.w>> weakReference) {
            boolean z10;
            qc.q.i(weakReference, "it");
            if (weakReference.get() == null) {
                z10 = true;
            } else {
                z10 = false;
            }
            return Boolean.valueOf(z10);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: PagedList.kt */
    @kotlin.coroutines.jvm.internal.f(c = "androidx.paging.PagedList$dispatchStateChangeAsync$1", f = "PagedList.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes.dex */
    public static final class h extends kotlin.coroutines.jvm.internal.l implements pc.p<ad.k0, Continuation<? super dc.w>, Object> {

        /* renamed from: f  reason: collision with root package name */
        int f5930f;

        /* renamed from: m  reason: collision with root package name */
        final /* synthetic */ n1<T> f5931m;

        /* renamed from: p  reason: collision with root package name */
        final /* synthetic */ t0 f5932p;

        /* renamed from: q  reason: collision with root package name */
        final /* synthetic */ q0 f5933q;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: PagedList.kt */
        /* loaded from: classes.dex */
        public static final class a extends qc.r implements pc.l<WeakReference<pc.p<? super t0, ? super q0, ? extends dc.w>>, Boolean> {

            /* renamed from: f  reason: collision with root package name */
            public static final a f5934f = new a();

            a() {
                super(1);
            }

            @Override // pc.l
            /* renamed from: a  reason: merged with bridge method [inline-methods] */
            public final Boolean invoke(WeakReference<pc.p<t0, q0, dc.w>> weakReference) {
                boolean z10;
                qc.q.i(weakReference, "it");
                if (weakReference.get() == null) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                return Boolean.valueOf(z10);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        h(n1<T> n1Var, t0 t0Var, q0 q0Var, Continuation<? super h> continuation) {
            super(2, continuation);
            this.f5931m = n1Var;
            this.f5932p = t0Var;
            this.f5933q = q0Var;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Continuation<dc.w> create(Object obj, Continuation<?> continuation) {
            return new h(this.f5931m, this.f5932p, this.f5933q, continuation);
        }

        @Override // pc.p
        public final Object invoke(ad.k0 k0Var, Continuation<? super dc.w> continuation) {
            return ((h) create(k0Var, continuation)).invokeSuspend(dc.w.f13270a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            ic.d.d();
            if (this.f5930f == 0) {
                dc.n.b(obj);
                ec.y.C(((n1) this.f5931m).f5908v, a.f5934f);
                List list = ((n1) this.f5931m).f5908v;
                t0 t0Var = this.f5932p;
                q0 q0Var = this.f5933q;
                Iterator<T> it = list.iterator();
                while (it.hasNext()) {
                    pc.p pVar = (pc.p) ((WeakReference) it.next()).get();
                    if (pVar != null) {
                        pVar.invoke(t0Var, q0Var);
                    }
                }
                return dc.w.f13270a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* compiled from: PagedList.kt */
    /* loaded from: classes.dex */
    static final class i extends qc.r implements pc.l<WeakReference<b>, Boolean> {

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ b f5935f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        i(b bVar) {
            super(1);
            this.f5935f = bVar;
        }

        @Override // pc.l
        /* renamed from: a  reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(WeakReference<b> weakReference) {
            boolean z10;
            qc.q.i(weakReference, "it");
            if (weakReference.get() != null && weakReference.get() != this.f5935f) {
                z10 = false;
            } else {
                z10 = true;
            }
            return Boolean.valueOf(z10);
        }
    }

    /* compiled from: PagedList.kt */
    /* loaded from: classes.dex */
    static final class j extends qc.r implements pc.l<WeakReference<pc.p<? super t0, ? super q0, ? extends dc.w>>, Boolean> {

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ pc.p<t0, q0, dc.w> f5936f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        j(pc.p<? super t0, ? super q0, dc.w> pVar) {
            super(1);
            this.f5936f = pVar;
        }

        @Override // pc.l
        /* renamed from: a  reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(WeakReference<pc.p<t0, q0, dc.w>> weakReference) {
            boolean z10;
            qc.q.i(weakReference, "it");
            if (weakReference.get() != null && weakReference.get() != this.f5936f) {
                z10 = false;
            } else {
                z10 = true;
            }
            return Boolean.valueOf(z10);
        }
    }

    public n1(u1<?, T> u1Var, ad.k0 k0Var, ad.g0 g0Var, p1<T> p1Var, d dVar) {
        qc.q.i(u1Var, "pagingSource");
        qc.q.i(k0Var, "coroutineScope");
        qc.q.i(g0Var, "notifyDispatcher");
        qc.q.i(p1Var, "storage");
        qc.q.i(dVar, "config");
        this.f5900f = u1Var;
        this.f5901m = k0Var;
        this.f5902p = g0Var;
        this.f5903q = p1Var;
        this.f5904r = dVar;
        this.f5906t = (dVar.f5914b * 2) + dVar.f5913a;
        this.f5907u = new ArrayList();
        this.f5908v = new ArrayList();
    }

    public abstract boolean A();

    public boolean C() {
        return A();
    }

    public final int D() {
        return this.f5903q.l();
    }

    public final void E(int i10) {
        if (i10 >= 0 && i10 < size()) {
            this.f5903q.x(i10);
            F(i10);
            return;
        }
        throw new IndexOutOfBoundsException("Index: " + i10 + ", Size: " + size());
    }

    public abstract void F(int i10);

    public final void G(int i10, int i11) {
        List t02;
        if (i11 != 0) {
            t02 = ec.b0.t0(this.f5907u);
            Iterator<T> it = t02.iterator();
            while (it.hasNext()) {
                b bVar = (b) ((WeakReference) it.next()).get();
                if (bVar != null) {
                    bVar.a(i10, i11);
                }
            }
        }
    }

    public final void H(int i10, int i11) {
        List t02;
        if (i11 != 0) {
            t02 = ec.b0.t0(this.f5907u);
            Iterator<T> it = t02.iterator();
            while (it.hasNext()) {
                b bVar = (b) ((WeakReference) it.next()).get();
                if (bVar != null) {
                    bVar.b(i10, i11);
                }
            }
        }
    }

    public final void I(int i10, int i11) {
        List t02;
        if (i11 != 0) {
            t02 = ec.b0.t0(this.f5907u);
            Iterator<T> it = t02.iterator();
            while (it.hasNext()) {
                b bVar = (b) ((WeakReference) it.next()).get();
                if (bVar != null) {
                    bVar.c(i10, i11);
                }
            }
        }
    }

    public /* bridge */ Object J(int i10) {
        return super.remove(i10);
    }

    public final void K(b bVar) {
        qc.q.i(bVar, "callback");
        ec.y.C(this.f5907u, new i(bVar));
    }

    public final void M(pc.p<? super t0, ? super q0, dc.w> pVar) {
        qc.q.i(pVar, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
        ec.y.C(this.f5908v, new j(pVar));
    }

    public void N(t0 t0Var, q0 q0Var) {
        qc.q.i(t0Var, "loadType");
        qc.q.i(q0Var, "loadState");
    }

    public final void O(Runnable runnable) {
        this.f5905s = runnable;
    }

    public final List<T> P() {
        if (C()) {
            return this;
        }
        return new j2(this);
    }

    @Override // java.util.AbstractList, java.util.List
    public T get(int i10) {
        return this.f5903q.get(i10);
    }

    public final void l(b bVar) {
        qc.q.i(bVar, "callback");
        ec.y.C(this.f5907u, f.f5928f);
        this.f5907u.add(new WeakReference<>(bVar));
    }

    public final void m(pc.p<? super t0, ? super q0, dc.w> pVar) {
        qc.q.i(pVar, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
        ec.y.C(this.f5908v, g.f5929f);
        this.f5908v.add(new WeakReference<>(pVar));
        n(pVar);
    }

    public abstract void n(pc.p<? super t0, ? super q0, dc.w> pVar);

    public final void o(t0 t0Var, q0 q0Var) {
        qc.q.i(t0Var, TaskFormActivity.TASK_TYPE_KEY);
        qc.q.i(q0Var, "state");
        ad.i.d(this.f5901m, this.f5902p, null, new h(this, t0Var, q0Var, null), 2, null);
    }

    public final d p() {
        return this.f5904r;
    }

    public final ad.k0 r() {
        return this.f5901m;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ T remove(int i10) {
        return (T) J(i10);
    }

    public abstract Object s();

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ int size() {
        return x();
    }

    public final ad.g0 t() {
        return this.f5902p;
    }

    public final a1<T> u() {
        return this.f5903q;
    }

    public u1<?, T> v() {
        return this.f5900f;
    }

    public final int w() {
        return this.f5906t;
    }

    public int x() {
        return this.f5903q.size();
    }

    public final p1<T> y() {
        return this.f5903q;
    }
}
