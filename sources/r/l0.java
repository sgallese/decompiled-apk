package r;

/* compiled from: EnterExitTransition.kt */
/* loaded from: classes.dex */
public final class l0 {

    /* renamed from: a  reason: collision with root package name */
    private final w f21963a;

    /* renamed from: b  reason: collision with root package name */
    private final g0 f21964b;

    /* renamed from: c  reason: collision with root package name */
    private final m f21965c;

    /* renamed from: d  reason: collision with root package name */
    private final b0 f21966d;

    public l0() {
        this(null, null, null, null, 15, null);
    }

    public final m a() {
        return this.f21965c;
    }

    public final w b() {
        return this.f21963a;
    }

    public final b0 c() {
        return this.f21966d;
    }

    public final g0 d() {
        return this.f21964b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l0)) {
            return false;
        }
        l0 l0Var = (l0) obj;
        if (qc.q.d(this.f21963a, l0Var.f21963a) && qc.q.d(this.f21964b, l0Var.f21964b) && qc.q.d(this.f21965c, l0Var.f21965c) && qc.q.d(this.f21966d, l0Var.f21966d)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        w wVar = this.f21963a;
        int i10 = 0;
        if (wVar == null) {
            hashCode = 0;
        } else {
            hashCode = wVar.hashCode();
        }
        int i11 = hashCode * 31;
        g0 g0Var = this.f21964b;
        if (g0Var == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = g0Var.hashCode();
        }
        int i12 = (i11 + hashCode2) * 31;
        m mVar = this.f21965c;
        if (mVar == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = mVar.hashCode();
        }
        int i13 = (i12 + hashCode3) * 31;
        b0 b0Var = this.f21966d;
        if (b0Var != null) {
            i10 = b0Var.hashCode();
        }
        return i13 + i10;
    }

    public String toString() {
        return "TransitionData(fade=" + this.f21963a + ", slide=" + this.f21964b + ", changeSize=" + this.f21965c + ", scale=" + this.f21966d + ')';
    }

    public l0(w wVar, g0 g0Var, m mVar, b0 b0Var) {
        this.f21963a = wVar;
        this.f21964b = g0Var;
        this.f21965c = mVar;
        this.f21966d = b0Var;
    }

    public /* synthetic */ l0(w wVar, g0 g0Var, m mVar, b0 b0Var, int i10, qc.h hVar) {
        this((i10 & 1) != 0 ? null : wVar, (i10 & 2) != 0 ? null : g0Var, (i10 & 4) != 0 ? null : mVar, (i10 & 8) != 0 ? null : b0Var);
    }
}
