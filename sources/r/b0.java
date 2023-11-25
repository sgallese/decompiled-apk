package r;

/* compiled from: EnterExitTransition.kt */
/* loaded from: classes.dex */
public final class b0 {

    /* renamed from: a  reason: collision with root package name */
    private final float f21845a;

    /* renamed from: b  reason: collision with root package name */
    private final long f21846b;

    /* renamed from: c  reason: collision with root package name */
    private final s.e0<Float> f21847c;

    public /* synthetic */ b0(float f10, long j10, s.e0 e0Var, qc.h hVar) {
        this(f10, j10, e0Var);
    }

    public final s.e0<Float> a() {
        return this.f21847c;
    }

    public final float b() {
        return this.f21845a;
    }

    public final long c() {
        return this.f21846b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b0)) {
            return false;
        }
        b0 b0Var = (b0) obj;
        if (Float.compare(this.f21845a, b0Var.f21845a) == 0 && androidx.compose.ui.graphics.g.e(this.f21846b, b0Var.f21846b) && qc.q.d(this.f21847c, b0Var.f21847c)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return (((Float.floatToIntBits(this.f21845a) * 31) + androidx.compose.ui.graphics.g.h(this.f21846b)) * 31) + this.f21847c.hashCode();
    }

    public String toString() {
        return "Scale(scale=" + this.f21845a + ", transformOrigin=" + ((Object) androidx.compose.ui.graphics.g.i(this.f21846b)) + ", animationSpec=" + this.f21847c + ')';
    }

    private b0(float f10, long j10, s.e0<Float> e0Var) {
        qc.q.i(e0Var, "animationSpec");
        this.f21845a = f10;
        this.f21846b = j10;
        this.f21847c = e0Var;
    }
}
