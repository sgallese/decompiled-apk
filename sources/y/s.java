package y;

import j0.g3;
import j0.l;
import j0.z1;
import n1.h1;
import n1.i1;
import n1.j0;
import n1.j1;

/* compiled from: LazyLayout.kt */
/* loaded from: classes.dex */
public final class s {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: LazyLayout.kt */
    /* loaded from: classes.dex */
    public static final class a extends qc.r implements pc.q<s0.c, j0.l, Integer, dc.w> {

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ z f26127f;

        /* renamed from: m  reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.e f26128m;

        /* renamed from: p  reason: collision with root package name */
        final /* synthetic */ pc.p<t, j2.b, j0> f26129p;

        /* renamed from: q  reason: collision with root package name */
        final /* synthetic */ int f26130q;

        /* renamed from: r  reason: collision with root package name */
        final /* synthetic */ g3<pc.a<o>> f26131r;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: LazyLayout.kt */
        /* renamed from: y.s$a$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static final class C0600a extends qc.r implements pc.p<j1, j2.b, j0> {

            /* renamed from: f  reason: collision with root package name */
            final /* synthetic */ m f26132f;

            /* renamed from: m  reason: collision with root package name */
            final /* synthetic */ pc.p<t, j2.b, j0> f26133m;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            C0600a(m mVar, pc.p<? super t, ? super j2.b, ? extends j0> pVar) {
                super(2);
                this.f26132f = mVar;
                this.f26133m = pVar;
            }

            public final j0 a(j1 j1Var, long j10) {
                qc.q.i(j1Var, "$this$null");
                return this.f26133m.invoke(new u(this.f26132f, j1Var), j2.b.b(j10));
            }

            @Override // pc.p
            public /* bridge */ /* synthetic */ j0 invoke(j1 j1Var, j2.b bVar) {
                return a(j1Var, bVar.t());
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: LazyLayout.kt */
        /* loaded from: classes.dex */
        public static final class b extends qc.r implements pc.a<o> {

            /* renamed from: f  reason: collision with root package name */
            final /* synthetic */ g3<pc.a<o>> f26134f;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            b(g3<? extends pc.a<? extends o>> g3Var) {
                super(0);
                this.f26134f = g3Var;
            }

            @Override // pc.a
            /* renamed from: a  reason: merged with bridge method [inline-methods] */
            public final o invoke() {
                return this.f26134f.getValue().invoke();
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        a(z zVar, androidx.compose.ui.e eVar, pc.p<? super t, ? super j2.b, ? extends j0> pVar, int i10, g3<? extends pc.a<? extends o>> g3Var) {
            super(3);
            this.f26127f = zVar;
            this.f26128m = eVar;
            this.f26129p = pVar;
            this.f26130q = i10;
            this.f26131r = g3Var;
        }

        public final void a(s0.c cVar, j0.l lVar, int i10) {
            qc.q.i(cVar, "saveableStateHolder");
            if (j0.n.K()) {
                j0.n.V(-1488997347, i10, -1, "androidx.compose.foundation.lazy.layout.LazyLayout.<anonymous> (LazyLayout.kt:60)");
            }
            g3<pc.a<o>> g3Var = this.f26131r;
            lVar.e(-492369756);
            Object f10 = lVar.f();
            l.a aVar = j0.l.f18688a;
            if (f10 == aVar.a()) {
                f10 = new m(cVar, new b(g3Var));
                lVar.J(f10);
            }
            lVar.N();
            m mVar = (m) f10;
            lVar.e(-492369756);
            Object f11 = lVar.f();
            if (f11 == aVar.a()) {
                f11 = new i1(new q(mVar));
                lVar.J(f11);
            }
            lVar.N();
            i1 i1Var = (i1) f11;
            z zVar = this.f26127f;
            lVar.e(-1523808190);
            if (zVar != null) {
                b0.a(this.f26127f, mVar, i1Var, lVar, ((this.f26130q >> 6) & 14) | 64 | (i1.f19999g << 6));
                dc.w wVar = dc.w.f13270a;
            }
            lVar.N();
            androidx.compose.ui.e eVar = this.f26128m;
            pc.p<t, j2.b, j0> pVar = this.f26129p;
            lVar.e(511388516);
            boolean Q = lVar.Q(mVar) | lVar.Q(pVar);
            Object f12 = lVar.f();
            if (Q || f12 == aVar.a()) {
                f12 = new C0600a(mVar, pVar);
                lVar.J(f12);
            }
            lVar.N();
            h1.b(i1Var, eVar, (pc.p) f12, lVar, i1.f19999g | (this.f26130q & 112), 0);
            if (j0.n.K()) {
                j0.n.U();
            }
        }

        @Override // pc.q
        public /* bridge */ /* synthetic */ dc.w invoke(s0.c cVar, j0.l lVar, Integer num) {
            a(cVar, lVar, num.intValue());
            return dc.w.f13270a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: LazyLayout.kt */
    /* loaded from: classes.dex */
    public static final class b extends qc.r implements pc.p<j0.l, Integer, dc.w> {

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ pc.a<o> f26135f;

        /* renamed from: m  reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.e f26136m;

        /* renamed from: p  reason: collision with root package name */
        final /* synthetic */ z f26137p;

        /* renamed from: q  reason: collision with root package name */
        final /* synthetic */ pc.p<t, j2.b, j0> f26138q;

        /* renamed from: r  reason: collision with root package name */
        final /* synthetic */ int f26139r;

        /* renamed from: s  reason: collision with root package name */
        final /* synthetic */ int f26140s;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        b(pc.a<? extends o> aVar, androidx.compose.ui.e eVar, z zVar, pc.p<? super t, ? super j2.b, ? extends j0> pVar, int i10, int i11) {
            super(2);
            this.f26135f = aVar;
            this.f26136m = eVar;
            this.f26137p = zVar;
            this.f26138q = pVar;
            this.f26139r = i10;
            this.f26140s = i11;
        }

        @Override // pc.p
        public /* bridge */ /* synthetic */ dc.w invoke(j0.l lVar, Integer num) {
            invoke(lVar, num.intValue());
            return dc.w.f13270a;
        }

        public final void invoke(j0.l lVar, int i10) {
            s.a(this.f26135f, this.f26136m, this.f26137p, this.f26138q, lVar, z1.a(this.f26139r | 1), this.f26140s);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:69:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void a(pc.a<? extends y.o> r14, androidx.compose.ui.e r15, y.z r16, pc.p<? super y.t, ? super j2.b, ? extends n1.j0> r17, j0.l r18, int r19, int r20) {
        /*
            Method dump skipped, instructions count: 234
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: y.s.a(pc.a, androidx.compose.ui.e, y.z, pc.p, j0.l, int, int):void");
    }
}
