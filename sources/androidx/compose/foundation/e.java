package androidx.compose.foundation;

import ad.k0;
import ad.l0;
import ad.u0;
import androidx.compose.foundation.a;
import androidx.compose.ui.e;
import androidx.compose.ui.platform.k1;
import androidx.compose.ui.platform.m1;
import dc.w;
import kotlin.coroutines.Continuation;
import okhttp3.internal.http.StatusLine;
import t.v;
import t.x;

/* compiled from: Clickable.kt */
/* loaded from: classes.dex */
public final class e {

    /* compiled from: Clickable.kt */
    /* loaded from: classes.dex */
    public static final class a extends qc.r implements pc.q<androidx.compose.ui.e, j0.l, Integer, androidx.compose.ui.e> {

        /* renamed from: f */
        final /* synthetic */ boolean f1864f;

        /* renamed from: m */
        final /* synthetic */ String f1865m;

        /* renamed from: p */
        final /* synthetic */ t1.i f1866p;

        /* renamed from: q */
        final /* synthetic */ pc.a<w> f1867q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(boolean z10, String str, t1.i iVar, pc.a<w> aVar) {
            super(3);
            this.f1864f = z10;
            this.f1865m = str;
            this.f1866p = iVar;
            this.f1867q = aVar;
        }

        public final androidx.compose.ui.e a(androidx.compose.ui.e eVar, j0.l lVar, int i10) {
            qc.q.i(eVar, "$this$composed");
            lVar.e(-756081143);
            if (j0.n.K()) {
                j0.n.V(-756081143, i10, -1, "androidx.compose.foundation.clickable.<anonymous> (Clickable.kt:97)");
            }
            e.a aVar = androidx.compose.ui.e.f2335a;
            v vVar = (v) lVar.C(x.a());
            lVar.e(-492369756);
            Object f10 = lVar.f();
            if (f10 == j0.l.f18688a.a()) {
                f10 = v.l.a();
                lVar.J(f10);
            }
            lVar.N();
            androidx.compose.ui.e b10 = e.b(aVar, (v.m) f10, vVar, this.f1864f, this.f1865m, this.f1866p, this.f1867q);
            if (j0.n.K()) {
                j0.n.U();
            }
            lVar.N();
            return b10;
        }

        @Override // pc.q
        public /* bridge */ /* synthetic */ androidx.compose.ui.e invoke(androidx.compose.ui.e eVar, j0.l lVar, Integer num) {
            return a(eVar, lVar, num.intValue());
        }
    }

    /* compiled from: InspectableValue.kt */
    /* loaded from: classes.dex */
    public static final class b extends qc.r implements pc.l<m1, w> {

        /* renamed from: f */
        final /* synthetic */ v.m f1868f;

        /* renamed from: m */
        final /* synthetic */ v f1869m;

        /* renamed from: p */
        final /* synthetic */ boolean f1870p;

        /* renamed from: q */
        final /* synthetic */ String f1871q;

        /* renamed from: r */
        final /* synthetic */ t1.i f1872r;

        /* renamed from: s */
        final /* synthetic */ pc.a f1873s;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(v.m mVar, v vVar, boolean z10, String str, t1.i iVar, pc.a aVar) {
            super(1);
            this.f1868f = mVar;
            this.f1869m = vVar;
            this.f1870p = z10;
            this.f1871q = str;
            this.f1872r = iVar;
            this.f1873s = aVar;
        }

        public final void a(m1 m1Var) {
            qc.q.i(m1Var, "$this$null");
            m1Var.b("clickable");
            m1Var.a().c("interactionSource", this.f1868f);
            m1Var.a().c("indication", this.f1869m);
            m1Var.a().c("enabled", Boolean.valueOf(this.f1870p));
            m1Var.a().c("onClickLabel", this.f1871q);
            m1Var.a().c("role", this.f1872r);
            m1Var.a().c("onClick", this.f1873s);
        }

        @Override // pc.l
        public /* bridge */ /* synthetic */ w invoke(m1 m1Var) {
            a(m1Var);
            return w.f13270a;
        }
    }

    /* compiled from: InspectableValue.kt */
    /* loaded from: classes.dex */
    public static final class c extends qc.r implements pc.l<m1, w> {

