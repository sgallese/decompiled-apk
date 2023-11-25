package n3;

import android.util.Log;
import androidx.compose.ui.platform.m0;
import androidx.paging.a1;
import androidx.paging.j;
import androidx.paging.j0;
import androidx.paging.q0;
import androidx.paging.s;
import androidx.paging.s0;
import androidx.paging.s1;
import androidx.paging.t1;
import androidx.paging.u0;
import androidx.paging.v0;
import dc.n;
import dc.w;
import dd.b0;
import dd.g;
import dd.i;
import j0.d3;
import j0.j1;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.l;
import pc.p;
import qc.h;
import qc.q;

/* compiled from: LazyPagingItems.kt */
/* loaded from: classes.dex */
public final class a<T> {

    /* renamed from: g  reason: collision with root package name */
    private static final b f20133g = new b(null);

    /* renamed from: h  reason: collision with root package name */
    public static final int f20134h = 8;

    /* renamed from: a  reason: collision with root package name */
    private final g<s1<T>> f20135a;

    /* renamed from: b  reason: collision with root package name */
    private final hc.f f20136b;

    /* renamed from: c  reason: collision with root package name */
    private final s f20137c;

    /* renamed from: d  reason: collision with root package name */
    private final f f20138d;

    /* renamed from: e  reason: collision with root package name */
    private final j1 f20139e;

    /* renamed from: f  reason: collision with root package name */
    private final j1 f20140f;

    /* compiled from: LazyPagingItems.kt */
    /* renamed from: n3.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static final class C0454a implements u0 {
        C0454a() {
        }

        @Override // androidx.paging.u0
        public boolean a(int i10) {
            return Log.isLoggable("Paging", i10);
        }

        @Override // androidx.paging.u0
        public void b(int i10, String str, Throwable th) {
            q.i(str, "message");
            if (th != null && i10 == 3) {
                Log.d("Paging", str, th);
            } else if (th != null && i10 == 2) {
                Log.v("Paging", str, th);
            } else if (i10 == 3) {
                Log.d("Paging", str);
            } else if (i10 == 2) {
                Log.v("Paging", str);
            } else {
                throw new IllegalArgumentException("debug level " + i10 + " is requested but Paging only supports default logging for level 2 (DEBUG) or level 3 (VERBOSE)");
            }
        }
    }

    /* compiled from: LazyPagingItems.kt */
    /* loaded from: classes.dex */
    private static final class b {
        private b() {
        }

