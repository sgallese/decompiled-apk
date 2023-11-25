package r;

/* compiled from: EnterExitTransition.kt */
/* loaded from: classes.dex */
public final class w {

    /* renamed from: a  reason: collision with root package name */
    private final float f22045a;

    /* renamed from: b  reason: collision with root package name */
    private final s.e0<Float> f22046b;

    public w(float f10, s.e0<Float> e0Var) {
        qc.q.i(e0Var, "animationSpec");
        this.f22045a = f10;
        this.f22046b = e0Var;
    }

    public final float a() {
        return this.f22045a;
    }

    public final s.e0<Float> b() {
        return this.f22046b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w)) {
            return false;
        }
        w wVar = (w) obj;
        if (Float.compare(this.f22045a, wVar.f22045a) == 0 && qc.q.d(this.f22046b, wVar.f22046b)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return (Float.floatToIntBits(this.f22045a) * 31) + this.f22046b.hashCode();
    }

    public String toString() {
        return "Fade(alpha=" + this.f22045a + ", animationSpec=" + this.f22046b + ')';
    }
}
