package a1;

/* compiled from: Brush.kt */
/* loaded from: classes.dex */
public final class r4 extends e1 {

    /* renamed from: c  reason: collision with root package name */
    private final long f183c;

    public /* synthetic */ r4(long j10, qc.h hVar) {
        this(j10);
    }

    @Override // a1.e1
    public void a(long j10, b4 b4Var, float f10) {
        boolean z10;
        long j11;
        qc.q.i(b4Var, "p");
        b4Var.c(1.0f);
        if (f10 == 1.0f) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z10) {
            long j12 = this.f183c;
            j11 = p1.o(j12, p1.r(j12) * f10, 0.0f, 0.0f, 0.0f, 14, null);
        } else {
            j11 = this.f183c;
        }
        b4Var.v(j11);
        if (b4Var.n() != null) {
            b4Var.m(null);
        }
    }

    public final long b() {
        return this.f183c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof r4) && p1.q(this.f183c, ((r4) obj).f183c)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return p1.w(this.f183c);
    }

    public String toString() {
        return "SolidColor(value=" + ((Object) p1.x(this.f183c)) + ')';
    }

    private r4(long j10) {
        super(null);
        this.f183c = j10;
    }
}
