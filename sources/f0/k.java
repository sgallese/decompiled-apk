package f0;

import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import com.habitrpg.android.habitica.ui.fragments.setup.TaskSetupFragment;

/* compiled from: Colors.kt */
/* loaded from: classes.dex */
public final class k {

    /* renamed from: a  reason: collision with root package name */
    private static final j0.v1<j> f14817a = j0.u.d(a.f14818f);

    /* compiled from: Colors.kt */
    /* loaded from: classes.dex */
    static final class a extends qc.r implements pc.a<j> {

        /* renamed from: f  reason: collision with root package name */
        public static final a f14818f = new a();

        a() {
            super(0);
        }

        @Override // pc.a
        /* renamed from: a  reason: merged with bridge method [inline-methods] */
        public final j invoke() {
            return k.f(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 4095, null);
        }
    }

    public static final long a(j jVar, long j10) {
        qc.q.i(jVar, "$this$contentColorFor");
        if (a1.p1.q(j10, jVar.j())) {
            return jVar.g();
        }
        if (a1.p1.q(j10, jVar.k())) {
            return jVar.g();
        }
        if (a1.p1.q(j10, jVar.l())) {
            return jVar.h();
        }
        if (a1.p1.q(j10, jVar.m())) {
            return jVar.h();
        }
        if (a1.p1.q(j10, jVar.c())) {
            return jVar.e();
        }
        if (a1.p1.q(j10, jVar.n())) {
            return jVar.i();
        }
        if (a1.p1.q(j10, jVar.d())) {
            return jVar.f();
        }
        return a1.p1.f146b.e();
    }

    public static final long b(long j10, j0.l lVar, int i10) {
        boolean z10;
        if (j0.n.K()) {
            j0.n.V(441849991, i10, -1, "androidx.compose.material.contentColorFor (Colors.kt:295)");
        }
        long a10 = a(s0.f15068a.a(lVar, 6), j10);
        if (a10 != a1.p1.f146b.e()) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z10) {
            a10 = ((a1.p1) lVar.C(p.a())).y();
        }
        if (j0.n.K()) {
            j0.n.U();
        }
        return a10;
    }

    public static final j c(long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j20, long j21) {
        return new j(j10, j11, j12, j13, j14, j15, j16, j17, j18, j19, j20, j21, false, null);
    }

    public static final j0.v1<j> d() {
        return f14817a;
    }

    public static final j e(long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j20, long j21) {
        return new j(j10, j11, j12, j13, j14, j15, j16, j17, j18, j19, j20, j21, true, null);
    }

    public static /* synthetic */ j f(long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j20, long j21, int i10, Object obj) {
        return e((i10 & 1) != 0 ? a1.r1.d(4284612846L) : j10, (i10 & 2) != 0 ? a1.r1.d(4281794739L) : j11, (i10 & 4) != 0 ? a1.r1.d(4278442694L) : j12, (i10 & 8) != 0 ? a1.r1.d(4278290310L) : j13, (i10 & 16) != 0 ? a1.p1.f146b.f() : j14, (i10 & 32) != 0 ? a1.p1.f146b.f() : j15, (i10 & 64) != 0 ? a1.r1.d(4289724448L) : j16, (i10 & 128) != 0 ? a1.p1.f146b.f() : j17, (i10 & UserVerificationMethods.USER_VERIFY_HANDPRINT) != 0 ? a1.p1.f146b.a() : j18, (i10 & 512) != 0 ? a1.p1.f146b.a() : j19, (i10 & UserVerificationMethods.USER_VERIFY_ALL) != 0 ? a1.p1.f146b.a() : j20, (i10 & RecyclerView.m.FLAG_MOVED) != 0 ? a1.p1.f146b.f() : j21);
    }

    public static final void g(j jVar, j jVar2) {
        qc.q.i(jVar, "<this>");
        qc.q.i(jVar2, TaskSetupFragment.TYPE_OTHER);
        jVar.x(jVar2.j());
        jVar.y(jVar2.k());
        jVar.z(jVar2.l());
        jVar.A(jVar2.m());
        jVar.p(jVar2.c());
        jVar.B(jVar2.n());
        jVar.q(jVar2.d());
        jVar.u(jVar2.g());
        jVar.v(jVar2.h());
        jVar.s(jVar2.e());
        jVar.w(jVar2.i());
        jVar.t(jVar2.f());
        jVar.r(jVar2.o());
    }
}
