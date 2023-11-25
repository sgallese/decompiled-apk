package androidx.paging;

import androidx.paging.q0;
import com.habitrpg.android.habitica.ui.activities.TaskFormActivity;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* compiled from: MutableCombinedLoadStateCollection.kt */
/* loaded from: classes.dex */
public final class x0 {

    /* renamed from: a  reason: collision with root package name */
    private final CopyOnWriteArrayList<pc.l<j, dc.w>> f6180a = new CopyOnWriteArrayList<>();

    /* renamed from: b  reason: collision with root package name */
    private final dd.x<j> f6181b;

    /* renamed from: c  reason: collision with root package name */
    private final dd.l0<j> f6182c;

    /* compiled from: MutableCombinedLoadStateCollection.kt */
    /* loaded from: classes.dex */
    static final class a extends qc.r implements pc.l<j, j> {

        /* renamed from: m  reason: collision with root package name */
        final /* synthetic */ s0 f6184m;

        /* renamed from: p  reason: collision with root package name */
        final /* synthetic */ s0 f6185p;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(s0 s0Var, s0 s0Var2) {
            super(1);
            this.f6184m = s0Var;
            this.f6185p = s0Var2;
        }

        @Override // pc.l
        /* renamed from: a  reason: merged with bridge method [inline-methods] */
        public final j invoke(j jVar) {
            return x0.this.c(jVar, this.f6184m, this.f6185p);
        }
    }

    /* compiled from: MutableCombinedLoadStateCollection.kt */
    /* loaded from: classes.dex */
    static final class b extends qc.r implements pc.l<j, j> {

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ boolean f6186f;

        /* renamed from: m  reason: collision with root package name */
        final /* synthetic */ t0 f6187m;

        /* renamed from: p  reason: collision with root package name */
        final /* synthetic */ q0 f6188p;

        /* renamed from: q  reason: collision with root package name */
        final /* synthetic */ x0 f6189q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(boolean z10, t0 t0Var, q0 q0Var, x0 x0Var) {
            super(1);
            this.f6186f = z10;
            this.f6187m = t0Var;
            this.f6188p = q0Var;
            this.f6189q = x0Var;
        }

        @Override // pc.l
        /* renamed from: a  reason: merged with bridge method [inline-methods] */
        public final j invoke(j jVar) {
            s0 a10;
            s0 a11;
            if (jVar == null || (a10 = jVar.e()) == null) {
                a10 = s0.f6032d.a();
            }
            if (jVar == null || (a11 = jVar.b()) == null) {
                a11 = s0.f6032d.a();
            }
            if (this.f6186f) {
                a11 = a11.g(this.f6187m, this.f6188p);
            } else {
                a10 = a10.g(this.f6187m, this.f6188p);
            }
            return this.f6189q.c(jVar, a10, a11);
        }
    }

    public x0() {
        dd.x<j> a10 = dd.n0.a(null);
        this.f6181b = a10;
        this.f6182c = dd.i.b(a10);
    }

    private final q0 b(q0 q0Var, q0 q0Var2, q0 q0Var3, q0 q0Var4) {
        if (q0Var4 == null) {
            return q0Var3;
        }
        if (!(q0Var instanceof q0.b) || (((q0Var2 instanceof q0.c) && (q0Var4 instanceof q0.c)) || (q0Var4 instanceof q0.a))) {
            return q0Var4;
        }
        return q0Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final j c(j jVar, s0 s0Var, s0 s0Var2) {
        q0 b10;
        q0 q0Var;
        q0 b11;
        q0 q0Var2;
        q0 b12;
        if (jVar == null || (b10 = jVar.d()) == null) {
            b10 = q0.c.f6001b.b();
        }
        q0 f10 = s0Var.f();
        q0 f11 = s0Var.f();
        q0 q0Var3 = null;
        if (s0Var2 != null) {
            q0Var = s0Var2.f();
        } else {
            q0Var = null;
        }
        q0 b13 = b(b10, f10, f11, q0Var);
        if (jVar == null || (b11 = jVar.c()) == null) {
            b11 = q0.c.f6001b.b();
        }
        q0 f12 = s0Var.f();
        q0 e10 = s0Var.e();
        if (s0Var2 != null) {
            q0Var2 = s0Var2.e();
        } else {
            q0Var2 = null;
        }
        q0 b14 = b(b11, f12, e10, q0Var2);
        if (jVar == null || (b12 = jVar.a()) == null) {
            b12 = q0.c.f6001b.b();
        }
        q0 f13 = s0Var.f();
        q0 d10 = s0Var.d();
        if (s0Var2 != null) {
            q0Var3 = s0Var2.d();
        }
        return new j(b13, b14, b(b12, f13, d10, q0Var3), s0Var, s0Var2);
    }

    private final void d(pc.l<? super j, j> lVar) {
        j value;
        j invoke;
        dd.x<j> xVar = this.f6181b;
        do {
            value = xVar.getValue();
            j jVar = value;
            invoke = lVar.invoke(jVar);
            if (qc.q.d(jVar, invoke)) {
                return;
            }
        } while (!xVar.b(value, invoke));
        if (invoke != null) {
            Iterator<T> it = this.f6180a.iterator();
            while (it.hasNext()) {
                ((pc.l) it.next()).invoke(invoke);
            }
        }
    }

    public final dd.l0<j> e() {
        return this.f6182c;
    }

    public final void f(s0 s0Var, s0 s0Var2) {
        qc.q.i(s0Var, "sourceLoadStates");
        d(new a(s0Var, s0Var2));
    }

    public final void g(t0 t0Var, boolean z10, q0 q0Var) {
        qc.q.i(t0Var, TaskFormActivity.TASK_TYPE_KEY);
        qc.q.i(q0Var, "state");
        d(new b(z10, t0Var, q0Var, this));
    }
}
