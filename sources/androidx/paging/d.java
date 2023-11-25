package androidx.paging;

import androidx.paging.n1;
import androidx.paging.q0;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.c;
import androidx.recyclerview.widget.i;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.habitrpg.android.habitica.ui.activities.TaskFormActivity;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;

/* compiled from: AsyncPagedListDiffer.kt */
/* loaded from: classes.dex */
public class d<T> {

    /* renamed from: a  reason: collision with root package name */
    public androidx.recyclerview.widget.r f5439a;

    /* renamed from: b  reason: collision with root package name */
    private final androidx.recyclerview.widget.c<T> f5440b;

    /* renamed from: c  reason: collision with root package name */
    private Executor f5441c;

    /* renamed from: d  reason: collision with root package name */
    private final CopyOnWriteArrayList<b<T>> f5442d;

    /* renamed from: e  reason: collision with root package name */
    private n1<T> f5443e;

    /* renamed from: f  reason: collision with root package name */
    private n1<T> f5444f;

    /* renamed from: g  reason: collision with root package name */
    private int f5445g;

    /* renamed from: h  reason: collision with root package name */
    private final n1.e f5446h;

    /* renamed from: i  reason: collision with root package name */
    private final wc.d<dc.w> f5447i;

    /* renamed from: j  reason: collision with root package name */
    private final List<pc.p<t0, q0, dc.w>> f5448j;

    /* renamed from: k  reason: collision with root package name */
    private final n1.b f5449k;

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: AsyncPagedListDiffer.kt */
    /* loaded from: classes.dex */
    public static final class a<T> implements b<T> {

        /* renamed from: a  reason: collision with root package name */
        private final pc.p<n1<T>, n1<T>, dc.w> f5450a;

        /* JADX WARN: Multi-variable type inference failed */
        public a(pc.p<? super n1<T>, ? super n1<T>, dc.w> pVar) {
            qc.q.i(pVar, "callback");
            this.f5450a = pVar;
        }

        @Override // androidx.paging.d.b
        public void a(n1<T> n1Var, n1<T> n1Var2) {
            this.f5450a.invoke(n1Var, n1Var2);
        }
    }

    /* compiled from: AsyncPagedListDiffer.kt */
    /* loaded from: classes.dex */
    public interface b<T> {
        void a(n1<T> n1Var, n1<T> n1Var2);
    }

    /* compiled from: AsyncPagedListDiffer.kt */
    /* loaded from: classes.dex */
    /* synthetic */ class c extends qc.n implements pc.p<t0, q0, dc.w> {
        c(Object obj) {
            super(2, obj, n1.e.class, "setState", "setState(Landroidx/paging/LoadType;Landroidx/paging/LoadState;)V", 0);
        }

        public final void h(t0 t0Var, q0 q0Var) {
            qc.q.i(t0Var, "p0");
            qc.q.i(q0Var, "p1");
            ((n1.e) this.f21661m).e(t0Var, q0Var);
        }

        @Override // pc.p
        public /* bridge */ /* synthetic */ dc.w invoke(t0 t0Var, q0 q0Var) {
            h(t0Var, q0Var);
            return dc.w.f13270a;
        }
    }

    /* compiled from: AsyncPagedListDiffer.kt */
    /* renamed from: androidx.paging.d$d  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static final class C0120d extends n1.e {

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ d<T> f5451d;

        C0120d(d<T> dVar) {
            this.f5451d = dVar;
        }

        @Override // androidx.paging.n1.e
        public void d(t0 t0Var, q0 q0Var) {
            qc.q.i(t0Var, TaskFormActivity.TASK_TYPE_KEY);
            qc.q.i(q0Var, "state");
            Iterator<T> it = this.f5451d.h().iterator();
            while (it.hasNext()) {
                ((pc.p) it.next()).invoke(t0Var, q0Var);
            }
        }
    }

    /* compiled from: AsyncPagedListDiffer.kt */
    /* loaded from: classes.dex */
    public static final class e extends n1.b {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ d<T> f5452a;

        e(d<T> dVar) {
            this.f5452a = dVar;
        }

        @Override // androidx.paging.n1.b
        public void a(int i10, int i11) {
            this.f5452a.i().d(i10, i11, null);
        }

        @Override // androidx.paging.n1.b
        public void b(int i10, int i11) {
            this.f5452a.i().a(i10, i11);
        }

        @Override // androidx.paging.n1.b
        public void c(int i10, int i11) {
            this.f5452a.i().b(i10, i11);
        }
    }

