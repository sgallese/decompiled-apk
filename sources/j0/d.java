package j0;

/* compiled from: SlotTable.kt */
/* loaded from: classes.dex */
public final class d {

    /* renamed from: a  reason: collision with root package name */
    private int f18629a;

    public d(int i10) {
        this.f18629a = i10;
    }

    public final int a() {
        return this.f18629a;
    }

    public final boolean b() {
        if (this.f18629a != Integer.MIN_VALUE) {
            return true;
        }
        return false;
    }

    public final void c(int i10) {
        this.f18629a = i10;
    }

    public final int d(k2 k2Var) {
        qc.q.i(k2Var, "slots");
        return k2Var.e(this);
    }

    public final int e(n2 n2Var) {
        qc.q.i(n2Var, "writer");
        return n2Var.B(this);
    }
}
