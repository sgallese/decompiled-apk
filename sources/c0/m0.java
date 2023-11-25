package c0;

import android.view.KeyEvent;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import j0.l;

/* compiled from: TextFieldKeyInput.kt */
/* loaded from: classes.dex */
public final class m0 {

    /* compiled from: TextFieldKeyInput.kt */
    /* loaded from: classes.dex */
    static final class a extends qc.r implements pc.q<androidx.compose.ui.e, j0.l, Integer, androidx.compose.ui.e> {

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ t0 f8483f;

        /* renamed from: m  reason: collision with root package name */
        final /* synthetic */ e0.v f8484m;

        /* renamed from: p  reason: collision with root package name */
        final /* synthetic */ b2.j0 f8485p;

        /* renamed from: q  reason: collision with root package name */
        final /* synthetic */ boolean f8486q;

        /* renamed from: r  reason: collision with root package name */
        final /* synthetic */ boolean f8487r;

        /* renamed from: s  reason: collision with root package name */
        final /* synthetic */ b2.x f8488s;

        /* renamed from: t  reason: collision with root package name */
        final /* synthetic */ a1 f8489t;

        /* renamed from: u  reason: collision with root package name */
        final /* synthetic */ pc.l<b2.j0, dc.w> f8490u;

        /* renamed from: v  reason: collision with root package name */
        final /* synthetic */ int f8491v;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: TextFieldKeyInput.kt */
        /* renamed from: c0.m0$a$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public /* synthetic */ class C0209a extends qc.n implements pc.l<i1.b, Boolean> {
            C0209a(Object obj) {
                super(1, obj, l0.class, "process", "process-ZmokQxo(Landroid/view/KeyEvent;)Z", 0);
            }

            public final Boolean h(KeyEvent keyEvent) {
                qc.q.i(keyEvent, "p0");
                return Boolean.valueOf(((l0) this.f21661m).l(keyEvent));
            }

            @Override // pc.l
            public /* bridge */ /* synthetic */ Boolean invoke(i1.b bVar) {
                return h(bVar.f());
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        a(t0 t0Var, e0.v vVar, b2.j0 j0Var, boolean z10, boolean z11, b2.x xVar, a1 a1Var, pc.l<? super b2.j0, dc.w> lVar, int i10) {
            super(3);
            this.f8483f = t0Var;
            this.f8484m = vVar;
            this.f8485p = j0Var;
            this.f8486q = z10;
            this.f8487r = z11;
            this.f8488s = xVar;
            this.f8489t = a1Var;
            this.f8490u = lVar;
            this.f8491v = i10;
        }

        public final androidx.compose.ui.e a(androidx.compose.ui.e eVar, j0.l lVar, int i10) {
            qc.q.i(eVar, "$this$composed");
            lVar.e(2057323757);
            if (j0.n.K()) {
                j0.n.V(2057323757, i10, -1, "androidx.compose.foundation.text.textFieldKeyInput.<anonymous> (TextFieldKeyInput.kt:244)");
            }
            lVar.e(-492369756);
            Object f10 = lVar.f();
            l.a aVar = j0.l.f18688a;
            if (f10 == aVar.a()) {
                f10 = new e0.y();
                lVar.J(f10);
            }
            lVar.N();
            e0.y yVar = (e0.y) f10;
            lVar.e(-492369756);
            Object f11 = lVar.f();
            if (f11 == aVar.a()) {
                f11 = new i();
                lVar.J(f11);
            }
            lVar.N();
            androidx.compose.ui.e a10 = androidx.compose.ui.input.key.a.a(androidx.compose.ui.e.f2335a, new C0209a(new l0(this.f8483f, this.f8484m, this.f8485p, this.f8486q, this.f8487r, yVar, this.f8488s, this.f8489t, (i) f11, null, this.f8490u, this.f8491v, 512, null)));
            if (j0.n.K()) {
                j0.n.U();
            }
            lVar.N();
            return a10;
        }

        @Override // pc.q
        public /* bridge */ /* synthetic */ androidx.compose.ui.e invoke(androidx.compose.ui.e eVar, j0.l lVar, Integer num) {
            return a(eVar, lVar, num.intValue());
        }
    }

    public static final androidx.compose.ui.e a(androidx.compose.ui.e eVar, t0 t0Var, e0.v vVar, b2.j0 j0Var, pc.l<? super b2.j0, dc.w> lVar, boolean z10, boolean z11, b2.x xVar, a1 a1Var, int i10) {
        qc.q.i(eVar, "$this$textFieldKeyInput");
        qc.q.i(t0Var, "state");
        qc.q.i(vVar, "manager");
        qc.q.i(j0Var, AppMeasurementSdk.ConditionalUserProperty.VALUE);
        qc.q.i(lVar, "onValueChange");
        qc.q.i(xVar, "offsetMapping");
        qc.q.i(a1Var, "undoManager");
        return androidx.compose.ui.c.b(eVar, null, new a(t0Var, vVar, j0Var, z10, z11, xVar, a1Var, lVar, i10), 1, null);
    }
}
