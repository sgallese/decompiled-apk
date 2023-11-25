package b2;

/* compiled from: EditCommand.kt */
/* loaded from: classes.dex */
public final class c implements f {
    @Override // b2.f
    public void a(i iVar) {
        qc.q.i(iVar, "buffer");
        iVar.m(0, iVar.h(), "");
    }

    public boolean equals(Object obj) {
        return obj instanceof c;
    }

    public int hashCode() {
        return qc.g0.b(c.class).hashCode();
    }

    public String toString() {
        return "DeleteAllCommand()";
    }
}
