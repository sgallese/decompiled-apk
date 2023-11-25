package d1;

import a1.q1;
import a1.q3;
import a1.t3;
import c1.e;
import c1.f;
import j2.l;
import j2.p;
import qc.h;
import qc.q;

/* compiled from: BitmapPainter.kt */
/* loaded from: classes.dex */
public final class a extends c {

    /* renamed from: t  reason: collision with root package name */
    private final t3 f13050t;

    /* renamed from: u  reason: collision with root package name */
    private final long f13051u;

    /* renamed from: v  reason: collision with root package name */
    private final long f13052v;

    /* renamed from: w  reason: collision with root package name */
    private int f13053w;

    /* renamed from: x  reason: collision with root package name */
    private final long f13054x;

    /* renamed from: y  reason: collision with root package name */
    private float f13055y;

    /* renamed from: z  reason: collision with root package name */
    private q1 f13056z;

    public /* synthetic */ a(t3 t3Var, long j10, long j11, h hVar) {
        this(t3Var, j10, j11);
    }

    private final long o(long j10, long j11) {
        boolean z10;
        if (l.j(j10) >= 0 && l.k(j10) >= 0 && p.g(j11) >= 0 && p.f(j11) >= 0 && p.g(j11) <= this.f13050t.getWidth() && p.f(j11) <= this.f13050t.getHeight()) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            return j11;
        }
        throw new IllegalArgumentException("Failed requirement.".toString());
    }

    @Override // d1.c
    protected boolean a(float f10) {
        this.f13055y = f10;
        return true;
    }

    @Override // d1.c
    protected boolean e(q1 q1Var) {
        this.f13056z = q1Var;
        return true;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        if (q.d(this.f13050t, aVar.f13050t) && l.i(this.f13051u, aVar.f13051u) && p.e(this.f13052v, aVar.f13052v) && q3.d(this.f13053w, aVar.f13053w)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return (((((this.f13050t.hashCode() * 31) + l.l(this.f13051u)) * 31) + p.h(this.f13052v)) * 31) + q3.e(this.f13053w);
    }

    @Override // d1.c
    public long k() {
        return j2.q.c(this.f13054x);
    }

    @Override // d1.c
    protected void m(f fVar) {
        int d10;
        int d11;
        q.i(fVar, "<this>");
        t3 t3Var = this.f13050t;
        long j10 = this.f13051u;
        long j11 = this.f13052v;
        d10 = sc.c.d(z0.l.i(fVar.b()));
        d11 = sc.c.d(z0.l.g(fVar.b()));
        e.g(fVar, t3Var, j10, j11, 0L, j2.q.a(d10, d11), this.f13055y, null, this.f13056z, 0, this.f13053w, 328, null);
    }

    public final void n(int i10) {
        this.f13053w = i10;
    }

    public String toString() {
        return "BitmapPainter(image=" + this.f13050t + ", srcOffset=" + ((Object) l.m(this.f13051u)) + ", srcSize=" + ((Object) p.i(this.f13052v)) + ", filterQuality=" + ((Object) q3.f(this.f13053w)) + ')';
    }

    public /* synthetic */ a(t3 t3Var, long j10, long j11, int i10, h hVar) {
        this(t3Var, (i10 & 2) != 0 ? l.f18992b.a() : j10, (i10 & 4) != 0 ? j2.q.a(t3Var.getWidth(), t3Var.getHeight()) : j11, null);
    }

    private a(t3 t3Var, long j10, long j11) {
        q.i(t3Var, "image");
        this.f13050t = t3Var;
        this.f13051u = j10;
        this.f13052v = j11;
        this.f13053w = q3.f165a.a();
        this.f13054x = o(j10, j11);
        this.f13055y = 1.0f;
    }
}
