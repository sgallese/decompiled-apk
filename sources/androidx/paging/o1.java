package androidx.paging;

import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView.f0;
import androidx.recyclerview.widget.i;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;

/* compiled from: PagedListAdapter.kt */
/* loaded from: classes.dex */
public abstract class o1<T, VH extends RecyclerView.f0> extends RecyclerView.h<VH> {
    private final androidx.paging.d<T> differ;
    private final pc.p<n1<T>, n1<T>, dc.w> listener;

    /* compiled from: PagedListAdapter.kt */
    /* loaded from: classes.dex */
    static final class a extends qc.r implements pc.p<n1<T>, n1<T>, dc.w> {

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ o1<T, VH> f5973f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(o1<T, VH> o1Var) {
            super(2);
            this.f5973f = o1Var;
        }

        public final void a(n1<T> n1Var, n1<T> n1Var2) {
            this.f5973f.onCurrentListChanged(n1Var2);
            this.f5973f.onCurrentListChanged(n1Var, n1Var2);
        }

        @Override // pc.p
        public /* bridge */ /* synthetic */ dc.w invoke(Object obj, Object obj2) {
            a((n1) obj, (n1) obj2);
            return dc.w.f13270a;
        }
    }

    /* compiled from: PagedListAdapter.kt */
    /* loaded from: classes.dex */
    static final class b extends qc.r implements pc.p<t0, q0, dc.w> {
        b(r0<?> r0Var) {
            super(2);
        }

        public final void a(t0 t0Var, q0 q0Var) {
            qc.q.i(t0Var, "loadType");
            qc.q.i(q0Var, "loadState");
            if (t0Var != t0.APPEND) {
                return;
            }
            throw null;
        }

        @Override // pc.p
        public /* bridge */ /* synthetic */ dc.w invoke(t0 t0Var, q0 q0Var) {
            a(t0Var, q0Var);
            return dc.w.f13270a;
        }
    }

    /* compiled from: PagedListAdapter.kt */
    /* loaded from: classes.dex */
    static final class c extends qc.r implements pc.p<t0, q0, dc.w> {
        c(r0<?> r0Var) {
            super(2);
        }

        public final void a(t0 t0Var, q0 q0Var) {
            qc.q.i(t0Var, "loadType");
            qc.q.i(q0Var, "loadState");
            if (t0Var != t0.PREPEND) {
                return;
            }
            throw null;
        }

        @Override // pc.p
        public /* bridge */ /* synthetic */ dc.w invoke(t0 t0Var, q0 q0Var) {
            a(t0Var, q0Var);
            return dc.w.f13270a;
        }
    }

    /* compiled from: PagedListAdapter.kt */
    /* loaded from: classes.dex */
    static final class d extends qc.r implements pc.p<t0, q0, dc.w> {
        d(r0<?> r0Var, r0<?> r0Var2) {
            super(2);
        }

        public final void a(t0 t0Var, q0 q0Var) {
            qc.q.i(t0Var, "loadType");
            qc.q.i(q0Var, "loadState");
            if (t0Var != t0.PREPEND) {
                if (t0Var != t0.APPEND) {
                    return;
                }
                throw null;
            }
            throw null;
        }

        @Override // pc.p
        public /* bridge */ /* synthetic */ dc.w invoke(t0 t0Var, q0 q0Var) {
            a(t0Var, q0Var);
            return dc.w.f13270a;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public o1(i.f<T> fVar) {
        qc.q.i(fVar, "diffCallback");
        a aVar = new a(this);
        this.listener = aVar;
        androidx.paging.d<T> dVar = new androidx.paging.d<>(this, fVar);
        this.differ = dVar;
        dVar.d(aVar);
    }

    public void addLoadStateListener(pc.p<? super t0, ? super q0, dc.w> pVar) {
        qc.q.i(pVar, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
        this.differ.c(pVar);
    }

    public n1<T> getCurrentList() {
        return this.differ.e();
    }

    public final androidx.paging.d<T> getDiffer$paging_runtime_release() {
        return this.differ;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public T getItem(int i10) {
        return this.differ.f(i10);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public int getItemCount() {
        return this.differ.g();
    }

    public void onCurrentListChanged(n1<T> n1Var) {
    }

    public void removeLoadStateListener(pc.p<? super t0, ? super q0, dc.w> pVar) {
        qc.q.i(pVar, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
        this.differ.l(pVar);
    }

    public void submitList(n1<T> n1Var) {
        this.differ.n(n1Var);
    }

    public final androidx.recyclerview.widget.f withLoadStateFooter(r0<?> r0Var) {
        qc.q.i(r0Var, "footer");
        addLoadStateListener(new b(r0Var));
        return new androidx.recyclerview.widget.f(this, r0Var);
    }

    public final androidx.recyclerview.widget.f withLoadStateHeader(r0<?> r0Var) {
        qc.q.i(r0Var, "header");
        addLoadStateListener(new c(r0Var));
        return new androidx.recyclerview.widget.f(r0Var, this);
    }

    public final androidx.recyclerview.widget.f withLoadStateHeaderAndFooter(r0<?> r0Var, r0<?> r0Var2) {
        qc.q.i(r0Var, "header");
        qc.q.i(r0Var2, "footer");
        addLoadStateListener(new d(r0Var, r0Var2));
        return new androidx.recyclerview.widget.f(r0Var, this, r0Var2);
    }

    public void onCurrentListChanged(n1<T> n1Var, n1<T> n1Var2) {
    }

    public void submitList(n1<T> n1Var, Runnable runnable) {
        this.differ.o(n1Var, runnable);
    }

    protected o1(androidx.recyclerview.widget.c<T> cVar) {
        qc.q.i(cVar, "config");
        a aVar = new a(this);
        this.listener = aVar;
        androidx.paging.d<T> dVar = new androidx.paging.d<>(new androidx.recyclerview.widget.b(this), cVar);
        this.differ = dVar;
        dVar.d(aVar);
    }

    public static /* synthetic */ void getCurrentList$annotations() {
    }

    public static /* synthetic */ void getDiffer$paging_runtime_release$annotations() {
    }

    private static /* synthetic */ void getListener$annotations() {
    }
}
