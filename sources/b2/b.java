package b2;

/* compiled from: EditCommand.kt */
/* loaded from: classes.dex */
public final class b implements f {

    /* renamed from: a  reason: collision with root package name */
    private final v1.d f7739a;

    /* renamed from: b  reason: collision with root package name */
    private final int f7740b;

    public b(v1.d dVar, int i10) {
        qc.q.i(dVar, "annotatedString");
        this.f7739a = dVar;
        this.f7740b = i10;
    }

    @Override // b2.f
    public void a(i iVar) {
        int length;
        int l10;
        qc.q.i(iVar, "buffer");
        if (iVar.l()) {
            iVar.m(iVar.f(), iVar.e(), c());
        } else {
            iVar.m(iVar.k(), iVar.j(), c());
        }
        int g10 = iVar.g();
        int i10 = this.f7740b;
        if (i10 > 0) {
            length = (g10 + i10) - 1;
        } else {
            length = (g10 + i10) - c().length();
        }
        l10 = vc.l.l(length, 0, iVar.h());
        iVar.o(l10);
    }

    public final int b() {
        return this.f7740b;
    }

    public final String c() {
        return this.f7739a.i();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        if (qc.q.d(c(), bVar.c()) && this.f7740b == bVar.f7740b) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return (c().hashCode() * 31) + this.f7740b;
    }

    public String toString() {
        return "CommitTextCommand(text='" + c() + "', newCursorPosition=" + this.f7740b + ')';
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public b(String str, int i10) {
        this(new v1.d(str, null, null, 6, null), i10);
        qc.q.i(str, "text");
    }
}
