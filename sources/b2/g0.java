package b2;

/* compiled from: EditCommand.kt */
/* loaded from: classes.dex */
public final class g0 implements f {

    /* renamed from: a  reason: collision with root package name */
    private final int f7766a;

    /* renamed from: b  reason: collision with root package name */
    private final int f7767b;

    public g0(int i10, int i11) {
        this.f7766a = i10;
        this.f7767b = i11;
    }

    @Override // b2.f
    public void a(i iVar) {
        int l10;
        int l11;
        qc.q.i(iVar, "buffer");
        if (iVar.l()) {
            iVar.a();
        }
        l10 = vc.l.l(this.f7766a, 0, iVar.h());
        l11 = vc.l.l(this.f7767b, 0, iVar.h());
        if (l10 != l11) {
            if (l10 < l11) {
                iVar.n(l10, l11);
            } else {
                iVar.n(l11, l10);
            }
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g0)) {
            return false;
        }
        g0 g0Var = (g0) obj;
        if (this.f7766a == g0Var.f7766a && this.f7767b == g0Var.f7767b) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return (this.f7766a * 31) + this.f7767b;
    }

    public String toString() {
        return "SetComposingRegionCommand(start=" + this.f7766a + ", end=" + this.f7767b + ')';
    }
}
