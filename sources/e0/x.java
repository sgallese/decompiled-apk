package e0;

import androidx.compose.ui.platform.z0;
import j0.d3;
import j0.j1;
import j0.l;

/* compiled from: TextFieldSelectionManager.android.kt */
/* loaded from: classes.dex */
public final class x {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: TextFieldSelectionManager.android.kt */
    /* loaded from: classes.dex */
    public static final class a extends qc.r implements pc.q<androidx.compose.ui.e, j0.l, Integer, androidx.compose.ui.e> {

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ v f13719f;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: TextFieldSelectionManager.android.kt */
        /* renamed from: e0.x$a$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static final class C0326a extends qc.r implements pc.a<z0.f> {

            /* renamed from: f  reason: collision with root package name */
            final /* synthetic */ v f13720f;

            /* renamed from: m  reason: collision with root package name */
            final /* synthetic */ j1<j2.p> f13721m;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0326a(v vVar, j1<j2.p> j1Var) {
                super(0);
                this.f13720f = vVar;
                this.f13721m = j1Var;
            }

            public final long a() {
                return w.b(this.f13720f, a.d(this.f13721m));
            }

            @Override // pc.a
            public /* bridge */ /* synthetic */ z0.f invoke() {
                return z0.f.d(a());
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: TextFieldSelectionManager.android.kt */
        /* loaded from: classes.dex */
        public static final class b extends qc.r implements pc.l<pc.a<? extends z0.f>, androidx.compose.ui.e> {

            /* renamed from: f  reason: collision with root package name */
            final /* synthetic */ j2.e f13722f;

            /* renamed from: m  reason: collision with root package name */
            final /* synthetic */ j1<j2.p> f13723m;

            /* JADX INFO: Access modifiers changed from: package-private */
            /* compiled from: TextFieldSelectionManager.android.kt */
            /* renamed from: e0.x$a$b$a  reason: collision with other inner class name */
            /* loaded from: classes.dex */
            public static final class C0327a extends qc.r implements pc.l<j2.e, z0.f> {

                /* renamed from: f  reason: collision with root package name */
                final /* synthetic */ pc.a<z0.f> f13724f;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C0327a(pc.a<z0.f> aVar) {
                    super(1);
                    this.f13724f = aVar;
                }

                public final long a(j2.e eVar) {
                    qc.q.i(eVar, "$this$magnifier");
                    return this.f13724f.invoke().x();
                }

                @Override // pc.l
                public /* bridge */ /* synthetic */ z0.f invoke(j2.e eVar) {
                    return z0.f.d(a(eVar));
                }
            }

            /* JADX INFO: Access modifiers changed from: package-private */
            /* compiled from: TextFieldSelectionManager.android.kt */
            /* renamed from: e0.x$a$b$b  reason: collision with other inner class name */
            /* loaded from: classes.dex */
            public static final class C0328b extends qc.r implements pc.l<j2.k, dc.w> {

                /* renamed from: f  reason: collision with root package name */
                final /* synthetic */ j2.e f13725f;

                /* renamed from: m  reason: collision with root package name */
                final /* synthetic */ j1<j2.p> f13726m;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C0328b(j2.e eVar, j1<j2.p> j1Var) {
                    super(1);
                    this.f13725f = eVar;
                    this.f13726m = j1Var;
                }

                public final void a(long j10) {
                    j1<j2.p> j1Var = this.f13726m;
                    j2.e eVar = this.f13725f;
                    a.e(j1Var, j2.q.a(eVar.K0(j2.k.h(j10)), eVar.K0(j2.k.g(j10))));
                }

                @Override // pc.l
                public /* bridge */ /* synthetic */ dc.w invoke(j2.k kVar) {
                    a(kVar.k());
                    return dc.w.f13270a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            b(j2.e eVar, j1<j2.p> j1Var) {
                super(1);
                this.f13722f = eVar;
                this.f13723m = j1Var;
            }

            @Override // pc.l
            /* renamed from: a  reason: merged with bridge method [inline-methods] */
            public final androidx.compose.ui.e invoke(pc.a<z0.f> aVar) {
                qc.q.i(aVar, "center");
                return t.z.f(androidx.compose.ui.e.f2335a, new C0327a(aVar), null, 0.0f, t.a0.f23106g.b(), new C0328b(this.f13722f, this.f13723m), 6, null);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(v vVar) {
            super(3);
            this.f13719f = vVar;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final long d(j1<j2.p> j1Var) {
            return j1Var.getValue().j();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void e(j1<j2.p> j1Var, long j10) {
            j1Var.setValue(j2.p.b(j10));
        }

        public final androidx.compose.ui.e c(androidx.compose.ui.e eVar, j0.l lVar, int i10) {
            qc.q.i(eVar, "$this$composed");
            lVar.e(1980580247);
            if (j0.n.K()) {
                j0.n.V(1980580247, i10, -1, "androidx.compose.foundation.text.selection.textFieldMagnifier.<anonymous> (TextFieldSelectionManager.android.kt:43)");
            }
            j2.e eVar2 = (j2.e) lVar.C(z0.e());
            lVar.e(-492369756);
            Object f10 = lVar.f();
            l.a aVar = j0.l.f18688a;
            if (f10 == aVar.a()) {
                f10 = d3.e(j2.p.b(j2.p.f19001b.a()), null, 2, null);
                lVar.J(f10);
            }
            lVar.N();
            j1 j1Var = (j1) f10;
            C0326a c0326a = new C0326a(this.f13719f, j1Var);
            lVar.e(511388516);
            boolean Q = lVar.Q(j1Var) | lVar.Q(eVar2);
            Object f11 = lVar.f();
            if (Q || f11 == aVar.a()) {
                f11 = new b(eVar2, j1Var);
                lVar.J(f11);
            }
            lVar.N();
            androidx.compose.ui.e g10 = o.g(eVar, c0326a, (pc.l) f11);
            if (j0.n.K()) {
                j0.n.U();
            }
            lVar.N();
            return g10;
        }

        @Override // pc.q
        public /* bridge */ /* synthetic */ androidx.compose.ui.e invoke(androidx.compose.ui.e eVar, j0.l lVar, Integer num) {
            return c(eVar, lVar, num.intValue());
        }
    }

    public static final boolean a(k1.r rVar) {
        qc.q.i(rVar, "<this>");
        return false;
    }

    public static final androidx.compose.ui.e b(androidx.compose.ui.e eVar, v vVar) {
        qc.q.i(eVar, "<this>");
        qc.q.i(vVar, "manager");
        if (!t.a0.f23106g.b().i()) {
            return eVar;
        }
        return androidx.compose.ui.c.b(eVar, null, new a(vVar), 1, null);
    }
}
