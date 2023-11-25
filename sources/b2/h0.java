package b2;

/* compiled from: EditCommand.kt */
/* loaded from: classes.dex */
public final class h0 implements f {

    /* renamed from: a  reason: collision with root package name */
    private final v1.d f7772a;

    /* renamed from: b  reason: collision with root package name */
    private final int f7773b;

    public h0(v1.d dVar, int i10) {
        qc.q.i(dVar, "annotatedString");
        this.f7772a = dVar;
        this.f7773b = i10;
    }

    @Override // b2.f
    public void a(i iVar) {
        boolean z10;
        int length;
        int l10;
        boolean z11;
        qc.q.i(iVar, "buffer");
        if (iVar.l()) {
            int f10 = iVar.f();
            iVar.m(iVar.f(), iVar.e(), c());
            if (c().length() > 0) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (z11) {
                iVar.n(f10, c().length() + f10);
            }
        } else {
            int k10 = iVar.k();
            iVar.m(iVar.k(), iVar.j(), c());
            if (c().length() > 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                iVar.n(k10, c().length() + k10);
            }
        }
        int g10 = iVar.g();
        int i10 = this.f7773b;
        if (i10 > 0) {
            length = (g10 + i10) - 1;
        } else {
            length = (g10 + i10) - c().length();
        }
        l10 = vc.l.l(length, 0, iVar.h());
        iVar.o(l10);
    }

    public final int b() {
        return this.f7773b;
    }

    public final String c() {
        return this.f7772a.i();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h0)) {
            return false;
        }
        h0 h0Var = (h0) obj;
        if (qc.q.d(c(), h0Var.c()) && this.f7773b == h0Var.f7773b) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return (c().hashCode() * 31) + this.f7773b;
    }

    public String toString() {
        return "SetComposingTextCommand(text='" + c() + "', newCursorPosition=" + this.f7773b + ')';
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public h0(String str, int i10) {
        this(new v1.d(str, null, null, 6, null), i10);
        qc.q.i(str, "text");
    }
}
