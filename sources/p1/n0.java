package p1;

/* compiled from: LayoutNode.kt */
/* loaded from: classes.dex */
public final class n0 {

    /* renamed from: a */
    private static final j2.e f20858a = j2.g.b(1.0f, 0.0f, 2, null);

    public static final /* synthetic */ j2.e a() {
        return f20858a;
    }

    public static final i1 b(j0 j0Var) {
        qc.q.i(j0Var, "<this>");
        i1 k02 = j0Var.k0();
        if (k02 != null) {
            return k02;
        }
        throw new IllegalStateException("LayoutNode should be attached to an owner".toString());
    }
}
