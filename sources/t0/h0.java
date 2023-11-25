package t0;

import java.util.concurrent.atomic.AtomicReference;
import kotlin.KotlinNothingValueException;

/* compiled from: Snapshot.kt */
/* loaded from: classes.dex */
public final class h0 extends g {

    /* renamed from: g  reason: collision with root package name */
    private final g f23310g;

    /* renamed from: h  reason: collision with root package name */
    private final boolean f23311h;

    /* renamed from: i  reason: collision with root package name */
    private final boolean f23312i;

    /* renamed from: j  reason: collision with root package name */
    private final pc.l<Object, dc.w> f23313j;

    /* renamed from: k  reason: collision with root package name */
    private final pc.l<Object, dc.w> f23314k;

    /* renamed from: l  reason: collision with root package name */
    private final g f23315l;

    public h0(g gVar, pc.l<Object, dc.w> lVar, boolean z10, boolean z11) {
        super(0, j.f23321r.a(), null);
        AtomicReference atomicReference;
        pc.l<Object, dc.w> h10;
        pc.l<Object, dc.w> I;
        this.f23310g = gVar;
        this.f23311h = z10;
        this.f23312i = z11;
        if (gVar == null || (h10 = gVar.h()) == null) {
            atomicReference = l.f23342j;
            h10 = ((androidx.compose.runtime.snapshots.a) atomicReference.get()).h();
        }
        I = l.I(lVar, h10, z10);
        this.f23313j = I;
        this.f23315l = this;
    }

    private final g A() {
        AtomicReference atomicReference;
        g gVar = this.f23310g;
        if (gVar == null) {
            atomicReference = l.f23342j;
            Object obj = atomicReference.get();
            qc.q.h(obj, "currentGlobalSnapshot.get()");
            return (g) obj;
        }
        return gVar;
    }

    @Override // t0.g
    /* renamed from: B  reason: merged with bridge method [inline-methods] */
    public Void m(g gVar) {
        qc.q.i(gVar, "snapshot");
        u.b();
        throw new KotlinNothingValueException();
    }

    @Override // t0.g
    /* renamed from: C  reason: merged with bridge method [inline-methods] */
    public Void n(g gVar) {
        qc.q.i(gVar, "snapshot");
        u.b();
        throw new KotlinNothingValueException();
    }

    @Override // t0.g
    public void d() {
        g gVar;
        t(true);
        if (this.f23312i && (gVar = this.f23310g) != null) {
            gVar.d();
        }
    }

    @Override // t0.g
    public int f() {
        return A().f();
    }

    @Override // t0.g
    public j g() {
        return A().g();
    }

    @Override // t0.g
    public pc.l<Object, dc.w> h() {
        return this.f23313j;
    }

    @Override // t0.g
    public boolean i() {
        return A().i();
    }

    @Override // t0.g
    public pc.l<Object, dc.w> k() {
        return this.f23314k;
    }

    @Override // t0.g
    public void o() {
        A().o();
    }

    @Override // t0.g
    public void p(d0 d0Var) {
        qc.q.i(d0Var, "state");
        A().p(d0Var);
    }

    @Override // t0.g
    public g x(pc.l<Object, dc.w> lVar) {
        g B;
        pc.l<Object, dc.w> J = l.J(lVar, h(), false, 4, null);
        if (!this.f23311h) {
            B = l.B(A().x(null), J, true);
            return B;
        }
        return A().x(J);
    }
}