    public d(RecyclerView.h<?> hVar, i.f<T> fVar) {
        qc.q.i(hVar, "adapter");
        qc.q.i(fVar, "diffCallback");
        Executor h10 = l.c.h();
        qc.q.h(h10, "getMainThreadExecutor()");
        this.f5441c = h10;
        this.f5442d = new CopyOnWriteArrayList<>();
        C0120d c0120d = new C0120d(this);
        this.f5446h = c0120d;
        this.f5447i = new c(c0120d);
        this.f5448j = new CopyOnWriteArrayList();
        this.f5449k = new e(this);
        m(new androidx.recyclerview.widget.b(hVar));
        androidx.recyclerview.widget.c<T> a10 = new c.a(fVar).a();
        qc.q.h(a10, "Builder(diffCallback).build()");
        this.f5440b = a10;
    }

    private final void k(n1<T> n1Var, n1<T> n1Var2, Runnable runnable) {
        Iterator<T> it = this.f5442d.iterator();
        while (it.hasNext()) {
            ((b) it.next()).a(n1Var, n1Var2);
        }
        if (runnable != null) {
            runnable.run();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void p(final n1 n1Var, final n1 n1Var2, final d dVar, final int i10, final n1 n1Var3, final b2 b2Var, final Runnable runnable) {
        qc.q.i(n1Var2, "$newSnapshot");
        qc.q.i(dVar, "this$0");
        qc.q.i(b2Var, "$recordingCallback");
        a1<T> u10 = n1Var.u();
        a1<T> u11 = n1Var2.u();
        i.f<T> b10 = dVar.f5440b.b();
        qc.q.h(b10, "config.diffCallback");
        final z0 a10 = b1.a(u10, u11, b10);
        dVar.f5441c.execute(new Runnable() { // from class: androidx.paging.c
            @Override // java.lang.Runnable
            public final void run() {
                d.q(d.this, i10, n1Var3, n1Var2, a10, b2Var, n1Var, runnable);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void q(d dVar, int i10, n1 n1Var, n1 n1Var2, z0 z0Var, b2 b2Var, n1 n1Var3, Runnable runnable) {
        qc.q.i(dVar, "this$0");
        qc.q.i(n1Var2, "$newSnapshot");
        qc.q.i(z0Var, "$result");
        qc.q.i(b2Var, "$recordingCallback");
        if (dVar.f5445g == i10) {
            dVar.j(n1Var, n1Var2, z0Var, b2Var, n1Var3.D(), runnable);
        }
    }

    public void c(pc.p<? super t0, ? super q0, dc.w> pVar) {
        qc.q.i(pVar, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
        n1<T> n1Var = this.f5443e;
        if (n1Var != null) {
            n1Var.m(pVar);
        } else {
            this.f5446h.a(pVar);
        }
        this.f5448j.add(pVar);
    }

    public final void d(pc.p<? super n1<T>, ? super n1<T>, dc.w> pVar) {
        qc.q.i(pVar, "callback");
        this.f5442d.add(new a(pVar));
    }

    public n1<T> e() {
        n1<T> n1Var = this.f5444f;
        if (n1Var == null) {
            return this.f5443e;
        }
        return n1Var;
    }

    public T f(int i10) {
        n1<T> n1Var = this.f5444f;
        n1<T> n1Var2 = this.f5443e;
        if (n1Var != null) {
            return n1Var.get(i10);
        }
        if (n1Var2 != null) {
            n1Var2.E(i10);
            return n1Var2.get(i10);
        }
        throw new IndexOutOfBoundsException("Item count is zero, getItem() call is invalid");
    }

    public int g() {
        n1<T> e10 = e();
        if (e10 != null) {
            return e10.size();
        }
        return 0;
    }

    public final List<pc.p<t0, q0, dc.w>> h() {
        return this.f5448j;
    }

    public final androidx.recyclerview.widget.r i() {
        androidx.recyclerview.widget.r rVar = this.f5439a;
        if (rVar != null) {
            return rVar;
        }
        qc.q.z("updateCallback");
        return null;
    }

    public final void j(n1<T> n1Var, n1<T> n1Var2, z0 z0Var, b2 b2Var, int i10, Runnable runnable) {
        int l10;
        qc.q.i(n1Var, "newList");
        qc.q.i(n1Var2, "diffSnapshot");
        qc.q.i(z0Var, "diffResult");
        qc.q.i(b2Var, "recordingCallback");
        n1<T> n1Var3 = this.f5444f;
        if (n1Var3 != null && this.f5443e == null) {
            this.f5443e = n1Var;
            n1Var.m((pc.p) this.f5447i);
            this.f5444f = null;
            b1.b(n1Var3.u(), i(), n1Var2.u(), z0Var);
            b2Var.d(this.f5449k);
            n1Var.l(this.f5449k);
            if (!n1Var.isEmpty()) {
                l10 = vc.l.l(b1.c(n1Var3.u(), z0Var, n1Var2.u(), i10), 0, n1Var.size() - 1);
                n1Var.E(l10);
            }
            k(n1Var3, this.f5443e, runnable);
            return;
        }
        throw new IllegalStateException("must be in snapshot state to apply diff");
    }

    public void l(pc.p<? super t0, ? super q0, dc.w> pVar) {
        qc.q.i(pVar, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
        this.f5448j.remove(pVar);
        n1<T> n1Var = this.f5443e;
        if (n1Var != null) {
            n1Var.M(pVar);
        }
    }

    public final void m(androidx.recyclerview.widget.r rVar) {
        qc.q.i(rVar, "<set-?>");
        this.f5439a = rVar;
    }

    public void n(n1<T> n1Var) {
        o(n1Var, null);
    }

    public void o(final n1<T> n1Var, final Runnable runnable) {
        final int i10 = this.f5445g + 1;
        this.f5445g = i10;
        n1<T> n1Var2 = this.f5443e;
        if (n1Var == n1Var2) {
            if (runnable != null) {
                runnable.run();
            }
        } else if (n1Var2 != null && (n1Var instanceof d0)) {
            n1Var2.K(this.f5449k);
            n1Var2.M((pc.p) this.f5447i);
            this.f5446h.e(t0.REFRESH, q0.b.f6000b);
            this.f5446h.e(t0.PREPEND, new q0.c(false));
            this.f5446h.e(t0.APPEND, new q0.c(false));
            if (runnable != null) {
                runnable.run();
            }
        } else {
            n1<T> e10 = e();
            if (n1Var == null) {
                int g10 = g();
                if (n1Var2 != null) {
                    n1Var2.K(this.f5449k);
                    n1Var2.M((pc.p) this.f5447i);
                    this.f5443e = null;
                } else if (this.f5444f != null) {
                    this.f5444f = null;
                }
                i().b(0, g10);
                k(e10, null, runnable);
            } else if (e() == null) {
                this.f5443e = n1Var;
                n1Var.m((pc.p) this.f5447i);
                n1Var.l(this.f5449k);
                i().a(0, n1Var.size());
                k(null, n1Var, runnable);
            } else {
                n1<T> n1Var3 = this.f5443e;
                if (n1Var3 != null) {
                    n1Var3.K(this.f5449k);
                    n1Var3.M((pc.p) this.f5447i);
                    List<T> P = n1Var3.P();
                    qc.q.g(P, "null cannot be cast to non-null type androidx.paging.PagedList<T of androidx.paging.AsyncPagedListDiffer.submitList$lambda$0>");
                    this.f5444f = (n1) P;
                    this.f5443e = null;
                }
                final n1<T> n1Var4 = this.f5444f;
                if (n1Var4 != null && this.f5443e == null) {
                    List<T> P2 = n1Var.P();
                    qc.q.g(P2, "null cannot be cast to non-null type androidx.paging.PagedList<T of androidx.paging.AsyncPagedListDiffer>");
                    final n1 n1Var5 = (n1) P2;
                    final b2 b2Var = new b2();
                    n1Var.l(b2Var);
                    this.f5440b.a().execute(new Runnable() { // from class: androidx.paging.b
                        @Override // java.lang.Runnable
                        public final void run() {
                            d.p(n1.this, n1Var5, this, i10, n1Var, b2Var, runnable);
                        }
                    });
                    return;
                }
                throw new IllegalStateException("must be in snapshot state to diff");
            }
        }
    }

    public d(androidx.recyclerview.widget.r rVar, androidx.recyclerview.widget.c<T> cVar) {
        qc.q.i(rVar, "listUpdateCallback");
        qc.q.i(cVar, "config");
        Executor h10 = l.c.h();
        qc.q.h(h10, "getMainThreadExecutor()");
        this.f5441c = h10;
        this.f5442d = new CopyOnWriteArrayList<>();
        C0120d c0120d = new C0120d(this);
        this.f5446h = c0120d;
        this.f5447i = new c(c0120d);
        this.f5448j = new CopyOnWriteArrayList();
        this.f5449k = new e(this);
        m(rVar);
        this.f5440b = cVar;
    }
}
