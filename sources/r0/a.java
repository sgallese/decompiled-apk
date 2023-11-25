package r0;

import androidx.compose.ui.platform.j0;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.g0;
import androidx.lifecycle.v;
import j0.d3;
import j0.e0;
import j0.f0;
import j0.g3;
import j0.h0;
import j0.j1;
import j0.n;
import pc.l;
import qc.q;
import qc.r;

/* compiled from: LiveDataAdapter.kt */
/* loaded from: classes.dex */
public final class a {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: LiveDataAdapter.kt */
    /* renamed from: r0.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static final class C0495a extends r implements l<f0, e0> {

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ LiveData<T> f22054f;

        /* renamed from: m  reason: collision with root package name */
        final /* synthetic */ v f22055m;

        /* renamed from: p  reason: collision with root package name */
        final /* synthetic */ j1<R> f22056p;

        /* compiled from: Effects.kt */
        /* renamed from: r0.a$a$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static final class C0496a implements e0 {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ LiveData f22057a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ g0 f22058b;

            public C0496a(LiveData liveData, g0 g0Var) {
                this.f22057a = liveData;
                this.f22058b = g0Var;
            }

            @Override // j0.e0
            public void dispose() {
                this.f22057a.o(this.f22058b);
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* JADX INFO: Add missing generic type declarations: [T] */
        /* compiled from: LiveDataAdapter.kt */
        /* renamed from: r0.a$a$b */
        /* loaded from: classes.dex */
        public static final class b<T> implements g0<T> {

            /* renamed from: f  reason: collision with root package name */
            final /* synthetic */ j1<R> f22059f;

            b(j1<R> j1Var) {
                this.f22059f = j1Var;
            }

            @Override // androidx.lifecycle.g0
            public final void onChanged(T t10) {
                this.f22059f.setValue(t10);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C0495a(LiveData<T> liveData, v vVar, j1<R> j1Var) {
            super(1);
            this.f22054f = liveData;
            this.f22055m = vVar;
            this.f22056p = j1Var;
        }

        @Override // pc.l
        public final e0 invoke(f0 f0Var) {
            q.i(f0Var, "$this$DisposableEffect");
            b bVar = new b(this.f22056p);
            this.f22054f.j(this.f22055m, bVar);
            return new C0496a(this.f22054f, bVar);
        }
    }

    public static final <T> g3<T> a(LiveData<T> liveData, j0.l lVar, int i10) {
        q.i(liveData, "<this>");
        lVar.e(-2027206144);
        if (n.K()) {
            n.V(-2027206144, i10, -1, "androidx.compose.runtime.livedata.observeAsState (LiveDataAdapter.kt:40)");
        }
        g3<T> b10 = b(liveData, liveData.f(), lVar, 8);
        if (n.K()) {
            n.U();
        }
        lVar.N();
        return b10;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <R, T extends R> g3<R> b(LiveData<T> liveData, R r10, j0.l lVar, int i10) {
        q.i(liveData, "<this>");
        lVar.e(411178300);
        if (n.K()) {
            n.V(411178300, i10, -1, "androidx.compose.runtime.livedata.observeAsState (LiveDataAdapter.kt:57)");
        }
        v vVar = (v) lVar.C(j0.i());
        lVar.e(-492369756);
        Object f10 = lVar.f();
        if (f10 == j0.l.f18688a.a()) {
            R r11 = r10;
            if (liveData.i()) {
                r11 = liveData.f();
            }
            f10 = d3.e(r11, null, 2, null);
            lVar.J(f10);
        }
        lVar.N();
        j1 j1Var = (j1) f10;
        h0.a(liveData, vVar, new C0495a(liveData, vVar, j1Var), lVar, 72);
        if (n.K()) {
            n.U();
        }
        lVar.N();
        return j1Var;
    }
}
