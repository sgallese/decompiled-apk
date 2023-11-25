package j0;

import java.util.Arrays;

/* compiled from: CompositionLocal.kt */
/* loaded from: classes.dex */
public final class u {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: CompositionLocal.kt */
    /* loaded from: classes.dex */
    public static final class a extends qc.r implements pc.p<l, Integer, dc.w> {

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ w1<?>[] f18905f;

        /* renamed from: m  reason: collision with root package name */
        final /* synthetic */ pc.p<l, Integer, dc.w> f18906m;

        /* renamed from: p  reason: collision with root package name */
        final /* synthetic */ int f18907p;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        a(w1<?>[] w1VarArr, pc.p<? super l, ? super Integer, dc.w> pVar, int i10) {
            super(2);
            this.f18905f = w1VarArr;
            this.f18906m = pVar;
            this.f18907p = i10;
        }

        @Override // pc.p
        public /* bridge */ /* synthetic */ dc.w invoke(l lVar, Integer num) {
            invoke(lVar, num.intValue());
            return dc.w.f13270a;
        }

        public final void invoke(l lVar, int i10) {
            w1<?>[] w1VarArr = this.f18905f;
            u.a((w1[]) Arrays.copyOf(w1VarArr, w1VarArr.length), this.f18906m, lVar, z1.a(this.f18907p | 1));
        }
    }

    public static final void a(w1<?>[] w1VarArr, pc.p<? super l, ? super Integer, dc.w> pVar, l lVar, int i10) {
        qc.q.i(w1VarArr, "values");
        qc.q.i(pVar, "content");
        l q10 = lVar.q(-1390796515);
        if (n.K()) {
            n.V(-1390796515, i10, -1, "androidx.compose.runtime.CompositionLocalProvider (CompositionLocal.kt:225)");
        }
        q10.y(w1VarArr);
        pVar.invoke(q10, Integer.valueOf((i10 >> 3) & 14));
        q10.E();
        if (n.K()) {
            n.U();
        }
        g2 w10 = q10.w();
        if (w10 != null) {
            w10.a(new a(w1VarArr, pVar, i10));
        }
    }

    public static final <T> v1<T> b(x2<T> x2Var, pc.a<? extends T> aVar) {
        qc.q.i(x2Var, "policy");
        qc.q.i(aVar, "defaultFactory");
        return new g0(x2Var, aVar);
    }

    public static /* synthetic */ v1 c(x2 x2Var, pc.a aVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            x2Var = y2.o();
        }
        return b(x2Var, aVar);
    }

    public static final <T> v1<T> d(pc.a<? extends T> aVar) {
        qc.q.i(aVar, "defaultFactory");
        return new h3(aVar);
    }
}
