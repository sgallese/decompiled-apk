package j0;

import ad.x1;
import java.util.Arrays;
import kotlin.coroutines.Continuation;

/* compiled from: Effects.kt */
/* loaded from: classes.dex */
public final class h0 {

    /* renamed from: a  reason: collision with root package name */
    private static final f0 f18647a = new f0();

    public static final void a(Object obj, Object obj2, pc.l<? super f0, ? extends e0> lVar, l lVar2, int i10) {
        qc.q.i(lVar, "effect");
        lVar2.e(1429097729);
        if (n.K()) {
            n.V(1429097729, i10, -1, "androidx.compose.runtime.DisposableEffect (Effects.kt:190)");
        }
        lVar2.e(511388516);
        boolean Q = lVar2.Q(obj) | lVar2.Q(obj2);
        Object f10 = lVar2.f();
        if (Q || f10 == l.f18688a.a()) {
            lVar2.J(new d0(lVar));
        }
        lVar2.N();
        if (n.K()) {
            n.U();
        }
        lVar2.N();
    }

    public static final void b(Object obj, pc.l<? super f0, ? extends e0> lVar, l lVar2, int i10) {
        qc.q.i(lVar, "effect");
        lVar2.e(-1371986847);
        if (n.K()) {
            n.V(-1371986847, i10, -1, "androidx.compose.runtime.DisposableEffect (Effects.kt:151)");
        }
        lVar2.e(1157296644);
        boolean Q = lVar2.Q(obj);
        Object f10 = lVar2.f();
        if (Q || f10 == l.f18688a.a()) {
            lVar2.J(new d0(lVar));
        }
        lVar2.N();
        if (n.K()) {
            n.U();
        }
        lVar2.N();
    }

    public static final void c(Object obj, Object obj2, pc.p<? super ad.k0, ? super Continuation<? super dc.w>, ? extends Object> pVar, l lVar, int i10) {
        qc.q.i(pVar, "block");
        lVar.e(590241125);
        if (n.K()) {
            n.V(590241125, i10, -1, "androidx.compose.runtime.LaunchedEffect (Effects.kt:355)");
        }
        hc.f D = lVar.D();
        lVar.e(511388516);
        boolean Q = lVar.Q(obj) | lVar.Q(obj2);
        Object f10 = lVar.f();
        if (Q || f10 == l.f18688a.a()) {
            lVar.J(new t0(D, pVar));
        }
        lVar.N();
        if (n.K()) {
            n.U();
        }
        lVar.N();
    }

    public static final void d(Object obj, pc.p<? super ad.k0, ? super Continuation<? super dc.w>, ? extends Object> pVar, l lVar, int i10) {
        qc.q.i(pVar, "block");
        lVar.e(1179185413);
        if (n.K()) {
            n.V(1179185413, i10, -1, "androidx.compose.runtime.LaunchedEffect (Effects.kt:333)");
        }
        hc.f D = lVar.D();
        lVar.e(1157296644);
        boolean Q = lVar.Q(obj);
        Object f10 = lVar.f();
        if (Q || f10 == l.f18688a.a()) {
            lVar.J(new t0(D, pVar));
        }
        lVar.N();
        if (n.K()) {
            n.U();
        }
        lVar.N();
    }

    public static final void e(Object[] objArr, pc.p<? super ad.k0, ? super Continuation<? super dc.w>, ? extends Object> pVar, l lVar, int i10) {
        qc.q.i(objArr, "keys");
        qc.q.i(pVar, "block");
        lVar.e(-139560008);
        if (n.K()) {
            n.V(-139560008, i10, -1, "androidx.compose.runtime.LaunchedEffect (Effects.kt:413)");
        }
        hc.f D = lVar.D();
        Object[] copyOf = Arrays.copyOf(objArr, objArr.length);
        lVar.e(-568225417);
        boolean z10 = false;
        for (Object obj : copyOf) {
            z10 |= lVar.Q(obj);
        }
        Object f10 = lVar.f();
        if (z10 || f10 == l.f18688a.a()) {
            lVar.J(new t0(D, pVar));
        }
        lVar.N();
        if (n.K()) {
            n.U();
        }
        lVar.N();
    }

    public static final void f(pc.a<dc.w> aVar, l lVar, int i10) {
        qc.q.i(aVar, "effect");
        lVar.e(-1288466761);
        if (n.K()) {
            n.V(-1288466761, i10, -1, "androidx.compose.runtime.SideEffect (Effects.kt:45)");
        }
        lVar.h(aVar);
        if (n.K()) {
            n.U();
        }
        lVar.N();
    }

    public static final ad.k0 h(hc.f fVar, l lVar) {
        ad.y b10;
        qc.q.i(fVar, "coroutineContext");
        qc.q.i(lVar, "composer");
        x1.b bVar = ad.x1.f574b;
        if (fVar.get(bVar) != null) {
            b10 = ad.c2.b(null, 1, null);
            b10.f0(new IllegalArgumentException("CoroutineContext supplied to rememberCoroutineScope may not include a parent job"));
            return ad.l0.a(b10);
        }
        hc.f D = lVar.D();
        return ad.l0.a(D.plus(ad.a2.a((ad.x1) D.get(bVar))).plus(fVar));
    }
}
