package t;

import a1.e1;

/* compiled from: BorderStroke.kt */
/* loaded from: classes.dex */
public final class g {

    /* renamed from: a  reason: collision with root package name */
    private final float f23174a;

    /* renamed from: b  reason: collision with root package name */
    private final e1 f23175b;

    public /* synthetic */ g(float f10, e1 e1Var, qc.h hVar) {
        this(f10, e1Var);
    }

    public final e1 a() {
        return this.f23175b;
    }

    public final float b() {
        return this.f23174a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        if (j2.h.l(this.f23174a, gVar.f23174a) && qc.q.d(this.f23175b, gVar.f23175b)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return (j2.h.m(this.f23174a) * 31) + this.f23175b.hashCode();
    }

    public String toString() {
        return "BorderStroke(width=" + ((Object) j2.h.n(this.f23174a)) + ", brush=" + this.f23175b + ')';
    }

    private g(float f10, e1 e1Var) {
        qc.q.i(e1Var, "brush");
        this.f23174a = f10;
        this.f23175b = e1Var;
    }
}
