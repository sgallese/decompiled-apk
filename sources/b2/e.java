package b2;

/* compiled from: EditCommand.kt */
/* loaded from: classes.dex */
public final class e implements f {

    /* renamed from: a  reason: collision with root package name */
    private final int f7756a;

    /* renamed from: b  reason: collision with root package name */
    private final int f7757b;

    public e(int i10, int i11) {
        boolean z10;
        this.f7756a = i10;
        this.f7757b = i11;
        if (i10 >= 0 && i11 >= 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            return;
        }
        throw new IllegalArgumentException(("Expected lengthBeforeCursor and lengthAfterCursor to be non-negative, were " + i10 + " and " + i11 + " respectively.").toString());
    }

    @Override // b2.f
    public void a(i iVar) {
        boolean b10;
        boolean b11;
        qc.q.i(iVar, "buffer");
        int i10 = this.f7756a;
        int i11 = 0;
        for (int i12 = 0; i12 < i10; i12++) {
            i11++;
            if (iVar.k() > i11) {
                b11 = g.b(iVar.c((iVar.k() - i11) - 1), iVar.c(iVar.k() - i11));
                if (b11) {
                    i11++;
                }
            }
            if (i11 == iVar.k()) {
                break;
            }
        }
        int i13 = this.f7757b;
        int i14 = 0;
        for (int i15 = 0; i15 < i13; i15++) {
            i14++;
            if (iVar.j() + i14 < iVar.h()) {
                b10 = g.b(iVar.c((iVar.j() + i14) - 1), iVar.c(iVar.j() + i14));
                if (b10) {
                    i14++;
                }
            }
            if (iVar.j() + i14 == iVar.h()) {
                break;
            }
        }
        iVar.b(iVar.j(), iVar.j() + i14);
        iVar.b(iVar.k() - i11, iVar.k());
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        if (this.f7756a == eVar.f7756a && this.f7757b == eVar.f7757b) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return (this.f7756a * 31) + this.f7757b;
    }

    public String toString() {
        return "DeleteSurroundingTextInCodePointsCommand(lengthBeforeCursor=" + this.f7756a + ", lengthAfterCursor=" + this.f7757b + ')';
    }
}
