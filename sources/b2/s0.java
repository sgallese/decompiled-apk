package b2;

/* compiled from: VisualTransformation.kt */
/* loaded from: classes.dex */
public final class s0 {

    /* renamed from: a  reason: collision with root package name */
    private final v1.d f7842a;

    /* renamed from: b  reason: collision with root package name */
    private final x f7843b;

    public s0(v1.d dVar, x xVar) {
        qc.q.i(dVar, "text");
        qc.q.i(xVar, "offsetMapping");
        this.f7842a = dVar;
        this.f7843b = xVar;
    }

    public final x a() {
        return this.f7843b;
    }

    public final v1.d b() {
        return this.f7842a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s0)) {
            return false;
        }
        s0 s0Var = (s0) obj;
        if (qc.q.d(this.f7842a, s0Var.f7842a) && qc.q.d(this.f7843b, s0Var.f7843b)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return (this.f7842a.hashCode() * 31) + this.f7843b.hashCode();
    }

    public String toString() {
        return "TransformedText(text=" + ((Object) this.f7842a) + ", offsetMapping=" + this.f7843b + ')';
    }
}
