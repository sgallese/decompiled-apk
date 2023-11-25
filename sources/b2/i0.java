package b2;

/* compiled from: EditCommand.kt */
/* loaded from: classes.dex */
public final class i0 implements f {

    /* renamed from: a  reason: collision with root package name */
    private final int f7781a;

    /* renamed from: b  reason: collision with root package name */
    private final int f7782b;

    public i0(int i10, int i11) {
        this.f7781a = i10;
        this.f7782b = i11;
    }

    @Override // b2.f
    public void a(i iVar) {
        int l10;
        int l11;
        qc.q.i(iVar, "buffer");
        l10 = vc.l.l(this.f7781a, 0, iVar.h());
        l11 = vc.l.l(this.f7782b, 0, iVar.h());
        if (l10 < l11) {
            iVar.p(l10, l11);
        } else {
            iVar.p(l11, l10);
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i0)) {
            return false;
        }
        i0 i0Var = (i0) obj;
        if (this.f7781a == i0Var.f7781a && this.f7782b == i0Var.f7782b) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return (this.f7781a * 31) + this.f7782b;
    }

    public String toString() {
        return "SetSelectionCommand(start=" + this.f7781a + ", end=" + this.f7782b + ')';
    }
}
