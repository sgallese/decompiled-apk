package t0;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.KotlinNothingValueException;

/* compiled from: Snapshot.kt */
/* loaded from: classes.dex */
public final class g0 extends b {

    /* renamed from: s  reason: collision with root package name */
    private final b f23305s;

    /* renamed from: t  reason: collision with root package name */
    private final boolean f23306t;

    /* renamed from: u  reason: collision with root package name */
    private final boolean f23307u;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public g0(t0.b r3, pc.l<java.lang.Object, dc.w> r4, pc.l<java.lang.Object, dc.w> r5, boolean r6, boolean r7) {
        /*
            r2 = this;
            t0.j$a r0 = t0.j.f23321r
            t0.j r0 = r0.a()
            if (r3 == 0) goto Le
            pc.l r1 = r3.h()
            if (r1 != 0) goto L1c
        Le:
            java.util.concurrent.atomic.AtomicReference r1 = t0.l.f()
            java.lang.Object r1 = r1.get()
            androidx.compose.runtime.snapshots.a r1 = (androidx.compose.runtime.snapshots.a) r1
            pc.l r1 = r1.h()
        L1c:
            pc.l r4 = t0.l.l(r4, r1, r6)
            if (r3 == 0) goto L28
            pc.l r1 = r3.k()
            if (r1 != 0) goto L36
        L28:
            java.util.concurrent.atomic.AtomicReference r1 = t0.l.f()
            java.lang.Object r1 = r1.get()
            androidx.compose.runtime.snapshots.a r1 = (androidx.compose.runtime.snapshots.a) r1
            pc.l r1 = r1.k()
        L36:
            pc.l r5 = t0.l.m(r5, r1)
            r1 = 0
            r2.<init>(r1, r0, r4, r5)
            r2.f23305s = r3
            r2.f23306t = r6
            r2.f23307u = r7
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: t0.g0.<init>(t0.b, pc.l, pc.l, boolean, boolean):void");
    }

    private final b S() {
        AtomicReference atomicReference;
        b bVar = this.f23305s;
        if (bVar == null) {
            atomicReference = l.f23342j;
            Object obj = atomicReference.get();
            qc.q.h(obj, "currentGlobalSnapshot.get()");
            return (b) obj;
        }
        return bVar;
    }

    @Override // t0.b
    public h C() {
        return S().C();
    }

    @Override // t0.b
    public k0.c<d0> E() {
        return S().E();
    }

    @Override // t0.b
    public void O(k0.c<d0> cVar) {
        u.b();
        throw new KotlinNothingValueException();
    }

    @Override // t0.b
    public b P(pc.l<Object, dc.w> lVar, pc.l<Object, dc.w> lVar2) {
        pc.l<Object, dc.w> K;
        pc.l<Object, dc.w> J = l.J(lVar, h(), false, 4, null);
        K = l.K(lVar2, k());
        if (!this.f23306t) {
            return new g0(S().P(null, K), J, K, false, true);
        }
        return S().P(J, K);
    }

    @Override // t0.b, t0.g
    /* renamed from: T  reason: merged with bridge method [inline-methods] */
    public Void m(g gVar) {
        qc.q.i(gVar, "snapshot");
        u.b();
        throw new KotlinNothingValueException();
    }

    @Override // t0.b, t0.g
    /* renamed from: U  reason: merged with bridge method [inline-methods] */
    public Void n(g gVar) {
        qc.q.i(gVar, "snapshot");
        u.b();
        throw new KotlinNothingValueException();
    }

    @Override // t0.b, t0.g
    public void d() {
        b bVar;
        t(true);
        if (this.f23307u && (bVar = this.f23305s) != null) {
            bVar.d();
        }
    }

    @Override // t0.g
    public int f() {
        return S().f();
    }

    @Override // t0.g
    public j g() {
        return S().g();
    }

    @Override // t0.b, t0.g
    public boolean i() {
        return S().i();
    }

    @Override // t0.b, t0.g
    public int j() {
        return S().j();
    }

    @Override // t0.b, t0.g
    public void o() {
        S().o();
    }

    @Override // t0.b, t0.g
    public void p(d0 d0Var) {
        qc.q.i(d0Var, "state");
        S().p(d0Var);
    }

    @Override // t0.g
    public void u(int i10) {
        u.b();
        throw new KotlinNothingValueException();
    }

    @Override // t0.g
    public void v(j jVar) {
        qc.q.i(jVar, AppMeasurementSdk.ConditionalUserProperty.VALUE);
        u.b();
        throw new KotlinNothingValueException();
    }

    @Override // t0.b, t0.g
    public void w(int i10) {
        S().w(i10);
    }

    @Override // t0.b, t0.g
    public g x(pc.l<Object, dc.w> lVar) {
        g B;
        pc.l<Object, dc.w> J = l.J(lVar, h(), false, 4, null);
        if (!this.f23306t) {
            B = l.B(S().x(null), J, true);
            return B;
        }
        return S().x(J);
    }
}
