package x;

/* compiled from: LazyListState.kt */
/* loaded from: classes.dex */
public final class b0 {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: LazyListState.kt */
    /* loaded from: classes.dex */
    public static final class a extends qc.r implements pc.a<a0> {

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ int f25554f;

        /* renamed from: m  reason: collision with root package name */
        final /* synthetic */ int f25555m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(int i10, int i11) {
            super(0);
            this.f25554f = i10;
            this.f25555m = i11;
        }

        @Override // pc.a
        /* renamed from: a  reason: merged with bridge method [inline-methods] */
        public final a0 invoke() {
            return new a0(this.f25554f, this.f25555m);
        }
    }

    public static final a0 a(int i10, int i11, j0.l lVar, int i12, int i13) {
        lVar.e(1470655220);
        if ((i13 & 1) != 0) {
            i10 = 0;
        }
        if ((i13 & 2) != 0) {
            i11 = 0;
        }
        if (j0.n.K()) {
            j0.n.V(1470655220, i12, -1, "androidx.compose.foundation.lazy.rememberLazyListState (LazyListState.kt:57)");
        }
        Object[] objArr = new Object[0];
        s0.i<a0, ?> a10 = a0.f25505w.a();
        Integer valueOf = Integer.valueOf(i10);
        Integer valueOf2 = Integer.valueOf(i11);
        lVar.e(511388516);
        boolean Q = lVar.Q(valueOf) | lVar.Q(valueOf2);
        Object f10 = lVar.f();
        if (Q || f10 == j0.l.f18688a.a()) {
            f10 = new a(i10, i11);
            lVar.J(f10);
        }
        lVar.N();
        a0 a0Var = (a0) s0.b.b(objArr, a10, null, (pc.a) f10, lVar, 72, 4);
        if (j0.n.K()) {
            j0.n.U();
        }
        lVar.N();
        return a0Var;
    }
}
