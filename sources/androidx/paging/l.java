package androidx.paging;

import androidx.paging.k0;
import androidx.paging.n1;
import androidx.paging.p1;
import androidx.paging.u1;
import androidx.recyclerview.widget.RecyclerView;
import com.habitrpg.android.habitica.ui.activities.TaskFormActivity;
import java.util.List;
import kotlin.coroutines.Continuation;

/* compiled from: ContiguousPagedList.kt */
/* loaded from: classes.dex */
public class l<K, V> extends n1<V> implements p1.a, k0.b<V> {
    public static final a I = new a(null);
    private int A;
    private boolean B;
    private boolean C;
    private int D;
    private int E;
    private boolean F;
    private final boolean G;
    private final k0<K, V> H;

    /* renamed from: x  reason: collision with root package name */
    private final u1<K, V> f5840x;

    /* renamed from: y  reason: collision with root package name */
    private final K f5841y;

    /* renamed from: z  reason: collision with root package name */
    private int f5842z;

    /* compiled from: ContiguousPagedList.kt */
    /* loaded from: classes.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(qc.h hVar) {
            this();
        }

        public final int a(int i10, int i11, int i12) {
            return ((i11 + i10) + 1) - i12;
        }

        public final int b(int i10, int i11, int i12) {
            return i10 - (i11 - i12);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ContiguousPagedList.kt */
    @kotlin.coroutines.jvm.internal.f(c = "androidx.paging.ContiguousPagedList$tryDispatchBoundaryCallbacks$1", f = "ContiguousPagedList.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes.dex */
    public static final class b extends kotlin.coroutines.jvm.internal.l implements pc.p<ad.k0, Continuation<? super dc.w>, Object> {

        /* renamed from: f  reason: collision with root package name */
        int f5843f;

        /* renamed from: m  reason: collision with root package name */
        final /* synthetic */ l<K, V> f5844m;

        /* renamed from: p  reason: collision with root package name */
        final /* synthetic */ boolean f5845p;

        /* renamed from: q  reason: collision with root package name */
        final /* synthetic */ boolean f5846q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(l<K, V> lVar, boolean z10, boolean z11, Continuation<? super b> continuation) {
            super(2, continuation);
            this.f5844m = lVar;
            this.f5845p = z10;
            this.f5846q = z11;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Continuation<dc.w> create(Object obj, Continuation<?> continuation) {
            return new b(this.f5844m, this.f5845p, this.f5846q, continuation);
        }

        @Override // pc.p
        public final Object invoke(ad.k0 k0Var, Continuation<? super dc.w> continuation) {
            return ((b) create(k0Var, continuation)).invokeSuspend(dc.w.f13270a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            ic.d.d();
            if (this.f5843f == 0) {
                dc.n.b(obj);
                this.f5844m.R(this.f5845p, this.f5846q);
                return dc.w.f13270a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(u1<K, V> u1Var, ad.k0 k0Var, ad.g0 g0Var, ad.g0 g0Var2, n1.a<V> aVar, n1.d dVar, u1.b.C0145b<K, V> c0145b, K k10) {
        super(u1Var, k0Var, g0Var, new p1(), dVar);
        boolean z10;
        int i10;
        int i11;
        int i12;
        boolean z11;
        qc.q.i(u1Var, "pagingSource");
        qc.q.i(k0Var, "coroutineScope");
        qc.q.i(g0Var, "notifyDispatcher");
        qc.q.i(g0Var2, "backgroundDispatcher");
        qc.q.i(dVar, "config");
        qc.q.i(c0145b, "initialPage");
        this.f5840x = u1Var;
        this.f5841y = k10;
        this.D = Integer.MAX_VALUE;
        this.E = RecyclerView.UNDEFINED_DURATION;
        if (dVar.f5917e != Integer.MAX_VALUE) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.G = z10;
        p1<V> y10 = y();
        qc.q.g(y10, "null cannot be cast to non-null type androidx.paging.LegacyPageFetcher.KeyProvider<K of androidx.paging.ContiguousPagedList>");
        this.H = new k0<>(k0Var, dVar, u1Var, g0Var, g0Var2, this, y10);
        if (dVar.f5915c) {
            p1<V> y11 = y();
            if (c0145b.h() != Integer.MIN_VALUE) {
                i11 = c0145b.h();
            } else {
                i11 = 0;
            }
            if (c0145b.f() != Integer.MIN_VALUE) {
                i12 = c0145b.f();
            } else {
                i12 = 0;
            }
            if (c0145b.h() != Integer.MIN_VALUE && c0145b.f() != Integer.MIN_VALUE) {
                z11 = true;
            } else {
                z11 = false;
            }
            y11.p(i11, c0145b, i12, 0, this, z11);
        } else {
            p1<V> y12 = y();
            if (c0145b.h() != Integer.MIN_VALUE) {
                i10 = c0145b.h();
            } else {
                i10 = 0;
            }
            y12.p(0, c0145b, 0, i10, this, false);
        }
        S(t0.REFRESH, c0145b.e());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void R(boolean z10, boolean z11) {
        if (!z10) {
            if (!z11) {
                return;
            }
            qc.q.f(null);
            y().m();
            throw null;
        }
        qc.q.f(null);
        y().k();
        throw null;
    }

    private final void U(boolean z10) {
        boolean z11;
        boolean z12 = true;
        if (this.B && this.D <= p().f5914b) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (!this.C || this.E < (size() - 1) - p().f5914b) {
            z12 = false;
        }
        if (!z11 && !z12) {
            return;
        }
        if (z11) {
            this.B = false;
        }
        if (z12) {
            this.C = false;
        }
        if (z10) {
            ad.i.d(r(), t(), null, new b(this, z11, z12, null), 2, null);
        } else {
            R(z11, z12);
        }
    }

    @Override // androidx.paging.n1
    public boolean A() {
        return this.H.h();
    }

    @Override // androidx.paging.n1
    public void F(int i10) {
        a aVar = I;
        int b10 = aVar.b(p().f5914b, i10, y().g());
        int a10 = aVar.a(p().f5914b, i10, y().g() + y().f());
        int max = Math.max(b10, this.f5842z);
        this.f5842z = max;
        if (max > 0) {
            this.H.o();
        }
        int max2 = Math.max(a10, this.A);
        this.A = max2;
        if (max2 > 0) {
            this.H.n();
        }
        this.D = Math.min(this.D, i10);
        this.E = Math.max(this.E, i10);
        U(true);
    }

    @Override // androidx.paging.n1
    public void N(t0 t0Var, q0 q0Var) {
        qc.q.i(t0Var, "loadType");
        qc.q.i(q0Var, "loadState");
        this.H.e().e(t0Var, q0Var);
    }

    @Override // androidx.paging.p1.a
    public void a(int i10, int i11, int i12) {
        G(i10, i11);
        H(0, i12);
        this.D += i12;
        this.E += i12;
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0065, code lost:
    
        if ((!r0.isEmpty()) != false) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x008d, code lost:
    
        if ((!r0.isEmpty()) != false) goto L33;
     */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0095  */
    @Override // androidx.paging.k0.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean e(androidx.paging.t0 r9, androidx.paging.u1.b.C0145b<?, V> r10) {
        /*
            Method dump skipped, instructions count: 283
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.paging.l.e(androidx.paging.t0, androidx.paging.u1$b$b):boolean");
    }

    @Override // androidx.paging.p1.a
    public void f(int i10) {
        boolean z10 = false;
        H(0, i10);
        if (y().g() > 0 || y().h() > 0) {
            z10 = true;
        }
        this.F = z10;
    }

    @Override // androidx.paging.p1.a
    public void g(int i10, int i11) {
        G(i10, i11);
    }

    @Override // androidx.paging.p1.a
    public void h(int i10, int i11) {
        I(i10, i11);
    }

    @Override // androidx.paging.k0.b
    public void i(t0 t0Var, q0 q0Var) {
        qc.q.i(t0Var, TaskFormActivity.TASK_TYPE_KEY);
        qc.q.i(q0Var, "state");
        o(t0Var, q0Var);
    }

    @Override // androidx.paging.p1.a
    public void j(int i10, int i11, int i12) {
        G(i10, i11);
        H(i10 + i11, i12);
    }

    @Override // androidx.paging.n1
    public void n(pc.p<? super t0, ? super q0, dc.w> pVar) {
        qc.q.i(pVar, "callback");
        this.H.e().a(pVar);
    }

    @Override // androidx.paging.n1
    public K s() {
        K refreshKey;
        w1<?, V> o10 = y().o(p());
        if (o10 == null || (refreshKey = this.f5840x.getRefreshKey(o10)) == null) {
            return this.f5841y;
        }
        return refreshKey;
    }

    @Override // androidx.paging.n1
    public final u1<K, V> v() {
        return this.f5840x;
    }

    private final void S(t0 t0Var, List<? extends V> list) {
    }
}
