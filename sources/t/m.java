package t;

import a1.q4;
import a1.z3;
import androidx.compose.ui.e;

/* compiled from: ClipScrollableContainer.kt */
/* loaded from: classes.dex */
public final class m {

    /* renamed from: a  reason: collision with root package name */
    private static final float f23186a = j2.h.j(30);

    /* renamed from: b  reason: collision with root package name */
    private static final androidx.compose.ui.e f23187b;

    /* renamed from: c  reason: collision with root package name */
    private static final androidx.compose.ui.e f23188c;

    /* compiled from: ClipScrollableContainer.kt */
    /* loaded from: classes.dex */
    public static final class a implements q4 {
        a() {
        }

        @Override // a1.q4
        public z3 a(long j10, j2.r rVar, j2.e eVar) {
            qc.q.i(rVar, "layoutDirection");
            qc.q.i(eVar, "density");
            float K0 = eVar.K0(m.b());
            return new z3.b(new z0.h(0.0f, -K0, z0.l.i(j10), z0.l.g(j10) + K0));
        }
    }

    /* compiled from: ClipScrollableContainer.kt */
    /* loaded from: classes.dex */
    public static final class b implements q4 {
        b() {
        }

        @Override // a1.q4
        public z3 a(long j10, j2.r rVar, j2.e eVar) {
            qc.q.i(rVar, "layoutDirection");
            qc.q.i(eVar, "density");
            float K0 = eVar.K0(m.b());
            return new z3.b(new z0.h(-K0, 0.0f, z0.l.i(j10) + K0, z0.l.g(j10)));
        }
    }

    static {
        e.a aVar = androidx.compose.ui.e.f2335a;
        f23187b = x0.e.a(aVar, new a());
        f23188c = x0.e.a(aVar, new b());
    }

    public static final androidx.compose.ui.e a(androidx.compose.ui.e eVar, u.o oVar) {
        androidx.compose.ui.e eVar2;
        qc.q.i(eVar, "<this>");
        qc.q.i(oVar, "orientation");
        if (oVar == u.o.Vertical) {
            eVar2 = f23188c;
        } else {
            eVar2 = f23187b;
        }
        return eVar.a(eVar2);
    }

    public static final float b() {
        return f23186a;
    }
}
