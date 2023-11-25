package y;

import j0.g2;
import j0.w1;
import j0.z1;
import n1.w0;
import n1.x0;

/* compiled from: LazyLayoutPinnableItem.kt */
/* loaded from: classes.dex */
public final class x {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: LazyLayoutPinnableItem.kt */
    /* loaded from: classes.dex */
    public static final class a extends qc.r implements pc.l<j0.f0, j0.e0> {

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ w f26156f;

        /* compiled from: Effects.kt */
        /* renamed from: y.x$a$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static final class C0601a implements j0.e0 {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ w f26157a;

            public C0601a(w wVar) {
                this.f26157a = wVar;
            }

            @Override // j0.e0
            public void dispose() {
                this.f26157a.f();
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(w wVar) {
            super(1);
            this.f26156f = wVar;
        }

        @Override // pc.l
        public final j0.e0 invoke(j0.f0 f0Var) {
            qc.q.i(f0Var, "$this$DisposableEffect");
            return new C0601a(this.f26156f);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: LazyLayoutPinnableItem.kt */
    /* loaded from: classes.dex */
    public static final class b extends qc.r implements pc.p<j0.l, Integer, dc.w> {

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ Object f26158f;

        /* renamed from: m  reason: collision with root package name */
        final /* synthetic */ int f26159m;

        /* renamed from: p  reason: collision with root package name */
        final /* synthetic */ y f26160p;

        /* renamed from: q  reason: collision with root package name */
        final /* synthetic */ pc.p<j0.l, Integer, dc.w> f26161q;

        /* renamed from: r  reason: collision with root package name */
        final /* synthetic */ int f26162r;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        b(Object obj, int i10, y yVar, pc.p<? super j0.l, ? super Integer, dc.w> pVar, int i11) {
            super(2);
            this.f26158f = obj;
            this.f26159m = i10;
            this.f26160p = yVar;
            this.f26161q = pVar;
            this.f26162r = i11;
        }

        @Override // pc.p
        public /* bridge */ /* synthetic */ dc.w invoke(j0.l lVar, Integer num) {
            invoke(lVar, num.intValue());
            return dc.w.f13270a;
        }

        public final void invoke(j0.l lVar, int i10) {
            x.a(this.f26158f, this.f26159m, this.f26160p, this.f26161q, lVar, z1.a(this.f26162r | 1));
        }
    }

    public static final void a(Object obj, int i10, y yVar, pc.p<? super j0.l, ? super Integer, dc.w> pVar, j0.l lVar, int i11) {
        qc.q.i(yVar, "pinnedItemList");
        qc.q.i(pVar, "content");
        j0.l q10 = lVar.q(-2079116560);
        if (j0.n.K()) {
            j0.n.V(-2079116560, i11, -1, "androidx.compose.foundation.lazy.layout.LazyLayoutPinnableItem (LazyLayoutPinnableItem.kt:43)");
        }
        q10.e(511388516);
        boolean Q = q10.Q(obj) | q10.Q(yVar);
        Object f10 = q10.f();
        if (Q || f10 == j0.l.f18688a.a()) {
            f10 = new w(obj, yVar);
            q10.J(f10);
        }
        q10.N();
        w wVar = (w) f10;
        wVar.g(i10);
        wVar.i((w0) q10.C(x0.a()));
        q10.e(1157296644);
        boolean Q2 = q10.Q(wVar);
        Object f11 = q10.f();
        if (Q2 || f11 == j0.l.f18688a.a()) {
            f11 = new a(wVar);
            q10.J(f11);
        }
        q10.N();
        j0.h0.b(wVar, (pc.l) f11, q10, 0);
        j0.u.a(new w1[]{x0.a().c(wVar)}, pVar, q10, ((i11 >> 6) & 112) | 8);
        if (j0.n.K()) {
            j0.n.U();
        }
        g2 w10 = q10.w();
        if (w10 != null) {
            w10.a(new b(obj, i10, yVar, pVar, i11));
        }
    }
}