        /* renamed from: f */
        final /* synthetic */ boolean f1874f;

        /* renamed from: m */
        final /* synthetic */ String f1875m;

        /* renamed from: p */
        final /* synthetic */ t1.i f1876p;

        /* renamed from: q */
        final /* synthetic */ pc.a f1877q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(boolean z10, String str, t1.i iVar, pc.a aVar) {
            super(1);
            this.f1874f = z10;
            this.f1875m = str;
            this.f1876p = iVar;
            this.f1877q = aVar;
        }

        public final void a(m1 m1Var) {
            qc.q.i(m1Var, "$this$null");
            m1Var.b("clickable");
            m1Var.a().c("enabled", Boolean.valueOf(this.f1874f));
            m1Var.a().c("onClickLabel", this.f1875m);
            m1Var.a().c("role", this.f1876p);
            m1Var.a().c("onClick", this.f1877q);
        }

        @Override // pc.l
        public /* bridge */ /* synthetic */ w invoke(m1 m1Var) {
            a(m1Var);
            return w.f13270a;
        }
    }

    /* compiled from: Clickable.kt */
    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.ClickableKt$handlePressInteraction$2", f = "Clickable.kt", l = {299, 301, StatusLine.HTTP_PERM_REDIRECT, 309, 318}, m = "invokeSuspend")
    /* loaded from: classes.dex */
    public static final class d extends kotlin.coroutines.jvm.internal.l implements pc.p<k0, Continuation<? super w>, Object> {

        /* renamed from: f */
        boolean f1878f;

        /* renamed from: m */
        int f1879m;

        /* renamed from: p */
        private /* synthetic */ Object f1880p;

        /* renamed from: q */
        final /* synthetic */ u.q f1881q;

        /* renamed from: r */
        final /* synthetic */ long f1882r;

        /* renamed from: s */
        final /* synthetic */ v.m f1883s;

        /* renamed from: t */
        final /* synthetic */ a.C0018a f1884t;

        /* renamed from: u */
        final /* synthetic */ pc.a<Boolean> f1885u;

        /* compiled from: Clickable.kt */
        @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.ClickableKt$handlePressInteraction$2$delayJob$1", f = "Clickable.kt", l = {293, 296}, m = "invokeSuspend")
        /* loaded from: classes.dex */
        public static final class a extends kotlin.coroutines.jvm.internal.l implements pc.p<k0, Continuation<? super w>, Object> {

            /* renamed from: f */
            Object f1886f;

            /* renamed from: m */
            int f1887m;

            /* renamed from: p */
            final /* synthetic */ pc.a<Boolean> f1888p;

            /* renamed from: q */
            final /* synthetic */ long f1889q;

            /* renamed from: r */
            final /* synthetic */ v.m f1890r;