        public /* synthetic */ b(h hVar) {
            this();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: LazyPagingItems.kt */
    /* loaded from: classes.dex */
    public static final class c implements dd.h<j> {

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ a<T> f20141f;

        c(a<T> aVar) {
            this.f20141f = aVar;
        }

        @Override // dd.h
        /* renamed from: a  reason: merged with bridge method [inline-methods] */
        public final Object emit(j jVar, Continuation<? super w> continuation) {
            this.f20141f.l(jVar);
            return w.f13270a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: LazyPagingItems.kt */
    @kotlin.coroutines.jvm.internal.f(c = "androidx.paging.compose.LazyPagingItems$collectPagingData$2", f = "LazyPagingItems.kt", l = {210}, m = "invokeSuspend")
    /* loaded from: classes.dex */
    public static final class d extends l implements p<s1<T>, Continuation<? super w>, Object> {

        /* renamed from: f  reason: collision with root package name */
        int f20142f;

        /* renamed from: m  reason: collision with root package name */
        /* synthetic */ Object f20143m;

        /* renamed from: p  reason: collision with root package name */
        final /* synthetic */ a<T> f20144p;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(a<T> aVar, Continuation<? super d> continuation) {
            super(2, continuation);
            this.f20144p = aVar;
        }

        @Override // pc.p
        /* renamed from: a  reason: merged with bridge method [inline-methods] */
        public final Object invoke(s1<T> s1Var, Continuation<? super w> continuation) {
            return ((d) create(s1Var, continuation)).invokeSuspend(w.f13270a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Continuation<w> create(Object obj, Continuation<?> continuation) {
            d dVar = new d(this.f20144p, continuation);
            dVar.f20143m = obj;
            return dVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object d10;
            d10 = ic.d.d();
            int i10 = this.f20142f;
            if (i10 != 0) {
                if (i10 == 1) {
                    n.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                n.b(obj);
                s1<T> s1Var = (s1) this.f20143m;
                f fVar = ((a) this.f20144p).f20138d;
                this.f20142f = 1;
                if (fVar.q(s1Var, this) == d10) {
                    return d10;
                }
            }
            return w.f13270a;
        }
    }

    /* compiled from: LazyPagingItems.kt */
    /* loaded from: classes.dex */
    public static final class e implements s {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a<T> f20145a;

        e(a<T> aVar) {
            this.f20145a = aVar;
        }

        @Override // androidx.paging.s
        public void a(int i10, int i11) {
            if (i11 > 0) {
                this.f20145a.m();
            }
        }

        @Override // androidx.paging.s
        public void b(int i10, int i11) {
            if (i11 > 0) {
                this.f20145a.m();
            }
        }

        @Override // androidx.paging.s
        public void c(int i10, int i11) {
            if (i11 > 0) {
                this.f20145a.m();
            }
        }
    }

    /* compiled from: LazyPagingItems.kt */
    /* loaded from: classes.dex */
    public static final class f extends t1<T> {

        /* renamed from: n  reason: collision with root package name */
        final /* synthetic */ a<T> f20146n;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(a<T> aVar, s sVar, hc.f fVar, s1<T> s1Var) {
            super(sVar, fVar, s1Var);
            this.f20146n = aVar;
        }

        @Override // androidx.paging.t1
        public Object v(a1<T> a1Var, a1<T> a1Var2, int i10, pc.a<w> aVar, Continuation<? super Integer> continuation) {
            aVar.invoke();
            this.f20146n.m();
            return null;
        }
    }

    static {
        u0 a10 = v0.a();
        if (a10 == null) {
            a10 = new C0454a();
        }
        v0.b(a10);
    }

    public a(g<s1<T>> gVar) {
        s1 s1Var;
        j1 e10;
        j1 e11;
        s0 s0Var;
        s0 s0Var2;
        s0 s0Var3;
        s0 s0Var4;
        Object c02;
        q.i(gVar, "flow");
        this.f20135a = gVar;
        hc.f b10 = m0.f2750y.b();
        this.f20136b = b10;
        e eVar = new e(this);
        this.f20137c = eVar;
        if (gVar instanceof b0) {
            c02 = ec.b0.c0(((b0) gVar).a());
            s1Var = (s1) c02;
        } else {
            s1Var = null;
        }
        f fVar = new f(this, eVar, b10, s1Var);
        this.f20138d = fVar;
        e10 = d3.e(fVar.y(), null, 2, null);
        this.f20139e = e10;
        j value = fVar.t().getValue();
        if (value == null) {
            s0Var = n3.b.f20148b;
            q0 f10 = s0Var.f();
            s0Var2 = n3.b.f20148b;
            q0 e12 = s0Var2.e();
            s0Var3 = n3.b.f20148b;
            q0 d10 = s0Var3.d();
            s0Var4 = n3.b.f20148b;
            value = new j(f10, e12, d10, s0Var4, null, 16, null);
        }
        e11 = d3.e(value, null, 2, null);
        this.f20140f = e11;
    }

    private final void k(j0<T> j0Var) {
        this.f20139e.setValue(j0Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void l(j jVar) {
        this.f20140f.setValue(jVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void m() {
        k(this.f20138d.y());
    }

    public final Object d(Continuation<? super w> continuation) {
        Object d10;
        Object collect = i.u(this.f20138d.t()).collect(new c(this), continuation);
        d10 = ic.d.d();
        if (collect == d10) {
            return collect;
        }
        return w.f13270a;
    }

    public final Object e(Continuation<? super w> continuation) {
        Object d10;
        Object g10 = i.g(this.f20135a, new d(this, null), continuation);
        d10 = ic.d.d();
        if (g10 == d10) {
            return g10;
        }
        return w.f13270a;
    }

    public final T f(int i10) {
        this.f20138d.s(i10);
        return h().get(i10);
    }

    public final int g() {
        return h().size();
    }

    public final j0<T> h() {
        return (j0) this.f20139e.getValue();
    }

    public final j i() {
        return (j) this.f20140f.getValue();
    }

    public final void j() {
        this.f20138d.x();
    }
}
