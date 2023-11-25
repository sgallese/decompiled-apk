package androidx.compose.ui.node;

import androidx.compose.ui.e;
import k0.f;
import p1.u0;
import pc.l;
import qc.q;
import qc.r;

/* compiled from: NodeChain.kt */
/* loaded from: classes.dex */
public final class b {

    /* renamed from: a */
    private static final a f2489a;

    /* compiled from: NodeChain.kt */
    /* loaded from: classes.dex */
    public static final class a extends e.c {
        a() {
        }

        public String toString() {
            return "<Head>";
        }
    }

    /* compiled from: NodeChain.kt */
    /* renamed from: androidx.compose.ui.node.b$b */
    /* loaded from: classes.dex */
    public static final class C0036b extends r implements l<e.b, Boolean> {

        /* renamed from: f */
        final /* synthetic */ f<e.b> f2490f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C0036b(f<e.b> fVar) {
            super(1);
            this.f2490f = fVar;
        }

        @Override // pc.l
        /* renamed from: a */
        public final Boolean invoke(e.b bVar) {
            q.i(bVar, "it");
            this.f2490f.d(bVar);
            return Boolean.TRUE;
        }
    }

    static {
        a aVar = new a();
        aVar.y1(-1);
        f2489a = aVar;
    }

    public static final /* synthetic */ f a(e eVar, f fVar) {
        return e(eVar, fVar);
    }

    public static final /* synthetic */ a b() {
        return f2489a;
    }

    public static final /* synthetic */ void c(u0 u0Var, e.c cVar) {
        f(u0Var, cVar);
    }

    public static final int d(e.b bVar, e.b bVar2) {
        q.i(bVar, "prev");
        q.i(bVar2, "next");
        if (q.d(bVar, bVar2)) {
            return 2;
        }
        if (!v0.a.a(bVar, bVar2) && (!(bVar instanceof ForceUpdateElement) || !v0.a.a(((ForceUpdateElement) bVar).v(), bVar2))) {
            return 0;
        }
        return 1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final f<e.b> e(e eVar, f<e.b> fVar) {
        int d10;
        d10 = vc.l.d(fVar.o(), 16);
        f fVar2 = new f(new e[d10], 0);
        fVar2.d(eVar);
        while (fVar2.s()) {
            e eVar2 = (e) fVar2.x(fVar2.o() - 1);
            if (eVar2 instanceof androidx.compose.ui.a) {
                androidx.compose.ui.a aVar = (androidx.compose.ui.a) eVar2;
                fVar2.d(aVar.e());
                fVar2.d(aVar.m());
            } else if (eVar2 instanceof e.b) {
                fVar.d(eVar2);
            } else {
                eVar2.h(new C0036b(fVar));
            }
        }
        return fVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <T extends e.c> void f(u0<T> u0Var, e.c cVar) {
        q.g(cVar, "null cannot be cast to non-null type T of androidx.compose.ui.node.NodeChainKt.updateUnsafe");
        u0Var.m(cVar);
    }
}