            /* renamed from: s */
            final /* synthetic */ a.C0018a f1891s;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(pc.a<Boolean> aVar, long j10, v.m mVar, a.C0018a c0018a, Continuation<? super a> continuation) {
                super(2, continuation);
                this.f1888p = aVar;
                this.f1889q = j10;
                this.f1890r = mVar;
                this.f1891s = c0018a;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Continuation<w> create(Object obj, Continuation<?> continuation) {
                return new a(this.f1888p, this.f1889q, this.f1890r, this.f1891s, continuation);
            }

            @Override // pc.p
            public final Object invoke(k0 k0Var, Continuation<? super w> continuation) {
                return ((a) create(k0Var, continuation)).invokeSuspend(w.f13270a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Object d10;
                v.p pVar;
                d10 = ic.d.d();
                int i10 = this.f1887m;
                if (i10 != 0) {
                    if (i10 != 1) {
                        if (i10 == 2) {
                            pVar = (v.p) this.f1886f;
                            dc.n.b(obj);
                            this.f1891s.e(pVar);
                            return w.f13270a;
                        }
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    dc.n.b(obj);
                } else {
                    dc.n.b(obj);
                    if (this.f1888p.invoke().booleanValue()) {
                        long a10 = t.l.a();
                        this.f1887m = 1;
                        if (u0.a(a10, this) == d10) {
                            return d10;
                        }
                    }
                }
                v.p pVar2 = new v.p(this.f1889q, null);
                v.m mVar = this.f1890r;
                this.f1886f = pVar2;
                this.f1887m = 2;
                if (mVar.c(pVar2, this) == d10) {
                    return d10;
                }
                pVar = pVar2;
                this.f1891s.e(pVar);
                return w.f13270a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(u.q qVar, long j10, v.m mVar, a.C0018a c0018a, pc.a<Boolean> aVar, Continuation<? super d> continuation) {
            super(2, continuation);
            this.f1881q = qVar;
            this.f1882r = j10;
            this.f1883s = mVar;
            this.f1884t = c0018a;
            this.f1885u = aVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Continuation<w> create(Object obj, Continuation<?> continuation) {
            d dVar = new d(this.f1881q, this.f1882r, this.f1883s, this.f1884t, this.f1885u, continuation);
            dVar.f1880p = obj;
            return dVar;
        }

        @Override // pc.p
        public final Object invoke(k0 k0Var, Continuation<? super w> continuation) {
            return ((d) create(k0Var, continuation)).invokeSuspend(w.f13270a);
        }

        /* JADX WARN: Removed duplicated region for block: B:70:0x008e  */
        /* JADX WARN: Removed duplicated region for block: B:76:0x00b4 A[RETURN] */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r20) {
            /*
                Method dump skipped, instructions count: 224
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.e.d.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public static final /* synthetic */ Object a(u.q qVar, long j10, v.m mVar, a.C0018a c0018a, pc.a aVar, Continuation continuation) {
        return f(qVar, j10, mVar, c0018a, aVar, continuation);
    }

    public static final androidx.compose.ui.e b(androidx.compose.ui.e eVar, v.m mVar, v vVar, boolean z10, String str, t1.i iVar, pc.a<w> aVar) {
        pc.l a10;
        qc.q.i(eVar, "$this$clickable");
        qc.q.i(mVar, "interactionSource");
        qc.q.i(aVar, "onClick");
        if (k1.c()) {
            a10 = new b(mVar, vVar, z10, str, iVar, aVar);
        } else {
            a10 = k1.a();
        }
        return k1.b(eVar, a10, FocusableKt.c(p.a(x.b(androidx.compose.ui.e.f2335a, mVar, vVar), mVar, z10), z10, mVar).a(new ClickableElement(mVar, z10, str, iVar, aVar, null)));
    }

    public static /* synthetic */ androidx.compose.ui.e c(androidx.compose.ui.e eVar, v.m mVar, v vVar, boolean z10, String str, t1.i iVar, pc.a aVar, int i10, Object obj) {
        boolean z11;
        String str2;
        t1.i iVar2;
        if ((i10 & 4) != 0) {
            z11 = true;
        } else {
            z11 = z10;
        }
        if ((i10 & 8) != 0) {
            str2 = null;
        } else {
            str2 = str;
        }
        if ((i10 & 16) != 0) {
            iVar2 = null;
        } else {
            iVar2 = iVar;
        }
        return b(eVar, mVar, vVar, z11, str2, iVar2, aVar);
    }

    public static final androidx.compose.ui.e d(androidx.compose.ui.e eVar, boolean z10, String str, t1.i iVar, pc.a<w> aVar) {
        pc.l a10;
        qc.q.i(eVar, "$this$clickable");
        qc.q.i(aVar, "onClick");
        if (k1.c()) {
            a10 = new c(z10, str, iVar, aVar);
        } else {
            a10 = k1.a();
        }
        return androidx.compose.ui.c.a(eVar, a10, new a(z10, str, iVar, aVar));
    }

    public static /* synthetic */ androidx.compose.ui.e e(androidx.compose.ui.e eVar, boolean z10, String str, t1.i iVar, pc.a aVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = true;
        }
        if ((i10 & 2) != 0) {
            str = null;
        }
        if ((i10 & 4) != 0) {
            iVar = null;
        }
        return d(eVar, z10, str, iVar, aVar);
    }

    public static final Object f(u.q qVar, long j10, v.m mVar, a.C0018a c0018a, pc.a<Boolean> aVar, Continuation<? super w> continuation) {
        Object d10;
        Object e10 = l0.e(new d(qVar, j10, mVar, c0018a, aVar, null), continuation);
        d10 = ic.d.d();
        if (e10 == d10) {
            return e10;
        }
        return w.f13270a;
    }
}
