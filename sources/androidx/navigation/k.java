package androidx.navigation;

import android.os.Bundle;
import androidx.navigation.p;
import ec.s;
import java.util.Iterator;
import java.util.List;

/* compiled from: NavGraphNavigator.kt */
@p.b("navigation")
/* loaded from: classes.dex */
public class k extends p<j> {

    /* renamed from: c  reason: collision with root package name */
    private final q f5335c;

    public k(q qVar) {
        qc.q.i(qVar, "navigatorProvider");
        this.f5335c = qVar;
    }

    private final void m(c cVar, m mVar, p.a aVar) {
        boolean z10;
        i J;
        List<c> d10;
        i e10 = cVar.e();
        qc.q.g(e10, "null cannot be cast to non-null type androidx.navigation.NavGraph");
        j jVar = (j) e10;
        Bundle c10 = cVar.c();
        int P = jVar.P();
        String Q = jVar.Q();
        if (P == 0 && Q == null) {
            z10 = false;
        } else {
            z10 = true;
        }
        if (z10) {
            if (Q != null) {
                J = jVar.M(Q, false);
            } else {
                J = jVar.J(P, false);
            }
            if (J != null) {
                p d11 = this.f5335c.d(J.p());
                d10 = s.d(b().a(J, J.h(c10)));
                d11.e(d10, mVar, aVar);
                return;
            }
            throw new IllegalArgumentException("navigation destination " + jVar.O() + " is not a direct child of this NavGraph");
        }
        throw new IllegalStateException(("no start destination defined via app:startDestination for " + jVar.m()).toString());
    }

    @Override // androidx.navigation.p
    public void e(List<c> list, m mVar, p.a aVar) {
        qc.q.i(list, "entries");
        Iterator<c> it = list.iterator();
        while (it.hasNext()) {
            m(it.next(), mVar, aVar);
        }
    }

    @Override // androidx.navigation.p
    /* renamed from: l  reason: merged with bridge method [inline-methods] */
    public j a() {
        return new j(this);
    }
}
