package b2;

/* compiled from: EditCommand.kt */
/* loaded from: classes.dex */
public final class k implements f {
    @Override // b2.f
    public void a(i iVar) {
        qc.q.i(iVar, "buffer");
        iVar.a();
    }

    public boolean equals(Object obj) {
        return obj instanceof k;
    }

    public int hashCode() {
        return qc.g0.b(k.class).hashCode();
    }

    public String toString() {
        return "FinishComposingTextCommand()";
    }
}
