package p1;

import p1.b1;

/* compiled from: LayoutModifierNode.kt */
/* loaded from: classes.dex */
public final /* synthetic */ class d0 {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: LayoutModifierNode.kt */
    /* loaded from: classes.dex */
    public static final class a implements b1.e {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ e0 f20777a;

        a(e0 e0Var) {
            this.f20777a = e0Var;
        }

        @Override // p1.b1.e
        public final n1.j0 d(n1.l0 l0Var, n1.g0 g0Var, long j10) {
            qc.q.i(l0Var, "$this$maxHeight");
            qc.q.i(g0Var, "intrinsicMeasurable");
            return this.f20777a.d(l0Var, g0Var, j10);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: LayoutModifierNode.kt */
    /* loaded from: classes.dex */
    public static final class b implements b1.e {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ e0 f20778a;

        b(e0 e0Var) {
            this.f20778a = e0Var;
        }

        @Override // p1.b1.e
        public final n1.j0 d(n1.l0 l0Var, n1.g0 g0Var, long j10) {
            qc.q.i(l0Var, "$this$maxWidth");
            qc.q.i(g0Var, "intrinsicMeasurable");
            return this.f20778a.d(l0Var, g0Var, j10);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: LayoutModifierNode.kt */
    /* loaded from: classes.dex */
    public static final class c implements b1.e {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ e0 f20779a;

        c(e0 e0Var) {
            this.f20779a = e0Var;
        }

        @Override // p1.b1.e
        public final n1.j0 d(n1.l0 l0Var, n1.g0 g0Var, long j10) {
            qc.q.i(l0Var, "$this$minHeight");
            qc.q.i(g0Var, "intrinsicMeasurable");
            return this.f20779a.d(l0Var, g0Var, j10);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: LayoutModifierNode.kt */
    /* loaded from: classes.dex */
    public static final class d implements b1.e {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ e0 f20780a;

        d(e0 e0Var) {
            this.f20780a = e0Var;
        }

        @Override // p1.b1.e
        public final n1.j0 d(n1.l0 l0Var, n1.g0 g0Var, long j10) {
            qc.q.i(l0Var, "$this$minWidth");
            qc.q.i(g0Var, "intrinsicMeasurable");
            return this.f20780a.d(l0Var, g0Var, j10);
        }
    }

    public static int a(e0 e0Var, n1.n nVar, n1.m mVar, int i10) {
        qc.q.i(nVar, "<this>");
        qc.q.i(mVar, "measurable");
        return b1.f20763a.a(new a(e0Var), nVar, mVar, i10);
    }

    public static int b(e0 e0Var, n1.n nVar, n1.m mVar, int i10) {
        qc.q.i(nVar, "<this>");
        qc.q.i(mVar, "measurable");
        return b1.f20763a.b(new b(e0Var), nVar, mVar, i10);
    }

    public static int c(e0 e0Var, n1.n nVar, n1.m mVar, int i10) {
        qc.q.i(nVar, "<this>");
        qc.q.i(mVar, "measurable");
        return b1.f20763a.c(new c(e0Var), nVar, mVar, i10);
    }

    public static int d(e0 e0Var, n1.n nVar, n1.m mVar, int i10) {
        qc.q.i(nVar, "<this>");
        qc.q.i(mVar, "measurable");
        return b1.f20763a.d(new d(e0Var), nVar, mVar, i10);
    }
}
