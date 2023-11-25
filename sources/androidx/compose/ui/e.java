package androidx.compose.ui;

import ad.a2;
import ad.k0;
import ad.l0;
import ad.x1;
import com.habitrpg.android.habitica.ui.fragments.setup.TaskSetupFragment;
import dc.w;
import p1.e1;
import p1.j;
import p1.k;
import p1.x0;
import pc.l;
import pc.p;
import qc.q;

/* compiled from: Modifier.kt */
/* loaded from: classes.dex */
public interface e {

    /* renamed from: a  reason: collision with root package name */
    public static final a f2335a = a.f2336c;

    /* compiled from: Modifier.kt */
    /* loaded from: classes.dex */
    public static final class a implements e {

        /* renamed from: c  reason: collision with root package name */
        static final /* synthetic */ a f2336c = new a();

        private a() {
        }

        @Override // androidx.compose.ui.e
        public e a(e eVar) {
            q.i(eVar, TaskSetupFragment.TYPE_OTHER);
            return eVar;
        }

        @Override // androidx.compose.ui.e
        public <R> R b(R r10, p<? super R, ? super b, ? extends R> pVar) {
            q.i(pVar, "operation");
            return r10;
        }

        @Override // androidx.compose.ui.e
        public boolean h(l<? super b, Boolean> lVar) {
            q.i(lVar, "predicate");
            return true;
        }

        public String toString() {
            return "Modifier";
        }
    }

    /* compiled from: Modifier.kt */
    /* loaded from: classes.dex */
    public interface b extends e {
    }

    e a(e eVar);

    <R> R b(R r10, p<? super R, ? super b, ? extends R> pVar);

    boolean h(l<? super b, Boolean> lVar);

    /* compiled from: Modifier.kt */
    /* loaded from: classes.dex */
    public static abstract class c implements j {

        /* renamed from: m  reason: collision with root package name */
        private k0 f2338m;

        /* renamed from: p  reason: collision with root package name */
        private int f2339p;

        /* renamed from: r  reason: collision with root package name */
        private c f2341r;

        /* renamed from: s  reason: collision with root package name */
        private c f2342s;

        /* renamed from: t  reason: collision with root package name */
        private e1 f2343t;

        /* renamed from: u  reason: collision with root package name */
        private x0 f2344u;

        /* renamed from: v  reason: collision with root package name */
        private boolean f2345v;

        /* renamed from: w  reason: collision with root package name */
        private boolean f2346w;

        /* renamed from: x  reason: collision with root package name */
        private boolean f2347x;

        /* renamed from: y  reason: collision with root package name */
        private boolean f2348y;

        /* renamed from: z  reason: collision with root package name */
        private boolean f2349z;

        /* renamed from: f  reason: collision with root package name */
        private c f2337f = this;

        /* renamed from: q  reason: collision with root package name */
        private int f2340q = -1;

        public final void A1(c cVar) {
            this.f2342s = cVar;
        }

        public final void B1(boolean z10) {
            this.f2345v = z10;
        }

        public final void C1(int i10) {
            this.f2339p = i10;
        }

        public final void D1(e1 e1Var) {
            this.f2343t = e1Var;
        }

        public final void E1(c cVar) {
            this.f2341r = cVar;
        }

        public final void F1(boolean z10) {
            this.f2346w = z10;
        }

        public final void G1(pc.a<w> aVar) {
            q.i(aVar, "effect");
            k.l(this).t(aVar);
        }

        public void H1(x0 x0Var) {
            this.f2344u = x0Var;
        }

        public final int f1() {
            return this.f2340q;
        }

        public final c g1() {
            return this.f2342s;
        }

        @Override // p1.j
        public final c getNode() {
            return this.f2337f;
        }

        public final x0 h1() {
            return this.f2344u;
        }

        public final k0 i1() {
            k0 k0Var = this.f2338m;
            if (k0Var == null) {
                k0 a10 = l0.a(k.l(this).getCoroutineContext().plus(a2.a((x1) k.l(this).getCoroutineContext().get(x1.f574b))));
                this.f2338m = a10;
                return a10;
            }
            return k0Var;
        }

        public final boolean j1() {
            return this.f2345v;
        }

        public final int k1() {
            return this.f2339p;
        }

        public final e1 l1() {
            return this.f2343t;
        }

        public final c m1() {
            return this.f2341r;
        }

        public boolean n1() {
            return true;
        }

        public final boolean o1() {
            return this.f2346w;
        }

        public final boolean p1() {
            return this.f2349z;
        }

        public void q1() {
            boolean z10;
            if ((!this.f2349z) != false) {
                if (this.f2344u != null) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (z10) {
                    this.f2349z = true;
                    this.f2347x = true;
                    return;
                }
                throw new IllegalStateException("attach invoked on a node without a coordinator".toString());
            }
            throw new IllegalStateException("node attached multiple times".toString());
        }

        public void r1() {
            if (this.f2349z) {
                if ((!this.f2347x) != false) {
                    if ((!this.f2348y) != false) {
                        this.f2349z = false;
                        k0 k0Var = this.f2338m;
                        if (k0Var != null) {
                            l0.c(k0Var, new f());
                            this.f2338m = null;
                            return;
                        }
                        return;
                    }
                    throw new IllegalStateException("Must run runDetachLifecycle() before markAsDetached()".toString());
                }
                throw new IllegalStateException("Must run runAttachLifecycle() before markAsDetached()".toString());
            }
            throw new IllegalStateException("Cannot detach a node that is not attached".toString());
        }

        public void v1() {
            if (this.f2349z) {
                u1();
                return;
            }
            throw new IllegalStateException("Check failed.".toString());
        }

        public void w1() {
            if (this.f2349z) {
                if (this.f2347x) {
                    this.f2347x = false;
                    s1();
                    this.f2348y = true;
                    return;
                }
                throw new IllegalStateException("Must run runAttachLifecycle() only once after markAsAttached()".toString());
            }
            throw new IllegalStateException("Must run markAsAttached() prior to runAttachLifecycle".toString());
        }

        public void x1() {
            boolean z10;
            if (this.f2349z) {
                if (this.f2344u != null) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (z10) {
                    if (this.f2348y) {
                        this.f2348y = false;
                        t1();
                        return;
                    }
                    throw new IllegalStateException("Must run runDetachLifecycle() once after runAttachLifecycle() and before markAsDetached()".toString());
                }
                throw new IllegalStateException("detach invoked on a node without a coordinator".toString());
            }
            throw new IllegalStateException("node detached multiple times".toString());
        }

        public final void y1(int i10) {
            this.f2340q = i10;
        }

        public final void z1(c cVar) {
            q.i(cVar, "owner");
            this.f2337f = cVar;
        }

        public void s1() {
        }

        public void t1() {
        }

        public void u1() {
        }
    }
}
